package com.xzh.weather.util;

import java.text.SimpleDateFormat;
import java.util.Date;
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
import com.xzh.weather.entity.Scrapy;
import com.xzh.weather.entity.Weather;

public class TodayScrapyViewExcel extends AbstractExcelView {
   
	protected void buildExcelDocument(Map<String, Object> model,
            HSSFWorkbook workbook, HttpServletRequest request,
            HttpServletResponse response) throws Exception {
         List<Scrapy> scrapy= (List<Scrapy>) model.get("todayToExcel");
         Date now = new Date();
         SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");//可以方便地修改日期格式
         String file = dateFormat.format( now ); 
         response.setHeader("Content-Disposition", "attachment;filename="+file+"_todayWeather.xls");
         HSSFSheet sheet = workbook.createSheet("今日天气");
         HSSFRow header = sheet.createRow(0);
         header.createCell(0).setCellValue("id");
         header.createCell(1).setCellValue("cityDate");
         header.createCell(2).setCellValue("week");
         header.createCell(3).setCellValue("img");
         header.createCell(4).setCellValue("temperature");
         header.createCell(5).setCellValue("weather");
         header.createCell(6).setCellValue("wind");
         header.createCell(7).setCellValue("date");
         for( int i = 0; i < scrapy.size();i++){
             HSSFRow row = sheet.createRow(i + 1);
             
             row.createCell(0).setCellValue(scrapy.get(i).getId());
             row.createCell(1).setCellValue(scrapy.get(i).getCityDate());
             row.createCell(2).setCellValue(scrapy.get(i).getWeek());
             row.createCell(3).setCellValue(scrapy.get(i).getImg());
             row.createCell(4).setCellValue(scrapy.get(i).getTemperature());
             row.createCell(5).setCellValue(scrapy.get(i).getWeather());
             row.createCell(6).setCellValue(scrapy.get(i).getWind());
             row.createCell(7).setCellValue(scrapy.get(i).getDate());
             
         }
    }
}
