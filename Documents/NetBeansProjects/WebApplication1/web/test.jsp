<%-- 
    Document   : test
    Created on : Jun 25, 2016, 2:57:17 PM
    Author     : Rishab-pc
--%>
<%!
   static final String[] COLORS = {
      "#CA9A26",
      "#3BF428",
      "#F7E339",
      "#FF40FF",
   };
%>
<%
   for (int i = 0; i < COLORS.length; i++) {
      String color = COLORS[i];
%>
<div style="background-color: <%= color%>;
            font-size: 12pt;
            font-weight: bold;">
   This is color <%= color %>
</div>
<% } %>
