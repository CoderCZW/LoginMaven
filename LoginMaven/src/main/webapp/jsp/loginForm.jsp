<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/3
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <form action="login" method="post" id="loginForm" >
        用户名：<input type="text" name="loginname" id="loginname"/><br>
        密码：<input type="password" name="password" id="password"><br>
        <input type="submit" value="登录"> <input type="reset" value="重置">
    </form>
    <br>
    <form action="select" method = "post" >
        <input type="submit" value="查询用户">
    </form>
    <br>
    <form action="add" method = "post" >
        <input type="submit" value="添加用户">
    </form>
    <br>
    <form action="delete" method = "post" >
        <input type="submit" value="删除用户">
    </form>
</body>
</html>
