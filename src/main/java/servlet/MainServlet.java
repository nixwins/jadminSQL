package servlet;

import database.DBConnect;
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
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/public/jsp/index.jsp");
//        requestDispatcher.forward(req, resp);
           DBConnect db = new DBConnect();
           
           List list = db.getDatabases();
           
           
           for(Object database : list){
               System.out.println(database.toString());
               
               resp.getWriter().write("<li>"+ database.toString() + "</li>");
              
           }
           
           
    }
}
