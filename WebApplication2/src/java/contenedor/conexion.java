/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package contenedor;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class conexion extends HttpServlet {

  String nombre = "";
  int telefono= 0;
  String direccion ="";
  String fecha_inicio_reserva ="";
  String fecha_termino_reserva="";
  String comentario ="";
  
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
        try ( PrintWriter out = response.getWriter()) {
 
        response.setContentType("text/html;charset=UTF-8");
  
        nombre = request.getParameter("Nombre");
        
        telefono = Integer.parseInt(request.getParameter("Telefono"));
        
        direccion = request.getParameter("Direccion");
        
        fecha_inicio_reserva = request.getParameter("Fecha_inicio_reserva");
       
        fecha_termino_reserva = request.getParameter("Fecha_termino_reserva");
        
        comentario = request.getParameter("Comentario");
       
        try
            
        {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/epe2bd", "root", "");
            Statement st=conn.createStatement();
            int i=st.executeUpdate("insert into datosarriendo (Nombre, Telefono, Direccion, FechaInicioReserva, FechaTerminoReserva, Comentario )values('"+nombre +"','"+telefono+"','"+direccion+"','"+fecha_inicio_reserva +"','"+fecha_termino_reserva +"','"+comentario+"');");
            out.println("Se insertaron tus datos Perfectamente! gracias!!");
        }
        catch(Exception e){
            System.out.print(e);
            e.printStackTrace();
          
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
