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
      <c:if test="${!empty requestScope.showTy_2014_day }">
		<table class="ui single line table" align="center" border="1"  width="95%"  cellspacing="0"><h1 align="center">太原每日天气</h1>
            <thead>
    <tr>
      <th>Name</th>
      <th>Registration Date</th>
      <th>E-mail address</th>
      <th>Premium Plan</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>John Lilki</td>
      <td>September 14, 2013</td>
      <td>jhlilk22@yahoo.com</td>
      <td>No</td>
    </tr>
    <tr>
      <td>Jamie Harington</td>
      <td>January 11, 2014</td>
      <td>jamieharingonton@yahoo.com</td>
      <td>Yes</td>
    </tr>
    <tr>
      <td>Jill Lewis</td>
      <td>May 11, 2014</td>
      <td>jilsewris22@yahoo.com</td>
      <td>Yes</td>
    </tr>
  </tbody>
            <tr style="background-color:#4EEE94"><th>最高温度</th>
				<th>最低温度</th>
				<th>平均温度</th>
				<th>风向</th>
				<th>风力</th>
				<th>时间</th>
				<th>天气</th>
			</tr>
			
			<c:forEach items="${requestScope.showTy_2014_day }" var="list">
				<tr>
					<td>${list.hTemp }</td>
					<td>${list.lTemp }</td>
					<td>${list.temAvg}</td>
					<td>${list.wind }</td>
					<td>${list.level}</td>
					<td>${list.day}</td>
					<td>${list.weather}</td>
					
				</tr>
			</c:forEach>
		</table>
	</c:if>
      </table>
</body>
</html>