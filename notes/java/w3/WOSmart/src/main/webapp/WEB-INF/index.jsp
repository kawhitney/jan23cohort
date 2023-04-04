<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
        <h1>Testing</h1>
        <nav>
            <a href="/addItem">Add Item</a>
        </nav>
    </header>
    <!-- MAIN -->
    <main>
        <c:forEach items="${allItems}" var="i">
            <div class="d-flex flex-row">
                <p>${i.name} / $${i.price} - </p>
                <div class="d-flex flex-row">
                    <a href="/item/${i.id}/edit" class="p-0 mx-2">Edit</a> 
                    |
                    <form action="/item/${i.id}/delete" method="post">
                        <input type="hidden" name="_method" value="delete">
                        <button class="btn btn-link p-0 pb-2 mx-2">Delete</button>
                    </form>
                </div>
            </div>
        </c:forEach>
    </main>
    <!-- FOOTER -->
    <footer>

    </footer>
</body>
</html>