<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>

</body>
</html><div class="login">

    <head>
        <h1>Login to JAN DHAN</h1>
        <link rel="stylesheet" href="login.css">
    </head>


    <form method="post" action="">
        <p><input type="text" name="login" value="" placeholder="Username or Email"></p>
        <p><input type="password" name="password" value="" placeholder="Password"></p>
        <p class="remember_me">
            <label>
              <input type="checkbox" name="remember_me" id="remember_me">
              Remember me on this computer
            </label>
        </p>
        <p class="submit"><input type="submit" name="commit" value="Login"></p>
    </form>
</div>

<div class="login-help">
    <p>Forgot your password? <a href="changePassword.jsp">Click here to reset it</a>.</p>
</div>