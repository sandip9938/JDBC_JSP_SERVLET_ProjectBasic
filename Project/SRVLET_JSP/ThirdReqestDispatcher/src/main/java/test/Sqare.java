package test;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/sqare")

public class Sqare extends GenericServlet {
 @Override
	public void init(ServletConfig Cfs)throws ServletException
	{
		// No Code
	}
 @Override
 public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
 {

	 int en = Integer.parseInt(req.getParameter("en"));
		PrintWriter pWriter = res.getWriter();
		res.setContentType("text/html");
		int f=en*en;
		pWriter.println(f);
		RequestDispatcher rDispatcher = req.getRequestDispatcher("input.html");
		rDispatcher.include(req, res);
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
