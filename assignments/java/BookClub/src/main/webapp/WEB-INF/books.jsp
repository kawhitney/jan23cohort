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
    <header class="d-flex flex-row justify-content-between m-2">
        <div class="">
            <h1>Welcome, ${user.userName}</h1>
            <p>Books from everyone's shelves:</p>
        </div>
        <nav class="d-flex flex-column justify-content-around align-items-end">
            <a href="/logout">Logout</a>
            <a href="/books/new">+ Add to my shelf!</a>
        </nav>
    </header class="m-2">
    <!-- MAIN -->
    <main class="m-2">
        <table class="table">
            <thead>
                <!--- Column Labels --->
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Title</th>
                    <th scope="col">Author Name</th>
                    <th scope="col">Posted By</th>
                </tr>
            </thead>
            <tbody>
                <!--- Row Data --->
                <c:forEach items="${allBooks}" var="i">
                    <tr>
                        <th scope="row">${i.id}</th>
                        <td><a href="/books/${i.id}">${i.title}</a></td>
                        <td>${i.author}</td>
                        <td>${i.user.userName}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </main>
    <!-- FOOTER -->
    <footer>

    </footer>
</body>
</html>