<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="foem" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page import="com.los.project.entity.enums.Sex" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <jsp:include page="../sections/head-config.jsp"/>
</head>
<body>

<jsp:include page="../fragments/header.jsp"/>
<main>

    <div class="container">
        <h1><spring:message code="header.profile.edit"/></h1>
        <hr>
        <!-- left column -->

        <form:form method="post" action="${contextPath}/user/profile/edit"
                   modelAttribute="editProfile" commandName="editProfile" enctype="multipart/form-data">
            <form:hidden path="login"/>
            <form:hidden path="password"/>
            <form:hidden path="email"/>
            <form:hidden path="userRole"/>
            <form:hidden path="avatarImage"/>

            <div class="row">
                <div class="col-md-3">
                    <div class="text-center">
                        <img src="//placehold.it/100" class="avatar img-circle" alt="avatar">
                        <h6><spring:message code="label.profile.upload.file"/></h6>

                        <form:input type="file" name="file" id="avatar" path="imageFile"/>
                        <%--<div class="kv-avatar">
                            <div class="file-loading">
                                <form:input cssStyle="display: none" id="avatar" name="avatarFile" type="file" path="avatarImage"/>
                            </div>
                        </div>--%>

                            <%--<label class="btn btn-primary cyan btn-file">
                                <form:input type="file" name="file" id="file" class="display: none;" path="avatarImage"/>
                            </label>--%>

                        <div>
                            <label for="avatar"><spring:message code="label.profile.choose.file"/></label>
                        </div>

                    </div>
                </div>
                <!-- edit form column -->

                <div class="col-md-9 personal-info">
                    <spring:hasBindErrors name="editProfile">
                        <div class="alert alert-info alert-dismissable">
                            <a class="panel-close close" data-dismiss="alert">×</a>
                            <i class="fa fa-coffee"></i>
                            This is an <strong>.alert</strong>. Use this to show important messages to the user.
                        </div>
                    </spring:hasBindErrors>
                    <h3><spring:message code="label.profile.personal.info"/></h3>
                    <div class="form-group">
                        <div class="form-group">
                            <label class="col-lg-3 control-label"><spring:message
                                    code="label.profile.first.name"/></label>
                            <div class="col-lg-8">
                                <form:input path="firstName" class="form-control" type="text"
                                            value="${editProfile.firstName}"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-lg-3 control-label"><spring:message
                                    code="label.profile.last.name"/></label>
                            <div class="col-lg-8">
                                <form:input class="form-control" type="text" path="lastName"
                                            value="${editProfile.lastName}"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-lg-3 control-label"><spring:message
                                    code="label.profile.middle.name"/></label>
                            <div class="col-lg-8">
                                <form:input class="form-control" type="text" path="middleName"
                                            value="${editProfile.middleName}"/>
                            </div>
                        </div>
                        <%--<div class="form-group">
                            <label class="col-lg-3 control-label"><spring:message code="label.email"/></label>
                            <div class="col-lg-8">
                                <form:input class="form-control" type="text" path="email"
                                            value="${editProfile.email}"/>
                            </div>
                        </div>--%>
                        <div class="form-group">
                            <label class="col-lg-3 control-label"><spring:message code="label.profile.sex"/></label>
                            <div class="px-3">
                                <form:radiobutton name="radio_group" class="with-gap" id="radio1" path="sex"
                                                  value="${Sex.MALE}"/>
                                <label for="radio1"><spring:message code="label.profile.sex.male"/></label>
                                <form:radiobutton name="radio_group" class="with-gap" id="radio2" path="sex"
                                                  value="${Sex.FEMALE}"/>
                                <label for="radio2"><spring:message code="label.profile.sex.female"/></label>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-lg-4 control-label"><spring:message
                                    code="label.profile.birthday"/></label>
                            <div class="col-lg-8">
                                <form:input class="form-control" type="date" path="birthday"
                                            value="${editProfile.birthday}"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-lg-3 control-label"><spring:message code="label.profile.phone"/></label>
                            <div class="col-lg-8">

                                <form:input type="text" class="input-medium" placeholder="+375 (29) 256 02 15"
                                            data-format="+375 (dd) ddd dd dd" path="phone"
                                            value="${editProfile.phone}"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-md-3 control-label"></label>
                            <div class="col-md-8">
                                <input type="submit" class="btn btn-primary"
                                       value="<spring:message code="label.profile.save"/>">
                                <span></span>
                                <input type="reset" class="btn btn-default"
                                       value="<spring:message code="label.profile.cancel"/>">
                            </div>
                        </div>
                    </div>
                </div>


            </div>
        </form:form>
        <hr>
    </div>

</main>

<jsp:include page="../sections/scripts.jsp"/>
</body>
</html>
