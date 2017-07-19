package com.maihe.grpc;


import com.maihe.proto.InputData.InputDataServiceGrpc;
import com.maihe.proto.InputData.inputDataMessage;
import com.maihe.proto.InputData.inputDataResponse;
import com.maihe.repository.InputDataRepository;
import io.grpc.stub.StreamObserver;
import net.devh.springboot.autoconfigure.grpc.server.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Leizhen on 2017/7/12.
 */
public class InputDataServer {

  @GrpcService(InputDataServiceGrpc.class)
  public static class InputDataBaseImp extends InputDataServiceGrpc.InputDataServiceImplBase{

    @Autowired
    private InputDataRepository inputDataRepository;

    public void inputData(inputDataMessage request, StreamObserver<inputDataResponse> responseObserver){
      String sqlArray = request.getInputDataSql().trim();
      String[] sql = sqlArray.split(";");
      String resultAll = " ";
      int result;
        for (int i = 0; i < sql.length; i++) {
          try {
           result = inputDataRepository.execMultiInsertSql(sql[i]);
          }catch(Exception e){
            result = 0;
          }
          resultAll = resultAll + result;
        }


      inputDataResponse mInputExcelResponse = inputDataResponse.newBuilder().setResult(resultAll).build();
      responseObserver.onNext(mInputExcelResponse);
      responseObserver.onCompleted();

    }
  }
}
