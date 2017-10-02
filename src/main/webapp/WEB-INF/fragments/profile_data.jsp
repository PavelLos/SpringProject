<%--
  Created by IntelliJ IDEA.
  User: pasha
  Date: 18.09.2017
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="row">
    <div class="col-md-3"></div>
    <div class="col-md-6">
        <div class="card">
            <div class="view overlay hm-white-slight z-depth-1-half">
                <img src="https://mdbootstrap.com/img/Photos/Others/img%20(27).jpg" alt="Sample image for first version of blog listing" class="img-fluid">
                <a>
                    <div class="mask"></div>
                </a>
            </div>
            <div class="card-body">
            <!--Title-->
            <a><h4 class="card-title">${profile.login}</h4></a>
            <a class="card-meta">Friends</a>

            <!--Text-->
            <p class="card-text">Anna is a web designer living in New York.</p>
            <hr>
            <a class="card-meta"><span><i class="fa fa-user"></i>83 Friends</span></a>
            <p class="card-meta float-right">Joined in 2012</p>
        </div>
        </div>
    </div>
    <div class="col-md-3"></div>
</div>
