<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page deferredSyntaxAllowedAsLiteral="true"%>

<html>

<head>
  <title>添加天气信息</title>
  <meta name="viewport" content="width=device-width,initial-scale=1">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="keywords" content="HTML,CSS,XML,JavaScript">
  <meta charset="utf-8" />
  <link rel="stylesheet" type="text/css" href="css/css.css">
  
</head>
<body>
	<div class="contact" >
		<form action="login/addWeather" method="post">
			<ul>
			    
				<li>
					<label>城市：</label>
					<input type="text" name="city" placeholder="请输入城市名称"  onblur="checkna()" required/><span class="tips" id="divname">最多10个字符</span>
				</li>
				<li>
					<label>最高温度：</label>
					<input type="text" name="HTemp" placeholder="请输入最高温度" onBlur="checkpsd1()" required/><span class="tips" id="divpassword1"></span>
				</li>
				<li>
					<label>最低温度：</label>
					<input type="text" name="LTemp" placeholder="请输入最低温度" onBlur="checkpsd2()" required/><span class="tips" id="divpassword2"></span>
				</li>
				<li>
					<label>降雨量:</label>
					<input type="text" name="rain" placeholder="请输入降雨量" onBlur="checkmail()" required/><span class="tips" id="divmail"></span>
				</li>
				<li>
					<label>风向：</label>
					<input type="text" name="wind" placeholder="请输入风向" onBlur="checkmail()" required/><span class="tips" id="divmail"></span>
				</li>
				<li>
					<label>湿度：</label>
					<input type="text" name="humidity" placeholder="请输入湿度" onBlur="checkmail()" required/><span class="tips" id="divmail"></span>
				</li>
				<li>
					<label>空气质量：</label>
					<input type="text" name="air" placeholder="请输入空气质量" onBlur="checkmail()" required/><span class="tips" id="divmail">一般,良好,优</span>
				</li>
				<li>
					<label>时间：</label>
					<input type="text" name="date" placeholder="请输入时间" onBlur="checkmail()" required/><span class="tips" id="divmail"></span>
				</li>
				
				
			</ul>
			<b class="btn"><input type="submit" value="提交"/>
			<input type="reset" value="取消"/></b>
		</form>
	</div>
	<div style="text-align:center;">
<p><a href="" target="_blank">辉腾公司</a></p>
</div>
</body>
</html>

