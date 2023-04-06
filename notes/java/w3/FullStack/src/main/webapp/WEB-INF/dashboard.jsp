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
        <h1> ${user.firstName}'s Dashboard</h1>
        <nav>
            <a href="/">Home</a>
            <a href="/addPuppy">Add Puppy</a>
            <a href="/logout">Logout</a>
        </nav>
    </header>
    <!-- MAIN -->
    <main>
        <div class="d-flex flex-row justify-content-around">
            <div class="d-flex flex-column m-3">
                <h2>Your Puppies</h2>
                <c:forEach items="${allPuppies}" var="p">
                    <c:if test="${userID == p.owner.id}">
                        <div class="d-flex flex-column">
                            <h4>${p.name}</h4>
                            <p>Breed: ${p.breed} Owner: ${p.owner.firstName}</p>
                        </div>
                    </c:if>
                </c:forEach>
            </div>
            <div class="d-flex flex-column m-3">
                <h2>All Puppies</h2>
                <c:forEach items="${allPuppies}" var="p">
                    <div class="d-flex flex-column">
                        <h4>${p.name}</h4>
                        <p>Breed: ${p.breed} Owner: ${p.owner.firstName}</p>
                    </div>
                </c:forEach>
            </div>
        </div>
    </main>
    <!-- FOOTER -->
    <footer>

    </footer>
</body>
</html>