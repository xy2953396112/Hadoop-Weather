<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>所有留言信息</title>
</head>
<body>
      <c:if test="${!empty requestScope.showTy_three }">
		<table align="center" border="1"  width="95%" bordercolor="#76EE00" cellspacing="0"><h1 align="center">2014-16太原天气信息</h1>
            <tr style="background-color:#4EEE94"><th>最高温度</th>
				<th>最低温度</th>
				<th>城市-年份-月份</th>
				<th>风向</th>
				<th>风力</th>
				<th>时间</th>
				<th>天气</th>
			</tr>
			
			<c:forEach items="${requestScope.showTy_three }" var="list">
				<tr>
					<td>${list.hTemp }</td>
					<td>${list.lTemp }</td>
					<td>${list.cityDate }</td>
					<td>${list.wind }</td>
					<td>${list.level }</td>
					<td>${list.day }</td>
					<td>${list.weather }</td>
					
				</tr>
			</c:forEach>
		</table>
	</c:if>
      </table>
</body>
</html>