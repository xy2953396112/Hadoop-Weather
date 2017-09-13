<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>WeatherVisualization</title>
<link rel="shortcut icon" href="img/j12.png" type="image/x-icon">
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Mobile App Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--fonts-->

<link href="css/font.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/wechat.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<script type="text/javascript" src="js/jquery.min/"></script>
<style>
   a.qq{
      position:fixed;
	     top:250px;
	    left:5px;
   }
   
</style>
<!-- slide -->
<a target="_blank" class="qq" href="http://wpa.qq.com/msgrd?v=3&uin=953396112&site=qq&menu=yes"><img border="0" src="http://wpa.qq.com/pa?p=2:953396112:53" alt="点击这里给我发消息" title="联系xzh"/></a>
<script type="text/javascript">

//微信

$(function(){

	$(".weixin").click(function(){				 

	$(".overlay").css({display:"block",height:$(document).height()});

	$(".weixindiag").css({

		left:($("body").width()-$(".weixindiag").width())/2+"px",

		top:($(window).height()-$(".weixindiag").height())/2+$(window).scrollTop()+"px",

		display:"block"

	});

	});

	

	$(".weixinclose").click(function(){

	$(".overlay,.weixindiag").css("display","none");

	return false;

	});

})

</script>
</head>
<body>

<!--header-->
	<%@ include file="header.jsp"%>
<!---->
	<div class="banner">
		 <div class="container">
			<div class="col-md-6 banner-matter">
				<!-- requried-jsfiles-for owl -->
				<link href="css/owl.carousel.css" rel="stylesheet">
				<script src="js/owl.carousel.js"></script>
							        <script>
									    $(document).ready(function() {
									      $("#owl-demo1").owlCarousel({
									        items : 1,
									        lazyLoad : true,
									        autoPlay : true,
									        navigation : true,
									        navigationText :  true,
									        pagination : false,
									      });
									    });
									  </script>
							 <!-- //requried-jsfiles-for owl -->
							 <!-- start content_slider -->
						<div id="owl-demo1" class="owl-carousel">
							<div class="item-bottom">
					            <div class="item-right">
									<h1>Weather<br>Visualization</h1>
									<span>Download this cool app for free</span>
									<p>大数据天气可视化信息APP</p>
									<a href="#"><i> </i>Download </a>
								</div>
							</div>
							<div class="item-bottom">
					            <div class="item-right">
									<h1></h1>
									<span>Download this cool app for free</span>
									<p>天气信息可视化</p>
									<a href="#"><i> </i>Download </a>
								</div>
							</div>
							<div class="item-bottom">
					            <div class="item-right">
									<h1>Web mobIle app</h1>
									<span>Download this cool app for free</span>
									<p>徐朝晖</p>
									<a href="#"><i> </i>Download </a>
								</div>
							</div>								
						</div>
				</div>
				<div class="col-md-6 banner-side">
					<div class="col-md-6 side">
						<img class="img-responsive" src="images/ba.jpg" alt="">
					</div>
					<div class="col-md-6 side">
						<img class="img-responsive" src="images/ba1.jpg" alt="">
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>	
	</div>
	<!---->
	<div class="content">
		<div class="container">
			<div class="content-top">
				<div class="col-md-4 grid">
					<h3><i></i> 数据来源</h3>
					<p>预报的数据几乎都来自于权威气象机构，比如中国气象台，通过气象观测站结合卫星云图，再预测出未来几天的天气状况。天气软件可接入气象机构的对外接口，天气数据就会显示在用户的网页中了。</p>
					<a href="services.jsp" class="just-do-in">Just do it </a>
				</div>
				<div class="col-md-4 grid">
					<h3><i class="mid"></i>数据处理</h3>
					<p>HADOOP 是一个能够对大量数据进行分布式处理的软件框架。 HADOOP 是以一种可靠、高效、可伸缩的方式进行处理的。HADOOP 依赖于社区服务器，因此它的成本比较低，任何人都可以使用。</p>
					<a href="services.jsp" class="just-do-in">Just do it </a>
				</div>
				<div class="col-md-4 grid">
					<h3><i class="just"></i> 数据可视化</h3>
					<p>数据可视化是关于图形或表格的数据展示,在一个被关注的连贯而简短的报告中体现大量的信息。添加各种技术应用到数据可视化，甚至是选择交互式的可视化方法。数据可视化技术是个讲故事的好工具。
                    </p>
					<a href="services.jsp" class="just-do-in">Just do it </a>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="content-grid">
				<h2>基于Hadoop的天文气象信息可视化</h2>
				<p>展示需要相比传统的用表格或文档展现数据的方式，数据可视化能将数据以更加直观的方式展现出来。使数据更加客观、更具说服力。在各类报表和说明性文件中，用直观的图表展现数据，显得简洁、可靠。在可视化图表工具的表现形式方面，图表类型表现的更加多样化，丰富化。除了传统的饼图、柱状图、折线图等常见图形，还有气泡图、面积图、省份地图、词云、瀑布图、漏斗图等酷炫图表，甚至还有GIS地图。这些种类繁多的图形能满足不同的展示和分析需求。
                </p>
                <%@ include file="demo3.jsp"%>
			</div>
		</div>
		<div class="content-bottom">
			<div class="container">
				<h3>DO YOU WANT START WEATHERVIISUALIZATION WITH ME ? 想和我一起开始可视化吗?</h3>
				<p>我们是全球做可视化最优秀的！</p>
			</div>
			<i> </i>
		</div>
	</div>
	<!---->
	<%@ include file="footer.jsp"%>
</body>
</html>