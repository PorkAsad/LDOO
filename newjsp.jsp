<%-- 
    Document   : newjsp
    Created on : 21/09/2018, 07:02:42 PM
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

    input[type=text] {
        background-color: rgb(194, 194, 163);
        color: black;
        padding: 3px;
        padding-left: 10px;
        padding-right: 10px;
        border-color: rgb(122, 122, 82);
        border-radius: 15px;
    }

    input[type=email] {
        background-color: rgb(194, 194, 163);
        color: black;
        padding: 3px;
        padding-left: 10px;
        padding-right: 10px;
        border-color: rgb(122, 122, 82);
        border-radius: 15px;
    }

    input[type=date] {
        background-color: rgb(194, 194, 163);
        color: black;
        padding: 3px;
        padding-left: 10px;
        padding-right: 10px;
        border-color: rgb(122, 122, 82);
        border-radius: 15px;
    }

    input[type=submit] {
        background-color: rgba(194, 194, 163,0.3);
        color: rgb(0, 0, 0);
        padding: 3px;
        padding-left: 10px;
        padding-right: 10px;
        border-color: rgb(122, 122, 82);
        border-radius: 15px;
        font-family: helvetica;
        font-style: italic;
        font-size: 22px;
    }
    input[type=reset] {
        background-color: rgba(194, 194, 163,0.3);
        color: rgb(0, 0, 0);
        padding: 3px;
        padding-left: 10px;
        padding-right: 10px;
        border-color: rgb(122, 122, 82);
        border-radius: 15px;
        font-family: helvetica;
        font-style: italic;
        font-size: 22px;
        select
    
    {
        background-color: rgb(194, 194, 163);
        color: black;
        padding: 3px;
        padding-left: 10px;
        padding-right: 10px;
        border-color: rgb(122, 122, 82);
        border-radius: 15px;
    }

    option {
        background-color: rgb(194, 194, 163);
        padding: 3px;
        padding-left: 10px;
        padding-right: 10px;
        border-color: rgb(122, 122, 82);
        border-radius: 15px;
    }

    h1 {
        text-align: center;
        font-style: italic;
    }

    h2 {
        text-align: center;
        font-style: italic;
    }

    h3 {
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
        <h1 align=center>Formulario en JSP </h1>
        <h2 align="center">
            Ingresa los datos solicitados:
        </h2>
        <form action="MostrarDatos.jsp" method="post">
            
            <table border="0" style="margin: 0 auto;">
                <tr>
                    <td>
                        <strong>Nombre:</strong>
                    </td>
                    <td>
                        <input type="text" value placeholder="Jose Eduardo" name="Nombre"required>
                    </td>
                </tr>
                <tr>
                    <td>
                        <strong>Apellido:</strong>
                    </td>
                    <td>
                        <input type="text" value placeholder="Martinez Torres" name="Apellido"required>
                    </td>
                </tr>
                <tr>
                    <td>
                        <strong>Edad:</strong>
                    </td>
                    <td>
                        <select name="Edad">
                            <option> 18 </option>
                            <option> 19 </option>
                            <option> 20 </option>
                            <option> 21 </option>
                            <option> 22 </option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>
                        <strong>Clave de validación:</strong>
                    </td>
                    <td>
                        <input type="password" value placeholder="Contraseña" name="Contraseña" required>
                    </td>
                </tr>
                <tr>
                    <td>
                        <strong>Correo:</strong>
                    </td>
                    <td>
                        <input type="email" value placeholder="ClaseDeDoo@hotmail.com" name="Email" required>
                    </td>
                <tr>
                    <td>
                        <strong>Fecha:</strong>
                    </td>
                    <td>
                        <input type="date" name="Fecha" required>
                    </td>
                </tr>

            </table>

            <h3 align="center">
                Genero
            </h3>

            <table border="0" style="margin: 0 auto;">
                <tr>
                    <td>
                        <input type="radio" name="Genero" id="Masculino" value="Masculino">
                        <strong>Masculino</strong>

                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="radio" name="Genero" id="Femenino" value="Femenino">
                        <strong>Femenino</strong>

                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="radio" name="Genero" id="Otro" value="Otro">
                        <strong>Otro</strong>
                    </td>
                </tr>
            </table>

            <br>
            <table border="0" style="margin: 0 auto;">
                <tr>
                    <td></td>
                </tr>
            </table>
            <table border="0" style="margin: 0 auto;">
                <tr>
                    <td>
                        <input type="submit" value="Enviar">
                    </td
                </tr>
            </table>
        </form>
        <% out.println("Mi IP es: " + request.getRemoteAddr()); %>
    </body>
</html>
