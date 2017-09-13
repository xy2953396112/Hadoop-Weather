﻿<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page deferredSyntaxAllowedAsLiteral="true"%>
<html>
<head>
  <title>修改用户信息</title>
  <meta name="viewport" content="width=device-width,initial-scale=1">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="keywords" content="HTML,CSS,XML,JavaScript">
  <meta charset="utf-8" />
  <style type="text/css">
		body{
			font:14px/28px "微软雅黑";
		}
		.contact *:focus{outline :none;}
		.contact{
			width: 700px;
			height: auto;
			background: #f6f6f6;
			margin: 40px auto;
			padding: 10px;
		}
		.contact ul {
			width: 650px;
			margin: 0 auto;
		}
		.contact ul li{
			border-bottom: 1px solid #dfdfdf;
			list-style: none;
			padding: 12px;
		}
		.contact ul li label {
			width: 120px;
			display: inline-block;
			float: left;
		}
		.contact ul li input[type=text],.contact ul li input[type=password]{
			width: 220px;
			height: 25px;
			border :1px solid #aaa;
			padding: 3px 8px;
			border-radius: 5px;
		}
		.contact ul li input:focus{
			border-color: #c00;
			
		}
		.contact ul li input[type=text]{
			transition: padding .25s;
			-o-transition: padding  .25s;
			-moz-transition: padding  .25s;
			-webkit-transition: padding  .25s;
		}
		.contact ul li input[type=password]{
			transition: padding  .25s;
			-o-transition: padding  .25s;
			-moz-transition: padding  .25s;
			-webkit-transition: padding  .25s;
		}
		.contact ul li input:focus{
			padding-right: 70px;
		}
		.btn{
			position: relative;
			left: 300px;
		}
		.tips{
			color: rgba(0, 0, 0, 0.5);
			padding-left: 10px;
		}
		.tips_true,.tips_false{
			padding-left: 10px;
		}
		.tips_true{
			color: green;
		}
		.tips_false{
			color: red;
		}
  </style>
  
</head>
<body>
	<div class="contact" >
		<form action="login/updateUser" method="post" >
			<ul>
				<li>
					<label>用户名：</label>
					<input type="text" name="username" value="${sessionScope.user.username}" placeholder="请输入用户名"  onblur="checkna()" readonly="readonly" required/><span class="tips" id="divname">长度1~12个字符</span>
				</li>
				<li>
					<label>修改密码：</label>
					<input id="password" type="password" name="password" placeholder="请输入你的密码" onBlur="checkpsd1()" required/><span class="tips" id="divpassword1">密码必须由字母和数字组成</span>
				</li>				
				<li>
					<label>修改性别：</label>
					<input  type="text" name="sex" placeholder="请输入你的性别" onBlur="checkpsd1()" required/><span class="tips" id="divpassword1">点选性别</span>
				</li>
				
				<li>
					<label>修改电话：</label>
					<input  type="text" name="phone" placeholder="请输入你的电话" onBlur="checkpsd1()" required/><span class="tips" id="divpassword1">请输入电话号码</span>
				</li>
				
				<li>
					<label>修改地址：</label>
					<input type="text" name="address" placeholder="请输入你的地址" onBlur="checkpsd2()" required/><span class="tips" id="divpassword2">请输入地址</span>
				</li>
				
			</ul>
			<b class="btn"><input type="submit" value="提交" onclick="check()"/>
			<input type="reset" value="取消"/></b>
		</form>
	</div>
	<div style="text-align:center;">
<p><a href="" target="_blank">辉腾公司</a></p>
</div>
</body>
</html>

