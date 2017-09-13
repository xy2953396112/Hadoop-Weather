<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<title>jQuery从页面右上角弹出的浮层</title> 
<link href="css/zzsc.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$(".showdiv").click(function(){
		var box =300;
		var th= $(window).scrollTop()+$(window).height()/1.6-box;
		var h =document.body.clientHeight;
		var rw =$(window).width()/2-box;
		$(".showbox").animate({top:th,opacity:'show',width:600,height:340,right:rw},500);
		$("#zhezhao").css({
			display:"block",height:$(document).height()
		});
		return false;
	});
	$(".showbox .close").click(function(){
		$(this).parents(".showbox").animate({top:0,opacity: 'hide',width:0,height:0,right:0},500);
		$("#zhezhao").css("display","none");
	});
});
</script>
</head>
<body>
	<a class="showdiv" >About Me</a>
	<div class="showbox">
		<h2>基于Hadoop的大数据可视化系统设计与实现<a class="close" style="color:#FF3333">关闭</a></h2>
		<div class="mainlist">
			
<p>基于B/S结构采用JAVA语言，配合mysql数据库，以apache作为运行服务器，采用MVC结构的框架进行开发，框架具有扩展性、重用性强，安全性高的特点，系统前端采用DIV,CSS布局，JS来做前段验证以及友好的交互效果。统计分析功能可用MapReduce并行分布式计算框架或Hive完成,分析前通过Sqoop将数据导入Hive。</p>
<p>前端:div+css、JQuery、Bootstrap、html5、Ajax</p>	
<p>后端:Spring、SpringMVC、Mybatis</p>
<p>数据存储:HDFS、File、Hive、MySQL</p>	
<p>数据获取:Sqoop、scrapy、python</p>
<p>数据处理:MapReduce、python、Hive、Java</p>
<p>数据展示:JSON	、matplotlib、Echarts.js</p>		
		</div>
	</div>	
	<div id="zhezhao"></div>

</body>
</html>
