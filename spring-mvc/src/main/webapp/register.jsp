<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>						<!-- multi part form data as an input in the form-->
<form method="post"  action="register.lti"   enctype="multipart/form-data">
Enter your name: <input type ="text" name="name" /><br/>
Enter your email: <input type ="text" name="emai" /><br/>
Select your Picture: <input type ="file" name="profilePic" /><br/>
<button type="submit">Register</button>
</form>
</body>
</html>