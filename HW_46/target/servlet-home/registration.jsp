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
    <title>Registration</title>
</head>
<body>
    <form class="form-horizontal" action="<%=request.getServletContext().getContextPath()%>/registration" method="post">


<form>
        <fieldset>
            <legend>Personal information</legend>
            <label for="user_name">Your name:</label>
            <input type="text" name="user_name" placeholder="Enter your name" id="user_name">
            <br>
            <br>
            <label for="user_age">Your age:</label>
            <input type="number" name="user_age" id="user_age" placeholder="Your age">
            <br>
            <br>
            <label for="user_password">Password:</label>
            <input type="password" name="user_password" id="user_password" placeholder="Password">
        </fieldset>

        <br>
        <br>
        <input type="radio" name="sex" value="Male">M
        <input type="radio" name="sex" value="Female">F
        <br>
        <br>
        <label for="remember">Remember me:</label>
        <input type="checkbox" name="xremember" id="remember">
        <br>
        <br>
        <select name="city">
            <option value="Lviv">Lviv</option>
            <option value="Kyiv">Kyiv</option>
            <option value="Dnipro">Dnipro</option>
        </select>
        <br>
        <br>
        <label for="message">Message:</label>
        <textarea name="message" id="message"></textarea>
        <br>
        <br>
        <input type="submit" value="Submit" name="submitRegistration">
    </form>


</body>
</html>
