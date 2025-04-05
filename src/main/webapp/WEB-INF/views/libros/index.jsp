<%--
  Created by IntelliJ IDEA.
  User: usuario
  Date: 05/04/2025
  Time: 9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Listado de Libros</title>
</head>
<body>
<h1>Libros disponibles</h1>
<ul>
    <c:forEach var="libro" items="${libros}">
        <li>${libro.isbn}, ${libro.titulo}</li>
    </c:forEach>
</ul>

<h1>Alta de libro</h1>
<form method="POST" action="libros">
    <div>
        <label>Libro:
            <input type="text" name="titulo" value="${titulo}" />
        </label>
    </div>
    <div>
        <label>ISBN:
            <input type="text" name="isbn" value="${isbn}" />
        </label>
    </div>
    <input type="submit" name="enviar" value="Alta">
</form>
</body>
</html>

