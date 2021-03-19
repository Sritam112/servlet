package com.nt.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.wrapper.MyRequst;


@WebFilter(filterName = "loginurl", urlPatterns = { "/loginurl" })
public class Servletfilter extends HttpFilter {

   

	public void doFilter(HttpServletRequest req ,HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
		MyRequst mreq=new MyRequst(req);
		chain.doFilter(mreq, res);
	}


}
