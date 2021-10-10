<%--
  Created by IntelliJ IDEA.
  User: pasha
  Date: 23.09.2021
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="../pages/styles.css" rel="stylesheet" type="text/css">
</head>
<body>
<form action="calc" method="post" >
    <input class="input-1" type="number" name="Num1" placeholder="Num 1">
    <input type="number" name="Num2" placeholder="Num 2">
   <select name="operation">
       <option value="sum">Sum</option>
       <option value="minus">Minus</option>
       <option value="delenie">Delenie</option>
       <option value="umnojenie">Umnojenie</option>
   </select>
    <button class="but" type="submit">Calculate</button>
</form>
<p>${result}</p>
</body>
</html>
