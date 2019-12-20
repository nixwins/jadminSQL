<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<html>
    <head>
        <title>Jadmin</title>
        <link href=<%= request.getContextPath()+"/public/assets/css/main.css" %> rel="stylesheet" type="text/css" />
    </head>

    <body>
        
        <% List<String> listDB = (ArrayList<String>)request.getAttribute("database"); %>
        
        <% for(String db : listDB){ %>
        
                <a href="/jadminsql/main?dbname=<%= db %>"> <%= db %></a>
        <% } %>
    </body>
</html>