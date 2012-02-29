package uk.ac.dundee.computing.aec;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.sql.*;
import java.sql.*;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;
import java.sql.*;
public class post extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{	
		HttpSession session = req.getSession(true);
		LoginBean ProfileBean = (LoginBean)session.getAttribute("ProfileBean");
		
		String mypost=req.getParameter("mystatus");
		int userid = ProfileBean.getid();
		String userName = ProfileBean.getFirstName();
		String[] Stores = new String[50];
		
        try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://arlia.computing.dundee.ac.uk/ddemetriou","ddemetriou","ac31004");
			Statement st=con.createStatement();
			ResultSet rs;
			int j=st.executeUpdate("insert into posts(iduser,username,text) values('"+userid+"','"+userName+"','"+mypost+"')");
			String searchQuery = "SELECT * FROM posts WHERE iduser = '"+ userid +"'";
			rs = st.executeQuery(searchQuery);
			PostBean HomeBean = new PostBean();
			int i=0;
			int counter=0;
			
			while (rs.next())
			{	
				Stores[i]= rs.getString("text");
				counter ++;
				
			i++	;
			}
			
			rs.close();
			con.close();
			HomeBean.setCounter(counter);
			HomeBean.setStore(Stores);
			req.getSession().setAttribute("HomeBean", HomeBean);
			res.sendRedirect("http://ac31004.computing.dundee.ac.uk:8080/demetrisdemetriou/home.jsp");
			
			/**
			else
			{
				//errorBean.setErrorMessage("Incorrect Username/Password!");
				rs.close();
				con.close();
				RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
				rd.forward(req,res);
				
			}
			**/
        }
       catch(Exception E)
		{	
			System.out.println(E);
		}
    
	}
		
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		RequestDispatcher rd = req.getRequestDispatcher("profile.jsp");
		rd.forward(req,res);
	}
}