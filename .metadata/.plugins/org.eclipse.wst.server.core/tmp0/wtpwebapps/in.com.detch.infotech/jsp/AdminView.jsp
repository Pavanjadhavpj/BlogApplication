<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
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

.create-btn {
    background-color: #4CAF50;
    color: white;
}

.read-btn {
    background-color: #3498db;
    color: white;
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
    padding: 27px;
}

nav ul {
    margin: 0px;
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
background-color:blue;
 border-radius:20px;
    text-align: center;
}


</style>
</head>
<body>
    <form action="" method="post">
        <header>
            <nav>
                <ul>
                    <li class="logout"><a href="welcome">Logout</a></li>
                </ul>
            </nav>
        </header>
        <h1>Admin CRUD</h1>
        <button formaction="RegisterView.jsp" class="create-btn">Create</button>
        <button formaction="ReadUserInfoView.jsp" class="read-btn">Read</button>
        <button formaction="updateuser" class="update-btn">Update</button>
        <button formaction="DeleteUserView.jsp" class="delete-btn">Delete</button>
    </form>
</body>
</html>