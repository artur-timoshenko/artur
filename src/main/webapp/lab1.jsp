<%-- 
    Document   : lab1
    Created on : 3 мая 2021 г., 11:07:42
    Author     : Andrey
--%>

<%@page import="knu.fit.ist.ta.FirstJavaClass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <h1>Lab №1</h1>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
      <%!FirstJavaClass nFJC = new FirstJavaClass(5);%>
        
        <%
          int x= nFJC.getMyInt();
          
          x+=3;
          x%=3;
          
         %>
        
         <p>8mod3 = <%=x%></p>
       
        <a href="index.jsp">Home</a>
    </body>
</html>
