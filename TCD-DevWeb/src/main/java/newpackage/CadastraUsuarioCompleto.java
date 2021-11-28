/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package newpackage;

import br.edu.ifnmg.web.endereco.Endereco;
import br.edu.ifnmg.web.endereco.EnderecoBeanLocal;
import br.edu.ifnmg.web.usuario.Usuario;
import br.edu.ifnmg.web.usuario.UsuarioBeanLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lucas <lsm3 at aluno.ifnmg.edu.br>
 */
@WebServlet(name = "CadastraUsuarioCompleto", urlPatterns = {"/CadastraUC"})
public class CadastraUsuarioCompleto extends HttpServlet {

    @Inject
    private UsuarioBeanLocal usuarioBean;
    
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        Endereco endereco = new Endereco(request.getParameter("cidade"), request.getParameter("logradouro"), Integer.parseInt(request.getParameter("numero")));
        
        Usuario usuario = new Usuario(request.getParameter("nome"), 
                request.getParameter("email"),
                request.getParameter("senha"),
                Long.parseLong(request.getParameter("cpf")),
                Boolean.parseBoolean(request.getParameter("admin")),
                endereco);
        
        
        usuarioBean.salvar(usuario);
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CadastraUsuarioCompleto</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Usuário cadastrado com sucesso!</h1>");
            out.println("<button><a href=\"http://localhost:8080/TCD-DevWeb-1.0-SNAPSHOT/\">Retornar</a></button>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
