package servlet;

import core.DBConnect;
import database.Table;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           String dbname = req.getParameter("dbname");
           resp.getWriter().write(dbname);
           Table tbl = new Table();
           List<String> tblList = tbl.getAllTable(dbname);
           
           resp.setContentType("text/html");
           for(String table : tblList){
                resp.getWriter().write("<h2>" + table + "</h2>");
           }
    }
}
