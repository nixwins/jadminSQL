<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="model.entity.User"%>
<jsp:include page="include/header.jsp"/>
<% 
    User user = (User)session.getAttribute("user");
     List<String> dbs = (ArrayList) request.getAttribute("dbs");

%>
        <div class="container-max">
            
                <nav class="navbar-main navbar-inner"> 
                    <li><a href="/jadminsql/main?logout=true">Logout</a></li>
                </nav>

                <ul id="slide-out" class="sidenav sidenav-fixed collapsible">
                    <li>
                        <a href="#"  class="logo waves-effect">JAdminSQL</a>
                  
                    </li>
                    <li><a class="waves-effect"><i class="material-icons">dns</i>      <%= user.getUsername() %>@localhost </a></li>
                    <li><div class="divider"></div></li>
                       <% for(String dbname : dbs) { %>
                    <li >
                        <a href="#" class="waves-effect collapsible-header"><i class="material-icons">storage</i> <%= dbname %> </a>
                        <div class="collapsible-body">
                            <ul>
                                <% for(String dtblname : dbs) { %>
                                                         
                                <li><a href="dropdown.html"><%= dtblname %></a></li> 
                                <% } %>
                            </ul>

                        </div>

                    </li>
                        <% } %>
                </ul>

            
            <main>
                <h1 class="som">
                    some data
                </h1>   
            </main>
        </div>

<jsp:include page="include/footer.jsp" />