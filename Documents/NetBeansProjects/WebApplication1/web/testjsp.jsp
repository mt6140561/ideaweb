<%-- 
    Document   : testjsp
    Created on : Jun 21, 2016, 2:34:10 PM
    Author     : Rishab-pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>First: <%=request.getParameter("first")%>
            Second:<%=request.getParameter("second")%>
        </p>
        <form action="hi" method="POST">
            <input type="submit" value="<%=request.getParameter("second")%>" name="hello">
            <input type="submit" value="<%=request.getParameter("first")%>" name="hello">
        </form>
    </body>
</html>
