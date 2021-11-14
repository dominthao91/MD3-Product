<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/14/2021
  Time: 10:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Product</title>
</head>
<body>
<center>
    <h2><a href="products?action=products">List Product</a></h2>
</center>
<div align="center">
    <form method="post">
        <table border="1">
            <caption><h1>Edit Product</h1></caption>
            <tr>
                <th>Product Name</th>
                <td><input type="text" name="name" size="50" value="${ep.name}"></td>
            </tr>
            <tr>
                <th>Product Price</th>
                <td><input type="number" name="price" value="${ep.price}"></td>
            </tr>
            <tr>
                <th>Product Note</th>
                <td><input type="text" name="note" value="${ep.note}"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Save"></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
