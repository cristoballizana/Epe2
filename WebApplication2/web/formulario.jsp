<%-- 
    Document   : index
    Created on : 13 nov 2022, 15:28:50
    Author     : cristoballizana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <link rel="stylesheet" href="css/estilo.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="contenedor">

        <h4 style="color:white;"> Formulario Registro</h4>


    <form action="conexion" method="POST">

        
        <input  id="nombre" class="controles" type="text" name="Nombre" placeholder="Nombre" minlength="10" required> <br>
        <input class="controles" type="number" name="Telefono" placeholder="Telefono" minlength="9" maxlength="9" required> <br>
        <input class="controles" type="text" name="Direccion" placeholder="Direccion" required> <br>
         <input id="FechaInicio"class="controles" type="date" name="Fecha_inicio_reserva"placeholder="Fecha inicio reserva" required> <br>
         <input id="FechaTermino" class="controles" type="date" name="Fecha_termino_reserva"placeholder="Fecha termino reserva" required > <br>
          <textarea class="areaControles" type="text" name="Comentario" style="resize: none;"placeholder="Comentario" required></textarea><br>
        <input  class="botones" type="submit" value ="Enviar" >
       
    </form>
    </div>        
        
       
    </body>
    
    
    
</html>
