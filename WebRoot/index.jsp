<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/weather_pm.js"></script>
  </head>
  
  <body>
    <a href="landlogin">landlogin</a> 
    <a href="register">register</a> 
    
    <form action="http://www.pm25.in/api/querys/pm2_5.json?city=zhuhai&token=5j1znBVAsnSf5xQyNQyq" method="get">
       <input type="submit" value="天气查询">
    </form> 
    <a href="excelView">Excel文件</a>
    <a href="login/weatherToExcel">天气信息转换为Excel文件</a>
    <br>
    <a href="http://www.pm25.in/api/querys/pm2_5.json?city=zhuhai&token=5j1znBVAsnSf5xQyNQyq">PM2.5</a>
     
     <a href="" onclick="request()">PM2.5</a>
  </body>
</html>
