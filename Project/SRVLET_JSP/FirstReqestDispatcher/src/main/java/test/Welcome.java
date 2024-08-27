package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/welcome")
public class Welcome extends GenericServlet {
	@Override
	public void init(ServletConfig cfs) throws ServletException
	{
		
	}
	public void service(ServletRequest req, ServletResponse res)throws ServletException,IOException
	{
		String unameString=req.getParameter("uname");
		String upString = req.getParameter("up");
		PrintWriter printWriter= res.getWriter();
		res.setContentType("text/html");
		printWriter.println("Sucessfully Login");
		
	}
	@Override
	public void destroy()
	{
		
	}
	@Override
	public String getServletInfo() {
		return " ";
	}

	@Override
	public ServletConfig getServletConfig() {
		return this.getServletConfig();
	}
	
}
