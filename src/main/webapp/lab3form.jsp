<%-- 
    Document   : lab3form
    Created on : 11 мая 2021 г., 7:17:43
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
         <h1>Insert k</h1>
        
        <div>
            <form action="./lab3" method="post">
                
                <input type="text" name="k" placeholder="enter a number(array length)"/>
                <input type="submit" value="Ok"/>
            </form>
        </div>
    </body>
</html>