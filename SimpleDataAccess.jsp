<%@ page import="java.util.*,java.sql.*"%>
<html>
<body>
<%
try
{
     Class.forName("org.gjt.mm.mysql.Driver");
}
catch(Exception E)
{
     System.out.println("First: " + E);
		 %>
		 <p>Can not get Class <%=E%>	 
<%
}
String username = request.getParameter("username").toString();
String pass = request.getParameter("password").toString();
String data = "";
boolean correct = false;
try
{
Connection MyConnection= DriverManager.getConnection("jdbc:mysql://arlia.computing.dundee.ac.uk/ddemetriou","ddemetriou","ac31004");

Statement st= null;
ResultSet rs;
 st = MyConnection.createStatement();
 rs = st.executeQuery("SELECT * FROM User WHERE  email='"+username+"' AND password='"+pass+"'");
 

 if(rs.next())

                {

                    

                   if(rs.getInt(1)>0)

                        {

                           session.setAttribute("email",username);

                           session.setAttribute("password",pass);
						   correct = true;
                        }

                }
			
				response.sendRedirect("login");
 rs.close();
 MyConnection.close();
}

catch(Exception e) 
{

      e.printStackTrace();
      out.println("Doesn't work");

    }
%> 
</body>
</html>