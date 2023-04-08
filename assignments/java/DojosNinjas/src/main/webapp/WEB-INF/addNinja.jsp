<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- for forms -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!-- for validation -->
<%@ page isErrorPage="true" %>


<!DOCTYPE html>
<html>
<head>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css"> 
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <!-- My CSS -->
    <link rel='stylesheet' href='/css/styles.css'>
    <!-- JS for Bootstrap / jQuery -->
    <script src='/webjars/jquery/jquery.min.js'>    </script>
    <script src='/webjars/bootstrap/js/boostrap.min.js'>    </script>
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous">    </script>
    <!-- My JS -->
    <script type = "text/javascript" src='/js/scripts.js'></script>
    <meta charset="UTF-8">

    <!-- Title -->
    <title>Project Title</title>
</head>
<body>
    <!-- HEADER -->
    <header>
        <nav>

        </nav>
    </header>
    <!-- MAIN -->
    <main class="d-flex flex-column align-items-center ms-4">
        <h1 class="my-3 w-100">New Ninja</h1>
        <form:form action="/ninjas/new" method="post" modelAttribute="modelForm" class="d-flex flex-column w-75">
            <div class="d-flex flex-row justify-content-between my-2">
                <label for="dojo">Dojo:</label>
                <select name="dojo" id="">
                    <option value="" selected="true" disabled>--Select a Location--</option>
                    <c:forEach items="${allDojos}" var="i">
                        <option value="${i.id}">${i.name}</option>
                    </c:forEach>
                </select>
                <!-- Validation Error -->
                <form:errors path="dojo" class="text-warning"/>
            </div>
            <div class="d-flex flex-row justify-content-between my-2">
                <label for="firstName">First Name:</label>
                <input type="text" name="firstName">
                <!-- Validation Error -->
                <form:errors path="firstName" class="text-warning"/>
            </div>
            <div class="d-flex flex-row justify-content-between my-2">
                <label for="lastName">Last Name:</label>
                <input type="text" name="lastName">
                <!-- Validation Error -->
                <form:errors path="lastName" class="text-warning"/>
            </div>
            <div class="d-flex flex-row justify-content-between my-2">
                <label for="age">Age:</label>
                <input type="number" name="age">
                <!-- Validation Error -->
                <form:errors path="age" class="text-warning"/>
            </div>
            <button>Submit</button>
        </form:form>
    </main>
    <!-- FOOTER -->
    <footer>

    </footer>
</body>
</html>