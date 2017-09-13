<!DOCTYPE html>
	
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>
<!-- <meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> -->
<title>日期选择控件</title>
<link href="css/datePicker.css" rel="stylesheet" type="text/css" media="all" />
<style type="text/css"> 
*{ margin:0; padding:0;}
body { font:12px/1.5 Arial; color:#666; background:#fff;}
ul,li{ list-style:none;}
img{border:0 none;}
</style> 
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.date_input.pack.js"></script> 
</head>
<body>
<script type="text/javascript">
$(function(){
	$('#datePicker').date_input();
	$('#datePicker2').date_input();
	});
</script>

  <form action="showDefineReportAction" method="post">
   <center>
   <h3 style="margin:30px;">点击下面的输入框，选择日期范围</h3>
   开始日期:<input type="text" name="date1" id="datePicker" class="date_picker" placeholder="点击选择日期"/>
   结束日期:<input type="text" name="date2" id="datePicker2" class="date_picker" placeholder="点击选择日期"/>
   <input type="submit" value="查询">
   </center>
  </form>
 
</body> 
</html>