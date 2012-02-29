<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<%@ page import="java.util.*,java.sql.*"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="style.css" />

<title>Registration</title>
</head>

<body>
    <div id="page">
		
        <div id="header">
        	<h1>Gossip </h1>
            <h2>The first Gossip in dundee is here!</h2>
            
      </div>
        <div id="bar">
            <ul>
                <li><a href="index.jsp">Welcome page</a></li>
              

            </ul>
      </div>
	<form action="input" method="post">
		<table>
		<tr><td>Name: </td>   <td> <input type="text" name="firstname"></td></tr>
		<tr><td>Surname: </td>   <td><input type="text" name="lastname"></td> </tr>
		<tr><td>Email: </td>   <td> <input type="text" name="mail"></td></tr>
		<tr><td>Password: </td>   <td><input type="password" name="pass"></td> </tr>
		<tr><td>Re-Password: </td>   <td><input type="password" name="re-password"></td> </tr>
		<tr></tr>
		<tr><td>Town: </td>   <td><input type="text" name="mytown"></td> </tr>
		<tr><td>Status: </td>   <td> <input type="text" name="mystatus"></td></tr>
		<tr><td><input type=submit value="Register"></td>   </tr>
		</table>
		</form>
		
        </div>
		 

</div>
</body>
</html>
