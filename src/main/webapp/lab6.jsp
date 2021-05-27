<%-- 
    Document   : lab6
    Created on : 23 мая 2021 г., 09:51:05
    Author     : Andrey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lab№6</h1>
        
        <p>Geometric progression: <%=request.getAttribute("array")%></p>
        
        <div>
            <form action="lab6form.jsp">  
                <input type="submit" value="New values">
            </form> 
        </div>
        
        <div>
            <form action="index.jsp">  
                <input type="submit" value="Home">
            </form> 
        </div>
    </body>
</html>
