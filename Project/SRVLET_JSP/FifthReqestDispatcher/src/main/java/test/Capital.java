package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/submit")

public class Capital extends GenericServlet{
	@Override
      public void init(ServletConfig cfs)throws ServletException
     {
		
     }
	@Override
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
	{
		String s1= req.getParameter("state");
		PrintWriter printWriter= res.getWriter();
		res.setContentType("text/html");
		if(s1.equals("Odisha"))
		{
			printWriter.println("Capital of Odisha : Bhubaneswar ");
		}
		else if(s1.equals("Sikim"))
		{
			printWriter.println("Capital of Sikim : Gangtok ");
		}
		else if(s1.equals("Delhi"))
		{
			printWriter.println("Capital of Delhi : Delhi");
		}
		else if(s1.equals("Up"))
		{
			printWriter.println("Capital of Up : Lucknow ");
		}
		else if(s1.equals("Telengana"))
		{
			printWriter.println("Capital of Telengana : Hyderabad ");
		}
		else if(s1.equals("Mp"))
		{
			printWriter.println("Capital of Mp : Bhopal ");
		}
		else if(s1.equals("Hr"))
		{
			printWriter.println("Capital of Hr : Chandigad(Hr) ");
		}
		else if(s1.equals("Pb"))
		{
			printWriter.println("Capital of Punjab : Chandigad(Pb) ");
		}
		
	}
	public void destroy()
	{
		
	}
}
