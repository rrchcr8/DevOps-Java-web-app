<%--
  Created by IntelliJ IDEA.
  User: ubuntu
  Date: 5/1/19
  Time: 11:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import ="java.util.*" %>
<!DOCTYPE html>
<html>
<body>

    <h1>
        Available Brands
    </h1>
        <%
List result= (List) request.getAttribute("brands");
Iterator it = result.iterator();
out.println("<br>We have <br><br>");
while(it.hasNext()){
out.println(it.next()+"<br>");
}
%>
</body>
</html>