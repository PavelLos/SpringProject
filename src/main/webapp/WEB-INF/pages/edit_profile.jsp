<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="com.los.project.entity.enums.Sex" %>
<%--
  Created by IntelliJ IDEA.
  User: pasha
  Date: 08.10.2017
  Time: 18:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../sections/head-config.jsp"/>
</head>
<body>

<jsp:include page="../fragments/header.jsp"/>
<main>

    <div class="container">
        <h1>Edit Profile</h1>
        <hr>
        <div class="row">
            <!-- left column -->

            <div class="col-md-3">
                <div class="text-center">
                    <img src="//placehold.it/100" class="avatar img-circle" alt="avatar">
                    <h6>Upload a different photo...</h6>

                    <label class="btn btn-primary cyan btn-file">
                        <input type="file" name="file" id="file" class="display: none;"/>
                    </label>

                    <div>
                        <label for="file">Choose a file</label>
                    </div>

                </div>
            </div>

            <!-- edit form column -->
            <div class="col-md-9 personal-info">
                <div class="alert alert-info alert-dismissable">
                    <a class="panel-close close" data-dismiss="alert">×</a>
                    <i class="fa fa-coffee"></i>
                    This is an <strong>.alert</strong>. Use this to show important messages to the user.
                </div>
                <h3>Personal info</h3>

                <form:form method="post" action="${contextPath}/user/profile/edit" cssClass="form-horizontal"
                           role="form"
                           modelAttribute="editProfile" commandName="editProfile" enctype="utf8">
                <div class="form-group">
                    <label class="col-lg-3 control-label">First name:</label>
                    <div class="col-lg-8">

                        <div class="form-group">
                                <form:input path="firstName" class="form-control" type="text"
                                            value="${user.userProfile.firstName}"/>
                            <%--<input class="form-control" type="text"
                            <c:choose>
                            <c:when test="${user.userProfile.firstName !=null}">
                                   value="${user.userProfile.firstName}"
                            </c:when>

                            <c:otherwise>
                                   value=""
                            </c:otherwise>
                            </c:choose>>--%>
                        </div>
                        <div class="form-group">
                            <label class="col-lg-3 control-label">Last name:</label>
                            <div class="col-lg-8">
                                <form:input class="form-control" type="text" path="lastName"/>
                                <%--<c:choose>
                                <c:when test="${user.userProfile.lastName !=null}">
                                       value="${user.userProfile.lastName}"
                                </c:when>

                                <c:otherwise>
                                       value=""
                                </c:otherwise>
                                </c:choose>>--%>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-lg-3 control-label">Middle Name:</label>
                            <div class="col-lg-8">
                                <form:input class="form-control" type="text" path="middleName"/>
                                <%--<c:choose>
                                <c:when test="${user.userProfile.middleName !=null}">
                                       value="${user.userProfile.middleName}"
                                </c:when>

                                <c:otherwise>
                                       value=""
                                </c:otherwise>
                                </c:choose>>--%>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-lg-3 control-label">Email:</label>
                            <div class="col-lg-8">
                                <form:input class="form-control" type="text" path="email"/>
                                <%--<c:choose>
                                <c:when test="${user.userProfile.email !=null}">
                                       value="${user.userProfile.email}"
                                </c:when>

                                <c:otherwise>
                                       value=""
                                </c:otherwise>
                                </c:choose>>--%>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-lg-3 control-label">Sex:</label>
                            <div class="px-3">

                                <form:input path="sex" name="radio_group" type="radio" class="with-gap"  id="radio1"/>
                                <label for="radio1">Male</label>

                                <input name="radio_group" type="radio" class="with-gap" id="radio2">
                                <label for="radio2">Female</label>
<%--
                                <c:choose>
                                    <c:when test="${user.userProfile.sex==Sex.MALE}">
                                        <input name="radio_group" type="radio" class="with-gap" id="radio1" checked>
                                        <label for="radio1">Male</label>

                                        <input name="radio_group" type="radio" class="with-gap" id="radio2">
                                        <label for="radio2">Female</label>
                                    </c:when>
                                    <c:when test="${user.userProfile.sex==Sex.FEMALE}">
                                        <input name="radio_group" type="radio" class="with-gap" id="radio1">
                                        <label for="radio1">Male</label>

                                        <input name="radio_group" type="radio" class="with-gap" id="radio2" checked>
                                        <label for="radio2">Female</label>
                                    </c:when>
                                    <c:otherwise>
                                        <input name="radio_group" type="radio" class="with-gap" id="radio1">
                                        <label for="radio1">Male</label>

                                        <input name="radio_group" type="radio" class="with-gap" id="radio2">
                                        <label for="radio2">Female</label>
                                    </c:otherwise>
                                </c:choose>
--%>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-lg-4 control-label">Date of birthday:</label>
                            <div class="col-lg-8">
                                <input class="form-control" type="date" id="date-input"
                                <c:choose>
                                <c:when test="${user.userProfile.birthday !=null}">
                                       value="${user.userProfile.birthday}"
                                </c:when>

                                <c:otherwise>
                                       value=""
                                </c:otherwise>
                                </c:choose>>
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-lg-3 control-label">Phone:</label>
                            <div class="col-lg-8">
                                <input type="text" class="input-medium" placeholder="+375 (29) 256 02 15"
                                       data-format="+375 (dd) ddd dd dd"
                                <c:choose>
                                <c:when test="${user.userProfile.phone !=null}">
                                       value="${user.userProfile.phone}"
                                </c:when>

                                <c:otherwise>
                                       value=""
                                </c:otherwise>
                                </c:choose>>
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-md-3 control-label"></label>
                            <div class="col-md-8">
                                <input type="button" class="btn btn-primary" value="Save Changes">
                                <span></span>
                                <input type="reset" class="btn btn-default" value="Cancel">
                            </div>
                        </div>
                        </form:form>
                    </div>
                </div>
            </div>
            <hr>

</main>

<jsp:include page="../sections/scripts.jsp"/>
<script src="js/custom-file-input.js"></script>
</body>
</html>
