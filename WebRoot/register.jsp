<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<link rel="shortcut icon" href="img/j12.png" type="image/x-icon">
<link rel="stylesheet" type="text/css" href="<%=basePath%>css/register.css" />
<link rel="stylesheet" href="<%=basePath %>login/css/xgxt_login.css" />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>账号注册</title>
<link rel="stylesheet" href="<%=basePath%>css/base.css" />
<link rel="stylesheet" type="text/css" href="<%=basePath%>css/register.css" />
<script type="text/javascript" src="<%=basePath%>js/register.js"></script>

</head>
	<body >
        <div id="header">
	       <div class="header_title">
		     <span class="title_con"><a href="home.jsp">天气可视化系统</a></span>
	       </div>
		</div>
		<!-- <video style="position: absolute;left:50%;margin-left:-828px;" loop="loop" autoplay="autoplay" width="1656" height="auto"><source src="video/video314.mp4" type="video/mp4"></video> -->
		<div id="form-header" class="header">
			<div class="logo_head">
				<%-- <img src="<%=basePath%>img/regist.png"/> --%>
				<div class="have-account" style="float: right;height: 120px;line-height: 120px;">已有账号
					<a href="landlogin">请登录</a>
				</div>
			</div>
		</div>
		<div class="container w">

			<div class="main clearfix" id="form-main">
				<div class="left">
					<form action="login/registerUser"  method="post" onsubmit="return test()">
						<div class="form-item" id="">
							<label>用　户　名</label>
							<input type="text" name="username" id="username"  class="username in" maxlength="20" placeholder="您的账户名和登录名"  />
							<i class="i-status"></i>
						</div>
						<div class="input-tip">
							<span></span>
						</div>
						<div class="form-item">
							<label>设 置 密 码</label>
							<input style="display:none" type="password" name="pwd" class="fakeinput in" />
							<input type="password" name="password" id="password" class="in" maxlength="20" placeholder="建议至少使用两种字符组合"/>
							<i class="i-status"></i>
						</div>
						<div class="input-tip">
							<span></span>
						</div>
						<div class="form-item">
							<label>确 认 密 码</label>
							<input style="display:none" type="password" name="pwdRepeat" class="fakeinput" />
							<input type="password" name="pwdRepeat" id="password1" class="in" placeholder="请再次输入密码" maxlength="20"  />
							<i class="i-status"></i>
						</div>
						<div class="input-tip">
							<span></span>
						</div>
						<div class="form-item">
							<label>输入 性 别</label>
							<!-- <input style="display:none" type="password" name="pwdRepeat" class="fakeinput" /> -->
							<input type="text" name="sex" id="sex" class="in" placeholder="请输入性别(男或女)" maxlength="20"/>
							
							<i class="i-status"></i>
						</div>
						<div class="input-tip">
							<span></span>
						</div>
						<div class="item-email-wrap">
							<div class="form-item">
								<label>输入 地 址</label>
								<input type="text" name="address" id="address" class="in" autocomplete="off" placeholder="建议使用常用地址"  />
								<i class="i-status"></i>
							</div>
							<div class="input-tip">
								<span></span>
							</div>
						</div>
						<div class="item-phone-wrap">
							<div class="form-item form-item-phone">
								<label class="select-country" id="select-country" country_id="0086">中国 + 86<a href="javascript:void(0) "class="arrow"></a></label>
								<input type="text" id="phone" name="phone" class="in" placeholder="建议使用常用手机" autocomplete="off" maxlength="11" />
								<i class="i-status"></i>
							</div>
							<div class="input-tip">
								<span></span>
							</div>
						</div>
						<!-- <div class="form-item form-item-authcode">
							<label>验　证　码</label>
							<input type="text" autocomplete="off" name="authcode" id="authCode" maxlength="6" class="field form-authcode in" placeholder="请输入验证码" />
							<img class="img-code" title="换一换" id="imgAuthCode" onclick="this.src= document.location.protocol +'//authcode.jd.com/verify/image?a=0&amp;acid=aae18c8b-e2cb-4297-94cd-e93b3957a4ab&amp;uid=aae18c8b-e2cb-4297-94cd-e93b3957a4ab&amp;srcid=reg&amp;is=406deaeb36860a635c7ff10ca3e4bc4a&amp;yys='+new Date().getTime()" ver_colorofnoisepoint="#888888" />
						</div>
						<div class="input-tip">
							<span></span>
						</div> -->
						<div class="form-agreen">
							<div><input type="checkbox" name="agreen" checked="" />我已阅读并同意
								<a>《辉腾用户注册协议》</a>
							</div>
							<div class="input-tip">
								<span></span>
							</div>
						</div>
						<div>
							<input type="submit" class="btn" value="立即注册" ></input>
						</div>

					</form>
				</div>
				<div id="right">
					<%-- <img src="<%=basePath%>img/side.jpg"/>   --%>
                </div>
			</div>

		</div>
		</div>
		<div id="form-footer" class="footer w">
			<div class="links">
				<a> 关于我们</a>|
				<a >联系我们</a>|
				<a >人才招聘</a>|
				<a >商家入驻</a>|
				<a >广告服务</a>|
				<a >手机辉腾</a>|
				<a >友情链接</a>|
				<a >销售联盟</a>|
				<a >辉腾社区</a>|
				<a >辉腾公益</a>|
				<a >English Site</a>
			</div>
			<div class="copyright">
				Copyright&copy;2004-2016&nbsp;&nbsp;xzh.com&nbsp;版权所有
			</div>
		</div>

	</body>

</html>

    
</html>
