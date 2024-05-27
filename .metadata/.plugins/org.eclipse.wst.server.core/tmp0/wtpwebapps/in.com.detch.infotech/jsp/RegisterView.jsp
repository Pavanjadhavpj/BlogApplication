<%@ page import="in.com.detch.infotech.ctl.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
    <style>
        /* Example style for form layout */
        h2{
            text-align: center;
        }
        form {
            position: relative;
            top: 100px;
            width: 300px;
            margin: 0 auto;
        }
        input[type="text"],
        input[type="email"],
        input[type="password"],
        input[type="submit"],
        input[type="city"] {
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
    </style>
</head>
<body>

<form action="Welcome.jsp" method="post">
    <h2>Registration Form</h2>
    <label for="username">Username:</label>
    <input type="text" id="username" name="username" required>

    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required>

    <label for="email">Email:</label>
    <input type="email" id="email" name="email" required>

    <label for="city">City:</label>
    <input type="text" id="city" name="city" required>

    <input type="submit" value="Register">
    
</form>

</body>
</html>
