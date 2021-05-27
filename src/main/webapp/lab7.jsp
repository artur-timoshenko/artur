<%-- 
    Document   : lab7
    Created on : 20 мая 2021 г., 16:28:19
    Author     : Andrey
--%>
<%@page import="java.util.Arrays"%>
<%@page import="knu.fit.ist.ta.lab7.Tree"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
        
        <h1> Lab№7</h1>
        

<%
    List<Integer> arr = Arrays.asList(1, 10, 8, 4, 11, 2, 9, 6);
    Collections.sort(arr);
    Tree tree = new Tree(arr);
%>
<h2> Tree Array: (1, 10, 8, 4, 11, 2, 9, 6) </h2>
<p> Iterative: <%= tree.getPostOrderIterative() %></p>
<p> Recursion: <%= tree.getPostOrder() %></p>
 
<form action="index.jsp">
                <input type="submit" value="HOME">
</form>
    </body>
</html>