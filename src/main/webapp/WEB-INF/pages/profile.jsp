<%--
  Created by IntelliJ IDEA.
  User: pasha
  Date: 18.09.2017
  Time: 14:51
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
        <div class="row">
            <div class="col-md-4">
                <jsp:include page="../fragments/profile_data.jsp"/>
            </div>
            <div class="col-md-8">
                <jsp:include page="../fragments/post.jsp"/>
                <jsp:include page="../fragments/post.jsp"/>
                <jsp:include page="../fragments/post.jsp"/>
                <jsp:include page="../fragments/post.jsp"/>
            </div>
        </div>
    </div>
</main>
<jsp:include page="../sections/scripts.jsp"/>
</body>
</html>
