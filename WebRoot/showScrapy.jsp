<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>所有爬虫信息</title>
</head>
<body><br>
		&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a href="scrapyToExcel">导出历史天气</a>
		<br>
		&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a href="todayToExcel">导出今日天气</a>
      <c:if test="${!empty requestScope.showScrapy }">
		<table align="center" border="1"  width="95%" bordercolor="#76EE00" cellspacing="0"><h1 align="center">天气信息</h1>
            <tr style="background-color:#4EEE94"><td>id</td>

				
				<th>城市</th>
				<th>星期</th>
				<th>图片链接</th>
				<th>温度</th>
				<th>天气状况</th>
				<th>风向</th>
				<th>日期</th>
			</tr>
			
			<c:forEach items="${requestScope.showScrapy }" var="list">
				<tr>
				    <td>${list.id}</td>
					<td>${list.cityDate }</td>
					<td>${list.week }</td>
					<td>${list.img }</td>
					<td>${list.temperature }</td>
					<td>${list.weather }</td>
					<th>${list.wind}</th>
					<th>${list.date }</th>
				</tr>
			</c:forEach>
		</table>
		<%-- <center>
      <a href="<s:url action="sortPageAction">
	            			<s:param name="pageno" value="1"></s:param>
	      			        
	        	</s:url>" >第一页</a>
      <a href="<s:url action="sortPageAction">
	            			<s:param name="pageno" value="%{ (pageno-1)<1 ? 1 : pageno-1}"></s:param>
	      			        <!-- <s:param name="pageSize" value="pageSize"></s:param> -->
	        	</s:url>"  >上一页</a>
	  <a href="<s:url action="sortPageAction">
	            			<s:param name="pageno" value="%{ (pageno+1)>totalPages ? totalPages : pageno+1}"></s:param>
	      			        <s:param name="totalPages" value="totalPages"></s:param>
	        	</s:url>"  >下一页</a>
	   <a href="<s:url action="sortPageAction">
	            			<s:param name="pageno" value="%{ totalPages}"></s:param>
	      			        <!-- <s:param name="totalPages" value="totalPages"></s:param> -->
	        	</s:url>"  >最后一页</a>     	
      
      </center> --%>
		
	</c:if>
      
</body>
</html>