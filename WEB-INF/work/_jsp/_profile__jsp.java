/*
 * JSP generated by Resin-3.0.21 (built Thu, 10 Aug 2006 12:03:19 PDT)
 */

package _jsp;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public class _profile__jsp extends com.caucho.jsp.JavaPage{
  private boolean _caucho_isDead;
  
  public void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response)
    throws java.io.IOException, javax.servlet.ServletException
  {
    javax.servlet.http.HttpSession session = request.getSession(true);
    com.caucho.server.webapp.Application _jsp_application = _caucho_getApplication();
    javax.servlet.ServletContext application = _jsp_application;
    com.caucho.jsp.PageContextImpl pageContext = com.caucho.jsp.QJspFactory.allocatePageContext(this, _jsp_application, request, response, null, session, 8192, true, false);
    javax.servlet.jsp.JspWriter out = pageContext.getOut();
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.Servlet page = this;
    response.setContentType("text/html");
    try {
      out.write('	');
      uk.ac.dundee.computing.aec.LoginBean ProfileBean;
      synchronized (session) {
        ProfileBean = (uk.ac.dundee.computing.aec.LoginBean) session.getAttribute("ProfileBean");
        if (ProfileBean == null) {
          ProfileBean = new uk.ac.dundee.computing.aec.LoginBean();
          session.setAttribute("ProfileBean", ProfileBean);
        }
      }
      out.write(_jsp_string0, 0, _jsp_string0.length);
        out.print(((uk.ac.dundee.computing.aec.LoginBean) pageContext.findAttribute("ProfileBean")).getid());
      out.write(_jsp_string1, 0, _jsp_string1.length);
        out.print(((uk.ac.dundee.computing.aec.LoginBean) pageContext.findAttribute("ProfileBean")).getFirstName());
      out.write(_jsp_string2, 0, _jsp_string2.length);
        out.print(((uk.ac.dundee.computing.aec.LoginBean) pageContext.findAttribute("ProfileBean")).getSurname());
      out.write(_jsp_string3, 0, _jsp_string3.length);
        out.print(((uk.ac.dundee.computing.aec.LoginBean) pageContext.findAttribute("ProfileBean")).getEmail());
      out.write(_jsp_string4, 0, _jsp_string4.length);
        out.print(((uk.ac.dundee.computing.aec.LoginBean) pageContext.findAttribute("ProfileBean")).getTown());
      out.write(_jsp_string5, 0, _jsp_string5.length);
        out.print(((uk.ac.dundee.computing.aec.LoginBean) pageContext.findAttribute("ProfileBean")).getStatus());
      out.write(_jsp_string6, 0, _jsp_string6.length);
    } catch (java.lang.Throwable _jsp_e) {
      pageContext.handlePageException(_jsp_e);
    } finally {
      com.caucho.jsp.QJspFactory.freePageContext(pageContext);
    }
  }

  private java.util.ArrayList _caucho_depends = new java.util.ArrayList();

  public java.util.ArrayList _caucho_getDependList()
  {
    return _caucho_depends;
  }

  public void _caucho_addDepend(com.caucho.make.PersistentDependency depend)
  {
    super._caucho_addDepend(depend);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  public boolean _caucho_isModified()
  {
    if (_caucho_isDead)
      return true;
    if (com.caucho.util.CauchoSystem.getVersionId() != -6418134904411496499L)
      return true;
    for (int i = _caucho_depends.size() - 1; i >= 0; i--) {
      com.caucho.make.Dependency depend;
      depend = (com.caucho.make.Dependency) _caucho_depends.get(i);
      if (depend.isModified())
        return true;
    }
    return false;
  }

  public long _caucho_lastModified()
  {
    return 0;
  }

  public void destroy()
  {
      _caucho_isDead = true;
      super.destroy();
  }

  public void init(com.caucho.vfs.Path appDir)
    throws javax.servlet.ServletException
  {
    com.caucho.vfs.Path resinHome = com.caucho.util.CauchoSystem.getResinHome();
    com.caucho.vfs.MergePath mergePath = new com.caucho.vfs.MergePath();
    mergePath.addMergePath(appDir);
    mergePath.addMergePath(resinHome);
    com.caucho.loader.DynamicClassLoader loader;
    loader = (com.caucho.loader.DynamicClassLoader) getClass().getClassLoader();
    String resourcePath = loader.getResourcePathSpecificFirst();
    mergePath.addClassPath(resourcePath);
    com.caucho.vfs.Depend depend;
    depend = new com.caucho.vfs.Depend(appDir.lookup("profile.jsp"), 6808443502881431841L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string6;
  private final static char []_jsp_string2;
  private final static char []_jsp_string1;
  private final static char []_jsp_string0;
  private final static char []_jsp_string4;
  private final static char []_jsp_string5;
  private final static char []_jsp_string3;
  static {
    _jsp_string6 = " </td> </tr>\r\n		<tr><td><input type=submit value=\"Edit\"></td>   </tr>\r\n		</table>\r\n		</form>\r\n		\r\n</div>\r\n</body>\r\n</html>\r\n".toCharArray();
    _jsp_string2 = " </td></tr>\r\n		<tr><td>Surname: </td> <td>".toCharArray();
    _jsp_string1 = " \r\n		<tr><td>Name: </td> <td> ".toCharArray();
    _jsp_string0 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.1//EN\" \"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n<head>\r\n\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\r\n\r\n<title>Profile</title>\r\n</head>\r\n\r\n<body>\r\n    <div id=\"page\">\r\n		\r\n        <div id=\"header\">\r\n        	<h1>Gossip </h1>\r\n            <h2>The first Gossip in dundee is here!</h2>\r\n            \r\n      </div>\r\n        <div id=\"bar\">\r\n            <ul>\r\n                <li><a href=\"home.jsp\">Home</a></li>\r\n                <li><a href=\"profile.jsp\">Profile</a></li>\r\n                <li><a href=\"#\">Messege</a></li>\r\n                <li><a href=\"friends.html\">My Friends</a></li>\r\n				<li><a href=\"Logout\">Log out<a/></li>\r\n            </ul>\r\n      </div>\r\n	 \r\n        </div>\r\n		 <div class=\"contentText\"> <h1> Profile</h1></div>\r\n		 <form action=\"edit.jsp\" method=\"post\">\r\n		 <table>\r\n		 id: ".toCharArray();
    _jsp_string4 = " </td> </tr>\r\n		<tr><td>Town: </td> <td>".toCharArray();
    _jsp_string5 = " </td> </tr>\r\n		<tr><td>Status: </td> <td>".toCharArray();
    _jsp_string3 = " </td> </tr>\r\n		<tr><td>Email: </td> <td>".toCharArray();
  }
}
