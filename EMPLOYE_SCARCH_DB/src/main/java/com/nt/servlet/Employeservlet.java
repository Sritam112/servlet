package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/empurl")
public class Employeservlet extends HttpServlet {
	private static final String Get_Emp_dit="SELECT EMPNO,EMPNAME,DEGINATION,SALARY  FROM EMPLOYE WHERE EMPNO=?";
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		//get printwriter 
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		int no=Integer.parseInt(req.getParameter("eno"));
		ServletConfig cg=getServletConfig();
		 String driver=cg.getInitParameter("driver");
		try {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//Jdbc code 
		try (Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","root")){
			     try(PreparedStatement ps=con.prepareStatement(Get_Emp_dit)) {
					ps.setInt(1, no);
					try(ResultSet rs =ps.executeQuery()){
						//process the resultset object
						if (rs.next()) {
							pw.println("<h1 style='color:blue;text-align:center'>"+no+"eploye details are</h1>");
							pw.println("<h1 style='color:green;text-align:center'> EMP NO::"+rs.getInt(1)+"</h1>");
							pw.println("<h1 style='color:green ;text-align:center'>EMP NAME::"+rs.getString(2)+  "</h1>");
							pw.println("<h1 style='color:green;text-align:center'>EMP JOB::"+rs.getString(3)+"</h1>");
							pw.println("<h1 style='color:red;text-align:center'> EMP SALARY::"+rs.getInt(4)+"</h1>");
							
						}
						
						else {
							pw.println("<h1 style='color:red;text-align:center'>EMPLOYE NO NOT FOUND </h1>  ");
						}
						pw.println("<h3 style='color:green;text-align:center'><a href='input.html'>HOME </a></h3>  ");
					}//3 rd try
				}//2nd try
			
			
		} //1st try
		catch (SQLException e) {
			e.printStackTrace();
			
		}
		 catch(Exception e) {
				e.printStackTrace();
				
			}
	
		
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}

}
