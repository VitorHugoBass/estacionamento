<%-- 
    Document   : layout
    Created on : 21/03/2019, 15:10:29
    Author     : Senai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="header">

        </div>
        <div class="content">
            <h1>layout <% out.print(request.getSession().getAttribute("url"));%></h1>
            
           <%--<jsp:include page = "${url}" />--%>
        </div>
        <div class="footer">

        </div>
        
    </body>
</html>
