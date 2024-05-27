<%@ page import="in.com.detch.infotech.bean.*"%>
<%@ page import="java.util.List" %>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Read User list</title>
</head>
 <style>
        table {
            border-collapse: collapse;
            width: 80%;
            margin: 20px auto;
        }
        th, td {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }
        th {
            background-color: #f2f2f2;
        }
        tbody tr {
            margin-bottom: 10px;
        }
    </style>
<body>
  <h2>Admin - User Information</h2>
<form action="" method="post">
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Username</th>
                <th>Email</th>
                <th>City</th>
                <th>Permission Level</th>
            </tr>
        </thead>
            <tbody>
            <% List<UserLoginBean> userList = (List<UserLoginBean>) request.getAttribute("user");
            if (userList != null) {
                for (UserLoginBean user : userList) { %>
                    <tr>
                        <td><%= user.getId() %></td>
                        <td><%= user.getUsername() %></td>
                        <td><%= user.getEmail() %></td>
                        <td><%= user.getCity() %></td>
                        <td><%= user.getPermissionLevel() %></td>
                    </tr>
                <% }
            } %>
        </tbody>
    </table>
    </form>
</body>
</html>