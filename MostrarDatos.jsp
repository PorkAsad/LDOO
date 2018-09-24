<%-- 
    Document   : MostrarDatos
    Created on : 21/09/2018, 07:33:42 PM
    Author     : xomel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style type="text/css">

    body {
        background-image: url(http://dissenyaweb.com/blog/diseno_web/wp-content/uploads/background2-1024x640.jpg);
        background-repeat: no-repeat;
        background-size: 100% 100%;
        background-attachment: fixed;
    }

    #Tabla {
        margin-top: 100px;
        margin-bottom: 100px;
        margin-right: 100px;
        margin-left: 100px;
        width: 1000px;
        background-position: left;
        background-color: rgba(192,192,192,0.7);
        border-style: dotted;
        border-width: 5px;
        border-color: rgb(163, 163, 117);
    }
        
    h1 {
        text-align: center;
        font-style: italic;
    }

    h2 {
        text-align: center;
        font-style: italic;
    }

    p {
        text-align: center;
        font-style: italic;
        font-size: 20px;
    }
</style>
    <body>
        <div id="Tabla">
            <h1 align="center">Sus datos:D</h1>
            <p>
                <% 
                    String edad=(String)request.getParameter("Edad");
                    String preferencia=(String)request.getParameter("Genero");
                    out.print("Tu nombre es: "+request.getParameter("Nombre")+" "+request.getParameter("Apellido"));
                    out.print("<br/>");
                    out.print("Edad:  "+edad+" años");
                    out.print("<br/>");
                    out.print("Correo: " + request.getParameter("Email"));
                    out.print("<br/>");
                    out.print("Fecha: " + request.getParameter("Fecha"));
                    out.print("<br/>");
                    out.print("Genero: " + preferencia);
                %>
            </p>
            <h2 align="center">
                Volver al
                <a href="newjsp.jsp"> Main</a>
            </h2>
            <p>
                Si me salio:D
                <br>
                <img src="https://k36.kn3.net/0/B/7/B/A/8/C79.gif" alt="Funny image">
            </p>
        </div>
    </body>
</html>
