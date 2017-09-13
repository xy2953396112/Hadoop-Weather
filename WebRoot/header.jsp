<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>header.jsp</title>
	
<meta name="keywords" content="keyword1,keyword2,keyword3">
<meta name="description" content="this is my page">
<meta name="content-type" content="text/html; charset=UTF-8">
    
    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/font.css" rel="stylesheet" type="text/css" />
<link href="css/pay.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<script type="text/javascript" src="js/wechat.js"></script>

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

  </head>
  
  <body>
    <div class="header">
		<div class="container">	
			<div class="logo">
				<a href="home.jsp"><img src="images/log.png" alt=""></a>
			</div>
				<div class="top-nav">
					<span class="menu"><img src="images/menu.png" alt=""> </span>
					<ul >
						<li class="active" ><a href="home.jsp" >WeatherVisualization</a></li>
						<li><a href="services.jsp" > 可视化简介 </a></li>
						<li><a href="resolve.jsp"> 解决方案 </a></li>
						<li><a href="example.jsp" > 案例 </a></li>
						<li><a href="landlogin" >登录</a></li>
						<li><a href="about.jsp" >关于</a></li> 
						
						
						 <li><a href="javascript:void(0)"  onmouseover="showImg()">
        <img class="wx" src="http://www.czqiushi.com/wp-content/uploads/2015/10/wx.png" ">
    </a></li>
					</ul>
					
					<div id="wxImg" style="display:none; left:5px; top:10px;back-ground:#f00;position:fixed; z-index:999;">
        <img class="wx" src="image/pay.png" width="180px" height="180px" onclick="hideImg()"> 
    </div>
				<script>
					$("span.menu").click(function(){
						$(".top-nav ul").slideToggle(500, function(){
						});
					});
			</script>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
    
    
    
  </body>
</html>
