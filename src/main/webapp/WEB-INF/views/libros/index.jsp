<%--
  Created by IntelliJ IDEA.
  User: usuario
  Date: 05/04/2025
  Time: 9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Listado de libros</title>
</head>
<body>
<h1>Libros disponibles</h1>
<ul>
    <c:forEach var="libro" items="${libros}">
        <li>
                ${libro.isbn}, ${libro.titulo}
            <!-- Enlaces usando c:url para rutas absolutas -->
            <a href="<c:url value='/libros/borra?isbn=${libro.isbn}'/>">Borrar</a>
            <a href="<c:url value='/libros/detalle?isbn=${libro.isbn}'/>">Detalle</a>
            <a href="<c:url value='/libros/edita?isbn=${libro.isbn}'/>">Editar</a>
        </li>
    </c:forEach>
</ul>

<h1>Alta de libro</h1>
<form:form method="POST" modelAttribute="libro" action="<c:url value='/libros'/>">
    <div>
        <label>Libro:
            <form:input path="titulo" />
            <form:errors path="titulo" cssStyle="color:red"/>
        </label>
    </div>
    <div>
        <label>ISBN:
            <form:input path="isbn" />
            <form:errors path="isbn" cssStyle="color:red"/>
        </label>
    </div>
    <input type="submit" value="Alta" />
</form:form>
</body>
</html>