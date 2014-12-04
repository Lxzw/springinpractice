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
<title>首页</title>
</head>
<body>
	<h2>Hello World</h2><hr/>
	
	<img alt="桥" src="${ctx}/img/bridge.jpg"/>
	
	<hr/>
	
	<h2>用户登录</h2>
	<hr/>
	<form:form action="" modelAttribute="account" method="post">
	
		<p>用户名：<form:input path="username"/></p>
		<p>密码：<form:input type="password" path="password" /></p>
		<p><input type="submit" value="登录"/>
		
	
	</form:form>
	
</body>
</html>