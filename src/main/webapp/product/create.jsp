<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/14/2021
  Time: 9:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Product</title>
</head>
<body>
<center>
    <p><a href="products?action=products">Back to Product List</a></p>

</center>
<div align="center">
    <form method="post">
<table>
<caption>Add New Product</caption>
<tr>
    <td>Product Name</td>
    <td><input type="text" name="name" size="50"></td>
</tr>
    <tr>
        <td>Product Price</td>
        <td><input type="number" name="price" size="30"></td>
    </tr>
    <tr>
        <td>Product Note</td>
        <td><input type="text" name="note" size="50"></td>
    </tr>
    <tr>
        <td><input type="submit" value="Save"></td>
    </tr>
</table>
    </form>
</div>
</body>
</html>
