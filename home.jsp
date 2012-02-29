
	<jsp:useBean
	id="HomeBean"
	scope="session"
	class="uk.ac.dundee.computing.aec.PostBean" />
	
	

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
                <li><a href="home.jsp">Home</a></li>
                <li><a href="profile.jsp">Profile</a></li>
                <li><a href="Logout">Log out</a></li>

            </ul>
      </div>
	
        </div>
		 <div class="contentText"> <h1> Home</h1></div>
		 
		<form action="post" method="post">
		<table>
			<tr><td><textarea type="text" name="mystatus"></textarea></td><td><input type=submit value="post"><td></tr>
		<%
		
		
			String[] stores;
			stores=HomeBean.getStore();
			
			for (int i=0; i< HomeBean.getCounter(); i++)
		{
		%>
		
			<tr><td><h2><%=stores[i]%></h2></td><td></td></tr>
			<% } %>
		</table>
	
		</form>

</div>
</body>
</html>
