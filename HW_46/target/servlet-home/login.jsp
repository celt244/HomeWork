<%--
  Created by IntelliJ IDEA.
  User: Arthur
  Date: 24.05.2017
  Time: 0:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

    <form class="form-horizontal" action="<%=request.getServletContext().getContextPath()%>/" method="post">

    <img src="images/login.png" alt="login preview">
<br>
<br>
   <button class="btn btn-success" name="registration">Registraton</button>
   <button class="btn btn-success" name="join">Join</button>

</body>
</html>
