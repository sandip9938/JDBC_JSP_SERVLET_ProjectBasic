package test;

import jakarta.servlet.GenericServlet;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/cal")

public class Choice extends GenericServlet {
 @Override
	public void init(ServletConfig Cfs)throws ServletException
	{
		// No Code
	}
 @Override
 public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
 {
	 String s1 = req.getParameter("s1");
	 if(s1.equals("PRIME"))
	 {
		 RequestDispatcher requestDispatcher = req.getRequestDispatcher("prime");
		 requestDispatcher.forward(req, res);
	 }
	 else if(s1.equals("FACTOR"))
	 {
		 RequestDispatcher requestDispatcher = req.getRequestDispatcher("factor");
		 requestDispatcher.forward(req, res);
	 }
	 else if(s1.equals("FACTORIAL"))
	 {
		 RequestDispatcher requestDispatcher = req.getRequestDispatcher("factorial");
		 requestDispatcher.forward(req, res);
	 }
	 else if(s1.equals("SQARE"))
	 {
		 RequestDispatcher requestDispatcher = req.getRequestDispatcher("sqare");
		 requestDispatcher.forward(req, res);
	 }
 }
 @Override
 public void destroy()
 {
	 
 }
 @Override
 public String getServletInfo()
 {
	 return " ";
 }
 @Override
 public ServletConfig getServletConfig()
 {
	 return this.getServletConfig();
 }
}
