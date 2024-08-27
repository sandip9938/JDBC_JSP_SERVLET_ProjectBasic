package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/dis")

public class Submit extends GenericServlet{
	@Override
      public void init(ServletConfig cfs)throws ServletException
     {
		
     }
	@Override
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
	{
		String Submit= req.getParameter("Submit");
		if(Submit.equals("Submit"))
		{
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("submit");
			requestDispatcher.forward(req, res);
		}
		
	}
	public void destroy()
	{
		
	}
}

