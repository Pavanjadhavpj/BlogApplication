<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
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
         input[type="email"],
        input[type="submit"],
         input[type="text"]{
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
<body>
 <div>
     <h2>Update User</h2>
        <form action="userview" method="POST">
            <label for="email">Old Email:</label>
            <input type="email" id="email" name="email" required><br><br>

            <label for="newEmail">New Email:</label>
            <input type="email" id="newEmail" name="newEmail" required><br><br>
            
            <input type="submit" value="Update User">
        </form>
    </div>
</body>
</html>