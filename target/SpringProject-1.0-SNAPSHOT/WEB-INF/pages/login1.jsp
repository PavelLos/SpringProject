<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Log in with your account</title>

    <link href="${contextPath}/resources/css/bootstrap.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/style.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/mdb.min.css" rel="stylesheet">


    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.0/css/font-awesome.min.css">
    <!-- Bootstrap core CSS -->
    <!-- Material Design Bootstrap -->
    <!-- Your custom styles (optional) -->

    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>

</head>

<body>


<nav class="navbar navbar-expand-lg navbar-dark indigo navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Network</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                       aria-expanded="false">Language <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Русский</a></li>
                        <li><a href="#">English</a></li>
                    </ul>
                </li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>


<section class="view intro-2 hm-stylish-strong">
    <div class="container flex-center">
        <div class="row flex-center pt-5 mt-3">
            <div class="col-md-6 text-center text-md-left mb-5">

            </div>

            <div class="col-md-6 col-xl-5 offset-xl-1">
                <form>
                    <p class="h5 text-center mb-4">Sign in</p>

                    <div class="md-form">
                        <i class="fa fa-envelope prefix grey-text"></i>
                        <input type="text" id="defaultForm-email" class="form-control" mdbActive>
                        <label for="defaultForm-email">Your email</label>
                    </div>

                    <div class="md-form">
                        <i class="fa fa-lock prefix grey-text"></i>
                        <input type="password" id="defaultForm-pass" class="form-control" mdbActive>
                        <label for="defaultForm-pass">Your password</label>
                    </div>

                    <div class="text-center">
                        <button class="btn btn-default waves-light" mdbRippleRadius>Login</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>

<%--<div class="row">
    <div class="col-md-2 col-md-auto">
        <div class="container-fluid page-block">
            <form:form method="POST" action="${contextPath}/login" class="form-horizontal" enctype="utf8">
                <div class="form-group ${error != null ? 'has-error' : ''}">
                    <span>${message}</span>
                    <div class="col-sm-10">
                        <input type="text" name="login" class="form-control" placeholder="Login" id="inputLogin"
                               aria-describedby="sizing-addon3">
                    </div>
                    <div class="col-sm-10">
                        <input type="password" name="password" class="form-control" placeholder="Password"
                               id="inputPassword">
                    </div>
                    <div class="col-sm-10">
                        <div class="checkbox">
                            <label><input type="checkbox"> Remember me</label>
                        </div>
                    </div>
                    <div class="col-sm-10">
                        <button type="submit" class="btn btn-primary">Sign in</button>
                    </div>
                </div>
            </form:form>
        </div>

        <div class="container-fluid page-block">
            <form method="POST" action="${contextPath}/registration" modelAttribute="registrationForm" class="form-horizontal">
                <div class="form-group ${error != null ? 'has-error' : ''}">
                    <span>${message}</span>
                    <div class="col-sm-10">
                        <input type="text" name="login" class="form-control" placeholder="Login" id="inputLoginRegistration"
                               aria-describedby="sizing-addon3">
                    </div>
                    <div class="col-sm-10">
                        <input type="email" name="email" class="form-control" placeholder="Email"
                               id="inputEmailRegistration">
                    </div>
                    <div class="col-sm-10">
                        <input type="password" name="password" class="form-control" placeholder="Password"
                               id="inputPasswordRegistration">
                    </div>
                    <div class="col-sm-10">
                        <button type="submit" class="btn btn-primary">Sign up</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>--%>


<!-- /container -->
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
