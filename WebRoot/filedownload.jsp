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
	<h2>文件下载内容：</h2><br/>  
    <a href="FileDownload.action?number=1">struts2.jpg</a><br/>  
    <a href="FileDownload?number=2">sas9.3-64sid-99CKGN-可用到2018年.txt</a>  
</body>
</html>
