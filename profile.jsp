	<jsp:useBean
	id="ProfileBean"
	scope="session"
	class="uk.ac.dundee.computing.aec.LoginBean" />
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="style.css" />

<title>Profile</title>
</head>

<body>
    <div id="page">
		
        <div id="header">
        	<h1>Gossip </h1>
            <h2>The first Gossip in dundee is here!</h2>
            
      </div>
        <div id="bar">
            <ul>
                <li><a href="home.jsp">Home</a></li>
                <li><a href="profile.jsp">Profile</a></li>
                <li><a href="#">Messege</a></li>
                <li><a href="friends.html">My Friends</a></li>
				<li><a href="Logout">Log out<a/></li>
            </ul>
      </div>
	 
        </div>
		 <div class="contentText"> <h1> Profile</h1></div>
		 <form action="edit.jsp" method="post">
		 <table>
		 id: <jsp:getProperty name="ProfileBean" property="id"/> 
		<tr><td>Name: </td> <td> <jsp:getProperty name="ProfileBean" property="FirstName"/> </td></tr>
		<tr><td>Surname: </td> <td><jsp:getProperty name="ProfileBean" property="Surname"/> </td> </tr>
		<tr><td>Email: </td> <td><jsp:getProperty name="ProfileBean" property="Email"/> </td> </tr>
		<tr><td>Town: </td> <td><jsp:getProperty name="ProfileBean" property="Town"/> </td> </tr>
		<tr><td>Status: </td> <td><jsp:getProperty name="ProfileBean" property="Status"/> </td> </tr>
		<tr><td><input type=submit value="Edit"></td>   </tr>
		</table>
		</form>
		
</div>
</body>
</html>
