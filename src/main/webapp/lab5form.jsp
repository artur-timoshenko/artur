<%-- 
    Document   : lab5form
    Created on : 15 мая 2021 г., 13:09:18
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
        <div>
            <form action="./lab5" method="post">
                <h3>Enter the word you want to find in the text</h3>
                <input type="text" name="word" placeholder="enter a word"/>
                
                <h3>Enter the desired number of objects with fields of type string and int</h3>
                <input type="text" name="amount" placeholder="enter a number"/>
                
                
            <input type="submit" value="Ok"/>
            </form>
        </div>
    </body>
</html>
