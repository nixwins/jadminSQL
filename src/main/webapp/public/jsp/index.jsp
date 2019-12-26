<!DOCTYPE html>
<html >
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link type="text/css" rel="stylesheet" href="<%= request.getContextPath() %>/public/assets/css/materialize.min.css"  media="screen,projection"/>
    <link type="text/css" rel="stylesheet" href="<%= request.getContextPath() %>/public/assets/css/main.css"  media="screen,projection"/>
    <!--<link type="text/css" rel="stylesheet" href="../assets/css/main.css"  media="screen,projection"/>-->
    
    <title>Document</title>
</head>
<body>
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
  
              <div class='row'>
                <div class='input-field col s12'>
                  <input class='validate' type='text' name='username' id='username' />
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
                  <button type="submit" href="/jadminsql.html"  class='col s12 btn btn-large waves-effect indigo'>Login</button>
            </div>
          
            </form>
      
        </div>
        </div>
     <script type="text/javascript" src="<%= request.getContextPath() +  "/public/assets/js/materialize.min.js" %>"></script>
     <script type="text/javascript" src="<%= request.getContextPath() +  "/public/assets/js/main.js" %>"></script>

</body>
</html>