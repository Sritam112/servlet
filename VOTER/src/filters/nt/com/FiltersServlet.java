package filters.nt.com;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FiltersServlet extends HttpFilter {
	@Override
	public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		long start=0,end=0;
		//
//		get request trapping time
		start=System.currentTimeMillis();// request proccesing logic 
		chain.doFilter(request, response);
		//get request proccecing logic
		end=System.currentTimeMillis();//responce proccecing logic
		System.out.println(request.getRequestURI()+"has taken "+(end -start)+"ns to process the request");
		
		
		
	}

}
