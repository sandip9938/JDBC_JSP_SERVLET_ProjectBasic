package test;
import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/dis")
public class Login extends GenericServlet{

	@Override
	public void init(ServletConfig cfs) throws ServletException
	{
		
	}
	@Override
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException
	{ 
		String usernameString = req.getParameter("uname");
		String userpasswordString = req.getParameter("up");
		if(usernameString.equals("abc")& userpasswordString.equals("123"))
		{
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("welcome");
			requestDispatcher.forward(req, res);
		}
		else {
			PrintWriter pWriter = res.getWriter();
			res.setContentType("text/html");
			pWriter.println(" Username and password Incorrect ");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("login.html");
			requestDispatcher.include(req, res);
		}
	
		
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
