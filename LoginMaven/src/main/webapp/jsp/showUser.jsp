<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/8
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users</title>
</head>
<body>
      <table border="1" align="center">
          <tr>
              <td>用户名</td>
              <td>密  码</td>
          </tr>
          <c:forEach items="${list}" var="item">
              <tr>
                  <td>${item.loginname}</td>
                  <td>${item.password}</td>
              </tr>
          </c:forEach>
      </table>
</body>
</html>
