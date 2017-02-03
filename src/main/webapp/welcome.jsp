<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%
application.setAttribute("ctx", request.getContextPath());
response.sendRedirect(request.getContextPath() + "/index.jsp");
%>