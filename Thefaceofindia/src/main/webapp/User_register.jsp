<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

/* Add a background color when the inputs get focus */
input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Set a style for all buttons */
button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

button:hover {
  opacity:1;
}

/* Extra styles for the cancel button */
.cancelbtn {
  padding: 14px 20px;
  background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn {
  float: left;
  width: 50%;
}

/* Add padding to container elements */
.container {
  padding: 16px;
}



/* Modal Content/Box */
.modal-content {
  background-color: #fefefe;
  margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
  border: 1px solid #888;
  width: 80%; /* Could be more or less, depending on screen size */
}

/* Style the horizontal ruler */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}
 
/* The Close Button (x) */
.close {
  position: absolute;
  right: 35px;
  top: 15px;
  font-size: 40px;
  font-weight: bold;
  color: #f1f1f1;
}

.close:hover,
.close:focus {
  color: #f44336;
  cursor: pointer;
}

/* Clear floats */
.clearfix::after {
  content: "";
  clear: both;
  display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
  .cancelbtn, .signupbtn {
     width: 100%;
  }
}
</style>
<script> 
function validate()
{ 
     var bfnm = document.form.bfnm.value;
     var blnm = document.form.blnm.value; 
     int bcont = document.form.bcont.value;
     var bem = document.form.bem.value;
     var badd = document.form.badd.value;
     var bpass = document.form.bpass.value;
     var bpassword= document.form.bpassword.value;
     
     if (bfnm==null || bfnm=="")
     { 
     alert("First Name can't be blank"); 
     return false; 
     }
     else if (blnm==null || blnm=="")
     { 
     alert("Last Name can't be blank"); 
     return false;
     }
     if (bcont==null || bcont=="")
     { 
     alert("Contact Number can't be blank"); 
     return false;
     }
     else if (bem==null || bem=="")
     { 
     alert("Email can't be blank"); 
     return false; 
     }
     else if (badd==null || badd=="")
     { 
     alert("City can't be blank"); 
     return false; 
     }
     else if(bpass.length<8)
     { 
     alert("Password must be at least 6 characters long."); 
     return false; 
     } 
     else if (bpass!=bpassword)
     { 
     alert("Confirm Password should match with the Password"); 
     return false; 
     } 
 } 
</script>
<body bgcolor="#214b7a">

  
  <form class="modal-content" action="User_reg" method="post" onsubmit="return validate()">
    <div class="container">
      <h1>Sign Up</h1>
      <p>Please fill in this form to create an account.</p>
      <hr>
     
      
      <label for="bname"><b>First Name:</b></label>
      <input type="text" placeholder="Enter Your Name" name="bfnm" required>
      
      <label for="bname"><b>Last Name:</b></label>
      <input type="text" placeholder="Enter Your Name" name="blnm" required>
      
       <label for="contact"><b>Enter Contact No:</b></label>
      <input type="text" placeholder="Must be 10 digit number" name="bcont" required>
      
      <label for="bmail"><b>Email ID:</b></label>
      <input type="text" placeholder="Enter Valid Mail" name="bem" required>

      <label for="Address"><b>Enter City:</b></label>
      <input type="text" placeholder="Enter Address" name="badd" required>

      <label for="psw"><b>Password:</b></label>
      <input type="password" placeholder="Password Must 8 Character Long" name="bpass" required>

      <label for="psw"><b>Conform Password:</b></label>
      <input type="password" placeholder="Retype Password" name="bpassword" required>
     
     <td><%=(request.getAttribute("errMessage") == null) ? ""
         : request.getAttribute("errMessage")%></td>
      <div class="clearfix"> 
      <a href="FOI_Home.html"><button type="button"  class="cancelbtn">Cancel</a></button>
        <button type="submit" class="signupbtn">Sign Up</button>

      </div>
    </div>
  </form>
</html>