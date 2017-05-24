<%--
  Created by IntelliJ IDEA.
  User: Arthur
  Date: 24.05.2017
  Time: 1:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Join</title>
</head>
<body>
    <form class="form-horizontal" action="<%=request.getServletContext().getContextPath()%>/join" method="post">

        <p><mark><strong>Hi, user!</strong></mark></p>

        <fieldset>
            <legend>Personal information</legend>
            <label for="uesr_login">Login:</label>
            <input type="text" name="uesr_login" placeholder="Enter your name" id="uesr_login">
            <br>
            <br>
            <label for="user_password">Password:</label>
            <input type="password" name="user_password" id="user_password" placeholder="Password">
        </fieldset>

        <input type="submit" value="Submit" name="submitJoin">

</body>
</html>
