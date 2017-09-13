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

public class ViewExcel extends AbstractExcelView {
   
	protected void buildExcelDocument(Map<String, Object> model,
            HSSFWorkbook workbook, HttpServletRequest request,
            HttpServletResponse response) throws Exception {
         List<Article> articles= (List<Article>) model.get("articles");

         HSSFSheet sheet = workbook.createSheet("�����б�");//����һҳ
         HSSFRow header = sheet.createRow(0);//������һ��
         header.createCell(0).setCellValue("����");
         header.createCell(1).setCellValue("����");
         for( int i = 0; i < articles.size();i++){
             HSSFRow row = sheet.createRow(i + 1);
             Article article = articles.get(i);
             row.createCell(0).setCellValue(article.getTitle());
             row.createCell(1).setCellValue(article.getContent());
         }
    }
}
