<%@ page import="java.util.*,java.sql.*"%>
<%
try{
     Class.forName("org.gjt.mm.mysql.Driver");
}catch(Exception E){
     System.out.println("First: " + E);
		 %>
		 
		 <p>Can not get Class <%=E%>
<%
}
try {
Connection MyConnection= DriverManager.getConnection("jdbc:mysql://arlia.computing.dundee.ac.uk/ddemetriou","ddemetriou","ac31004");

Statement st=null;
ResultSet rs=null;
 st = MyConnection.createStatement();
 rs = st.executeQuery("Select * FROM user );
 
 		System.out.println("connect");
 }
 rs.close();
 MyConnection.close();
 
 }catch(Exception E){
     System.out.println("Second: " + E);
		 %><p>Can not execute query <%=E%><%
}
%> 
