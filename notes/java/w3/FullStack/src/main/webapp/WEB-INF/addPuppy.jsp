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
        <h1>Welcome!</h1>
        <nav>
            <a href="/dashboard">Dashboard</a>
            <a href="/addPuppy">Add Puppy</a>
            <a href="/logout">Logout</a>
        </nav>
    </header>
    <!-- MAIN -->
    <main>
        <h1>Adopt a Puppy!</h1>
        <form:form action="/createPuppy" method="post" modelAttribute="puppyForm" class="d-flex flex-column">                
            <div class="d-flex">
                <!-- Attribute Information -->
                <label for="name">Puppy's name:</label>
                <input type="text" name="name">
                <!-- Validation Error -->
                <form:errors path="name" class="text-warning"/>
            </div>
            <div class="d-flex">
                <!-- Attribute Information -->
                <label for="breed">Puppy's breed:</label>
                <input type="text" name="breed">
                <!-- Validation Error -->
                <form:errors path="breed" class="text-warning"/>
            </div>
            <input type="text" name="owner" value="${userID}" hidden>
            <button>Submit</button>
        </form:form>
    </main>
    <!-- FOOTER -->
    <footer>

    </footer>
</body>
</html>