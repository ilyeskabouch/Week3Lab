<%-- 
    Document   : arithmeticCalculator
    Created on : Sep 21, 2022, 12:32:41 PM
    Author     : ilyes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            First: <input type="text" name="first" value="${first}"><br>
            Second: <input type="text" name="second" value="${second}"><br>
            <input type="submit" name="operation" value="+"><input type="submit" name="operation" value="-"><input type="submit" name="operation" value="*"><input type="submit" name="operation" value="%">
        </form>
        <p>
            Result: ${msg} <br>
            <a href="age">Age Calculator</a>
        </p>
    </body>
</html>
