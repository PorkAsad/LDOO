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

/**
 *
 * @author xomel
 */
@WebServlet(urlPatterns = {"/FormulariooServlet"})
public class FormulariooServlet extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FormulariooServlet</title>");            
            out.println("</head>");
            out.println("<style type=\"text/css\">\n" +
"\n" +
"    body {\n" +
"        background-image: url(http://dissenyaweb.com/blog/diseno_web/wp-content/uploads/background2-1024x640.jpg);\n" +
"        background-repeat: no-repeat;\n" +
"        background-size: 100% 100%;\n" +
"        background-attachment: fixed;\n" +
"    }\n" +
"\n" +
"    #Tabla {\n" +
"        margin-top: 100px;\n" +
"        margin-bottom: 100px;\n" +
"        margin-right: 100px;\n" +
"        margin-left: 100px;\n" +
"        width: 1000px;\n" +
"        background-position: left;\n" +
"        background-color: rgba(192,192,192,0.7);\n" +
"        border-style: dotted;\n" +
"        border-width: 5px;\n" +
"        border-color: rgb(163, 163, 117);\n" +
"    }\n" +
"\n" +
"    input[type=text] {\n" +
"        background-color: rgb(194, 194, 163);\n" +
"        color: black;\n" +
"        padding: 3px;\n" +
"        padding-left: 10px;\n" +
"        padding-right: 10px;\n" +
"        border-color: rgb(122, 122, 82);\n" +
"        border-radius: 15px;\n" +
"    }\n" +
"\n" +
"    input[type=email] {\n" +
"        background-color: rgb(194, 194, 163);\n" +
"        color: black;\n" +
"        padding: 3px;\n" +
"        padding-left: 10px;\n" +
"        padding-right: 10px;\n" +
"        border-color: rgb(122, 122, 82);\n" +
"        border-radius: 15px;\n" +
"    }\n" +
"\n" +
"    input[type=date] {\n" +
"        background-color: rgb(194, 194, 163);\n" +
"        color: black;\n" +
"        padding: 3px;\n" +
"        padding-left: 10px;\n" +
"        padding-right: 10px;\n" +
"        border-color: rgb(122, 122, 82);\n" +
"        border-radius: 15px;\n" +
"    }\n" +
"\n" +
"    input[type=submit] {\n" +
"        background-color: rgba(194, 194, 163,0.3);\n" +
"        color: rgb(0, 0, 0);\n" +
"        padding: 3px;\n" +
"        padding-left: 10px;\n" +
"        padding-right: 10px;\n" +
"        border-color: rgb(122, 122, 82);\n" +
"        border-radius: 15px;\n" +
"        font-family: helvetica;\n" +
"        font-style: italic;\n" +
"        font-size: 22px;\n" +
"        select\n" +
"    }\n" +
"    input[type=reset] {\n" +
"        background-color: rgba(194, 194, 163,0.3);\n" +
"        color: rgb(0, 0, 0);\n" +
"        padding: 3px;\n" +
"        padding-left: 10px;\n" +
"        padding-right: 10px;\n" +
"        border-color: rgb(122, 122, 82);\n" +
"        border-radius: 15px;\n" +
"        font-family: helvetica;\n" +
"        font-style: italic;\n" +
"        font-size: 22px;\n" +
"        select\n" +
"\n" +
"    {\n" +
"    {\n" +
"        background-color: rgb(194, 194, 163);\n" +
"        color: black;\n" +
"        padding: 3px;\n" +
"        padding-left: 10px;\n" +
"        padding-right: 10px;\n" +
"        border-color: rgb(122, 122, 82);\n" +
"        border-radius: 15px;\n" +
"    }\n" +
"\n" +
"    option {\n" +
"        background-color: rgb(194, 194, 163);\n" +
"        padding: 3px;\n" +
"        padding-left: 10px;\n" +
"        padding-right: 10px;\n" +
"        border-color: rgb(122, 122, 82);\n" +
"        border-radius: 15px;\n" +
"    }\n" +
"\n" +
"    h1 {\n" +
"        text-align: center;\n" +
"        font-style: italic;\n" +
"    }\n" +
"\n" +
"    h2 {\n" +
"        text-align: center;\n" +
"        font-style: italic;\n" +
"    }\n" +
"\n" +
"    h3 {\n" +
"        text-align: center;\n" +
"        font-style: italic;\n" +
"    }\n" +
"\n" +
"    p {\n" +
"        text-align: center;\n" +
"        font-style: italic;\n" +
"        font-size: 20px;\n" +
"    }\n" +
"</style>");
             out.println("<div id=\"Tabla\">");
            out.println("<body>");
            out.println("<h1 align=\"center\">Servlet FormulariooServlet at " + request.getContextPath() + "</h1>");
            out.println("<form>\n" +
"            <table border=\"0\" style=\"margin: 0 auto;\">\n" +
"                <tr>\n" +
"                    <td>\n" +
"                        <strong>Nombre:</strong>\n" +
"                    </td>\n" +
"                    <td>\n" +
"                        <input type=\"text\" value placeholder=\"Juan Carlos\" required>\n" +
"                    </td>\n" +
"                </tr>");
            out.println("<tr>\n" +
"                    <td>\n" +
"                        <strong>Apellido:</strong>\n" +
"                    </td>\n" +
"                    <td>\n" +
"                        <input type=\"text\" value placeholder=\"Martinez Torres\" required>\n" +
"                    </td>\n" +
"                </tr>");
            out.println("<tr>\n" +
"                    <td>\n" +
"                        <strong>Clave de validación:</strong>\n" +
"                    </td>\n" +
"                    <td>\n" +
"                        <input type=\"password\" value placeholder=\"Contraseña\" required>\n" +
"                    </td>\n" +
"                </tr>");
            out.println("<tr>\n" +
"                    <td>\n" +
"                        <strong>Edad:</strong>\n" +
"                    </td>\n" +
"                    <td>\n" +
"                        <select>\n" +
"                            <option> 18 </option>\n" +
"                            <option> 19 </option>\n" +
"                            <option> 20 </option>\n" +
"                            <option> 21 </option>\n" +
"                            <option> 22 </option>\n" +
"                        </select>\n" +
"                    </td>\n" +
"                </tr>");
            out.println("<tr>\n" +
"                    <td>\n" +
"                        <strong>Teléfono:</strong>\n" +
"                    </td>\n" +
"                    <td>\n" +
"                        <input type=\"text\" value placeholder=\"8117151690\" required>\n" +
"                    </td>\n" +
"                </tr>\n" +
"                <tr>");
            out.println("<td>\n" +
"                        <strong>Correo:</strong>\n" +
"                    </td>\n" +
"                    <td>\n" +
"                        <input type=\"email\" value placeholder=\"ClaseDeDoo@hotmail.com\" required>\n" +
"                    </td>\n" +
"                <tr>");
            out.println("<td>\n" +
"                        <strong>Fecha:</strong>\n" +
"                    </td>\n" +
"                    <td>\n" +
"                        <input type=\"date\" name=\"Fecha\" required>\n" +
"                    </td>\n" +
"                </tr>");
            out.println("</table>\n" +
"\n" +
"            <h3 align=\"center\">\n" +
"                Genero\n" +
"            </h3>\n" +
"\n" +
"            <table border=\"0\" style=\"margin: 0 auto;\">\n" +
"                <tr>\n" +
"                    <td>\n" +
"                        <input type=\"radio\" name=\"Genero\" id=\"Masculino\">\n" +
"                        <strong>Masculino</strong>\n" +
"\n" +
"                    </td>\n" +
"                </tr>\n" +
"                <tr>\n" +
"                    <td>\n" +
"                        <input type=\"radio\" name=\"Genero\" id=\"Femenino\">\n" +
"                        <strong>Femenino</strong>\n" +
"\n" +
"                    </td>\n" +
"                </tr>\n" +
"                <tr>\n" +
"                    <td>\n" +
"                        <input type=\"radio\" name=\"Genero\" id=\"Otro\">\n" +
"                        <strong>Otro</strong>\n" +
"                    </td>\n" +
"                </tr>\n" +
"            </table>");
            out.println("<table border=\"0\" style=\"margin: 0 auto;\">\n" +
"                <tr>\n" +
"                    <td>\n" +
"                        <input type=\"submit\" value=\"enviar\">\n" +
"                    </td\n" +
"                </tr>\n" +
"            </table>");
            out.println("</form");
            out.println("</div id=\"Tabla\">");
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
