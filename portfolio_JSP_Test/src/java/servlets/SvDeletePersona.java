package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Controladora;
import logica.Persona;
import persistencia.exceptions.NonexistentEntityException;

@WebServlet(name = "SvDeletePersona", urlPatterns = {"/SvDeletePersona"})
public class SvDeletePersona extends HttpServlet {
    
    Controladora control = new Controladora();
 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        }
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        int id_persona = Integer.parseInt(request.getParameter("id_delete"));
        try {
            control.eliminarPersona(id_persona);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(SvDeletePersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        response.sendRedirect("index.jsp");
        
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
