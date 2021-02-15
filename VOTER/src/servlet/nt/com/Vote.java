package servlet.nt.com;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.servlet.*;
import javax.servlet.http.*;
public class Vote {
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException{
	PrintWriter pw=res.getWriter();
	res.setContentType("text/html");
	String name=req.getParameter("pname");
	int page=Integer.parseInt(req.getParameter("page"));
		String addr=req.getParameter("addr");
		if (page<18) 
			pw.println("<h1 style='color:red;text-align='center'>Mr/Miss/Mrs."+name+" u r not elgible to vote</h1>" );
			else
			pw.println("<h1 style='color:green;text-align='center'>Mr/Miss/Mrs."+name+" u r  elgible for voting</h1>" );
 pw.println("<a href='http://localhost:4040/VOTER/form.html'></a>");
		pw.close();
}
	
	//http://localhost:3030/
}
