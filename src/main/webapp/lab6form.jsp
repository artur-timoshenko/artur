<%-- 
    Document   : lab6form
    Created on : 23 мая 2021 г., 09:10:46
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
        <form method="post" action="./lab6">
                <p>The first element of geometric progression</p>
                <input type="text" name="a" placeholder="enter a number"/>
                <p>Geometric progression step</p>
                <input type="text" name="q" placeholder="enter a number"/>
                <p>How many members of the geometric progression to look for</p>
                <input type="text" name="k" placeholder="enter a number"/>
                
                <p> </p>
                <input type="submit" value="ok"/>
        </form>
    </body>
</html>
