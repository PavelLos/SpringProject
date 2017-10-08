<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="container">
    <div class="row">
        <div class="col-md-7"></div>
        <div class="col-md-5">
            <section class="form-elegant">
                <div class="card ">
                    <div class="card-body mx-4">
                        <div class="text-center">
                            <h3 class="dark-grey-text mb-1"><strong><spring:message code="label.sign_in"/></strong></h3>
                        </div>
                        <%--@elvariable id="${loginForm}" type="com.los.project.forms.UserLoginForm"--%>
                        <form:form method="POST" action="${contextPath}/login"
                                   modelAttribute="${loginForm}" class="form-horizontal validate"
                                   enctype="utf8">
                            <div class="md-form mt-2">
                                <input type="text" name="login" id="Form-email1" class="form-control"
                                       data-error="${error}">
                                <label for="Form-email1"><spring:message code="label.email"/></label>
                            </div>
                            <div class="md-form mt-2">
                                <input type="password" name="password" id="Form-pass" class="form-control"
                                       data-error="${error}">
                                <label for="Form-pass"><spring:message code="label.password"/></label>
                                <p class="font-small blue-text d-flex justify-content-end">
                                    <a href="#" class="cyan-text ml-1"><spring:message code="label.forgot_pass"/></a>
                                </p>
                            </div>
                            <span>${error}</span>
                            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                            <div class="text-center mb-3">
                                <button type="submit" class="btn btn-cyan btn-block btn-rounded z-depth-1a">
                                    <spring:message code="label.sign_in"/>
                                </button>
                            </div>
                        </form:form>
                    </div>
                </div>
            </section>

            <section class="form-elegant mt-5">
                <div class="card">
                    <div class="card-body mx-4">
                        <div class="text-center">
                            <h3 class="dark-grey-text mb-1"><strong><spring:message
                                    code="label.sign_up"/></strong></h3>
                        </div>
                        <%--@elvariable id="${registrationForm}" type="com.los.project.forms.UserRegistrationForm"--%>
                        <form:form method="POST" action="${contextPath}/registration"
                                   modelAttribute="${registrationForm}" class="form-horizontal"
                                   enctype="utf8">
                            <div class="md-form mt-2">
                                <input type="text" name="login" class="form-control"
                                       id="inputLoginRegistration" aria-describedby="sizing-addon3"/>
                                <label for="inputLoginRegistration" data-error="${error}"
                                       data-success="right"><spring:message code="label.login"/></label>
                            </div>
                            <div class="md-form mt-2">
                                <input type="email" name="email" class="form-control"
                                       data-error="${error}"
                                       id="inputEmailRegistration" path="email"/>
                                <label for="inputEmailRegistration"><spring:message code="label.email"/></label>
                            </div>
                            <div class="md-form mt-2">
                                <input type="password" name="password" class="form-control"
                                       data-error="${error}"
                                       id="inputPasswordRegistration" path="password"/>
                                <label for="inputPasswordRegistration"><spring:message code="label.password"/></label>
                            </div>
                            <span>${error}</span>
                            <div class="text-center mb-3">
                                <button type="submit" class="btn btn-cyan btn-block btn-rounded z-depth-1a">
                                    <spring:message code="label.sign_up"/>
                                </button>
                            </div>
                        </form:form>
                    </div>
                </div>
            </section>
        </div>

    </div>
</div>
