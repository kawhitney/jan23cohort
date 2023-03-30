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

        </nav>
    </header>
    <!-- MAIN -->
    <main>
        <div id="goldCount">
            <h2>Your Gold: <span id="count"><c:out value="${count}"></c:out></span></h2>
            <form action="reset" method="post">
                <button>Reset</button>
            </form>
        </div>
        <div>
            <div id="farm">
                <h2>Farm</h2>
                <p>(Earns 10-20 gold)</p>
                <form action="/gold/farm" method="post">
                    <button>Find Gold!</button>
                </form>
            </div>
            <div id="cave">
                <h2>Cave</h2>
                <p>(Earns 5-10 gold)</p>
                <form action="/gold/cave" method="post">
                    <button>Find Gold!</button>
                </form>
            </div>
            <div id="house">
                <h2></h2>
                <p>(Earns 2-5 gold)</p>
                <form action="/gold/house" method="post">
                    <button>Find Gold!</button>
                </form>
            </div>
            <div id="quest">
                <h2></h2>
                <p>(Earns / Takes 0-50 gold)</p>
                <form action="/gold/quest" method="post">
                    <button>Find Gold!</button>
                </form>
            </div>
        </div>
        <div>
            <h2>Activities</h2>

        </div>
    </main>
    <!-- FOOTER -->
    <footer>

    </footer>
</body>
</html>