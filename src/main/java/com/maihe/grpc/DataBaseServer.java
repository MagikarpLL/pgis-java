package com.maihe.grpc;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.maihe.proto.DataBase.*;

import com.maihe.repository.BaseRepository;
import io.grpc.stub.StreamObserver;
import net.devh.springboot.autoconfigure.grpc.server.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Maple on 2017/5/8.
 */
public class DataBaseServer {

  @GrpcService(DBInfoGrpc.class)
  public static class DataBaseImp extends DBInfoGrpc.DBInfoImplBase {

    @Autowired
    private BaseRepository baseRepository;
    @Value("${spring.jpa.database}")
    private String database;
    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String username;

    @Override
    public void getPros(DBRequest request, StreamObserver<DBResponse> responseObserver) {

      JSONObject jsonResponse = new JSONObject();
      if (database.equals("MYSQL")) {
        Object cur_Db = baseRepository.selectByNativeSQL("SELECT DATABASE() as CUR_DB").get(0);
        jsonResponse.put("cur_Db", cur_Db);
      } else if (database.equals("ORACLE")) {
        Object cur_Db = baseRepository.selectByNativeSQL("SELECT DISTINCT TABLESPACE_NAME as CUR_DB FROM user_tables").get(0);
        jsonResponse.put("cur_Db", cur_Db);
      }


      jsonResponse.put("database", database);
      jsonResponse.put("url", url);
      jsonResponse.put("username", username);

      DBResponse response = DBResponse.newBuilder().setResult(jsonResponse.toString()).build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    }

    @Override
    public void query(com.maihe.proto.DataBase.SQLRequest request, StreamObserver<SQLResponse> responseObserver) {
      String sql = request.getSql().trim();
      String keyword = sql.substring(0, 6).toUpperCase();
      String result = "";
      if (!keyword.equals("SELECT")) {
        result = "SQL NOT SUPPORT: " + sql;
      } else {
        List list = baseRepository.selectByNativeSQL(request.getSql());
        result = JSON.toJSONString(list);
      }
      SQLResponse sqlResponse = SQLResponse.newBuilder().setResult(result).build();
      responseObserver.onNext(sqlResponse);
      responseObserver.onCompleted();
    }

    @Override
    @Transactional
    public void edit(com.maihe.proto.DataBase.SQLRequest request, StreamObserver<SQLResponse> responseObserver) {
      String sql = request.getSql().trim();
      int re = baseRepository.updateByNativeSQL(sql);
      String result = "";
      SQLResponse sqlResponse;
      if (re == -1) {
        result += "SQL NOT SUPPORT" + sql;
        sqlResponse = SQLResponse.newBuilder().setResult(result).build();
      } else {
        sqlResponse = SQLResponse.newBuilder().setResult(String.valueOf(re)).build();
      }
      responseObserver.onNext(sqlResponse);
      responseObserver.onCompleted();
    }
  }
}
