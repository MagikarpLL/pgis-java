package com.maihe.grpc;


import com.alibaba.fastjson.JSON;
import com.maihe.proto.Excel.excelResponse;
import com.maihe.proto.Excel.*;
import io.grpc.stub.StreamObserver;
import net.devh.springboot.autoconfigure.grpc.server.GrpcService;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by LeiZhen on 2017/6/5.
 */
public class ExcelServer {

  @GrpcService(ExcelServiceGrpc.class)
  public static class DataBaseImp extends ExcelServiceGrpc.ExcelServiceImplBase {



    public void genExcel(excelParams request, StreamObserver<excelResponse> responseObserver) {
      boolean result = true;
      String[] firstData = null;
      String[][] data = null;

      String excelName = request.getExcelName().trim();
      String excelRoute = request.getExcelRoute().trim();
      String excelHead = request.getExcelHead().trim();
      String excelData = request.getExcelData().trim();


      String[] title = excelHead.split(",");
      if(!excelData.isEmpty()) {
        firstData = excelData.split(";");
        data = new String[firstData.length][(firstData[0].length() + 1) / 2];
        for (int i = 0; i < firstData.length; i++) {
          String[] tempData = firstData[i].split(",");
          for (int j = 0; j < tempData.length; j++) {
            data[i][j] = tempData[j];
          }
        }
      }else{
        data = new String[0][0];
      }

      System.out.println("");
//      System.out.println("data[i].length:" + data[0].length);
      System.out.println("data.length:" + data.length);

      try {
        Workbook wb = new HSSFWorkbook();
        File file = new File(excelRoute, excelName);
        FileOutputStream fileOut = new FileOutputStream(file);

        Sheet sheet = wb.createSheet("data");

        Row titleRow = sheet.createRow(0);
        for (int i = 0; i < title.length; i++) {
          Cell cell = titleRow.createCell(i);
          cell.setCellValue(title[i]);
          CellStyle cellStyle = wb.createCellStyle();//创建样式
          cellStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN); //下边框
          cellStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);//左边框
          cellStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);//上边框
          cellStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);//右边框
          cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 居中
          Font font = wb.createFont();
          font.setFontName("黑体");
          font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);//粗体显示
          font.setColor(HSSFColor.RED.index);//红色
          font.setFontHeightInPoints((short) 18);//设置字体大小
          cellStyle.setFont(font);
          cell.setCellStyle(cellStyle);//给单元格添加样式
        }
        for (int i = 0; i < data.length; i++) {
          Row dataRow = sheet.createRow(i+1);
          for(int j = 0; j < data[i].length; j++){
            Cell cell = dataRow.createCell(j);
            CellStyle dataStyle = wb.createCellStyle();
            dataStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN); //下边框
            dataStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);//左边框
            dataStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);//上边框
            dataStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);//右边框
            cell.setCellStyle(dataStyle);
            cell.setCellValue(data[i][j]);
          }
        }
        wb.write(fileOut);
        fileOut.close();
        result = true;
      } catch (Exception e) {
        e.printStackTrace();
        result = false;
      }
      excelResponse mExcelResponse = excelResponse.newBuilder().setResult( JSON.toJSONString(result)).build();
      responseObserver.onNext(mExcelResponse);
      responseObserver.onCompleted();
    }




  }


}
