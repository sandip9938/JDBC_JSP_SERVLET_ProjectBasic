package test;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/dis")
public class Click extends GenericServlet {

	@Override
	public void init(ServletConfig cfs) throws ServletException {
		// No Code
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		
		String clickString = req.getParameter("click");
		if(clickString.equals("Click")) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("Personal.jsp");
			requestDispatcher.forward(req, res);
		}

	}

	@Override
	public void destroy() {

	}
}
