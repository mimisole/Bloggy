package uk.ac.dundee.computing.aec;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.sql.*;
import java.sql.*;

public class Logout extends HttpServlet   
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		HttpSession ls = req.getSession(false);  
           
        if(ls!=null)  
            ls.invalidate();  
              
        res.setHeader("Cache-Control","no-cache");   
        res.setHeader("Cache-Control","no-store");   
        res.setDateHeader("Expires", 0);   
        res.setHeader("Pragma","no-cache");   
            
        res.sendRedirect("index.jsp");
	}
}