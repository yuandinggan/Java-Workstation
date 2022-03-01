<%--
  Created by IntelliJ IDEA.
  User: Reaper
  Date: 2022/2/21
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script>
        const arr = [];
        arr.push({id:1,name: "tom", age: 15})
        arr.push({id:2,name: "james", age: 16})

        $.ajax({
            type:"POST",
            url:"${pageContext.request.contextPath}/user/quick7",
            data:JSON.stringify(arr),
            contentType:"application/json;charset=utf-8"
        })
    </script>
</head>
<body>
<h1>This is Ajax Page</h1>
</body>
</html>
