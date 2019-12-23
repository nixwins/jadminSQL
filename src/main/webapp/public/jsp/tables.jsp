<%-- 
    Document   : tables
    Created on : Dec 23, 2019, 5:21:00 PM
    Author     : nixwins
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="windows-1251"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1251">
        <title>Tables</title>
    </head>
    <body>
        <% List<String> tblList = (ArrayList<String>)request.getAttribute("tables"); %>
        
        <% for(String tbl : tblList){ %>
        
                <a href="/jadminsql/main?table=<%= tbl %>"> <%= tbl %></a>
        <% } %>
    </body>
</html>
