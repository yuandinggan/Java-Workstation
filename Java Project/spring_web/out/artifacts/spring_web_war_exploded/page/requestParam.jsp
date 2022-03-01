<%--
  Created by IntelliJ IDEA.
  User: Reaper
  Date: 2022/2/21
  Time: 22:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>requestParam</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/quick8" method="post">
    <label>
        姓名：
        <input type="text" name="name"/>
    </label><br>
    <input type="submit" value="提交"/><br>
</form>
</body>
</html>
