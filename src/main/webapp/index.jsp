<%--
  Created by IntelliJ IDEA.
  User: ubuntu
  Date: 5/1/19
  Time: 11:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Liquor Store</title>
</head>
<body>
<center>
  <h1>
    Select the type of Liquor
  </h1>
  <form method="post" action="SelectLiquor">
    <br>
    <select name="Type" size="1">
      <option>WINE</option>
      <option>WHISKY</option>
      <option>BEER</option>

    </select>
    <br><br>
    <input type="submit">
  </form>
</center>


</body>
</html>
