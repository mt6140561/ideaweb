<%-- 
    Document   : processHandle
    Created on : Jun 24, 2016, 5:46:25 PM
    Author     : Rishabh-pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Web App</title>
    </head>
    <body>
        <form action="subprocessHandle.jsp" method="POST">
            <select name="RequestType">
                <option value="OnBoarding">On Boarding</option>
                <option value="OffBoarding">Off Boarding</option>
                <option value="Reports">Reports</option>
                <option value="EmployeeUpdates">Employee Updates</option>
            </select>
            <input type="submit" value="Proceed">
        </form>
        
    </body>
</html>


