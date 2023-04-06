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
    <main class="d-flex flex-column justify-content-center align-items-center">
        <div class="d-flex flex-column align-items-center w-75">
            <div class="d-flex flex-row justify-content-between align-items-center mt-5 w-100">
                <h1>Expense Details</h1>
                <a href="/">Go Back</a>
            </div>
            <div class="d-flex flex-row justify-content-between w-50 mt-3">
                <p>Expense Name:</p>
                <p>${expense.name}</p>
            </div>
            <div class="d-flex flex-row justify-content-between w-50">
                <p>Expense Description:</p>
                <p>${expense.description}</p>
            </div>
            <div class="d-flex flex-row justify-content-between w-50">
                <p>Vendor:</p>
                <p>${expense.vendor}</p>
            </div>
            <div class="d-flex flex-row justify-content-between w-50">
                <p>Amount Spent:</p>
                <p>$${expense.amount}</p>
            </div>
        </div>
    </main>
    <!-- FOOTER -->
    <footer>

    </footer>
</body>
</html>