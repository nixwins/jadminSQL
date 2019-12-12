# servlet-fast-run
Installing and Configuring IntelliJ IDEA Community Edition2019
1. Clone project https://github.com/nixwins/servlet-fast-run.git
2. Open as project IntelliJ IDEA Community Edition
3. Run mvn clean install

Configuration

1.Create user in apache-tomcat-8.5.49\conf\tomcat-users.xml
```
  <role rolename="manager-gui"/>
  <role rolename="manager-script"/>
  <user username="admin" password="password" roles="manager-gui,manager-script" />
 ```
  
2. Add in C:\Users\SomeUSER\'.m2'

```
    <servers>
        <server>
            <id>TomcatServer</id>
            <username>admin</username>
            <password>password</password>
        </server>
    </servers>
 ```
 
 3.  Add in apache-maven-3.6.3\conf\settings.xml  block servers
 
 ```
  <server>
      <id>TomcatServer</id>
      <username>admin</username>
      <password>password</password>
    </server>
  ```

