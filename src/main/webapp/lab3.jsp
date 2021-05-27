<%-- 
    Document   : lab3
    Created on : 11 мая 2021 г., 7:17:28
    Author     : Andrey
--%>

<%@page import="knu.fit.ist.ta.lab3.Lab3Task"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lab №3</h1> 
        <p>Fill an array of n natural numbers. Determine the number of elements with the maximum sum of digits.</p>
 
        <h2>our array</h2>
        <p><%=request.getAttribute("array")%></p>

        <h2>Number of elements with the maximum sum of digits:
            <%=request.getAttribute("ame")%>
        </h2>
        
        <div>
            <form action="index.jsp">
                <input type="submit" value="HOME">
            </form>
        </div>
        
    </body>
</html>

