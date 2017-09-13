<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>可视化简介</title>
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
<link href='css/font.css' rel='stylesheet' type='text/css'>
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<script type="text/javascript" src="js/services.js" charset="utf-8"></script>
<!-- slide -->
<style>
   a.qq{
      position:fixed;
	     top:250px;
	    left:5px;
   }
   
</style>
<a target="_blank" class="qq" href="http://wpa.qq.com/msgrd?v=3&uin=953396112&site=qq&menu=yes"><img border="0" src="http://wpa.qq.com/pa?p=2:953396112:53" alt="点击这里给我发消息" title="联系xzh"/></a>
</head>
<body>
<!--header-->
	<%@ include file="header.jsp"%>
<!---->
	<div class="banner banner-in">
		 <div class="container">
			<div class="col-md-6 banner-matter-in">
				<h1>可视化系统简介</h1>
			</div>
				<div class="col-md-6 banner-side side-banner">
					<div class="col-md-6 side">
						<img class="img-responsive" src="images/se1.jpg" alt="">
					</div>
					<div class="col-md-6 side">
						<img class="img-responsive" src="images/se.jpg" alt="">
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>	
	</div>
	<!---->
	<div class="content">
		<div class="container">
			<div class="service-top">
				<div class="col-md-4 grid-service-in">
					<ul class="drop">
						<li><a href="services.jsp" onmouseover="hadooop()">大数据技术HADOOP</a></li>
						<li><a href="services.jsp" onmouseover="hive()">数据仓库HIVE</a></li>
						<li><a href="services.jsp" onmouseover="web()">数据WEB</a></li>
						<li><a href="services.jsp" onmouseover="echarts()">数据可视化Echarts.js</a></li>
					</ul>
					<div class="ser-grid">
						<h3><i></i> Cool Weahter</h3>
						<p>预报的数据几乎都来自于权威气象机构，比如中国气象台，通过气象观测站结合卫星云图，再预测出未来几天的天气状况。天气软件可接入气象机构的对外接口，天气数据就会显示在用户的网页中了。 </p>
						<div class="example.jsp">
							<a href="#" class="just-do-in do">Just do it </a>
							<a href="example.jsp" class="see">see some examples</a>
							<div class="clearfix"> </div>
						</div>
					</div>
					<div class="ser-grid ">
						<h3><i class="mid"></i> Cool Weahter</h3>
						<div class="do-see">
							<a href="example.jsp" class="just-do-in do-this">Just do it </a>
							<a href="example.jsp" class="see">see some examples</a>
							<div class="clearfix"> </div>
						</div>
					</div>
				</div>
				<div class="col-md-8 grid-service">
					<h2><center>基于Hadoop的天文气象信息可视化</center></h2>
					<p class="you" id="you1">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp正是在此应用背景下，大数据开始发挥着重要的作用。这些技术的产生为气象数据的研究注入了新的活力。气象数据中蕴藏的大量气象规律，这些气象的规律往往对气象预测具有很大的价值。例如空气PM2.5数据，可以用来预测某一地区出现雾霾的可能性，从而为人类的出行提供提示以及帮助。
分布式存储解决了大数据存取的问题，其中hadoop便是该领域的翘楚。它由一个高容错、高吞吐量、低成本的分布式文件系统和一个高效的分布式编程模型MapReduce组成。HDFS为超大数据集提供了底层存储基础，MapReduce为纷繁复杂的数据提供了并行化计算框架，HDFS和MapReduce是既独立又配合的关系。 </p>					
					<p class="you" id="you2">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp将hadoop技术应用到气象领域，并且建立相应的平台，对当前气象数据的存储、计算提供了一定的帮助作用，有助于对于天气进行更为全面和准确的分析，从而提高人们的生活和工作效率。</p>
					<div class=" service-para">
				<h4>留下你的联系方式</h4>
			<form action="addMessage" method="post">
				<div class="col-md-6 service-name">
					<div>
						<span>Your name:</span>		
						<input name="name" type="text" value="" onfocus="this.value='';" onblur="if (this.value == '') {this.value ='';}">						
						</div>
					<div >
						<span>Your email:</span>		
						<input name="email" type="text" value="" onfocus="this.value='';" onblur="if (this.value == '') {this.value ='';}">						
						</div>				
				</div>
				<div class="col-md-6 service-name">					
					<span class="your-para">Message:</span>
					<textarea name="note" cols="77" rows="6" value=" " onfocus="this.value='';" onblur="if (this.value == '') {this.value = '';}"></textarea>
				</div>
				<div class="clearfix"> </div>
						<div class="send">
							<input type="submit" value="SEND">
						</div>
				</form>
			</div>
			</div>
				<div class="clearfix"> </div>
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