package com.xzh.weather.util;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.xzh.weather.entity.Article;
import com.xzh.weather.entity.Weather;

public class WeatherViewExcel extends AbstractExcelView {
   
	protected void buildExcelDocument(Map<String, Object> model,
            HSSFWorkbook workbook, HttpServletRequest request,
            HttpServletResponse response) throws Exception {
         List<Weather> weather= (List<Weather>) model.get("weatherToExcel");
         response.setHeader("Content-Disposition", "attachment; filename=weather.xls");
         HSSFSheet sheet = workbook.createSheet("天气数据");
         HSSFRow header = sheet.createRow(0);
         header.createCell(0).setCellValue("id");
         header.createCell(1).setCellValue("city");
         header.createCell(2).setCellValue("lTemp");
         header.createCell(4).setCellValue("rain");
         header.createCell(5).setCellValue("wind");
         header.createCell(6).setCellValue("humidity");
         header.createCell(7).setCellValue("air");
         header.createCell(8).setCellValue("date");
         for( int i = 0; i < weather.size();i++){
             HSSFRow row = sheet.createRow(i + 1);
             
             row.createCell(0).setCellValue(weather.get(i).getId());
             row.createCell(1).setCellValue(weather.get(i).getCity());
             row.createCell(2).setCellValue(weather.get(i).getHTemp());
             row.createCell(3).setCellValue(weather.get(i).getLTemp());
             row.createCell(4).setCellValue(weather.get(i).getRain());
             row.createCell(5).setCellValue(weather.get(i).getWind());
             row.createCell(6).setCellValue(weather.get(i).getHumidity());
             row.createCell(7).setCellValue(weather.get(i).getAir());
             row.createCell(8).setCellValue(weather.get(i).getDate());
         }
    }
}
