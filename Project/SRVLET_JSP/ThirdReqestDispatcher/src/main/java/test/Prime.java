package test;

import jakarta.servlet.GenericServlet;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/prime")

public class Prime extends GenericServlet {
	@Override
	public void init(ServletConfig Cfs) throws ServletException {
		// No Code
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int en = Integer.parseInt(req.getParameter("en"));
		PrintWriter pWriter = res.getWriter();
		res.setContentType("text/html");

		if (en != 1)// 12
		{
			int f = 1;
			for (int i = 2; i <= en / 2; i++) {
				if (en % i == 0) {
					f = 0;
					break;
				}
			}

			pWriter.println(f == 1 ? "Its a Prime Number" : "Its not a prime number");
			RequestDispatcher rDispatcher = req.getRequestDispatcher("input.html");
			rDispatcher.include(req, res);
		} else {
			pWriter.println("Its not  a Prime Number");
			RequestDispatcher rDispatcher = req.getRequestDispatcher("input.html");
			rDispatcher.include(req, res);
		}
	}

	@Override
	public void destroy() {

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
