<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>天气信息API</title>
</head>
<body>
      <c:if test="${!empty requestScope.showWeather }">
		<table align="center" border="1"  width="95%" bordercolor="#76EE00" cellspacing="0"><h1 align="center">天气信息</h1>
            <tr style="background-color:#4EEE94"><th>城市</th>

				<th>最高气温</th>
				<th>最低气温</th>
				<th>降雨量</th>
				<th>风向</th>
				<th>湿度</th>
				<th>空气质量</th>
				<th>观测日期</th>
			</tr>
			
			<c:forEach items="${requestScope.showWeather }" var="list">
				<tr>
				    <td>${list.city}</td>
					<td>${list.HTemp }</td>
					<td>${list.LTemp }</td>
					<td>${list.rain }</td>
					<td>${list.wind }</td>
					<td>${list.humidity }</td>
					<th>${list.air}</th>
					<th>${list.date }</th>
				</tr>
			</c:forEach>
		</table>
		<br>
		&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a href="weatherToExcel">导出Excel</a>
	</c:if>
      
</body>
</html>