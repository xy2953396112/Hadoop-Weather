<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/weather_pm.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>所有天气信息</title>
</head>
<body>
      <c:if test="${!empty requestScope.showWeatherApi}">
		<table align="center" border="1"  width="95%" bordercolor="#76EE00" cellspacing="0"><h1 align="center">天气信息</h1>
            <tr style="background-color:#4EEE94"><td>空气质量指数</td>

				<th>城市</th>
				<th>pm2.5</th>
				<th>pm2.5_24小时</th>
				<th>地点</th>
				<th>主要的污染物</th>
				<th>空气质量</th>
				<th>站点编码</th>
				<th>时间点</th>
			</tr>
			
			<c:forEach items="${requestScope.showWeatherApi }" var="list">
				<tr>
				    <td>${list.aqi}</td>
					<td>${list.area }</td>
					<td>${list.pm2_5_24h }</td>
					<td>${list.position_name }</td>
					<td>${list.primary_pollutant }</td>
					<td>${list.quality }</td>
					<th>${list.station_code}</th>
					<th>${list.time_point }</th>
				</tr>
			</c:forEach>
		</table>
		<br>
		&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a href="weatherApiToExcel">导出Excel</a>
	</c:if>
      
</body>
</html>