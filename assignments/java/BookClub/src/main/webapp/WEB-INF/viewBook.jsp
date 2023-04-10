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
    <header class="d-flex flex-row justify-content-between m-5">
        <h1><c:out value="${book.title}"/></h1>
        <nav>
            <a href="/books">Back to the Shelves</a>
        </nav>
    </header>
    <!-- MAIN -->
    <main class="d-flex flex-column m-5">
        <h2>
            <c:if test="${userID == book.user.id}">
                <span style="color: red">You </span>
            </c:if>
            <c:if test="${userID != book.user.id}">
                <span style="color: red"><c:out value="${book.user.userName} "/></span>
            </c:if>            
            read
            <span style="color: purple"><c:out value="${book.title} "/></span>
            by 
            <span style="color: green"><c:out value="${book.author}"/></span>
            .
        </h2>

        <p>
            Here are 
            <span>
                <c:if test="${userID == book.user.id}">
                    your
                </c:if>
                <c:if test="${userID != book.user.id}">
                    <c:out value="${book.user.userName}'s"/>
                </c:if> 
            </span>
            thoughts:
        </p>

        <p class="border-top border-bottom w-75 py-3">
            <c:out value="${book.thoughts}"/>
        </p>

        <div class="d-flex justify-content-end w-75">
            <c:if test="${userID == book.user.id}">
                <a href="/books/${book.id}/edit" class="btn btn-secondary">edit</a>
                <form:form action="/books/${book.id}/delete" method="post" modelAttribute="modelForm" class="d-flex ms-3">            
                    <button class="btn btn-danger">Delete</button>
                </form:form>
            </c:if>
        </div>
    </main>
    <!-- FOOTER -->
    <footer>

    </footer>
</body>
</html>