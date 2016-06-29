<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    
        <title>JSP Page</title>
      
    </head>
    <body>
        <h1>LOGIN</h1>
        <form  method="post" action="menu.jsp">
            <table class="">
                <tr>
                    <td>Usuario</td>
                    <td><input type="text" name="user"></td>
                </tr>
                <tr>
                    <td>Contraseña</td>
                    <td><input type="password" name="pass"></td>
                </tr>  
            </table>
            <input type="submit" value="Ingresar" name="login">
        </form>
        
        
    </body>
</html>