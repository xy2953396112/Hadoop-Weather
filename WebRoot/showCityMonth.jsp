<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>所有客户信息</title>
</head>
<body>
      <c:if test="${!empty requestScope.showCityMonth }">
		<table align="center" border="1"  width="95%" bordercolor="#76EE00" cellspacing="0"><h1 align="center">城市三年月平均气温统计</h1>
            <tr style="background-color:#4EEE94"><th>城市-年份-月份</th>
				<th>最高温度</th>
                <th>最低温度</th>
                <th>平均温度</th>
			</tr>
			
			<c:forEach items="${requestScope.showCityMonth }" var="list">
				<tr>
					<td>${list.citydate }</td>
					<td>${list.htemp }</td>
					<td>${list.ltemp }</td>
					<td>${list.temavg }</td>
					<%-- <td><a href="emp/${emp.id}">Edit</a></td>
					<td><a class="delete" href="emp/${emp.id}">Delete</a>< --%>
				</tr>
			</c:forEach>
		</table>
	</c:if>
      </table>
</body>
</html>