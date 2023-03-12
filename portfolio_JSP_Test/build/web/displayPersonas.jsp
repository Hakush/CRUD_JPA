<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="logica.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista personas</title>
    </head>
    <body>
        <h1>Lista de Personas</h1>
        
        <% 
            List <Persona> listaPersonas = (List) request.getSession().getAttribute("listaPersonas");
            for (Persona per : listaPersonas) {
        %>
        <p><b>Nombre: <%= per.getName()%></b></p>
        <p><b>Telefono: <%= per.getCellphone()%></b></p>
        <p><b>>----------------------------------------------------<</b></p>
        
        <%
            }
        %>
        
    </body>
</html>
