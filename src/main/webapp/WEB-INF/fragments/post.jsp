<%--
  Created by IntelliJ IDEA.
  User: pasha
  Date: 16.09.2017
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="row mt-5">
    <div class="card">
        <div class="card-body mx-4">
            <div class="row">
                <div class="media">
                    <img class="d-flex rounded-circle avatar z-depth-1-half mr-3"
                         src="../../resources/img/project/default-avatar-ponsy-deer.png"
                         alt="Avatar">
                    <div class="media-body">
                        <a class="name">John Doe</a>
                        <%--<h5 class="mt-0">Name</h5>--%>
                        <div class="date">17.09.2017 13:42</div>
                    </div>
                </div>
            </div>
            <hr>
            <div class="row">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt
                ut labore
                et
                dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
                aliquip
                ex
                ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore
                eu
                fugiat
                nulla pariatur.
            </div>
            <hr>
            <div class="row">
                <a class="btn-floating btn-lg"><i class="fa fa-thumbs-o-up fa-lg" aria-hidden="true"></i></a>
                <h5 class="px-3 py-2">23</h5>
                <a class="btn-floating btn-lg"><i class="fa fa-thumbs-o-down fa-lg" aria-hidden="true"></i></a>
                <a class="btn-floating btn-lg  ml-auto"><i class="fa fa-comment fa-lg" aria-hidden="true"></i> </a>
                <a class="btn-floating btn-lg" style="margin-left: -20px;"><h5>Comments</h5></a>
            </div>
            <div class="collapse" id="collapseExample-1">
                <div class="card card-body mt-1">
                    <!--Add comment-->
                    <div class="md-form mt-1 mb-1">
                        <textarea type="text" id="form7" class="md-textarea"></textarea>
                        <label for="form7">Add comment</label>
                    </div>
                    <div class="d-flex justify-content-end">
                        <button type="button" class="btn-flat waves-effect" data-toggle="collapse" data-target="#collapseExample-1" aria-expanded="false" aria-controls="collapseExample-1">Cancel</button>
                        <button type="button" class="btn btn-primary" data-toggle="collapse" data-target="#collapseExample-1" aria-expanded="false" aria-controls="collapseExample-1">Reply</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
