<%-- 
    Document   : welcome
    Created on : Dec 15, 2017, 10:03:19 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
    </head>
    <body>
     
         <jsp:include page="head.jsp"></jsp:include>

        <div class="container">
        <h2>${msg}</h2>
        <p><a href="${pageContext.request.contextPath}/login">Link Login</a></p>
        <p><a href="${pageContext.request.contextPath}/register">Link register</a></p>
         <a href="customers/all">Lihat Produk</a>
    </body>
</html>
