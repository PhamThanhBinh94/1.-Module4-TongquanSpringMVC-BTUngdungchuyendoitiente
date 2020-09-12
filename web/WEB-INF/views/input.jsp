<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 9/12/2020
  Time: 2:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="/convert">
        <label> Rate:</label>
        <input type="text" name="rate" placeholder="Rate" value="22000"><br>
        <label> USD:</label>
        <input type="text" name="usd" placeholder="usd" value="0"><br>
        <input type="submit" value="Convert">
    </form>
</body>
</html>
