package servlet;

import core.BaseHttpServlet;
import core.DBConnect;
import model.Table;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import model.Database;
import model.entity.Column;
import model.entity.User;

public class MainServlet extends BaseHttpServlet {
            
     private Table tbl = new Table();
     private boolean isLogin = false;
     private HttpSession session;
     
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        //boolean logout =(boolean)req.getAttribute("logout");
   
        
        HttpSession session = req.getSession();
        User user = new User();
        System.out.println(req.getAttribute("logout"));
          
       if(req.getAttribute("logout") != null && req.getAttribute("logout").equals(true)){
           
           session.setAttribute("isLogin", false);
           session.setAttribute("user", null);
           resp.sendRedirect("/jadminsql/");
           System.out.println("Logout!!!!");
           
        }else{
                isLogin = (boolean)session.getAttribute("isLogin");

                 if(isLogin){
                     Database dbs = new Database();
                     req.setAttribute("dbs", dbs.getListDatabase());
                   //resp.getWriter().write(user.getUsername());  
                     forwardView(req, resp, "main.jsp");
                 }
                 else{
                      //resp.getWriter().write(Boolean.toString(isLogin));
                    resp.sendRedirect("/jadminsql/auth");
                 }
       }
     
         
//           String dbname = req.getParameter("dbname");
//           String tblname = req.getParameter("table");
//           
//           resp.getWriter().write("Something");
//           
//           if(dbname != null){
//       
//                List<String> tblList = tbl.getAllTable(dbname);
//                req.setAttribute("tables", tblList);
//                forwardView(req, resp, "tables.jsp");
//                
//           }
//           
//           if(tblname != null){
//               
//               List<Column> tblStruct = tbl.getTableStruct(tblname);
//               
//               for(Column col : tblStruct){
//                  resp.getWriter().write(col.getColumnName() + " ===> " + col.getDataType()); 
//                  resp.getWriter().write("\n"); 
//               }
//               
//               
//               
//           }

    }
}
