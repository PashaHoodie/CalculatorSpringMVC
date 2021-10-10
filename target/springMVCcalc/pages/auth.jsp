<%--
  Created by IntelliJ IDEA.
  User: pasha
  Date: 22.09.2021
  Time: 21:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="../pages/styles.css" rel="stylesheet" type="text/css">
</head>
<body>
<form action="/user/auth" method="post">
    <input type="text" name="Username" placeholder="username">
    <input type="password" name="Password" placeholder="password">
    <button>Submit</button>
</form>
<p>${message}</p>
</body>
</html>
