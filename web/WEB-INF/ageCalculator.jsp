<%-- 
    Document   : ageCalculator
    Created on : Sep 21, 2022, 11:58:43 AM
    Author     : ilyes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="age" method="post">
            Enter your age: <input type="text" name="age" value="${age}"><br>
            <input type="submit" value="Age next birthday">
        </form>
        ${msg}
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
