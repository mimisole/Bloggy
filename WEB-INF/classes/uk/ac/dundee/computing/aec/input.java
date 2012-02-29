package uk.ac.dundee.computing.aec;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.sql.*;
import java.sql.*;

public class input extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{	
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String mail=request.getParameter("mail");
		String pass=request.getParameter("pass");
		String mytown=request.getParameter("mytown");
		String mystatus=request.getParameter("mystatus");
		if (mail== "")
		{
			response.sendRedirect("register.jsp");
		}
		else 
		{
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://arlia.computing.dundee.ac.uk/ddemetriou","ddemetriou","ac31004");
				Statement st=con.createStatement();
				int i=st.executeUpdate("insert into user(name,surname,email,password,town,status) values('"+firstname+"','"+lastname+"','"+mail+"','"+pass+"','"+mytown+"','"+mystatus+"')");
				
		
				response.sendRedirect("index.jsp");
				}
				catch(Exception e)
				{
				System.out.print(e);
				e.printStackTrace();
				}
        
        }
    }
}