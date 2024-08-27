<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Personal Details</title>
</head>
<body>
	<%
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	String mno = request.getParameter("mno");
	String r1 = request.getParameter("r1");
	String cs1[] = request.getParameterValues("c1");
	%>
	<div align="center">
		<h2>Personal Details</h2>
		<table border="1" align="center">
			<tr>
				<th>Name</th>
				<th>Age</th>
				<th>Mobile No</th>
				<th>Gender</th>
				<th>Hobbies</th>

			</tr>

			<tr>
				<td><%=name%></td>
				<td><%=age%></td>
				<td><%=mno%></td>
				<td><%=r1%></td>
				<td>
					<%
					int c = cs1.length;
					

					for (int i = 0; i < cs1.length; i++) {
						out.print(cs1[i]);
						if (i < c - 1) {
							out.print(",");
						}
					}
					%>

				</td>

			</tr>

		</table>
	</div>

</body>
</body>
</html>