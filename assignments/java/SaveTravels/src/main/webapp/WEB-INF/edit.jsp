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
        <div class="d-flex flex-column align-items-start w-75">
            <h2 class="w-100">Add an expense:</h2>
            <form:form action="/expense/${expense.id}/update" method="post" modelAttribute="expenseForm" class="d-flex flex-column">
                <input type="hidden" name="_method" value="put">

                <div class="d-flex justify-content-between m-2">
                    <label for="name" class="pe-3">Expense Name:</label>
                    <input type="text" name="name" value="${expense.name}">
                    <form:errors path="name" class="text-warning ms-2 me-2 pe-1"/>
                </div>
                <div class="d-flex justify-content-between m-2">
                    <label for="vendor" class="pe-3">Vendor:</label>
                    <input type="text" name="vendor" value="${expense.vendor}">
                    <form:errors path="vendor" class="text-warning ms-2 me-2 pe-1"/>
                </div>
                <div class="d-flex justify-content-between m-2">
                    <label for="amount" class="pe-3">Amount:</label>
                    <input type="number" step="0.01" name="amount" value="${expense.amount}">
                    <form:errors path="amount" class="text-warning ms-2 me-2 pe-1"/>
                </div>
                <div class="d-flex justify-content-between m-2">
                    <label for="description" class="pe-3">Description:</label>
                    <textarea type="text" name="description" row="5" cols="22">${expense.description}</textarea>
                    <form:errors path="description" class="text-warning ms-2 me-2 pe-1"/>
                </div>
                <div class="d-flex justify-content-end">
                    <button class="btn btn-secondary col-3 m-2">Submit</button>
                </div>
            </form:form>
        </div>
    </main>
    <!-- FOOTER -->
    <footer>

    </footer>
</body>
</html>