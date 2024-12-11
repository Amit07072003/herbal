<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background-image: url('https://images.pexels.com/photos/34950/pexels-photo.jpg?auto=compress&cs=tinysrgb&w=600');
        background-size: cover;
        background-attachment: fixed;
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }
    
    .navbar {
        overflow: hidden;
        background-color: #333;
        position: fixed;
        top: 0;
        width: 100%;
        z-index: 1000;
    }

    .navbar a {
        float: left;
        display: block;
        color: #f2f2f2;
        text-align: center;
        padding: 14px 16px;
        text-decoration: none;
    }

    .navbar a:hover {
        background-color: #ddd;
        color: black;
    }

    .login-container {
        background-color: rgba(255, 255, 255, 0.9);
        padding: 30px;
        border-radius: 10px;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
        width: 350px;
        text-align: center;
        margin-top: 80px; /* Adjust based on navbar height */
    }

    .login-container h1 {
        margin-bottom: 20px;
        color: #333;
    }

    .login-container input {
        width: 100%;
        padding: 12px;
        margin: 10px 0;
        border: 1px solid #ccc;
        border-radius: 5px;
        box-sizing: border-box;
    }

    .login-container button {
        width: 100%;
        padding: 12px;
        background-color: #4CAF50;
        color: white;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        font-size: 16px;
    }

    .login-container button:hover {
        background-color: #45a049;
    }

    .login-container .signup-button {
        background-color: #007BFF;
    }

    .login-container .signup-button:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>
<div class="navbar">
    <a href="/user/home">Home</a>
    <a href="#virtual-tour">Virtual Tour</a>
    <a href="#advanced-search">Advanced Search</a>
    <a href="#books">Books</a>
    <a href="#quiz">Quiz</a>
    <a href="#kiosk">Kiosk</a>
    <a href="/logout">Logout</a>
</div>
<div class="login-container">
    <h1>Login</h1>
    <form action="userlogin" method="post">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
        <input type="email" id="email" name="email" placeholder="Email Id" required>
        <input type="password" id="password" name="password" placeholder="Password" required>
        <button type="submit">Login</button><br><br>
        <button type="button" class="signup-button" onclick="window.location.href='register'">Sign Up</button>
    </form>
</div>
</body>
</html>