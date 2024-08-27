package text;

import java.io.*;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/dis")

public class Displayservlet implements Servlet {

	@Override
	public void init(ServletConfig scf) throws ServletException {

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String eidString = req.getParameter("eid");
		String enameString = req.getParameter("ename");
		String edsgString = req.getParameter("edsg");
		String ebsalString = req.getParameter("ebsal");
		String eharString = req.getParameter("ehra");
		String edaString = req.getParameter("eda");
		PrintWriter printWriter = res.getWriter();
		res.setContentType("text/html");
		printWriter.println("+++++++++++++++Employee Details++++++++++++++");
		printWriter.println("<br> Employee Id: " + ebsalString);
		printWriter.println("<br> Employee Name: " + enameString);
		printWriter.println("<br> Employee designation: " + edsgString);
		printWriter.println("<br> Employee BasicSlary : " + ebsalString);
		printWriter.println("<br> Employee HAR : " + eharString);
		printWriter.println("<br> Employee BA : " + edaString);
		// Integer tsal=Integer.parseInt(ebsalString+edaString+eharString);
		Integer ebsalInteger = Integer.parseInt(ebsalString);
		Integer eharInteger = Integer.parseInt(eharString);
		Integer edaInteger = Integer.parseInt(edaString);
		// String tsal1 = String.valueOf(tsal);
		printWriter.println("<br> Total Salary : " + (ebsalInteger + eharInteger + edaInteger));

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
