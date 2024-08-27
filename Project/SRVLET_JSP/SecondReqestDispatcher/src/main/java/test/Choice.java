package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/dis")
public class Choice extends GenericServlet {

	@Override
	public void init(ServletConfig cfs) throws ServletException
	{
		//No code
	}
	@Override
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		String s1 = req.getParameter("s1");
		if(s1.equals("ADD"))
		{
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("add");
			requestDispatcher.forward(req, res);
		}
		else if(s1.equals("SUB"))
		{
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("sub");
			requestDispatcher.forward(req, res);
		}
		else if(s1.equals("MUL"))
		{
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("mul");
			requestDispatcher.forward(req, res);
		}
		else if(s1.equals("DIV"))
		{
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("div");
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
