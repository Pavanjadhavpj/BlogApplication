<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Delete User</title>
<style>
      h2{
            text-align: center;
        }
        form {
            position: relative;
            top: 100px;
            width: 300px;
            margin: 0 auto;
        }
        input[type="submit"],
         input[type="number"]{
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
    <div>
        <h2>Delete User</h2>
        <form action="UserView.jsp" method="POST">
            <label for="id">ID:</label>
            <input type="number" id="id" name="id" required>
            <input type="submit" value="Delete User">
        </form>
    </div>
</body>
</html>
