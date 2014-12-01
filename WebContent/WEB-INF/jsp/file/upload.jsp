<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <link rel="stylesheet" type="text/css" href="${ctx}/css/global.css" >
<title>文件上传</title>
</head>
<body>
		<hr/>
	
	<form:form method="post" action="" modelAttribute="customer" enctype="multipart/form-data">
	
		身份证：<form:input path="cardId"/>
		用户名：<form:input path="name"/>
		图片：<input type="file" name="image">
		
		<p><input type="submit" value="提交" /></p>
	
	</form:form>
	
	<hr/>
	
</body>
</html>