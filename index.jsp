	<jsp:useBean
	id="errorBean"
	scope="session"
	class="uk.ac.dundee.computing.aec.ErrorMessageBean" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="style.css" />

<title>Gossip</title>
</head>

<body>
    <div id="page">
		
        <div id="header">
        	<h1>Gossip </h1>
            <h2>The first Gossip in dundee is here!</h2>
            
      </div>
        <div id="bar">
            <ul>
                <li><a href="register.jsp">Register</a></li>
                

            </ul>
      </div>
	  <div class="contentTitle"><h1>Gossing news</h1></div>
        <div class="contentText">
          <p>This site is created for you to spread to the world the real gossip ;) </p>
        
        </div>
		<div> <h1> Log In</h1></div>
		
		<form action="login" method="post">
		<table>
		<tr><td>Login: </td>   <td> <input type="text" name="Email"></td></tr>
		<tr><td>Password: </td>   <td><input type="password" name="password"></td> </tr>
		<tr><td><input type=submit value="Login"></td>   </tr>
		</table>
		</form>
		
		<div> <a href ="register.jsp"> <h1> Sing up now </h1> </a> </div>
		
        
    
    
       
</div>
</body>
</html>
