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
    <main class="p-5">
        <div id="goldCount" class="d-flex flex-row align-items-center py-2">
            <h2 class="pe-3">Your Gold: </h2>
            <span id="count" class="border mx-2 px-2" style="width: 150px; height:35px; text-align:left;"><c:out value="${count}"></c:out></span>
            <form action="reset" method="post">
                <button class="mx-5 p-1">Reset</button>
            </form>
        </div>
        <div class="d-flex flex-row justify-content-between py-2">
            <div id="farm" class="border overflow-auto p-3" style="width:250px; height: 200px;">
                <h2>Farm</h2>
                <p>(Earns 10-20 gold)</p>
                <form action="/gold/farm" method="post">
                    <button class="shadow">Find Gold!</button>
                </form>
            </div>
            <div id="cave" class="border overflow-auto p-3" style="width:250px; height: 200px;">
                <h2>Cave</h2>
                <p>(Earns 5-10 gold)</p>
                <form action="/gold/cave" method="post">
                    <button class="shadow">Find Gold!</button>
                </form>
            </div>
            <div id="house" class="border overflow-auto p-3" style="width:250px; height: 200px;">
                <h2>House</h2>
                <p>(Earns 2-5 gold)</p>
                <form action="/gold/house" method="post">
                    <button class="shadow">Find Gold!</button>
                </form>
            </div>
            <div id="quest" class="border overflow-auto p-3" style="width:250px; height: 200px;">
                <h2>Quest</h2>
                <p>(Earns / Takes 0-50 gold)</p>
                <form action="/gold/quest" method="post">
                    <button class="shadow">Find Gold!</button>
                </form>
            </div>
        </div>
        <div class="d-flex flex-column w-100 py-2 px-1">
            <h2 class="mt-3">Activities:</h2>
            <div class="border overflow-auto px-3" style="height: 300px;">
            	<c:if test='${count != 0}'>
    		            <c:forEach var="i" items="${activities}">
    		            	<c:if test="${i.contains('lost')}">
    		            		<p style="color:red;"> <c:out value="${i}"/> </p>
    		            	</c:if>
    		            	<c:if test="${i.contains('earned')}">
    		            		<p style="color:green;"> <c:out value="${i}"/> </p>
    		            	</c:if>	                
    		            </c:forEach>
            	</c:if>
            </div>
        </div>
    </main>
    <!-- FOOTER -->
    <footer>

    </footer>
</body>
</html>