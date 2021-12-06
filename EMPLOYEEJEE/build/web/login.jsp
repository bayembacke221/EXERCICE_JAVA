<%-- 
    Document   : login.jsp
    Created on : 26 juil. 2021, 18:32:35
    Author     : bayembacke
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <form action="loginRegister" method="post">
            <table style="background-color: aqua; margin-left: 20%;">
                <tr><td><h3 style="font-family: italic;">Se Connecter</h3></td></tr>
                <tr><td><h3 style="color: green">${SuccesMessage}</h3></td></tr>
                <tr><td>UserName :</td><td><input type="text" name="username" placeholder="UserName..."/></td></tr>
                <tr><td>Password :</td><td><input type="password" name="password" placeholder="Password..."/></td></tr>
                <tr><td><input type="submit" name="Valider" value="Connexion"/></td><td><a href="signUp.jsp">S'inscrire</a></td></tr>
            </table>
        </form>
    </body>
</html>
