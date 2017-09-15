<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: pasha
  Date: 15.09.2017
  Time: 0:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html class="full-height">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Material Design Bootstrap</title>
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.0/css/font-awesome.min.css">
    <!-- Bootstrap core CSS -->
    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <!-- Material Design Bootstrap -->
    <link href="${contextPath}/resources/css/mdb.min.css" rel="stylesheet">
    <!-- Your custom styles (optional) -->
    <link href="${contextPath}/resources/css/style.css" rel="stylesheet">

</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light blue-grey lighten-5 fixed-top mb-5">
    <div class="container">
        <a class="navbar-brand" href="#">Social</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent"
                aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span>
        </button>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav ml-auto">
                <div class="nav-item custom-margin">
                    <form class="form-inline">
                        <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
                    </form>
                </div>
                <div class="nav-item">
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" id="navbarDropdownMenuLink" data-toggle="dropdown"
                           aria-haspopup="true" aria-expanded="false">Language</a>
                        <div class="dropdown-menu dropdown-primary" aria-labelledby="navbarDropdownMenuLink">
                            <a class="dropdown-item" href="#">Russian</a>
                            <a class="dropdown-item" href="#">English</a>
                        </div>
                    </li>
                </div>
            </ul>
        </div>
    </div>
</nav>
<main class="mt-5">

    <div class="container mt-5">
        <div class="row">
            <div class="col-md-7 mt-5"></div>
            <div class="col-md-5 mt-5">

                <section class="form-elegant">
                    <div class="card">
                        <div class="card-body mx-4">
                            <div class="text-center">
                                <h3 class="dark-grey-text mb-1"><strong>Sign in</strong></h3>
                            </div>
                            <div class="md-form">
                                <input type="text" id="Form-email1" class="form-control">
                                <label for="Form-email1">Your email</label>
                            </div>
                            <div class="md-form">
                                <input type="password" id="Form-pass" class="form-control">
                                <label for="Form-pass">Your password</label>
                                <p class="font-small blue-text d-flex justify-content-end">Forgot <a href="#"
                                                                                                     class="blue-text ml-1">Password?</a>
                                </p>
                            </div>
                            <div class="text-center mb-3">
                                <button type="submit" class="btn blue-gradient btn-block btn-rounded z-depth-1a">Sign
                                    in
                                </button>
                            </div>
                        </div>
                    </div>
                </section>

                <section class="form-elegant mt-5">
                    <div class="card">
                        <div class="card-body mx-4">
                            <div class="text-center">
                                <h3 class="dark-grey-text mb-1"><strong>Sign up</strong></h3>
                            </div>
                            <form:form method="POST" action="${contextPath}/registration"
                                       modelAttribute="registrationForm" class="form-horizontal"
                                       enctype="utf8">
                                <div class="md-form">
                                    <input type="text" name="login" class="form-control"
                                           id="inputLoginRegistration"
                                           aria-describedby="sizing-addon3">
                                    <label for="inputLoginRegistration">Your Login</label>
                                </div>
                                <div class="md-form">
                                    <input type="email" name="email" class="form-control"
                                           id="inputEmailRegistration">
                                    <label for="inputEmailRegistration">Your Email</label>
                                </div>
                                <div class="md-form">
                                    <input type="password" name="password" class="form-control"
                                           id="inputPasswordRegistration">
                                    <label for="inputPasswordRegistration">Your password</label>
                                </div>
                                <div class="text-center mb-3">
                                    <button type="submit" class="btn blue-gradient btn-block btn-rounded z-depth-1a">
                                        Sign
                                        up
                                    </button>
                                </div>
                            </form:form>
                        </div>
                    </div>
                </section>
            </div>

        </div>
    </div>


</main>

<footer>

</footer>

<!-- SCRIPTS -->
<!-- JQuery -->
<script type="text/javascript" src="${contextPath}/resources/js/jquery-3.1.1.min.js"></script>
<!-- Bootstrap tooltips -->
<script type="text/javascript" src="${contextPath}/resources/js/popper.min.js"></script>
<!-- Bootstrap core JavaScript -->
<script type="text/javascript" src="${contextPath}/resources/js/bootstrap.min.js"></script>
<!-- MDB core JavaScript -->
<script type="text/javascript" src="${contextPath}/resources/js/mdb.min.js"></script>

</body>
</html>
