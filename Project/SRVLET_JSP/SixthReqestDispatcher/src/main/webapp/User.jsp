<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>-------User Details---------</h1>
<%
String ufn=request.getParameter("ufn" );
String uln=request.getParameter("uln");
String uad=request.getParameter("uad");
String umid=request.getParameter("umid");
String uno = request.getParameter("uno");
out.print("User First Name : "+ufn +"<br>");
out.print("User Last name : "+uln+"<br>");
out.print("User Address : "+uad+"<br>");
out.print("User MailId : "+umid+"<br>");
out.print("User Phone No : "+uno+"<br>");
%>

</body>
</html>