/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.web.filme;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Filip
 */
@WebServlet(name = "FilmeServlet", urlPatterns = {"/FilmeServlet"})
public class FilmeServlet extends HttpServlet {

    
    @Inject
    private FilmeBeanLocal filmeBeanLocal;
    
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
        
        //formato correto para data
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        
        Filme filme = new Filme(
            request.getParameter("nome"),
            request.getParameter("genero"),
            request.getParameter("sinopse"),
            request.getParameter("classificacao"),
            LocalDate.parse(request.getParameter("datalancamento"), formatter),
            Integer.parseInt(request.getParameter("duracao"))
        );
        
        filmeBeanLocal.salvar(filme);
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet fservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h1>Cadastro de filme.</h1>");
            
            out.println("<table>");
            out.println("<thead>");
            out.println("<tr>");
            out.println("<th>Nome</th>");
            out.println("<th>Gênero</th>");
            out.println("<th>Sinopse</th>");
            out.println("<th>Classificação indicativa</th>");
            out.println("<th>Data de Lançamento</th>");
            out.println("<th>Duração</th>");
            out.println("</tr>");
            out.println("</thead>");
            out.println("<tbody>");
            out.println("<tr>");
            out.println("<td>" + filme.getNome() + "</td>");
            out.println("<td>" + filme.getGenero() + "</td>");
            out.println("<td>" + filme.getSinopse() + "</td>");
            out.println("<td>" + filme.getClassificacao() + "</td>");
            out.println("<td>" + filme.getDataLancamento() + "</td>");
            out.println("<td>" + filme.getDuracao() + "</td>");
            out.println("</tr>");
            out.println("</tbody>");
            out.println("</table>");
            out.println("<p>Filme cadastrado com sucesso!</p>");
            out.println("<button><a href=\"http://localhost:8080/SJakartaServer-1.0-SNAPSHOT/cadastroFilme.html\">Retornar</a></button>"); 
            
            //out.println("<h1>Servlet fservlet at " + request.getContextPath() + "</h1>");
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
