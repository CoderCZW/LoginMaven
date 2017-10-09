<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/9
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add</title>
</head>
<body>
    <form action="addUser" method="post" id="main">
        用户名：<input type="text" name="loginname" id="loginname"/><br>
        密码：<input type="password" name="password" id="password"><br>
        <input type="submit" value="添加"> <input type="reset" value="重置">
    </form>
</body>
</html>
