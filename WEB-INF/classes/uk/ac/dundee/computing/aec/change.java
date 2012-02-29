package uk.ac.dundee.computing.aec;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.sql.*;
import java.sql.*;

public class change extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{	
		HttpSession session = request.getSession(true);
		LoginBean ProfileBean = (LoginBean)session.getAttribute("ProfileBean");
		
		int id = ProfileBean.getid();
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String mail=request.getParameter("mail");
		String pass=request.getParameter("pass");
		String mytown=request.getParameter("mytown");
		String mystatus=request.getParameter("mystatus");

        try{
		
			
			
         Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://arlia.computing.dundee.ac.uk/ddemetriou","ddemetriou","ac31004");
           Statement st=con.createStatement();
		   
		   int i=st.executeUpdate("UPDATE user SET name = '"+firstname+"' Where iduser='"+id+"'"); 
			
		   
		
		response.sendRedirect("http://ac31004.computing.dundee.ac.uk:8080/demetrisdemetriou/profile.jsp");
        }
        catch(Exception e){
        System.out.print(e);
        e.printStackTrace();
        }
    }
}