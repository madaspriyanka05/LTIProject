<html>

<link rel="stylesheet" href="Registration.css">

<body>
<pre></pre>
<form action="">

  <div class="container">
    <h1>Register</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>
 	<label for="email"><b>FirstName</b></label>
    <input type="text" placeholder="Enter FirstName" name="fname" required>
    
    <label for="email"><b>MiddleName</b></label>
    <input type="text" placeholder="Enter MiddleName" name="mname" >
    
    <label for="email"><b>LastName</b></label>
    <input type="text" placeholder="Enter LastName" name="lname" required>
    
    <label for="email"><b>Gender</b></label>
  <hr>
    <input type="radio" name="gender" value="male"> Male<br><input type="radio" name="gender" value="female"> Female<br>
    <hr>
    <label>DOB</label>
	<input type="date">   
    <hr>
    <label>Address</label><hr>
    <textarea style="align:left" rows="4" cols="50">
	Enter Your address here
	</textarea>
    <hr>
    
    <label for="email"><b>Father's Name </b></label>
    <input type="text" placeholder="Enter Father's Name" name="faname" required>
    <hr>
    
    <label for="email"><b>Occupation Type </b></label>
    <input type="text" placeholder="Enter Occupation Type" name="otaname" required>
    <hr>
    
    <label for="email"><b>Income </b></label>
    <input type="text" placeholder="Enter Income" name="income" required>
    <hr>
    
    
    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required>

    <label for="psw-repeat"><b>Repeat Password</b></label>
    <input type="password" placeholder="Repeat Password" name="psw-repeat" required>
    <hr>

    <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
    <button type="submit" class="registerbtn">Register</button>
  </div>

  <div class="container signin">
    <p>Already have an account? <a href="#">Sign in</a>.</p>
  </div>
</form>
</body>
</html>