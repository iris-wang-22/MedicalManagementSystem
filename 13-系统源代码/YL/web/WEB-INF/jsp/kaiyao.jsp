
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
    <link rel="stylesheet" href="${ctxStatic}/dist/css/AdminLTE.min.css">
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
        <a href="index2.html" class="logo">
            <!-- mini logo for sidebar mini 50x50 pixels -->
            <span class="logo-mini"><b>YL</b></span>
            <!-- logo for regular state and mobile devices -->
            <span class="logo-lg">医疗管理系统</span>
        </a>

        <!-- Header Navbar -->
        <nav class="navbar navbar-static-top" role="navigation">
            <!-- Sidebar toggle button-->
            <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
                <span class="sr-only">开关导航栏</span>
            </a>
            <!-- Navbar Right Menu -->
            <div class="navbar-custom-menu">
                <ul class="nav navbar-nav">
                    <!-- User Account Menu -->
                    <li class="dropdown user user-menu">
                        <!-- Menu Toggle Button -->
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <!-- The user image in the navbar-->

                            <!-- hidden-xs hides the username on small devices so only the image appears. -->
                            <span class="hidden-xs">陈叔甫</span>
                        </a>
                        <ul class="dropdown-menu">
                            <!-- The user image in the menu -->
                            <li class="user-header">


                                <p>
                                    陈叔甫 - 医师
                                    <small>只要米酒</small>
                                </p>
                            </li>
                            <!-- Menu Footer-->
                            <li class="user-footer">
                                <div class="pull-left">
                                    <a href="#" class="btn btn-default btn-flat">个人信息</a>
                                </div>
                                <div class="pull-right">
                                    <a href="#" class="btn btn-default btn-flat">登出</a>
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
                    <p>医师</p>
                    <!-- Status -->
                    <a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
                </div>
            </div>

            <!-- search form (Optional) -->
            <form action="#" method="get" class="sidebar-form">
                <div class="input-group">
                    <input type="text" name="q" class="form-control" placeholder="功能搜索...">
                    <span class="input-group-btn">
                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                </button>
              </span>
                </div>
            </form>
            <!-- /.search form -->

            <!-- Sidebar Menu -->
            <ul class="sidebar-menu">
                <li class="header">功能导航</li>
                <!-- Optionally, you can add icons to the links -->
                <li class><a href="#"><i class="fa fa-user"></i> <span>个人信息</span></a></li>
                <li class="treeview  active">
                    <a href="#"><i class="fa fa-stethoscope"></i> <span>门诊</span>
                        <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
                    </a>
                    <ul class="treeview-menu">
                        <li class="active"><a href="#">接诊</a></li>
                        <li><a href="#">治疗</a></li>
                    </ul>
                </li>
                <li class="treeview">
                    <a href="#"><i class="fa fa-flask"></i> <span> 药品管理</span>
                        <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
                    </a>
                    <ul class="treeview-menu">
                        <li class="treeview">
                            <a href="#"> <span>库存管理</span> <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span></a>
                            <ul class="treeview-menu">
                                <li><a href="#">采购计划查询</a></li>
                                <li><a href="#">出入库查询</a></li>
                                <li><a href="#">采购管理</a></li>

                            </ul>
                        </li>
                        <li><a href="#">采购管理</a></li>
                        <li><a href="#">查询</a></li>
                        <li><a href="#">发药</a></li>
                    </ul>
                </li>
                <li class="treeview">
                    <a href="#"><i class="fa fa-institution"></i> <span>院方管理</span>
                        <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
                    </a>
                    <ul class="treeview-menu">
                        <li><a href="#">住院部</a></li>
                        <li><a href="#">手术室</a></li>
                        <li><a href="#">财务处</a></li>
                    </ul>
                </li>
                <li class="treeview">
                    <a href="#"><i class="fa fa-gears"></i> <span>系统管理</span>
                        <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
                    </a>
                    <ul class="treeview-menu">
                        <li><a href="#">权限管理</a></li>
                        <li><a href="#">职工注册</a></li>
                        <li><a href="#">资料修改</a></li>
                        <li><a href="#">报表查询</a></li>
                    </ul>
                </li>
            </ul>
            <!-- /.sidebar-menu -->
        </section>
        <!-- /.sidebar -->
    </aside>

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                查询管理
                <small>查询采购计划</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i>药品管理</a></li>
                <li><a href="#"></i> 查询管理</a></li>
                <li class="active">查询采购计划</li>
            </ol>
        </section>

        <!-- Main content -->
        <section class="content">
            <div>

            </div>
            <div class="col-xs-12">
                <div class="box">

                    <div class="box-header">
                        <h3 class="box-title">药品列表</h3>

                    </div>
                    <!-- /.box-header -->
                    <div class="box-body">
                        <div id="example1_wrapper" class="dataTables_wrapper form-inline dt-bootstrap">
                            <div class="row"><div class="col-sm-6"></div><div class="col-sm-6">
                            </div></div><div class="row"><div class="col-sm-12">
                            <table id="example1" class="table table-bordered table-striped " role="grid" aria-describedby="example2_info">
                                <thead>
                                <tr role="row">
                                    <th class="sorting_asc" tabindex="0" aria-controls="example2" rowspan="1" colspan="1"  aria-label="Rendering engine: activate to sort column descending">品名</th>
                                    <th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1"  aria-label="Browser: activate to sort column ascending">型号</th>
                                    <th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Platform(s): activate to sort column ascending">库存</th>
                                    <th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Engine version: activate to sort column ascending">单价</th>
                                    <th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-sort="ascending" aria-label="CSS grade: activate to sort column ascending">操作</th>

                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="drug" items="${drugs}">

                                <tr role="row" class="odd">
                                    <td class="sorting_1">${drug.diName}</td>
                                    <td>${drug.diType}</td>
                                    <td>${drug.diAmount}</td>
                                    <td>${drug.diSoldPrice}</td>
                                    <c:if test="${drug.diAmount > 0}">
                                        <td>
                                            <button type="button" class="btn btn-success btn-xs" data-toggle="modal" data-target="#${drug.diName}${drug.diType}">选择药品</button>
                                        </td>
                                    </c:if>
                                    <c:if test="${drug.diAmount <= 0}">
                                        <td>
                                            <a href="#"  type="button" class="btn btn-info btn-xs" disabled="disable" >库存不足</a>
                                        </td>
                                    </c:if>


                                </tr>
                                <div class="modal fade" id="${drug.diName}${drug.diType}" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
                                    <div class="modal-dialog" role="document">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                                <h4 class="modal-title" id="exampleModalLabel">选择开药数量</h4>
                                            </div>
                                            <div class="modal-body">
                                                <form id="drugRx" action="/outpatient/drugrx" method="post">
                                                    <div class="form-group">
                                                        <label for="pingm1" class="control-label">品名</label>
                                                        <label  id="pingm1" disabled="disabled" type="text" class="form-control" content="${drug.diName}">${drug.diName}</label>
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="xingh1" class="control-label">型号</label>
                                                        <label type="text" class="form-control" id="xingh1" disabled="disabled" content="${drug.diType}">${drug.diType}</label>
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="amount1" class="control-label">数量</label>
                                                        <input id="amount1" name="drugRxAmount" min="1" max="${drug.diAmount}" type="number" class="form-control" value="1"/>
                                                    </div>
                                                    <div class="modal-footer">
                                                        <input id="mrId" name="mrId" type="hidden" value="${mrid}"/>
                                                        <input id="diId" name="diId" type="hidden" value="${drug.diId}"/>
                                                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                                        <button type="submit" class="btn btn-primary">开药</button>
                                                    </div>
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                </c:forEach>
                                </tbody>

                                <tfoot>
                                <tr>
                                    <th rowspan="1" colspan="1">药品</th>
                                    <th rowspan="1" colspan="1">型号</th>
                                    <th rowspan="1" colspan="1">库存</th>
                                    <th rowspan="1" colspan="1">单价</th>
                                    <th rowspan="1" colspan="1">操作</th>

                                </tr>
                                </tfoot>
                            </table>
                        </div>
                        </div>
                            <div class="row">
                            </div>
                        </div>
                    </div>
                    <!-- /.box-body -->
                </div>
                <!-- /.box -->
            </div>
            <div class="col-xs-12">
                <div class="box">

                    <div class="box-header">
                        <h3 class="box-title">处方单</h3>

                    </div>
                    <!-- /.box-header -->
                    <div class="box-body">
                        <div id="example2_wrapper" class="dataTables_wrapper form-inline dt-bootstrap">
                            <div class="row"><div class="col-sm-6"></div><div class="col-sm-6">
                            </div></div><div class="row"><div class="col-sm-12">
                            <table id="example2" class="table table-bordered table-striped " role="grid" aria-describedby="example2_info">
                                <thead>
                                <tr role="row">
                                    <th class="sorting_asc" tabindex="0" aria-controls="example2" rowspan="1" colspan="1"  aria-label="Rendering engine: activate to sort column descending">品名</th>
                                    <th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1"  aria-label="Browser: activate to sort column ascending">型号</th>
                                    <th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Platform(s): activate to sort column ascending">库存</th>
                                    <th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Engine version: activate to sort column ascending">单价</th>
                                    <th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-sort="ascending" aria-label="CSS grade: activate to sort column ascending">操作</th>
                                    <th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-sort="ascending" aria-label="CSS grade: activate to sort column ascending">状态</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="drug" items="${drugRxes}">

                                    <tr role="row" class="odd">
                                        <td class="sorting_1">${drug.drugInstrument.diName}</td>
                                        <td>${drug.drugInstrument.diType}</td>
                                        <td>${drug.drugRxAmount}</td>
                                        <td>${drug.drugInstrument.diSoldPrice}</td>
                                        <td><a href="/outpatient/drugDelete?drugRx=${drug.diId}&amount=${drug.drugRxAmount}&mrId=${drug.mrId}" type="button" class="btn btn-danger btn-xs">删除</a> </td>
                                        <c:if test="${drug.drugRxAmount > 0}">
                                            <td>
                                                <a href="#"  type="button" class="btn btn-info btn-xs" disabled="disable" >未取药</a>
                                            </td>
                                        </c:if>
                                        <c:if test="${drug.drugRxAmount <= 0}">
                                            <td>
                                                <a href="#"  type="button" class="btn btn-info btn-xs" disabled="disable" >已取药</a>
                                            </td>
                                        </c:if>


                                    </tr>


                                </c:forEach>


                                </tbody>

                                <tfoot>
                                <tr>
                                    <th rowspan="1" colspan="1">药品</th>
                                    <th rowspan="1" colspan="1">型号</th>
                                    <th rowspan="1" colspan="1">库存</th>
                                    <th rowspan="1" colspan="1">单价</th>
                                    <th rowspan="1" colspan="1">操作</th>

                                </tr>
                                </tfoot>
                            </table>
                        </div>
                        </div>
                            <div class="row">
                                <a href="/outpatient/drug?userId=2" type="button" class="btn-warning">结束开药</a>
                            </div>
                        </div>
                    </div>
                    <!-- /.box-body -->
                </div>
                <!-- /.box -->
            </div>
            <!-- /.row -->
        </section>
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->

    <!-- Main Footer -->
    <footer class="main-footer">
        <!-- To the right -->
        <div class="pull-right hidden-xs">
            邓茜文 李泽世 陈叔甫 韩震博 王子月
        </div>
        <!-- Default to the left -->
        <strong>Copyright &copy; 2017 <a href="#">JavaEE第二项目组</a>.</strong> All rights reserved.
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
<script src="../../static/plugins/jQuery/jquery-2.2.3.min.js"></script>
<!-- Bootstrap 3.3.6 -->
<script src="../../static/bootstrap/js/bootstrap.min.js"></script>
<!-- AdminLTE App -->
<script src="${ctxStatic}/dist/js/app.min.js"></script>

<!-- Optionally, you can add Slimscroll and FastClick plugins.
     Both of these plugins are recommended to enhance the
     user experience. Slimscroll is required when using the
     fixed layout. -->
<!-- DataTables -->
<script src="${ctxStatic}/plugins/datatables/jquery.dataTables.min.js"></script>

<script src="${ctxStatic}/plugins/datatables/dataTables.bootstrap.min.js"></script>
<!-- SlimScroll -->
<script src="${ctxStatic}/plugins/slimScroll/jquery.slimscroll.min.js"></script>
<!-- FastClick -->
<script src="${ctxStatic}/plugins/fastclick/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="${ctxStatic}/dist/js/app.min.js"></script>
<!-- page script -->
<script>
    $(function () {
        $("#example1").DataTable();
        $('#example2').DataTable({
            "paging": true,
            "lengthChange": false,
            "searching": false,
            "ordering": true,
            "info": true,
            "autoWidth": false
        });
    });
</script>
<script>
</script>
</body>
</html>