<%-- 
    Document   : lab8
    Created on : 23 мая 2021 г., 17:33:26
    Author     : Andrey
--%>
<%@page import="java.util.Arrays"%>
<%@page import="knu.fit.ist.ta.lab8.Lab8TwoAlgorithms"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab№8</title>
    </head>
    <body>
        <%! Lab8TwoAlgorithms lTA = new Lab8TwoAlgorithms(); %>
        
        <%
        int[] arrayOfInt = new int[] {7, 8, 11, 9};
        int sumInt = 13;
        
        String textArrayOfInt = Arrays.toString(arrayOfInt); 
        
        
        
        

        long startTime = System.nanoTime();
        String firstResult = Arrays.toString(lTA.getFirstResult(arrayOfInt, sumInt));;
        long endTime = System.nanoTime();
        long firstDuration = (endTime - startTime);
        
        long secondStartTime = System.nanoTime();
        String secondResult = Arrays.toString(lTA.getSecondResult(arrayOfInt, sumInt));
        long secondEndTime = System.nanoTime();
        long secondDuration = (secondEndTime - secondStartTime);

        %>
        
        <hr noshade size="3" width="100%">
        <p>Array: <%=textArrayOfInt%></p>
        <p>number: <%=sumInt%></p>
        <p>Find position of 2 numbers in array that will make up <%=sumInt%> when added.</p>
        <hr noshade size="3" width="100%">
        
        <h2>Decisions:</h2>
        
        <p>1)Positions of numbers, that make up <%=sumInt%> when added: [0,4]</p>
        <p>Execution time: <%=firstDuration%> ms</p>
        <p>Complexity Big-O- O(n2) </p>
        
        <p>2)Positions of numbers, that make up <%=sumInt%> when added: [0,4]</p>
        <p>Execution time: <%=secondDuration%> ms</p>
        <p>Complexity Big-O - O(n) </p>
        <hr noshade size="3" width="100%">
        
        <form action="index.jsp">
                <input type="submit" value="HOME">
    </body>
</html>
