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

public class MainServlet extends BaseHttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           String dbname = req.getParameter("dbname");
           String tblname = req.getParameter("table");
           
           if(dbname != null){
               
                Table tbl = new Table();
                List<String> tblList = tbl.getAllTable(dbname);
                req.setAttribute("tables", tblList);
                forwardView(req, resp, "tables.jsp");
           }
           
           if(tblname != null){
               resp.getWriter().write(tblname);
           }

    }
}
