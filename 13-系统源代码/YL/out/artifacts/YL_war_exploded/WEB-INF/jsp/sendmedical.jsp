<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="ctxStatic" value="${pageContext.request.contextPath }/static"/>
<!DOCTYPE html>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>AdminLTE 2 | Starter</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.6 -->
    <link rel="stylesheet" href="${ctxStatic}/bootstrap/css/bootstrap.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="${ctxStatic}/plugins/datatables/dataTables.bootstrap.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href=".${ctxStatic}/dist/css/AdminLTE.min.css">
    <!-- AdminLTE Skins. We have chosen the skin-blue for this starter
          page. However, you can choose any other skin. Make sure you
          apply the skin class to the body tag so the changes take effect.
    -->
    <link rel="stylesheet" href="${ctxStatic}/dist/css/skins/skin-blue.min.css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<!--
BODY TAG OPTIONS:
=================
Apply one or more of the following classes to get the
desired effect
|---------------------------------------------------------|
| SKINS         | skin-blue                               |
|               | skin-black                              |
|               | skin-purple                             |
|               | skin-yellow                             |
|               | skin-red                                |
|               | skin-green                              |
|---------------------------------------------------------|
|LAYOUT OPTIONS | fixed                                   |
|               | layout-boxed                            |
|               | layout-top-nav                          |
|               | sidebar-collapse                        |
|               | sidebar-mini                            |
|---------------------------------------------------------|
-->
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

    <!-- Main Header -->
    <header class="main-header">

        <!-- Logo -->
        <a class="logo">
            <!-- mini logo for sidebar mini 50x50 pixels -->
            <span class="logo-mini"><b>YL</b></span>
            <!-- logo for regular state and mobile devices -->
            <span class="logo-lg">??????????????????</span>
        </a>

        <!-- Header Navbar -->
        <nav class="navbar navbar-static-top" role="navigation">
            <!-- Sidebar toggle button-->
            <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
                <span class="sr-only">???????????????</span>
            </a>
            <!-- Navbar Right Menu -->
            <div class="navbar-custom-menu">
                <ul class="nav navbar-nav">
                    <!-- User Account Menu -->
                    <li class="dropdown user user-menu">
                        <!-- Menu Toggle Button -->
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <!-- The user image in the navbar-->
                            <img src="../../../dist/img/user2-160x160.jpg" class="user-image" alt="User Image">
                            <!-- hidden-xs hides the username on small devices so only the image appears. -->
                            <span class="hidden-xs">?????????</span>
                        </a>
                        <ul class="dropdown-menu">
                            <!-- The user image in the menu -->
                            <li class="user-header">
                                <img src="../../../dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">

                                <p>
                                    ????????? - ??????
                                    <small>????????????</small>
                                </p>
                            </li>
                            <!-- Menu Footer-->
                            <li class="user-footer">
                                <div class="pull-left">
                                    <a href="#" class="btn btn-default btn-flat">????????????</a>
                                </div>
                                <div class="pull-right">
                                    <a href="#" class="btn btn-default btn-flat">??????</a>
                                </div>
                            </li>
                        </ul>
                    </li>
                    <li class="dropdown notifications-menu">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="fa fa-sign-out"></i>
                        </a>
                    </li>
                </ul>
            </div>
        </nav>
    </header>
    <!-- Left side column. contains the logo and sidebar -->
    <aside class="main-sidebar">

        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">

            <!-- Sidebar user panel (optional) -->
            <div class="user-panel">

                <div class="pull-left info">
                    <p>??????</p>
                    <!-- Status -->
                    <a href="#"><i class="fa fa-circle text-success"></i> ??????</a>
                </div>
            </div>

            <!-- search form (Optional) -->
            <form action="#" method="get" class="sidebar-form">
                <div class="input-group">
                    <input type="text" name="q" class="form-control" placeholder="????????????...">
                    <span class="input-group-btn">
                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                </button>
              </span>
                </div>
            </form>
            <!-- /.search form -->

            <!-- Sidebar Menu -->
            <ul class="sidebar-menu">
                <li class="header">????????????</li>
                <!-- Optionally, you can add icons to the links -->
                <li class><a href="#"><i class="fa fa-user"></i> <span>????????????</span></a></li>
                <li class="treeview">
                    <a href="#"><i class="fa fa-stethoscope"></i> <span>??????</span>
                        <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
                    </a>
                    <ul class="treeview-menu">
                        <li><a href="#">??????</a></li>
                        <li><a href="#">??????</a></li>
                    </ul>
                </li>
                <li class="treeview active">
                    <a href="#"><i class="fa fa-flask"></i> <span> ????????????</span>
                        <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
                    </a>
                    <ul class="treeview-menu">
                        <li class="treeview">
                            <a href="#"> <span>??????/?????????????????????</span> <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span></a>
                            <ul class="treeview-menu">
                                <li><a href="#">?????????????????????</a></li>
                                <li><a href="#">????????????</a></li>
                                <li><a href="#">????????????</a></li>
                                <li><a href="#">????????????</a></li>

                            </ul>
                        </li>
                        <li class="treeview">
                            <a href="#"> <span>??????????????????</span> <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span></a>
                            <ul class="treeview-menu">
                                <li><a href="#">??????????????????</a></li>
                                <li><a href="#">??????????????????????????????</a></li>
                            </ul>
                        </li>
                        <li><a href="#">????????????</a></li>
                        <li class="active"><a href="#">??????</a></li>
                    </ul>
                </li>
                <li class="treeview">
                    <a href="#"><i class="fa fa-institution"></i> <span>????????????</span>
                        <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
                    </a>
                    <ul class="treeview-menu">
                        <li><a href="#">?????????</a></li>
                        <li><a href="#">?????????</a></li>
                        <li><a href="#">?????????</a></li>
                    </ul>
                </li>
                <li class="treeview">
                    <a href="#"><i class="fa fa-gears"></i> <span>????????????</span>
                        <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
                    </a>
                    <ul class="treeview-menu">
                        <li><a href="#">????????????</a></li>
                        <li><a href="#">????????????</a></li>
                        <li><a href="#">????????????</a></li>
                        <li><a href="#">????????????</a></li>
                    </ul>
                </li>
            </ul>
            <!-- /.sidebar-menu -->
        </section>
        <!-- /.sidebar -->
    </aside>
    <!-- Main content -->



<!-- Content Wrapper. Contains page content -->

    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
            ??????????????????
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> ????????????</a></li>
                <li class="active">??????</li>
            </ol>
        </section>
        <!-- Main content -->
        <section class="content">
            <div>
                <div class="box-tools">
                    <div class="has-feedback">
                        <input type="text" class="form-control input-sm" placeholder="Search Mail">
                        <span class="glyphicon glyphicon-search form-control-feedback"></span>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-xs-3">
                    <div class="box box-primary">
                        <div class="box-body box-profile">
                            <img class="profile-user-img img-responsive img-circle" src="../../../dist/img/IMG_8444.JPG"/>
                            <h3 class="profile-username text-center">?????????</h3>

                            <p class="text-muted text-center">???/38???</p>

                            <ul class="list-group list-group-unbordered">
                                <li class="list-group-item">
                                    <b>?????????</b> <a>?????????</a>
                                </li>
                                <li class="list-group-item">
                                    <b>?????????</b> <a>?????????????????????5h???</a>
                                </li>
                                <li class="list-group-item">
                                    <b>???????????????</b> <a>?????????</a>
                                </li>
                            </ul>


                            <button type="button" data-toggle="modal" data-target="#MM" a href="#" class="btn btn-primary btn-block">?????????</button>
                            <div class="modal fade" id="MM" tabindex="-1" role="dialog">
                                <div class="modal-dialog" role="document">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                            <h4 class="modal-title">????????????</h4>
                                        </div>
                                        <form class="form-horizontal">
                                            <div class="form-group">
                                                <label  class="col-sm-3 control-label">?????????</label>
                                                <div class="col-sm-8">
                                                    <label>?????????</label>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label  class="col-sm-3 control-label">?????????</label>
                                                <div class="col-sm-8">
                                                    <label>???</label>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label  class="col-sm-3 control-label">????????????????????????</label>
                                                <div class="col-sm-8">
                                                    <div class="box-body">
                                                        <table id="example1" class="table table-bordered table-striped">
                                                            <thead>
                                                            <tr>
                                                                <th>??????</th>
                                                                <th>????????????</th>
                                                                <th>??????</th>
                                                                <th>??????</th>
                                                                <th>??????</th>
                                                                <th>????????????</th>
                                                                <th>????????????</th>
                                                            </tr>
                                                            </thead>
                                                            <tbody>
                                                            <tr>
                                                                <td>1</td>
                                                                <td>005</td>
                                                                <td>?????????</td>
                                                                <td> GB5099</td>
                                                                <td>2</td>
                                                                <td>?????????</td>
                                                                <td>

                                                                    <button type="button" data-toggle="modal" data-target="#MM">?????????</button>
                                                                    <div class="modal fade" id="MM" tabindex="-1" role="dialog">
                                                                        <div class="modal-dialog" role="document">
                                                                            <div class="modal-content">
                                                                                <div class="modal-header">
                                                                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                                                                    <h4 class="modal-title">??????????????????</h4>
                                                                                </div>
                                                                                <form class="form-horizontal">
                                                                                    <div class="box-body">
                                                                                        <table id="example1" class="table table-bordered table-striped">
                                                                                            <thead>
                                                                                            <tr>
                                                                                                <th>????????????</th>
                                                                                                <th>????????????</th>
                                                                                                <th>????????????</th>
                                                                                                <th>?????????</th>
                                                                                                <th>??????</th>
                                                                                            </tr>
                                                                                            </thead>
                                                                                            <tbody>
                                                                                            <tr>
                                                                                                <td>?????????</td>
                                                                                                <td>GB5099</td>
                                                                                                <td>2017-1-20</td>
                                                                                                <td> ?????????</td>
                                                                                                <td>
                                                                                                    <a class="btn btn-primary btn-xs">??????</a>
                                                                                                </td>
                                                                                            </tr>
                                                                                            <tr>
                                                                                                <td>?????????</td>
                                                                                                <td>GB5099</td>
                                                                                                <td>2017-10-29</td>
                                                                                                <td> ?????????</td>
                                                                                                <td>
                                                                                                    <a class="btn btn-primary btn-xs">??????</a>
                                                                                                </td>
                                                                                            </tr>
                                                                                            <tr>
                                                                                                <td>?????????</td>
                                                                                                <td>GB5099</td>
                                                                                                <td>2017-10-20</td>
                                                                                                <td> ?????????</td>
                                                                                                <td>
                                                                                                    <a class="btn btn-primary btn-xs">??????</a>
                                                                                                </td>
                                                                                            </tr>
                                                                                            <tr>
                                                                                                <td>?????????</td>
                                                                                                <td>GB5099</td>
                                                                                                <td>2019-10-20</td>
                                                                                                <td> ?????????</td>
                                                                                                <td>
                                                                                                    <a class="btn btn-primary btn-xs">??????</a>
                                                                                                </td>
                                                                                            </tr>
                                                                                            <tr>
                                                                                                <td>?????????</td>
                                                                                                <td>GB5099</td>
                                                                                                <td>2018-6-20</td>
                                                                                                <td> ?????????</td>
                                                                                                <td>
                                                                                                    <a class="btn btn-primary btn-xs">??????</a>
                                                                                                </td>
                                                                                            </tr>
                                                                                            <tr>
                                                                                                <td>?????????</td>
                                                                                                <td>GB5099</td>
                                                                                                <td>2018-9-20</td>
                                                                                                <td> ?????????</td>
                                                                                                <td>
                                                                                                    <a class="btn btn-primary btn-xs">??????</a>
                                                                                                </td>
                                                                                            </tr>
                                                                                            <tr>
                                                                                                <td>?????????</td>
                                                                                                <td>GB5099</td>
                                                                                                <td>2018-11-20</td>
                                                                                                <td> ?????????</td>
                                                                                                <td>
                                                                                                    <a class="btn btn-primary btn-xs">??????</a>
                                                                                                </td>
                                                                                            </tr>
                                                                                            <tr>
                                                                                                <td>?????????</td>
                                                                                                <td>GB5099</td>
                                                                                                <td>2018-10-22</td>
                                                                                                <td> ?????????</td>
                                                                                                <td>
                                                                                                    <a class="btn btn-primary btn-xs">??????</a>
                                                                                                </td>
                                                                                            </tr>
                                                                                            <tr>
                                                                                                <td>?????????</td>
                                                                                                <td>GB5099</td>
                                                                                                <td>2018-10-21</td>
                                                                                                <td> ?????????</td>
                                                                                                <td>
                                                                                                    <a class="btn btn-primary btn-xs">??????</a>
                                                                                                </td>
                                                                                            </tr>
                                                                                        </table>
                                                                                        <div class="box-footer clearfix">
                                                                                            <ul class="pagination pagination-sm no-margin pull-right">
                                                                                                <li><a href="#">&laquo;</a></li>
                                                                                                <li><a href="#">1</a></li>
                                                                                                <li><a href="#">2</a></li>
                                                                                                <li><a href="#">3</a></li>
                                                                                                <li><a href="#">&raquo;</a></li>
                                                                                            </ul>
                                                                                        </div>
                                                                                    </div>
                                                                                    <div class="modal-footer">
                                                                                        <button type="button" class="btn btn-default" data-dismiss="modal">??????</button>
                                                                                        <button type="button" class="btn btn-primary">??????</button>
                                                                                    </div>
                                                                            </div><!-- /.modal-content -->
                                                                        </div><!-- /.modal-dialog -->
                                                                    </div>
                                                                </td>
                                                            </tr>
                                                            <tr>
                                                                <td>2</td>
                                                                <td>015</td>
                                                                <td>?????????</td>
                                                                <td>5ml</td>
                                                                <td>2</td>
                                                                <td>?????????</td>
                                                                <td>
                                                                    <a class="btn btn-primary btn-xs">?????????</a>
                                                                </td>
                                                            </tr>
                                                        </table>
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="form-group">
                                                <label  class="col-sm-3 control-label">???????????????</label>
                                                <div class="col-sm-8">
                                                    <label>2017-07-06 17:00</label>
                                                </div>
                                            </div>
                                            <div class="modal-footer">
                                                <button type="button" class="btn btn-default" data-dismiss="modal">??????</button>
                                            </div>
                                    </div><!-- /.modal-content -->
                                </div><!-- /.modal-dialog -->
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-xs-3">
                <div class="box box-primary">
                        <div class="box-body box-profile">
                            <img class="profile-user-img img-responsive img-circle" src="${ctxStatic}/dist/img/IMG_8444.JPG"/>
                            <h3 class="profile-username text-center">?????????</h3>

                            <p class="text-muted text-center">???/38???</p>

                            <ul class="list-group list-group-unbordered">
                                <li class="list-group-item">
                                    <b>?????????</b> <a>?????????</a>
                                </li>
                                <li class="list-group-item">
                                    <b>?????????</b> <a>?????????????????????5h???</a>
                                </li>
                                <li class="list-group-item">
                                    <b>???????????????</b> <a>?????????</a>
                                </li>
                            </ul>

                            <a href="#" class="btn btn-primary btn-block"><b>?????????</b></a>
                        </div>
                </div>
                </div>
                <div class="col-xs-3">
                    <div class="box box-primary">
                        <div class="box-body box-profile">
                            <img class="profile-user-img img-responsive img-circle" src="${ctxStatic}/dist/img/IMG_8444.JPG"/>
                            <h3 class="profile-username text-center">?????????</h3>

                            <p class="text-muted text-center">???/38???</p>

                            <ul class="list-group list-group-unbordered">
                                <li class="list-group-item">
                                    <b>?????????</b> <a>?????????</a>
                                </li>
                                <li class="list-group-item">
                                    <b>?????????</b> <a>?????????????????????5h???</a>
                                </li>
                                <li class="list-group-item">
                                    <b>???????????????</b> <a>?????????</a>
                                </li>
                            </ul>

                            <a href="#" class="btn btn-primary btn-block"><b>?????????</b></a>
                        </div>
                    </div>
                </div>
                <div class="col-xs-3">
                    <div class="box box-primary">
                        <div class="box-body box-profile">
                            <img class="profile-user-img img-responsive img-circle" src="${ctxStatic}/dist/img/IMG_8444.JPG"/>
                            <h3 class="profile-username text-center">?????????</h3>

                            <p class="text-muted text-center">???/38???</p>

                            <ul class="list-group list-group-unbordered">
                                <li class="list-group-item">
                                    <b>?????????</b> <a>?????????</a>
                                </li>
                                <li class="list-group-item">
                                    <b>?????????</b> <a>?????????????????????5h???</a>
                                </li>
                                <li class="list-group-item">
                                    <b>???????????????</b> <a>?????????</a>
                                </li>
                            </ul>

                            <a href="#" class="btn btn-primary btn-block"><b>?????????</b></a>
                        </div>
                    </div>
                </div>
                <div class="col-xs-3">
                    <div class="box box-primary">
                        <div class="box-body box-profile">
                            <img class="profile-user-img img-responsive img-circle" src="${ctxStatic}/dist/img/IMG_8444.JPG"/>
                            <h3 class="profile-username text-center">?????????</h3>

                            <p class="text-muted text-center">???/38???</p>

                            <ul class="list-group list-group-unbordered">
                                <li class="list-group-item">
                                    <b>?????????</b> <a>?????????</a>
                                </li>
                                <li class="list-group-item">
                                    <b>?????????</b> <a>?????????????????????5h???</a>
                                </li>
                                <li class="list-group-item">
                                    <b>???????????????</b> <a>?????????</a>
                                </li>
                            </ul>

                            <a href="#" class="btn btn-primary btn-block"><b>?????????</b></a>
                        </div>
                    </div>
                </div>
                <div class="col-xs-3">
                    <div class="box box-primary">
                        <div class="box-body box-profile">
                            <img class="profile-user-img img-responsive img-circle" src="${ctxStatic}/dist/img/IMG_8444.JPG"/>
                            <h3 class="profile-username text-center">?????????</h3>

                            <p class="text-muted text-center">???/38???</p>

                            <ul class="list-group list-group-unbordered">
                                <li class="list-group-item">
                                    <b>?????????</b> <a>?????????</a>
                                </li>
                                <li class="list-group-item">
                                    <b>?????????</b> <a>?????????????????????5h???</a>
                                </li>
                                <li class="list-group-item">
                                    <b>???????????????</b> <a>?????????</a>
                                </li>
                            </ul>

                            <a href="#" class="btn btn-primary btn-block"><b>?????????</b></a>
                        </div>
                    </div>
                </div>
                <div class="col-xs-3">
                    <div class="box box-primary">
                        <div class="box-body box-profile">
                            <img class="profile-user-img img-responsive img-circle" src="${ctxStatic}/dist/img/IMG_8444.JPG"/>
                            <h3 class="profile-username text-center">?????????</h3>

                            <p class="text-muted text-center">???/38???</p>

                            <ul class="list-group list-group-unbordered">
                                <li class="list-group-item">
                                    <b>?????????</b> <a>?????????</a>
                                </li>
                                <li class="list-group-item">
                                    <b>?????????</b> <a>?????????????????????5h???</a>
                                </li>
                                <li class="list-group-item">
                                    <b>???????????????</b> <a>?????????</a>
                                </li>
                            </ul>

                            <a href="#" class="btn btn-primary btn-block"><b>?????????</b></a>
                        </div>
                    </div>
                </div>
                <div class="col-xs-3">
                    <div class="box box-primary">
                        <div class="box-body box-profile">
                            <img class="profile-user-img img-responsive img-circle" src="${ctxStatic}/dist/img/IMG_8444.JPG"/>
                            <h3 class="profile-username text-center">?????????</h3>

                            <p class="text-muted text-center">???/38???</p>

                            <ul class="list-group list-group-unbordered">
                                <li class="list-group-item">
                                    <b>?????????</b> <a>?????????</a>
                                </li>
                                <li class="list-group-item">
                                    <b>?????????</b> <a>?????????????????????5h???</a>
                                </li>
                                <li class="list-group-item">
                                    <b>???????????????</b> <a>?????????</a>
                                </li>
                            </ul>

                            <a href="#" class="btn btn-primary btn-block"><b>?????????</b></a>
                        </div>
                    </div>
                    <div class="pull-right">
                        1-8/200
                        <div class="btn-group">
                            <button type="button" class="btn btn-default btn-sm"><i class="fa fa-chevron-left"></i></button>
                            <button type="button" class="btn btn-default btn-sm"><i class="fa fa-chevron-right"></i></button>
                        </div>
                        <!-- /.btn-group -->
                    </div>
                </div>
                </div>
            </div>

        </section>
    </div>
</body>
<!-- Main Footer -->
<footer class="main-footer">
    <!-- To the right -->
    <div class="pull-right hidden-xs">
        ????????? ????????? ????????? ????????? ?????????
    </div>
    <!-- Default to the left -->
    <strong>Copyright &copy; 2017 <a href="#">JavaEE???????????????</a>.</strong> All rights reserved.
</footer>

<!-- Control Sidebar -->
<aside class="control-sidebar control-sidebar-dark">
    <!-- Create the tabs -->
    <ul class="nav nav-tabs nav-justified control-sidebar-tabs">
        <li class="active"><a href="#control-sidebar-home-tab" data-toggle="tab"><i class="fa fa-home"></i></a></li>
        <li><a href="#control-sidebar-settings-tab" data-toggle="tab"><i class="fa fa-gears"></i></a></li>
    </ul>
    <!-- Tab panes -->
    <div class="tab-content">
        <!-- Home tab content -->
        <div class="tab-pane active" id="control-sidebar-home-tab">
            <h3 class="control-sidebar-heading">Recent Activity</h3>
            <ul class="control-sidebar-menu">
                <li>
                    <a href="javascript:;">
                        <i class="menu-icon fa fa-birthday-cake bg-red"></i>

                        <div class="menu-info">
                            <h4 class="control-sidebar-subheading">Langdon's Birthday</h4>

                            <p>Will be 23 on April 24th</p>
                        </div>
                    </a>
                </li>
            </ul>
            <!-- /.control-sidebar-menu -->

            <h3 class="control-sidebar-heading">Tasks Progress</h3>
            <ul class="control-sidebar-menu">
                <li>
                    <a href="javascript:;">
                        <h4 class="control-sidebar-subheading">
                            Custom Template Design
                            <span class="pull-right-container">
                  <span class="label label-danger pull-right">70%</span>
                </span>
                        </h4>

                        <div class="progress progress-xxs">
                            <div class="progress-bar progress-bar-danger" style="width: 70%"></div>
                        </div>
                    </a>
                </li>
            </ul>
            <!-- /.control-sidebar-menu -->

        </div>
        <!-- /.tab-pane -->
        <!-- Stats tab content -->
        <div class="tab-pane" id="control-sidebar-stats-tab">Stats Tab ContentStats Tab Content</div>
        <!-- /.tab-pane -->
        <!-- Settings tab content -->
        <div class="tab-pane" id="control-sidebar-settings-tab">
            <form method="post">
                <h3 class="control-sidebar-heading">General Settings</h3>

                <div class="form-group">
                    <label class="control-sidebar-subheading">
                        Report panel usage
                        <input type="checkbox" class="pull-right" checked>
                    </label>

                    <p>
                        Some information about this general settings option
                    </p>
                </div>
                <!-- /.form-group -->
            </form>
        </div>
        <!-- /.tab-pane -->
    </div>
</aside>
<!-- /.control-sidebar -->
<!-- Add the sidebar's background. This div must be placed
     immediately after the control sidebar -->
<div class="control-sidebar-bg"></div>
</div>
<!-- ./wrapper -->

<!-- REQUIRED JS SCRIPTS -->

<!-- jQuery 2.2.3 -->
<!--script src="../../jQuery/jquery-2.2.3.min.js"></script>
<!-- Bootstrap 3.3.6 -->
<script src="${ctxStatic}/bootstrap/js/bootstrap.min.js"></script>
<!-- AdminLTE App -->
<script src="${ctxStatic}/dist/js/app.min.js"></script>

<script src="${ctxStatic}/sparkline/jquery.sparkline.min.js"></script>
<!-- jvectormap -->
<script src="${ctxStatic}/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script src="${ctxStatic}/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<!-- jQuery Knob Chart -->
<script src="${ctxStatic}/knob/jquery.knob.js"></script>
<!-- daterangepicker -->
</html>