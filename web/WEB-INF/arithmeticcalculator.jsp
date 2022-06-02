<%-- 
    Document   : arithmeticcalculator
    Created on : 25-May-2022, 1:37:19 PM
    Author     : Marcelo Vieira
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
        <form method="POST" action="arithmetic">
            <label>First:</label>
            <input type="text" name="first_arg" value="${firstArg}">
            <br>
            <label>Second:</label>
            <input type="text" name="second_arg" value="${secondArg}">
            <br>
            <input type="submit" name="operation" value="+">
            <input type="submit" name="operation" value="-">
            <input type="submit" name="operation" value="*">
            <input type="submit" name="operation" value="%">
        </form>
        <br>
        <p style="margin:0;">Result: ${result}</p>
        <a href="age">Age Calculator</a>
    </body>
</html>
