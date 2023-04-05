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
    <main>
        <div class="d-flex flex-column  align-items-center">
            <h1 class="w-75">Burger Tracker</h1>
            <table class="table w-75">
                <thead>
                    <!--- Column Labels --->
                    <tr>
                        <th scope="col">Burger Name</th>
                        <th scope="col">Restaurant Name</th>
                        <th scope="col">Rating (out of 5)</th>
                        <th scope="col">Action</th>
                    </tr>
                </thead>
                <tbody>
                    <!--- Row Data --->
                    <c:forEach items="${allBurgers}" var="i">
                    <tr>
                        <th scope="row">${i.burgerName}</th>
                        <td>${i.restaurant}</td>
                        <td>${i.rating}</td>
                        <td><a href="/burger/${i.id}/edit">Edit</a></td>
                    </tr>
                    </c:forEach>
                </tbody>
            </table>
            <form:form action="/createBurger" method="post" modelAttribute="burgerForm" class="d-flex flex-column align-items-end py-2 w-auto">
                <div class="d-flex flex-row justify-content-evenly p-2">
                    <label for="burgerName" class="px-2">Burger Name:</label>
                    <input type="text" name="burgerName" id=""/>
                    <form:errors path="notes" class="text-warning ms-2"/>
                </div>

                <div class="d-flex flex-row justify-content-evenly p-2">
                    <label for="restaurant" class="px-2">Restaurant Name:</label>
                    <input type="text" name="restaurant" id=""/>
                    <form:errors path="burgerName" class="text-warning ms-2"/>
                </div>
                
                <div class="d-flex flex-row justify-content-evenly p-2">
                    <label for="rating" class="px-2">Rating:</label>
                    <input name="rating" type="number"/>
                    <form:errors path="rating" class="text-warning ms-2 me-2 pe-1"/>   
                </div>

                <div class="d-flex flex-row justify-content-evenly p-2">
                    <label for="notes" class="px-2">Notes:</label>
                    <textarea name="notes" rows="5" cols="22"></textarea>
                    <form:errors path="restaurant" class="text-warning ms-2"/>
                </div>

                <button class="btn btn-primary m-2">Add Burger</button>
            </form:form>
        </div>
    </main>
    <!-- FOOTER -->
    <footer>

    </footer>
</body>
</html>