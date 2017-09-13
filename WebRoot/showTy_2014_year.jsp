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
      <c:if test="${!empty requestScope.showTy_2014_year }">
		<table align="center" border="1"  width="95%" bordercolor="#76EE00" cellspacing="0"><h1 align="center">太原天气变化</h1>
            <tr style="background-color:#4EEE94"><th>最高温度</th>
				<th>最低温度</th>
				<th>年最高平均温度</th>
				<th>年最低平均温度</th>
			</tr>
			
			<c:forEach items="${requestScope.showTy_2014_year }" var="list">
				<tr>
					<td>${list.max_hTemp }</td>
					<td>${list.min_lTemp }</td>
					<td>${list.avg_hTemp}</td>
					<td>${list.avg_lTemp}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
      </table>
</body>
</html>