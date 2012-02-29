package uk.ac.dundee.computing.aec;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.sql.*;
import java.sql.*;
import java.text.*;

public class Login extends HttpServlet
{
	static Connection myConnection = null;
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{	
			
		HttpSession currentSession = req.getSession(true);
		ErrorMessageBean errorBean = (ErrorMessageBean)currentSession.getAttribute("errorBean");
		
		
		
		String mail = req.getParameter("Email");
		String pass = req.getParameter("password");
		PreparedStatement pst = null;
		String searchQuery = "SELECT * FROM user WHERE email = ? AND password = ? ";
		try 
		{
			Class.forName("org.gjt.mm.mysql.Driver");
			myConnection = DriverManager.getConnection("jdbc:mysql://arlia.computing.dundee.ac.uk/ddemetriou","ddemetriou","ac31004");
			pst = myConnection.prepareStatement(searchQuery);
			pst.setString(1, mail);
			pst.setString(2, pass);
			ResultSet rs;
			
			rs = pst.executeQuery();
			
			
			if (rs.next())
			{		
				int id = rs.getInt("iduser");
				String ForeName = rs.getString("name");
				String Surname = rs.getString("surname");
				String Email = rs.getString("email");
				String Town = rs.getString("town");
				String Status = rs.getString("status");
				
				
				rs.close();
				myConnection.close();
			
				LoginBean profileBean;
				if (req.getSession().getAttribute("profileBean") == null)
				{
					profileBean = new LoginBean();
				}
				else
				{
					profileBean = (LoginBean)req.getSession().getAttribute("ProfileBean");
				}
				profileBean.setid(id);
				profileBean.setFirstName(ForeName);
				profileBean.setSurname(Surname);
				profileBean.setEmail(Email);
				profileBean.setTown(Town);
				profileBean.setStatus(Status);
				req.getSession().setAttribute("ProfileBean", profileBean);
				res.sendRedirect("profile.jsp");
				
			}
			else
			{
				errorBean.setErrorMessage("Incorrect Username/Password!");
				rs.close();
				myConnection.close();
				RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
				rd.forward(req,res);
				
			}
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