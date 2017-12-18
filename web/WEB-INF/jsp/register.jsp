<%-- 
    Document   : register
    Created on : Dec 15, 2017, 10:32:39 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Register</h1>
        <form:form action="register/save" modelAttribute="registerBean" method="POST" >
            <form:label path="firstName">First Name</form:label>
            <form:input path="firstName"/><br/>
            <form:label path="lastName">Last Name</form:label>
            <form:input path="lastName"/><br/>
            <form:label path="username">User Name</form:label>
            <form:input path="username"/><br/>
            <form:label path="password">Password</form:label>
            <form:input path="password"/><br/>
            <p>
                <form:button name="submitButton" value="Submit">Submit</form:button>
            </p>
        </form:form>
    </body>
</html>
