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
        <nav>
            <a href="/dojos/new" class="m-2">Add New Dojo</a>
            <a href="/ninjas/new" class="m-2">Add New Ninja</a>
        </nav>
    </header>
    <!-- MAIN -->
    <main class="d-flex flex-column justify-content-center">
        <h1 class="my-3">Dojos</h1>
        <table class="table ">
            <thead>
                <!--- Column Labels --->
                <tr>
                    <th scope="col">Dojo</th>
                    <th scope="col"># Students</th>
                    <th scope="col">Actions</th>
                </tr>
            </thead>
            <tbody>
                <!--- Row Data --->
                <c:forEach items="${allDojos}" var="i">
                    <tr>
                        <th scope="row">${i.name}</th>
                        <td>${i.ninjas.size()}</td>
                        <td>
                            <a href="/ninjas/${i.id}">View Ninjas</a>
                        </td>
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