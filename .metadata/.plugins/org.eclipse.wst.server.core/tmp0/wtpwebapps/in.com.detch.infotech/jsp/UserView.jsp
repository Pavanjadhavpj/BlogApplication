<%@ page import="in.com.detch.infotech.bean.*"%>
<%@ page import="java.util.List" %>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <title>CRUD BUTTONS</title>
<style>
    body{
        display: grid;
        align-items: center;
        justify-content: center;
        padding: 260px;
        border: solid;
    }
button {
    padding: 10px 20px;
    font-size: 16px;
    cursor: pointer;
    margin: 5px;
    border-radius: 5px;
    border: none;
}
.update-btn {
    background-color: #f39c12;
    color: white;
}

.delete-btn {
    background-color: #e74c3c;
    color: white;
}

header {
    background-color: #333;
    color: white;
    padding: 10px 0;
}

nav ul {
    margin: 0;
    padding: 0;
    list-style-type: none;
}

nav ul li {
    display: inline-block;
}

nav ul li a {
    text-decoration: none;
    color: white;
    padding: 10px 20px;
}

.logout {
    float: right;
}


</style>
</head>
<body>
<form method="post">
    <header>
        <nav>
            <ul>
                <li class="logout"><a href="Welcome.jsp">Logout</a></li>
            </ul>
        </nav>
    </header>
    <h1>UserInfo</h1>
    
    <a href="UpdateUserView.jsp"><button class="update-btn" >Update</button></a>
    
   
    <a href="DeleteUserView.jsp"><button class="delete-btn" >Delete</button></a>
</form>
</body>
</html>