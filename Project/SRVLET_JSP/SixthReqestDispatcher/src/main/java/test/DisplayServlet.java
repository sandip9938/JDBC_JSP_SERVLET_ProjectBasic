package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/dis")
public class DisplayServlet extends GenericServlet{

	public void init()throws ServletException
	{
		// No code
	}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		String submit=req.getParameter("submit");
		if(submit.equals("submit"))
		{
			RequestDispatcher rDispatcher= req.getRequestDispatcher("User.jsp");
			rDispatcher.forward(req, res);
		}
	}
	public void destroy() {
		
	}
}
