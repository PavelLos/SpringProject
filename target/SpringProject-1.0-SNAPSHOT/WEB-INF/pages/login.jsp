<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Log in with your account</title>

    <link href="${contextPath}/resources/css/bootstrap.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/style.css" rel="stylesheet">

    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>

</head>

<body>


<nav class="navbar navbar-default navbar-fixed-top">
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

<div class="row">
    <div class="col-md-2 col-md-offset-7">
        <div class="container-fluid page-block">
            <form method="POST" action="${contextPath}/login" class="form-horizontal">
                <div class="form-group ${error != null ? 'has-error' : ''}">
                    <span>${message}</span>
                    <div class="col-sm-10">
                        <input type="text" name="username" class="form-control" placeholder="Login" id="inputLogin"
                               aria-describedby="sizing-addon3">
                    </div>
                    <div class="col-sm-10">
                        <input type="password" name="password" class="form-control" placeholder="Password"
                               id="inputPassword">
                    </div>
                    <div class="col-sm-10">
                        <div class="checkbox">
                            <label><input type="checkbox" > Remember me</label>
                        </div>
                    </div>
                    <div class="col-sm-10">
                        <button type="submit" class="btn btn-primary">Sign in</button>
                    </div>
                </div>
            </form>
        </div>

        <div class="container-fluid page-block">
            <form method="POST" action="${contextPath}/login" class="form-horizontal">
                <div class="form-group ${error != null ? 'has-error' : ''}">
                    <span>${message}</span>
                    <div class="col-sm-10">
                        <input type="text" name="username" class="form-control" placeholder="Login" id="inputLogin"
                               aria-describedby="sizing-addon3">
                    </div>
                    <div class="col-sm-10">
                        <input type="email" name="email" class="form-control" placeholder="Email"
                               id="inputEmail">
                    </div>
                    <div class="col-sm-10">
                        <input type="password" name="password" class="form-control" placeholder="Password"
                               id="inputPassword">
                    </div>
                    <div class="col-sm-10">
                        <button type="submit" class="btn btn-primary">Sign in</button>
                    </div>
                </div>
            </form>
        </div>
    </div>

    <%-- <div class="container page_block">
         <form method="POST" action="${contextPath}/login" class="form-horizontal">
             <div class="form-group ${error != null ? 'has-error' : ''}">
                 <span>${message}</span>
                 <div class="col-sm-10">
                     <input type="text" name="username" class="form-control" placeholder="Login" id="inputLogin"
                            aria-describedby="sizing-addon3">
                 </div>
                 <div class="col-sm-10">
                     <input type="password" name="password" class="form-control" placeholder="Password"
                            id="inputPassword">
                 </div>
                 <div class="col-sm-10">
                     <div class="checkbox">
                         <label>
                             <input type="checkbox"> Remember me
                         </label>
                     </div>
                 </div>
                 <div class="col-sm-10">
                     <button type="submit" class="btn btn-primary">Sign in</button>
                 </div>
             </div>
         </form>
     </div>--%>

    <%--<form method="POST" action="${contextPath}/login" class=page_block>
        <h2 class="form-heading">Log in</h2>

        <div class="form-group ${error != null ? 'has-error' : ''}">
            <span>${message}</span>
            <input name="username" type="text" class="form-control" placeholder="Username"
                   autofocus="true"/>
            <input name="password" type="password" class="form-control" placeholder="Password"/>
            <span>${error}</span>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

            <button class="btn btn-lg btn-primary btn-block" type="submit">Log In</button>
        </div>

    </form>--%>


</div>


<!-- /container -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.js"></script>
</body>
</html>
