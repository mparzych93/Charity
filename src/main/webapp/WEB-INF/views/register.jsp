<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="pl">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Document</title>
    <link rel="stylesheet" href="resources/css/style.css" />
</head>
<body>

<jsp:include page="header.jsp" />

<section class="login-page">
    <h2>Załóż konto</h2>
    <form:form path="/register" method="post" modelAttribute="user">
        <div class="form-group">
            <form:input type="text" path="username" placeholder="Login" />
        </div>
        <div class="form-group">
            <form:input type="email" path="email" placeholder="Email" />
        </div>
        <div class="form-group">
            <form:input type="text" path="firstName" placeholder="Imie" />
        </div>
        <div class="form-group">
            <form:input type="text" path="lastName" placeholder="Nazwisko" />
        </div>
        <div class="form-group">
            <form:input type="password" path="password" placeholder="Hasło" />
        </div>
        <div class="form-group">
            <input type="password" name="password2" placeholder="Powtórz hasło" />
        </div>

        <div class="form-group form-group--buttons">
            <a href="login.html" class="btn btn--without-border">Zaloguj się</a>
            <button class="btn" type="submit">Załóż konto</button>
        </div>
    </form:form>
</section>

<jsp:include page="footer.jsp" />
</body>
</html>
