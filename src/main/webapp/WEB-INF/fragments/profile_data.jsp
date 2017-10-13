<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="user" scope="request" type="com.los.project.entity.User"/>
<%--
  Created by IntelliJ IDEA.
  User: pasha
  Date: 18.09.2017
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="row">
    <div class="card">
        <img src="https://mdbootstrap.com/img/Photos/Others/img%20(27).jpg"
             class="img-fluid avatar avatar-size mx-4 mt-4">
        <div class="card-body mx-4 mb-3">
            <hr>
            <a><h4 class="card-title">${user.userProfile.login}</h4></a>
            <a class="card-meta">Friends</a>

            <p class="card-text">Anna is a web designer living in New York.</p>
            <hr>
            <%--<c:if test="${user.subscriberList != null}">
                <a class="card-meta"><span><i class="fa fa-user"></i>Friends ${user.subscriberList.size()} </span></a>
            </c:if>--%>
            <c:if test="${user.userProfile.birthday!=null}">
                <a class="card-meta"><span><i class="fa fa-calendar"></i>Data ${user.userProfile.birthday}</span></a>
            </c:if>
            <c:if test="${user.userProfile.email!=null}">
                <a class="card-meta"><span><i class="fa fa-calendar"></i>Data ${user.userProfile.email}</span></a>
            </c:if>
            <c:if test="${user.userProfile.phone!=null}">
                <a class="card-meta"><span><i class="fa fa-calendar"></i>Data ${user.userProfile.phone}</span></a>
            </c:if>
            <p class="card-meta float-right">Data 1111</p>
        </div>
    </div>
</div>
