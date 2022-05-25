<%-- 
    Document   : agecalculator
    Created on : 25-May-2022, 12:57:45 PM
    Author     : Marcelo Vieira
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="POST" action="age">
            <label>Enter your age:</label>
            <input type="text" name="age" value="${age}">
            <br>
            <input type="submit" value="Age next birthday">
        </form>
        <span>${message}</span>
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>