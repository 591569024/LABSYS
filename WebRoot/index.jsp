<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
	+ request.getServerName() + ":" + request.getServerPort()
	+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>My JSP 'index.jsp' starting page</title>
</head>

<body>
	<form action="DaoAction!regist" method="post">
		姓名：<input name="name" type="text" /><br /> 年龄：<input name="age"
			type="text" /><br /> <input type="submit" value="注册" />
	</form>
</body>
</html>
