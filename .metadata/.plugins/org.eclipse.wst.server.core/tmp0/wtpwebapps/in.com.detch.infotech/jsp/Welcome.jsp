<%@page import="in.com.detch.infotech.ctl.DTCView" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
    <script type="text/'javascript"></script>
    <script>
    function validateEmail() {
        const emailRegex = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
        const email = document.getElementById("email").value;
        if (emailRegex.test(email)) {
            console.log('Valid email address.');
            return true;
        } else {
            console.log('Invalid email address.');
            return false;
        }
    }

    </script>
    <style>
        body
        {
            border-radius: 10px;
        }
        h2{
            text-align: center;
        }
        form {
            border: 10px;
            position: relative;
            top: 100px;
            width: 300px;
            margin: 0 auto;
        }
        input[type="email"],
        input[type="password"],
        input[type="submit"],
        input[type="button"]
        {
            width: 100%;
            padding: 8px;
            margin: 5px 0;
            box-sizing: border-box;
        }
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
        }
        input[type ="button"]
        {
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer; 
        }
    </style>
</head>
<body>
    <form onsubmit="validateEmail();" action="adminview" method="post">
        <h2>Login</h2>
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" >
    
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
    
       <input type="submit" value="Login">
        <a href="registration"><input type="button" value="Register"></a>
    </form>
</body>
</html>
