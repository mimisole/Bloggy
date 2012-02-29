package uk.ac.dundee.computing.aec;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.sql.*;
import java.sql.*;
import java.text.*;
import java.util.*;

public class change extends HttpServlet
{
	static Connection myConnection = null;
	
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
		
		
		PreparedStatement pst = null;
		String updateQuery = "UPDATE user SET  user.name = ?, user.surname = ?, user.town=?, user.status=? WHERE iduser = ? ";
		//String updateQuery = "INSERT INTO user(name, surname) VALUES(?,?) WHERE iduser = ?;
			System.out.println(id);
			System.out.println(firstname);
			System.out.println(lastname);
			System.out.println(mail);
        try{
		
			
			
			Class.forName("com.mysql.jdbc.Driver");
			myConnection = DriverManager.getConnection("jdbc:mysql://arlia.computing.dundee.ac.uk/ddemetriou","ddemetriou","ac31004");
			pst = myConnection.prepareStatement(updateQuery);
			
			pst.setString(1, firstname);
			pst.setString(2, lastname);
			pst.setString(3, mytown);
			pst.setString(4, mystatus);
			pst.setInt(5, id);
			//Statement st=con.createStatement();
		   
			//int i=st.executeUpdate("UPDATE user SET name = '"+firstname+"' Where iduser='"+id+"'"); 
			int i = pst.executeUpdate();
			
		   
		
			response.sendRedirect("profile.jsp");
        }
        catch(Exception e){
			System.out.print(e);
			e.printStackTrace();
        }
    }
}