package test;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;

@WebServlet("/dis")

public class DisplayServlet implements Servlet {

	@Override
	public void init(ServletConfig scf) throws ServletException {

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String userid = req.getParameter("uid");
		String ufirstname= req.getParameter("ufname");
		String ulastname = req.getParameter("ulname");
		String umail = req.getParameter("umail");
		String uphn = req.getParameter("uphn");
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		pw.println("+++++++++++++Customer Details++++++++++++++++");
		pw.println("<br>UserId: " +userid);
		pw.println("<br>UserFirstName: " +ufirstname );
		pw.println("<br>UseerLastName: " +ulastname );
		pw.println("<br>UsermailId: " + umail);
		pw.println("<br>UserPhoneNo: " + uphn);
		
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
