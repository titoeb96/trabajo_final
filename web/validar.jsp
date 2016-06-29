<%-- 
    Document   : validar
    Created on : 09-jun-2016, 3:52:12
    Author     : tito
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head><%
        String u_nombre;
        String u_clave;
        
        
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            u_nombre=request.getParameter("u_nombre");
            u_clave=request.getParameter("u_clave");
            if(u_nombre.equals("asd") && u_clave.equals("123"))
                    {
                        response.sendRedirect("menu.jsp");
                    }else{
                response.sendRedirect("index.jsp");
                
            }

            %>
     
