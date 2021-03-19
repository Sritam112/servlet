   package servlet.nt.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginurl")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
	String user=req.getParameter("uname");
	String pass=req.getParameter("pwd");
	System.out.println(user+"...................."+pass);
	if (user.equalsIgnoreCase("sritam@gmail.com")&&pass.equalsIgnoreCase("swosti")) {
		pw.println("<h1 style='color:red;text-align:center'>welcome sritam <h1>");
		
	}
	else
	pw.println("<h1 style='color:red;text-align:center'>oops wrong <h1>");
	pw.println("<br> <a href='Login.html'>HOME</a>");
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		doGet(req, res);
	}

}
