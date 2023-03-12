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

@WebServlet(name = "SvEditPersona", urlPatterns = {"/SvEditPersona"})
public class SvEditPersona extends HttpServlet {
    
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
        
        int id = Integer.parseInt(request.getParameter("id_edit"));
        String name = request.getParameter("nombre_completo");
        String cellphone = request.getParameter("cellphone_edit");
        
        Persona editPersona = control.encontrarPersona(id);
        
        editPersona.setName(name);
        editPersona.setCellphone(cellphone);
        
        try {
            control.editarPersona(editPersona);
        } catch (Exception ex) {
            Logger.getLogger(SvEditPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        response.sendRedirect("index.jsp");
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
