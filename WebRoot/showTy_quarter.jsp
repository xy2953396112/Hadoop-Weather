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
      <c:if test="${!empty requestScope.showTy_quarter }">
		<table align="center" border="1"  width="95%" bordercolor="#76EE00" cellspacing="0"><h1 align="center">太原季度天气变化</h1>
            <tr style="background-color:#4EEE94"><th>季度</th>
				<th>季度最高温度</th>
				<th>季度最低温度</th>
				<th>季度最高平均温度</th>
				<th>季度最低平均温度</th>
				<th>季度平均温度</th>
			</tr>
			
			<c:forEach items="${requestScope.showTy_quarter }" var="list">
				<tr>
				    <td>${list.quarter }</td>
					<td>${list.max_hTemp }</td>
					<td>${list.min_lTemp }</td>
					<td>${list.avg_hTemp}</td>
					<td>${list.avg_lTemp}</td>
					<td>${list.avg_hl}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
      </table>
</body>
</html>