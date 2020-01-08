<jsp:include page="include/header.jsp" />

    <header>
        <div class="navbar-main"><a href="#">JAdminSQL for MySQL</a></div>
    </header>

    <div class="login-wrapper">
        <h5 class="indigo-text">Please, login into your account</h5>
          <div class="z-depth-1 grey lighten-4 row" style="display: inline-block; padding: 32px 48px 0px 48px; border: 1px solid #EEE;">
  
            <form class="col s12" method="get">
              <div class='row'>
                <div class='col s12'>
                </div>
              </div>
               <%  String username = (String)request.getAttribute("username"); %>
              <div class='row'>
                <div class='input-field col s12'>
                    <input class='validate' type='text' name='username' id='username' value="<%= username != null ? username: "" %>" />
                  <label for='username'>User name</label>
                </div>
              </div>
  
              <div class='row'>
                <div class='input-field col s12'>
                  <input class='validate' type='password' name='password' id='password' />
                  <label for='password'>Enter your password</label>
                </div>
              </div>
                
                <div class='row'>
                <div class='input-field col s12'>
                    <% 
                       
                        String error = (String)request.getAttribute("error"); 
                        
                        if(error != null){
                    
                    %>
                    
                    <p class="err-login"> <%= error %>  </p>
                    
                   <% } %>
                </div>
              </div>
              
           
  
              <div class='row'>
                  <button type="submit" href="/jadminsql.html"  class='col s12 btn btn-large waves-effect indigo'>Login</button>
            </div>
          
            </form>
      
        </div>
        </div>
    <jsp:include page="include/footer.jsp" />