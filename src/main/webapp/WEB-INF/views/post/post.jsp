<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
 <%@ page session="false" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table class="table table-bordered">
		<tr>
			<th style="width: 50px">�۹�ȣ</th>
			<th>����ڹ�ȣ</th>
			<th>�۹�ȣ</th>
			<th>�۳���</th>
			<th>����¥</th>
		</tr>
		
		<c:forEach items="${list}" var="PostVO">
		<tr>
			<th>${PostVO.ID}</th>
			<th>${PostVO.USERID}</th>
			<th>${PostVO.CATEID}</th>
			<th>${PostVO.CAPTION}</th>
			<th>${PostVO.REGDATE}</th>
			
		</tr>
		</c:forEach>
	</table>
</body>
</html>