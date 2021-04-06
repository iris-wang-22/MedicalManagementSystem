<%--
  Created by IntelliJ IDEA.
  User: Chenshufu
  Date: 2017/7/1
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="ctxStatic" value="${pageContext.request.contextPath }/static"/>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>医疗管理系统 | 注册</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.6 -->
    <link rel="stylesheet" href="${ctxStatic}/bootstrap/css/bootstrap.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="${ctxStatic}/dist/css/AdminLTE.min.css">
    <!-- iCheck -->
    <link rel="stylesheet" href="${ctxStatic}/plugins/iCheck/square/blue.css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
</head>
<body class="hold-transition register-page">

<div class="register-box">
    <div class="register-logo">
        <a href="${pageContext.request.contextPath}/user/login"><i class="fa fa-user-md"></i>
            <b>医疗管理系统</b></a>
    </div>

    <div class="register-box-body">
        <p class="login-box-msg">注册一个新用户</p>

        <form:form action="register" method="post" modelAttribute="user">
            <div class="form-group has-feedback">
                <form:input path="userName" type="text" class="form-control" placeholder="用户名"/>
                <span class="glyphicon glyphicon-user form-control-feedback"></span>
                <form:errors path="userName"/>
            </div>
            <div class="form-group has-feedback">
                <form:input path="userAccount" type="text" class="form-control" placeholder="账号"/>
                <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
                <form:errors path="userAccount"/>
            </div>
            <div class="form-group has-feedback">
                <form:input path="userPassword" type="password" class="form-control" placeholder="密码"/>
                <span class="glyphicon glyphicon-lock form-control-feedback"></span>
                <form:errors path="userPassword"/>
            </div>
            <div class="form-group has-feedback">
                <input type="password" class="form-control" placeholder="确认密码"/>
                <span class="glyphicon glyphicon-log-in form-control-feedback"></span>
            </div>
            <div class="row">
                <div class="col-xs-8">
                    <div class="checkbox icheck">
                        <label>
                            <input type="checkbox"> 我同意 <a href="#">条例</a>
                        </label>
                    </div>
                </div>
                <!-- /.col -->
                <div class="col-xs-4">
                    <button type="submit" class="btn btn-block btn-flat ">注册</button>
                </div>
                <!-- /.col -->
            </div>
        </form:form>


        <a href="${pageContext.request.contextPath}/user/login" class="text-center"><font color="#483d8b">我已有账号</font></a>
    </div>
    <!-- /.form-box -->
</div>
<!-- /.register-box -->

<!-- jQuery 2.2.3 -->
<script src="${ctxStatic}/plugins/jQuery/jquery-2.2.3.min.js"></script>
<!-- Bootstrap 3.3.6 -->
<script src="${ctxStatic}/bootstrap/js/bootstrap.min.js"></script>

</body>
</html>