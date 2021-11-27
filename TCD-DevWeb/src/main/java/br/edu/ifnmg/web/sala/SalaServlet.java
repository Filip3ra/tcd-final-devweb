/*
 * Este código foi desenvolvido com intuito de aprender sobre desenvolvimento de aplicações WEB.
 * Este trabalho foi desenvolvido na disciplina de Desenvolvimento Web do IFNMG - Campus - Montes Claros.
 * Este é um projeto de código aberto que pode ser utilizado para ajudar as pessoas no desenvolvimento de aplicações Web.
 * Copyright (C) 2021 Lucas <lsm3 at aluno.ifnmg.edu.br>
 */
package br.edu.ifnmg.web.sala;

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
@WebServlet(name = "SalaServlet", urlPatterns = {"/SalaServlet"})
public class SalaServlet extends HttpServlet {
    
    @Inject
    private SalaBeanLocal salaBean;
    
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
        
        Sala sala = new Sala();
        sala.setNome(request.getParameter("nome")); 
        sala.setCapacidade(Integer.parseInt(request.getParameter("capacidade")));
        
        salaBean.salvar(sala);
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet salaServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h1>Cadastro de filme.</h1>");
            
            out.println("<table>");
            out.println("<thead>");
            out.println("<tr>");
            out.println("<th>Nome</th>");
            out.println("<th>Capacidade</th>");
            out.println("<th>Tipo da Tela</th>");
            out.println("</tr>");
            out.println("</thead>");
            out.println("<tbody>");
            out.println("<tr>");
            out.println("<td>" + sala.getNome() + "</td>");
            out.println("<td>" + sala.getCapacidade() + "</td>");
            out.println("</tr>");
            out.println("</tbody>");
            out.println("</table>");
            out.println("<p>Sala criada com sucesso!</p>");
            out.println("<button><a href=\"http://localhost:8080/TCD-DevWeb-1.0-SNAPSHOT/\">Retornar</a></button>"); 
            //out.println("<h1>Servlet salaServlet at " + request.getContextPath() + "</h1>");
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