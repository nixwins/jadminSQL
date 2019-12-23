/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import core.BaseHttpServlet;
import model.Database;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author nixwins
 */

@WebServlet(name = "AuthServlet", urlPatterns = {"/"})

public class AuthServlet extends BaseHttpServlet{

    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        Database database = new Database();
        
        List<String> listDB = database.getListDatabase();
        req.setAttribute("database", listDB);
        forwardView(req, resp, "index.jsp");
    }
 
}
