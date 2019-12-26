/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author nixwins
 */
public abstract class BaseHttpServlet extends HttpServlet {
    
    protected final String viewDir = "/public/jsp/";
    private String viewHolder;  
    
    public void  forwardView(HttpServletRequest request, HttpServletResponse response, String view){
       // response.setContentType("text/html");
        try {
            RequestDispatcher dispatcher = request.getRequestDispatcher(viewDir+view);
            dispatcher.forward(request, response);
            
        } catch (ServletException ex) {
            Logger.getLogger(BaseHttpServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BaseHttpServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
