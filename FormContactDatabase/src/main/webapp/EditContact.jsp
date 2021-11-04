<%--
  Created by IntelliJ IDEA.
  User: milan
  Date: 5.08.2021
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Contact</title>
</head>
<body>
<form action="/FormContactDatabase_war_exploded/edit-contact">
    Enter name <input type="text" name="name">
    Enter Tel No <input type="text" name="tel_number">
    <input type="submit" value="Edit Contact"><br>
 Name: ${name}<br>
 Tel No: ${tel_number}
</form>
</body>
</html>
