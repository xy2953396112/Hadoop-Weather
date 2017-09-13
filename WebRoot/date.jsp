<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>双日期控件 </title>
<link href="blue/doubleDate.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="js/doubleDate2.0.js"></script>
<script type="text/javascript">
$(function(){
	
	$('.doubledate').kuiDate({
		className:'doubledate',
		isDisabled: "0"  // isDisabled为可选参数，“0”表示今日之前不可选，“1”标志今日之前可选
	});

});
</script>
</head>

<body>

<style type="text/css">
*{margin:0;padding:0;list-style-type:none;}
a,img{border:0;}
body{font:12px/180% Arial, Helvetica, sans-serif, "新宋体";}


.iptgroup{width:620px;height:60px;margin:20px auto 0 auto;}
.iptgroup li{float:left;height:30px;line-height:30px;padding:5px;}
.iptgroup li .ipticon{background:url(blue/date_icon.gif) 98% 50% no-repeat;border:1px #CFCFCF solid;padding:3px;}
</style>

<ul class="iptgroup">
	<li>出发日期：</li>
	<li><input type="text" readonly="readonly" class="doubledate ipticon"/></li>
	<li style="width:20px;"></li>
	<li>返程日期：</li>
	<li><input type="text" readonly="readonly" class="doubledate ipticon"/></li>
</ul>

</body>
</html>
