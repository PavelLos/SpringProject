<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<spring:url value="/user/profile" var="profileUrl"/>

<nav class="navbar navbar-expand-lg navbar-dark fixed-top scrolling-navbar cyan">
    <a class="navbar-brand" href="/">Social</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link waves-effect waves-light" href="#"><i class="fa fa-envelope"></i> <spring:message
                        code="header.contact"/> </a>
            </li>
            <li class="nav-item">
                <a class="nav-link waves-effect waves-light" href="#"><i class="fa fa-gear"></i> <spring:message
                        code="header.settings"/></a>
            </li>
            <li class="nav-item btn-group">
                <a class="nav-link dropdown-toggle" id="navbarDropdownMenuProfile"
                   data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-user"></i>
                    <spring:message
                            code="header.profile"/>
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuProfile">
                    <a class="dropdown-item" href="${profileUrl}"><spring:message
                            code="header.profile.my_account"/></a>
                    <a class="dropdown-item" href="/logout"><spring:message
                            code="header.profile.log_out"/></a>
                </div>
            </li>
        </ul>
        <ul class="navbar-nav ml-auto">
            <div class="nav-item mr-2">
                <form class="form-inline">
                    <input class="form-control mr-sm-2" type="text" placeholder="<spring:message
                            code="header.search"/>" aria-label="Search">
                </form>
            </div>
            <div class="nav-item">
                <li class="nav-item btn-group">
                    <a class="nav-link dropdown-toggle" id="navbarDropdownMenauLanguage"
                       data-toggle="dropdown"
                       aria-haspopup="true" aria-expanded="false"><spring:message
                            code="header.language"/></a>
                    <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLanguage">
                        <a class="dropdown-item button-a" href="?lang=ru"><spring:message
                                code="header.language.russian"/></a>
                        <a class="dropdown-item button-a" href="?lang=en"><spring:message
                                code="header.language.english"/></a>
                    </div>
                </li>
            </div>
        </ul>
    </div>
</nav>
