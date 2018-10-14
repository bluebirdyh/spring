<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/14 0014
  Time: 下午 4:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${userList}" var="user">
    <tr>
        <td><input name="ids" type="checkbox"></td>
        <td>${user.id }</td>
        <td>${user.username }</td>
    </tr>
</c:forEach>
</body>
</html>
