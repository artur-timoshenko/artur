<%-- 
    Document   : lab2
    Created on : 6 мая 2021 г., 8:58:06
    Author     : Andrey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>lab 2</title>
    </head>
    <h1>Lab №2</h1>
    
    <body>
        <h1>Formula</h1>
        <h2>d/(ax2+bx+c)</h2>
        <h3> Results: </h3>
        <p> <%=request.getAttribute("result")%> </p>

<form action="lab2form.jsp">
    <input type= "submit" value="Return to input X">
</form>
  
<a href="index.jsp">Home</a>
        
        
        
        

    </body>
</html>