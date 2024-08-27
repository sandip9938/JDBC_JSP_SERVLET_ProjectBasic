package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/div")
public class Div extends GenericServlet{
	@Override
	public void init(ServletConfig cfs) throws ServletException
	{
		//No code
	}
	@Override
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		int v1 =  Integer.parseInt(req.getParameter("v1"));
		int v2 =  Integer.parseInt(req.getParameter("v2"));
		int v3= v1/v2;
		PrintWriter printWriter=res.getWriter();
	res.setContentType("text/html");
	printWriter.println("Divison : "+v3+"<br>");
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