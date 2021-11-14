<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/14/2021
  Time: 9:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List Product</title>
</head>
<body>
<center>
    <h1>Product</h1>
</center>
<center>
    <p><a href="products?action=create">Add NEW Product</a></p>
</center>

<div align="center">
    <table border="1">
        <caption><h1>List Product</h1></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Price</th>
            <th>Note</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <c:forEach items="${product}" var="product">
            <tr>
                <td>${product.id}</td>
                <td>${product.name}</td>
                <td>${product.price}</td>
                <td>${product.note}</td>
                <td><a href="/products?action=edit&id=${product.id}">Edit</a></td>
                <td><a href="/products?action=delete&id=${product.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
