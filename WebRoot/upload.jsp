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
	<form action="upload" method="post" enctype="multipart/form-data">
      <label for="myFile">Upload your file</label>
      <input type="file" name="myFile" />
      <input type="submit" value="Upload"/>
   </form>
</body>
</html>

<!-- uploadFile.java是一个非常简单的类。重要的是要注意的是使用FileUpload拦截器随着参数Intercetpor 确实为我们解决所有繁重工作。文件上传拦截器，使三个参数，默认情况下提供。它们被命名为以下模式：
[your file name parameter] - 这是实际的文件的上载。在这个例子中是 "myFile"
[your file name parameter]ContentType - 这是被上传的文件，该文件的内容类型。在这个例子中是 "myFileContentType"
[your file name parameter]FileName - 这是被上传的文件的名称。在这个例子中是 "myFileFileName"
这三个参数是为我们提供的，这要归功于Struts的拦截器。所有我们需要做的是在我们的Action类，这些变量是自动连线我们以正确的名称创建三个参数。所以，在上面的例子中，我们有三个参数的操作方法简单地返回“success”，如果一切顺利，否则返回“error”。 -->
