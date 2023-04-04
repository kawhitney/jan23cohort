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

        </nav>
    </header>
    <!-- MAIN -->
    <main>
        <div class="d-flex flex-column">
            <h1>Burger Tracker</h1>
            <table class="table">
                <thead>
                    <!--- Column Labels --->
                    <tr>
                      <th scope="col">1</th>
                      <th scope="col">2</th>
                      <th scope="col">3</th>
                      <th scope="col">4</th>
                    </tr>
                </thead>
                <tbody>
                    <!--- Row Data --->
                    <c:forEach items="${allBurgers}" var="i">
                    <tr>
                        <th scope="row">A</th>
                        <td>B</td>
                        <td>C</td>
                        <td>D</td>
                    </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
        <form:form action="/addBurger" method="post">
            <h2>Add a Burger:</h2>

            <form:errors path="burgerName" class="text-warning"/>
            <div class="d-flex flex-row my-3">
                <label for="burgerName">Burger Name</label>
                <input type="text" name="burgerName">
            </div>

            <form:errors path="restaurant" class="text-warning"/>
            <div class="d-flex flex-row my-3">
                <label for="restaurant">Restaurant Name</label>
                <input type="text" name="restaurant">
            </div>

            <form:errors path="rating" class="text-warning"/>
            <div class="d-flex flex-row my-3">
                <label for="rating">Rating</label>
                <input type="number" name="rating">
            </div>

            <form:errors path="notes" class="text-warning"/>
            <div class="d-flex flex-row my-3">
                <label for="notes">Notes</label>
                <input type="textarea" name="notes">
            </div>

            <button>Add Burger</button>
        </form:form>
    </main>
    <!-- FOOTER -->
    <footer>

    </footer>
</body>
</html>