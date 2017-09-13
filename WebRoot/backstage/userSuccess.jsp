<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@page import="java.util.Date" %>
<%@page import="java.text.*" %>
<%@page import="java.net.*" %>

<head>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
  
%>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<title>用户</title>
<link rel="shortcut icon" href="<%=basePath%>img/j12.png" type="image/x-icon">
<link rel="stylesheet" type="text/css" href="<%=basePath%>css/register.css" />
<link rel="stylesheet" type="text/css" href="<%=basePath%>backstage/css/style.css" />
<script type="text/javascript" src="<%=basePath%>backstage/js/jquery-1.6.min.js"></script>
<script type="text/javascript" src="<%=basePath%>backstage/js/index.js"></script>
</head>

<body>
<div class="nav-top">
	<span><a href="<%=basePath%>home.jsp">天气可视化系统</a></span>
    <div class="nav-topright">
         <%
         	com.ticket.www.entity.User user = (com.ticket.www.entity.User)session.getAttribute("user");
                      
                      if(user==null){
                         response.sendRedirect("login");  
                      }  
                      
                 if(application.getAttribute("counter") == null)
                 {
                     application.setAttribute("counter", "1");
                 }
                 else
                 {
                     String strnum = null;
                     strnum = application.getAttribute("counter").toString();
                     int icount = 0;
                     icount = Integer.valueOf(strnum).intValue();
                     icount++;
                     application.setAttribute("counter", Integer.toString(icount));
                     
                 }
         %>
    
        
         <% String ip = InetAddress.getLocalHost().getHostAddress(); %>
    	<p>您是第<%=application.getAttribute("counter") %>位访问者！   登陆IP：<%=ip %></p>
    	<p>现在时间:<%  
    	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
         String time=df.format(new Date());
    	%><%=time%></p>
        <span>您好：${user.username}</span><span><a href="login/removelogin">注销</a></span>
    </div>
</div>
<div class="nav-down">
	<div class="leftmenu1">
        <div class="menu-oc"><img src="<%=basePath%>backstage/images/menu-all.png" /></div>
    	<ul>
        	<li>
            	<a class="a_list a_list1">用户设置</a>
                <div class="menu_list menu_list_first">
                	<a class="lista_first" href="<%=basePath%>login/selectUser" target="right">查看个人信息</a>
                    <!-- <a href="../addUser.jsp" target="right">新增用户</a> -->
                    <a href="updateUser.jsp" target="right">修改个人信息</a>
                </div>
            </li>
           
            <li>
            	<a class="a_list a_list2">传统天气信息管理</a>
                <div class="menu_list">
                    <a href="<%=basePath%>login/showTodayWeather" target="right">今日天气</a>
                    <a href="<%=basePath%>login/showWeather" target="right">mysql天气信息查看</a>
                    <a href="<%=basePath%>login/showScrapy" target="right">天气爬虫信息查看</a>
                    <a href="<%=basePath%>searchCity.html" target="right">按城市查看天气信息</a>
                    <a href="<%=basePath%>inputDate.jsp" target="right">按日期查看天气信息</a>
                </div>
            </li>
            <li>
            	<a class="a_list a_list1">Hive数据管理</a>
                <div class="menu_list">
                    <a href="<%=basePath%>login/showTy_2014_day" target="right">太原2014年日平均气温统计</a>
                    <a href="<%=basePath%>login/showTy_2015_day" target="right">太原2015年日平均气温统计</a>
                    <a href="<%=basePath%>login/showTy_2016_day" target="right">太原2016年日平均气温统计</a>
                    <a href="<%=basePath%>login/showCityMonth" target="right">城市三年月平均气温统计</a>
                    <a href="<%=basePath%>login/showTy_year" target="right">太原年平均气温统计</a>
                </div>
            </li>
             <li>
            	<a class="a_list a_list3">天气可视化展示</a>
                <div class="menu_list">
                	<a href="<%=basePath%>demo1.jsp" target="right">雨量流量关系图</a>
                    
                    <a href="<%=basePath%>demo3.jsp" target="right">一周气温变化-折线图</a>
                    <a href="<%=basePath%>demo4.html" target="right">蒸发量和降水量-柱状图</a>
                    <a href="<%=basePath%>demo5.html" target="right">空气质量指数-散点图</a>
                    <a href="<%=basePath%>demo6.html" target="right">一年中空气质量优的天数比例图</a>
                    <a href="<%=basePath%>demo7.html" target="right">空气质量指数-雷达图</a>
                    <a href="<%=basePath%>demo8.html" target="right">空气质量-饼图</a>
                    <a href="<%=basePath%>demo9.html" target="right">漏斗图</a>
                    <a href="<%=basePath%>demo10.html" target="right">堆叠区域图</a>
                    <a href="<%=basePath%>demo11.html" target="right">本站流量</a>
                    <a href="rain.jsp" target="right">多种天气</a>
                    <a href="map.jsp" target="right">地图浏览器定位</a>
                    <a href="map_ip.jsp" target="right">地图Ip定位</a>
                </div>
            </li>
            <!--  
            <li>
            	<a class="a_list a_list3">出库单管理</a>
                <div class="menu_list">
                	<a href="showBarcodeActionOut" target="right">出库</a>
                    <a href="showOutStockAction" target="right">查看出库单</a>
                    <a href="#">修改新闻</a>
                    <a href="#">删除新闻</a> 
                </div>
            </li> -->
        </ul>
    </div>
   <div class="leftmenu2">
    	<div class="menu-oc1"><img src="<%=basePath%>backstage/images/menu-all.png" /></div>
        <ul>
        	<li>
            	<a class="j_a_list j_a_list1"></a>
                <div class="j_menu_list j_menu_list_first">
                	<span class="sp1"><i></i>用户设置</span>
                	<!-- <a class="j_lista_first" href="../date/time.jsp" target="right">日报表</a>
                    <a href="showWeekReportAction" target="right">周报表</a>
                    <a href="showMonthReportAction" target="right">月报表</a>
                    <a href="../date/DefineReport.jsp" target="right">自定义报表</a> -->
                    <a class="lista_first" href="login/selectUser" target="right">查看个人信息</a>
                    <!-- <a href="../addUser.jsp" target="right">新增用户</a> -->
                    <a href="updateUser.jsp" target="right">修改个人信息</a>
                </div>
            </li>
            <li>
            	<a class="j_a_list j_a_list2"></a>
                <div class="j_menu_list">
                	<span class="sp2"><i></i>传统天气</span>
                	
                    <a href="<%=basePath%>showWeatherJSON.jsp" target="right">json</a>
                    <a href="login/showWeather" target="right">mysql天气</a>
                    <a href="login/showScrapy" target="right">天气爬虫信息</a>
                    <a href="<%=basePath%>searchCity.html" target="right">按城市查看</a>
                    <a href="<%=basePath%>inputDate.jsp" target="right">按日期查看</a>
                </div>
            </li>
            <li>
            	<a class="j_a_list j_a_list3"></a>
                <div class="j_menu_list">
                	<span class="sp3"><i></i>可视化</span>
                	<a href="<%=basePath%>demo1.html" target="right">雨量流量关系图</a>
                    <a href="<%=basePath%>demo2.html" target="right">天气小插件</a>
                    <a href="<%=basePath%>demo3.html" target="right">一周气温变化</a>
                    <a href="<%=basePath%>demo4.html" target="right">蒸发量和降水量</a>
                    <a href="<%=basePath%>demo5.html" target="right">空气质量指数</a>
                    <a href="<%=basePath%>demo6.html" target="right">空气质量比例图</a>
                    <a href="<%=basePath%>demo7.html" target="right">空气质量指数</a>
                    <a href="<%=basePath%>demo8.html" target="right">空气质量饼图</a>
                    <a href="<%=basePath%>demo9.html" target="right">漏斗图</a>
                    <a href="<%=basePath%>demo10.html" target="right">堆叠区域图</a>
                    <a href="<%=basePath%>demo11.html" target="right">本站流量</a>
                    <a href="test.jsp" target="right">浮动层</a>
                    <a href="rain.jsp" target="right">多种天气</a>
                </div>
            </li>
        </ul>
        
    </div> 
    <div class="rightcon">
    	<div class="right_con">
        	<!-- <p style="text-align:left; margin-top:50px">右侧内容自适应哦！我是左对齐</p>
            <p style="text-align:center">右侧内容自适应哦！我是居中</p>
            <p style="text-align:right">右侧内容自适应哦！我是右对齐</p>
            <h1>我是标题1。。。</h1>
            <h2>我是标题2。。。</h2>
            <h3>我是标题3。。。</h3>
            <h4>我是标题4。。。</h4>
            <h5>我是标题5。。。</h5> -->
            <iframe src="<%=basePath%>demo10.html" name="right" height="710px" width="100%"  style="background:#FFEFD5;"></iframe>
        </div>
    </div>
</div>
<<div id="form-footer" class="footer w">
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
<script type="text/javascript">
	
</script>