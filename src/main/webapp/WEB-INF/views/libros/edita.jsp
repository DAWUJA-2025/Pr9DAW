<%--
  Created by IntelliJ IDEA.
  User: CristianJ
  Date: 06/04/2025
  Time: 21:55
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <title>Editar libro</title>
</head>
<body>
<h1>Editar libro</h1>
<form:form method="POST" modelAttribute="libro" action="edita">
  <div>
    <label>ISBN:
      <form:input path="isbn" readonly="true" />
      <form:errors path="isbn" cssStyle="color:red"/>
    </label>
  </div>
  <div>
    <label>Título:
      <form:input path="titulo" />
      <form:errors path="titulo" cssStyle="color:red"/>
    </label>
  </div>
  <input type="submit" value="Guardar cambios" />
</form:form>
<a href="<c:url value='/libros'/>">Cancelar</a>
</body>
</html>