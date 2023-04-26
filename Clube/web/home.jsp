<%-- 
    Document   : home
    Created on : 26 de abr de 2023, 14:27:24
    Author     : geiss
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="icon" href="img/clubedaaula.jfif"/>
        <link rel="stylesheet" href="css/style.css"/>
        <title>ClubeDeApoio</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Bem vindo <%= request.getAttribute("userLogged")%>!</h1>
        <h1>Bem vindo <%= session.getAttribute("userSession")%>!</h1>
    </body>
</html>
