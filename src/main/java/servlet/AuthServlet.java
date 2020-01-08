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
import javax.servlet.http.HttpSession;
import model.entity.User;
import model.service.UserService;

/**
 *
 * @author nixwins
 */

@WebServlet(name = "AuthServlet", urlPatterns = "/auth")

public class AuthServlet extends BaseHttpServlet{

    private HttpSession session; 
           
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
       session = req.getSession();
       session.setAttribute("isLogin", false);
       
       User user = new User();
       UserService userService = new UserService();
       
       String username  = req.getParameter("username") != null  ? req.getParameter("username")  : ""; 
       String passsword = req.getParameter("password") != null  ? req.getParameter("password")  : "";
       
       if(!username.equals("")){
           
            user.setUsername(username);
            user.setPassword(passsword);
       
            if(userService.userExists(user)){

                session.setAttribute("user", user);
                session.setAttribute("isLogin", true);
                resp.sendRedirect("/jadminsql/main");


            } else{ 
                req.setAttribute("username", username);
                req.setAttribute("error", "login or password wrong!!!");
                forwardView(req, resp, "index.jsp");
            }   
            
       } else{ forwardView(req, resp, "index.jsp");  } 
       
         
    }
 
}
