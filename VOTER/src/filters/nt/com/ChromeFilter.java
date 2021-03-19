package filters.nt.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ChromeFilter extends HttpFilter {
@Override
public void init() throws ServletException {
	// TODO Auto-generated method stub
	//super.init()
	System.out.println("Browser Checking Filter.init()");
}
@Override
	protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		//super.doFilter(request, response, chain);
	System.out.println("Browser Checking Filter.doFilter()");
	String browser =req.getHeader("user-agent");
	if (!browser.contains("Chrome")) {
		PrintWriter pw=res.getWriter();
		pw.println("<h1 style ='color:red;text-align:center'>Request must given from chrome browser<h1>");	
		return;
	}
	else
	{
		System.out.println("Browser checking filter before chain.doFilter()");
	
	chain.doFilter(req, res);
	System.out.println("Browser checking filter after chain.doFilter()");
	}
	}

}
