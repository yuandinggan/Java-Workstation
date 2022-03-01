<%--
  Created by IntelliJ IDEA.
  User: Reaper
  Date: 2022/2/21
  Time: 23:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/quick13" method="post" enctype="multipart/form-data">
    <label>
        名称：
        <input type="text" name="username"><br>
    </label>
    <label>
        文件1：
        <input type="file" name="uploadFile"><br>
    </label>
    <label>
        文件2：
        <input type="file" name="uploadFile"><br>
    </label>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
