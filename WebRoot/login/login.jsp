<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
 
%>
<link rel="shortcut icon" href="img/j12.png" type="image/x-icon">
<link rel="stylesheet" href="<%=basePath %>login/css/xgxt_login.css" />
<link rel="stylesheet" href="<%=basePath%>css/base.css" />
<link rel="stylesheet" type="text/css" href="<%=basePath%>css/register.css" />
<title>用户登录</title>
<script>(function(T,h,i,n,k,P,a,g,e){g=function(){P=h.createElement(i);a=h.getElementsByTagName(i)[0];P.src=k;P.charset="utf-8";P.async=1;a.parentNode.insertBefore(P,a)};T["ThinkPageWeatherWidgetObject"]=n;T[n]||(T[n]=function(){(T[n].q=T[n].q||[]).push(arguments)});T[n].l=+new Date();if(T.attachEvent){T.attachEvent("onload",g)}else{T.addEventListener("load",g,false)}}(window,document,"script","tpwidget","//widget.thinkpage.cn/widget/chameleon.js"))</script>
<script>tpwidget("init", {
    "flavor": "bubble",
    "location": "WW8P3NH2TPDT",
    "geolocation": "enabled",
    "position": "top-right",
    "margin": "5px 5px",
    "language": "zh-chs",
    "unit": "c",
    "theme": "chameleon",
    "uid": "UBD51A9329",
    "hash": "2ae58e3762600c51b22bcf6b8cb88152"
});
tpwidget("show");</script>
<script  type="text/javascript">
		function test(){
			var username=document.getElementById("username").value;
			var password=document.getElementById("password").value;
			var select;
			var radio = document.getElementsByName("role");
               for(var i=0; i<radio.length; i++){
                   if(radio[i].checked){
                        select = radio[i].value;
                   }
			   }
			//alert("select:"+select);
			 //alert("用户名不能为空");
			 if(username.length<3 || username.length>10){
			      alert("用户名长度为3-10位数字或字母！");
			      //document.getElementById("username").innerHTML = "用户名长度为3-10位数字或字母！";
			      return false;
			 }else if(username=="" || username==null){
			     alert("用户名不能为空!");
			     //document.getElementById("username").innerHTML = "请输入用户名";
			     //window.history.back(-1);
			     //window.location.href="http://localhost:8080/Hadoop-Weather/landlogin";
			     //return false;
			     return false; 
			 }
			 if(password.length<3 || password.length>10){
			      alert("密码长度为3-10位数字或字母！");
			      return false;
			 }else if(password=="" || password==null){
			     alert("密码不能为空!"); 
			     //document.getElementById("password").innerHTML = "请输入密码";
                 return false; 
				}
			if(select=="" || select==null){
			     alert("请选择角色!");
                 //document.getElementById("role").innerHTML = "请输入角色";
                 return false;
			}
			return true;
		}
</script>

 
</head>
<body>

<div id="header">
	<div class="header_title">
		<span class="title_con"><a href="home.jsp">天气可视化系统</a></span>
	</div>
</div>

<div id="content">
	<center>
		<div class="con">
		<div class="con_title">
			<span class="con_title_sp">欢迎光临天气可视化系统</span>
		</div>
		
	 <form  action="login" method="get" onsubmit="return test()"> 
		<div class="con_panel">
			<div class="con_input">
				<span>用户名：</span><input id="username" type="text" name="username" placeholder="用户名"/>
			</div>
			<div class="con_input">
				<span>密&nbsp;&nbsp;&nbsp;&nbsp;码：</span><input id="password" type="text" name="password" placeholder="密码"/>
			</div>
			<div class="con_select" id="role">
				<input type="radio" name="role" value="users" />用户
				<input type="radio" name="role" value="admin" />管理员
			</div>
			<input type="submit" value="登    录" class="submit-btn" /><a href="register.jsp">还未注册?请注册</a>
		</div>
	  </form>
	</div>
	</center>
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
				Copyright&copy;2017&nbsp;&nbsp;Mrs Xu&nbsp;版权所有
			</div>
		</div>


</body>
</html>
