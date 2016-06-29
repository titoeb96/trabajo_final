/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.Establecimiento;

/**
 *
 * @author tito
 */
@WebServlet(urlPatterns = {"/ServletEstablecimiento"})
public class ServletEstablecimiento extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            if(request.getParameter("eliminar")!=null){
               int id=Integer.parseInt(request.getParameter("eliminar"));
               out.println("Eliminar ID:"+id);
               Establecimiento est=new Establecimiento();
               est.setEstablecimiento_id(id);
               est.delete();
                response.sendRedirect("establecimientos/index.jsp");
              }
         else if(request.getParameter("guardar")!=null){
                
              String nombre=request.getParameter("nombre");
             String fecha_creacion=request.getParameter("fecha_creacion");
               int ciudad_id=Integer.parseInt(request.getParameter("ciudad_id"));
                String creado_por=request.getParameter("creado_por");
               
               Establecimiento est=new Establecimiento();
               est.setNombre(nombre);
               est.setFecha_creacion(fecha_creacion);
               est.setCiudad_id(ciudad_id);
                est.setCreado_por(creado_por);
              est.save();
             
           response.sendRedirect("establecimientos/index.jsp");
              
               
    }else if(request.getParameter("editar")!=null){
               int establecimiento_id=Integer.parseInt(request.getParameter("establecimiento_id"));
              String nombre=request.getParameter("nombre");
               String fecha_creacion=request.getParameter("fecha_creacion");
                int ciudad_id=Integer.parseInt(request.getParameter("ciudad_id"));
                String creado_por=request.getParameter("creado_por");
             
               Establecimiento est=new Establecimiento();
               est.setEstablecimiento_id(establecimiento_id);
                est.setNombre(nombre);
               est.setFecha_creacion(fecha_creacion);
               est.setCiudad_id(ciudad_id);
               est.setCreado_por(creado_por);
               est.update();
           response.sendRedirect("establecimientos/index.jsp");
            
               
           }
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
