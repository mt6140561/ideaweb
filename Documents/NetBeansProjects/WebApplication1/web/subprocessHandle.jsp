<%-- 
    Document   : processHandle
    Created on : Jun 24, 2016, 5:46:25 PM
    Author     : Rishab-pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="Optgen.OptionGenerator"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%=request.getParameter("RequestType")%></h1>
        
        <form action="reqHandler" method="POST">
            <%if (request.getParameter("RequestType")!=null){
                String requ = request.getParameter("RequestType");
                if (request.getParameter("RequestType").equals("OnBoarding")){%>
                        
                <%} else {%>
                    <input type="text" name="EmployeeID">
                    <input type="submit" value="Proceed">
                  
                <%}
                OptionGenerator opt = new OptionGenerator();
                String[] options = opt.generateNorm(requ);
            %>
            <select name="SubRequestType">
                <%for (int i=0; i<options.length; i++){%>
                    <option value="<%=options[i].replaceAll("\\s","")%>"><%=options[i]%></option>
                <%}
            }%>
            </select>
            
            <input type="hidden" value="<%=request.getParameter("RequestType")%>" name="RequestType">
            <input type="submit" value="Proceed">
        </form>
        
    </body>
</html>
