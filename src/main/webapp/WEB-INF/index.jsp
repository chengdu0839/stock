<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="com.zw.stock.model.Firm"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
<%
List<Firm> firms = (List<Firm>) request.getAttribute( "firms" );
%>
<%
for (Firm firm : firms) {
pageContext.setAttribute("firstname", firm.getName() );
%>
<div>${firstname}</div>
<%
}
%>
</body>
</html>
