<%--
  Created by IntelliJ IDEA.
  User: milan
  Date: 5.08.2021
  Time: 23:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Contact</title>
</head>
<body>
<form action="/FormContactDatabase_war_exploded/create-contact">
    Enter name <input type="text" name="name"><br>
    Enter Tel No <input type="text" name="tel_number">
<input type="submit" value="Create Contact">
</form>
</body>
</html>
