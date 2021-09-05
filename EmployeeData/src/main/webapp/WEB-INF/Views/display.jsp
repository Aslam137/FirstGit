<%@ page import ="com.technoelevate.Employee.DTO.EmployeeInformation"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
EmployeeInformation einfo=(EmployeeInformation) request.getAttribute("addEmp");
	String mssg=(String)request.getAttribute("msg");
	String name=einfo.getEmpname();
%>
<%=name %>
<%=mssg %>  </br></br>
${msg}
<a href="login"><input type="button" value="Logout"></a>
</body>
</html>