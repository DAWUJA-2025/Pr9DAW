<%--
  Created by IntelliJ IDEA.
  User: CristianJ
  Date: 06/04/2025
  Time: 21:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <title>Detalle del libro</title>
</head>
<body>
  <h1>Detalle del libro</h1>
  <p><strong>ISBN:</strong> ${libro.isbn}</p>
  <p><strong>Título:</strong> ${libro.titulo}</p>
  <a href="<c:url value='/libros'/>">Volver al listado</a>
</body>
</html>
