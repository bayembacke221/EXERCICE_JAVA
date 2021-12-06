<%-- 
    Document   : signUp.jsp
    Created on : 26 juil. 2021, 20:36:01
    Author     : bayembacke
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>S'incrire</title>
    </head>
    <body>
        <form action="loginRegister" method="post">
            <table style="background-color: aqua; margin-left: 20%;">
                <tr><td><h3 style="font-family: italic;">S'inscrire</h3></td></tr>
                <tr><td>UserName :</td><td><input type="text" name="name" placeholder="UserName..."/></td></tr>
                <tr><td>Password :</td><td><input type="password" name="password" placeholder="Password..."/></td></tr>
                <tr><td><input type="submit" name="Valider" value="Inscription"/></td></tr>
            </table>
        </form>
    </body>
</html>
