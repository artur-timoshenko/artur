<%-- 
    Document   : lab4
    Created on : 14 мая 2021 г., 12:25:07
    Author     : Andrey
--%>

<%@page import="knu.fit.ist.ta.lab4.TextProcessing"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <h1>Lab №4</h1>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>lab 4</title>
    </head>
    <body>
        <%
    TextProcessing processor = new TextProcessing("Animals or people that are provided with unique identifiers (UIDs) and the ability to transfer data over a network without requiring human-to-human or human-to-computer interaction. A thing in the internet of things can be a person with a heart monitor implant, a farm animal with a biochip transponder, an automobile that has built-in sensors to alert the driver when tire pressure is low or any other natural or man-made object that can be assigned an Internet Protocol (IP) address and is able to transfer data over a network. Increasingly, organizations in a variety of industries are using IoT to operate more efficiently, better understand customers to deliver enhanced customer service, improve decision-making and increase the value of the business. How IoT works An IoT ecosystem consists of web-enabled smart devices that use embedded systems, such as processors, sensors and communication hardware, to collect, send and act on data they acquire from their environments. IoT devices share the sensor data they collect by connecting to an IoT gateway or other edge device where data is either sent to the cloud to be analyzed or analyzed locally. Sometimes, these devices communicate with other related devices and act on the information they get from one another. The devices do most of the work without human intervention, although people can interact with the devices -- for instance, to set them up, give them instructions or access the data. The connectivity, networking and communication protocols used with these web-enabled devices largely depend on the specific IoT applications deployed. IoT can also make use of artificial intelligence (AI) and machine learning to aid in making data collecting processes easier and more dynamic .The internet of things helps people live and work smarter, as well as gain complete control over their lives. In addition to offering smart devices to automate homes, IoT is essential to business. IoT provides businesses with a real-time look into how their systems really work, delivering insights into everything from the performance of machines to supply chain and logistics operations");
%>
<p align="center"> <%= processor.getText() %></p>
<p>Total Words: <%= processor.getTotalWordCount() %></p>
<p >5 most common words: <%= processor.getMostcommonWords() %></p>

<p>Words without "j": <%= processor.getWordsWithoutG() %> </p>


<p>Words with exactly 4 unique letters: <%= processor.get4DifferentLetterWords() %></p>


<p>the first 3 three-letter sequences: <%= processor.getThreeLetterSeqs() %></p>


<form action="index.jsp">
                <input type="submit" value="HOME">
</form>
    </body>
</html>