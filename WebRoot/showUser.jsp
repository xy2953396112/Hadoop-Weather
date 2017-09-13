<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>所有用户信息</title>
</head>
<body>
      <c:if test="${!empty sessionScope.showUser }">
		<table align="center" border="1"  width="95%" bordercolor="#76EE00" cellspacing="0"><h1 align="center">客户信息</h1>
            <tr style="background-color:#4EEE94"><td>姓名</td>

				<th>密码</th>
				<th>角色</th>
				<th>性别</th>
				<th>电话</th>
				<th>地址</th>
				<th>上次登录日期</th>
				<!-- <th>修改</th> -->
			</tr>
			
			<%-- <c:forEach items="${requestScope.selectUser }" var="list"> --%>
				<tr>
					<td>${sessionScope.showUser.username}</td>
					<td>${sessionScope.showUser.password}</td>
					<td>${sessionScope.showUser.role}</td>
					<td>${sessionScope.showUser.sex}</td>
					<td>${sessionScope.showUser.phone}</td>
					<th>${sessionScope.showUser.address}</th>
					<th>${sessionScope.showUser.lastLoginTime }</th>
					<%-- <td><a href="updateUser/${sessionScope.showUser.id}">UPDATE</a></td> --%>
					
				</tr>
			
		</table>
	</c:if>
      
</body>
</html>