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
    <header class="d-flex flex-row justify-content-between m-2">
        <h1>Add a book to Your Shelf!</h1>
        <nav>
            <a href="/books">Back to the Shelves</a>
        </nav>
    </header>
    <!-- MAIN -->
    <main class="m-2 w-75">
        <form:form action="/books/new" method="post" modelAttribute="modelForm" class="d-flex flex-column">  
            <input type="text" name="user" value="${userID}" hidden> 

            <!-- Validation Error -->
            <form:errors path="title" class="text-warning"/>
                <!-- Attribute Information -->
                <div class="d-flex flex-row justify-content-between my-2">
                    <label for="title">Title:</label>
                    <input type="text" name="title" class="w-75">
                </div>

            <!-- Validation Error -->
            <form:errors path="author" class="text-warning"/>
                <!-- Attribute Information -->
                <div class="d-flex flex-row justify-content-between my-2">
                    <label for="author">Author:</label>
                    <input type="text" name="author" class="w-75">
                </div>

            <!-- Validation Error -->
            <form:errors path="thoughts" class="text-warning"/>
                <!-- Attribute Information -->
                <div class="d-flex flex-row justify-content-between my-2">
                    <label for="thoughts">My Thoughts:</label>
                    <textarea name="thoughts" class="w-75" ></textarea>
                </div>

            <div class="d-flex justify-content-end">
                <button class="btn btn-secondary w-25">Submit</button>
            </div>
        </form:form>
    </main>
    <!-- FOOTER -->
    <footer>

    </footer>
</body>
</html>