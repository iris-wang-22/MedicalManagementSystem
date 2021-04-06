<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/7
  Time: 9:39
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
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>医疗管理系统</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.6 -->
    <link rel="stylesheet" href="${ctxStatic}/bootstrap/css/bootstrap.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
    <!-- daterange picker -->
    <link rel="stylesheet" href="${ctxStatic}/plugins/daterangepicker/daterangepicker.css">
    <!-- bootstrap datepicker -->
    <link rel="stylesheet" href="${ctxStatic}/plugins/datepicker/datepicker3.css">
    <!-- iCheck for checkboxes and radio inputs -->
    <link rel="stylesheet" href="${ctxStatic}/plugins/iCheck/all.css">
    <!-- Bootstrap Color Picker -->
    <link rel="stylesheet" href="${ctxStatic}/plugins/colorpicker/bootstrap-colorpicker.min.css">
    <!-- Bootstrap time Picker -->
    <link rel="stylesheet" href="${ctxStatic}/plugins/timepicker/bootstrap-timepicker.min.css">
    <!-- Select2 -->
    <link rel="stylesheet" href="${ctxStatic}/plugins/select2/select2.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="${ctxStatic}/dist/css/AdminLTE.min.css">
    <!-- AdminLTE Skins. Choose a skin from the css/skins
         folder instead of downloading all of them to reduce the load. -->
    <link rel="stylesheet" href="${ctxStatic}/dist/css/skins/_all-skins.min.css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

    <header class="main-header">
        <!-- Logo -->
        <a class="logo">
            <!-- mini logo for sidebar mini 50x50 pixels -->
            <span class="logo-mini"><b></b></span>
            <!-- logo for regular state and mobile devices -->
            <span class="logo-lg"><b>医疗管理系统</b></span>
        </a>
        <!-- Header Navbar: style can be found in header.less -->
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
                            <img src="dist/img/userB.png" class="user-image" alt="User Image">
                            <!-- hidden-xs hides the username on small devices so only the image appears. -->
                            <span class="hidden-xs">邓茜文</span>
                        </a>
                        <ul class="dropdown-menu">
                            <!-- The user image in the menu -->
                            <li class="user-header">

                                <p>
                                    邓茜文 - 管理人员
                                    <small>就要粉儿</small>
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
            <!-- Sidebar user panel -->
            <div class="user-panel">
                <div class="pull-left image">
                    <img src="${ctxStatic}/dist/img/avatar2.png" class="img-circle" alt="User Image">
                </div>
                <div class="pull-left info">
                    <p>系统管理员</p>
                    <a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
                </div>
            </div>
            <!-- search form -->
            <form action="#" method="get" class="sidebar-form">
                <div class="input-group">
                    <input type="text" name="q" class="form-control" placeholder="Search...">
                    <span class="input-group-btn">
                <button type="submit" name="search"  class="btn btn-flat"><i class="fa fa-search"></i>
                </button>
              </span>
                </div>
            </form>
            <!-- /.search form -->
            <!-- sidebar menu: : style can be found in sidebar.less -->
            <ul class="sidebar-menu">
                <li class="header">功能导航</li>
                <li class="treeview">
                    <a href="/user/w_ownInformation">
                        <i class="fa fa-user"></i> <span>个人信息</span>
                        <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
                    </a>

                </li>
                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-cab"></i><span>门诊</span>

                        <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
                    </a>
                    <ul class="treeview-menu">
                        <li><a href="#">接诊</a></li>
                        <li><a href="#">治疗</a></li>
                    </ul>
                </li>
                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-flask"></i><span>药品管理</span>

                        <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
                    </a>
                    <ul class="treeview-menu">
                        <li><a href="#">库存管理</a></li>
                        <li><a href="#">采购管理</a></li>
                        <li><a href="#">查询</a></li>

                    </ul>
                </li>
                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-files-o"></i><span>院方管理</span>

                        <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
                    </a>
                <li class="treeview">
                <li><a href="#"><i class="fa fa-institution"></i><span>院方管理</span>
                    <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
                </a>
                    <ul class="treeview-menu">
                        <li><a href="#"><span>住院部</span> <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span></a>
                            <ul class="treeview-menu">
                                <li><a href="#">查看病历</a></li>

                                <li><a href="#">安排住院</a></li>
                                <li><a href="#">更新病房信息</a></li>
                            </ul>
                        </li>
                        <li><a href="#"><span>手术室</span> <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span></a>
                            <ul class="treeview-menu">
                                <li><a href="#">查看待手术信息</a></li>
                                <li><a href="#">安排手术</a></li>
                            </ul>
                        </li>

                        <li><a href="#"><span>财务处</span> <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span></a>
                            <ul class="treeview-menu">
                                <li><a href="#">查看患者账单</a></li>
                                <li><a href="#">审核采购计划</a></li>

                            </ul>
                        </li>
                    </ul>
                </li>

                <li class="treeview">
                <li class="active"><a href="#"><i class="fa fa-gears"></i><span>系统管理</span>

                    <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
                </a>
                    <ul class="treeview-menu">
                        <li class="active"><a href="/staff/authority">权限管理</a></li>
                        <li><a href="#">职工注册</a></li>
                        <li><a href="#">资料修改</a></li>
                        <li><a href="#">查看注册用户</a></li>
                    </ul></li>
                </li>



            </ul>
        </section>
        <!-- /.sidebar -->
    </aside>

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                系统管理
                <small>权限管理</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-send"></i>系统管理</a></li>
                <li class="active">权限管理</li>
            </ol>
            <br>

            <div class="input-group">
                <input type="text" name="q" class="form-control" placeholder="Search...">
                <span class="input-group-btn">
                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                </button>
              </span>
            </div>




            <!-- Main content -->
            <section class="content">
            <form:form action="authority" method="post" modelAttribute="staff">

                <!-- SELECT2 EXAMPLE -->
                <div class="box box-danger">
                    <div class="box-header with-border">
                        <h3 class="box-title">权限管理表</h3>

                        <div class="box-tools pull-right">
                            <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
                            <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-remove"></i></button>
                        </div>
                    </div>
                    <!-- /.box-header -->
                    <div class="box-body">
                        <div class="row">
                            <div class="col-md-6">


                                <div class="form-group">
                                    <label>科室</label>
                                    <select class="form-control select2" style="width: 100%;">
                                        <option selected="selected">心外科</option>
                                        <option>口腔科</option>
                                        <option>肛肠科</option>
                                        <option>耳鼻喉科</option>
                                        <option>眼科</option>
                                        <option>神经外科</option>
                                        <option>脑科</option>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label>姓名</label>

                                    <div class="input-group">
                                        <div class="input-group-addon">
                                            <i class="fa fa-user"></i>
                                        </div>
                                        <form:input path="userName" type="text" class="form-control" placeholder="姓名"/>

                                    </div>
                                    <!-- /.input group -->
                                </div>
                                <!-- /.form group -->
                                <div class="form-group">
                                    <label>账号</label>

                                    <div class="input-group">
                                        <div class="input-group-addon">
                                            <i class="fa fa-user"></i>
                                        </div>
                                        <form:input path="userAccount" type="text" class="form-control" placeholder="账号"/>

                                    </div>
                                    <!-- /.input group -->
                                </div>

                                <!-- phone mask -->
                                <div class="form-group">
                                    <label>性别</label>
                                    <div class="input-group">
                                        <div class="input-group-addon">
                                            <i class="fa fa-user"></i>
                                        </div>
                                        <form:input path="userSex" type="text" class="form-control"/>

                                    </div>

                                </div>
                                <!-- /.form group -->

                                <!-- phone mask -->


                                <!-- IP mask -->
                                <div class="form-group">
                                    <label>员工属性</label>
                                    <select class="form-control select2" style="width: 100%;">
                                        <option selected="selected">医师</option>

                                        <option>系统管理员</option>
                                        <option>药师</option>
                                        <option>手术室人员</option>
                                        <option>住院部人员人员</option>
                                        <option>财务处人员</option>
                                    </select>
                                </div>
                                <!-- /.form-group -->

                                <!-- /.form-group -->
                            </div>
                            <div class="col-md-6">

                                <div class="box-body">
                                    <!-- Minimal style -->

                                    <!-- checkbox -->
                                    <div class="form-group">

                                        <label>
                                            <input type="radio" name="quanxian"class="minimal" disabled="disabled">
                                            1.所属科室权限
                                        </label>
                                    </div>
                                    <div class="form-group">

                                        <label>
                                            <input type="radio"  name="quanxian" class="minimal"disabled="disabled">
                                            2. 所有科室权限
                                        </label>
                                    </div>

                                    <!-- radio -->

                                    <!-- Minimal red style -->

                                    <!-- checkbox -->
                                    <div class="form-group">

                                        <label>
                                            <input type="radio" name="quanxian" class="minimal-red"disabled="disabled" >
                                            3. 药师权限
                                        </label>
                                    </div>

                                    <!-- radio -->

                                    <!-- Minimal red style -->

                                    <!-- checkbox -->
                                    <div class="form-group">

                                        <label>
                                            <input type="radio" name="quanxian" class="flat-red" disabled="disabled">
                                            4.系统管理员权限
                                        </label>
                                    </div>
                                    <div class="form-group">

                                        <label>
                                            <input type="radio" name="quanxian" class="flat-red"disabled="disabled" >
                                            5.手术室人员权限
                                        </label>
                                    </div>
                                    <div class="form-group">

                                        <label>
                                            <input type="radio" name="quanxian" class="flat-red"disabled="disabled" >
                                            6.住院部人员权限
                                        </label>
                                    </div>
                                    <div class="form-group">

                                        <label>
                                            <input type="radio" name="quanxian" class="flat-red" disabled="disabled">
                                            7.财务处人员权限
                                        </label>
                                    </div>
                                    <div class="form-group">

                                        <label>
                                            请选择权限类型
                                            <form:input path="userAuth" type="text"  class="form-control" />


                                        </label>
                                    </div>

                                    <!-- radio -->

                                </div>


                                <!-- /.form group -->


                                <!-- phone mask -->

                                <!--roup -->

                                <!-- IP mask -->

                                <!-- /.form group -->
                                <!-- /.form-group -->

                                <!-- /.form-group -->
                            </div>
                            <!-- /.col -->

                            <!-- /.col -->
                        </div>
                        <!-- /.row -->
                    </div>
                    <!-- /.box-body -->

                </div>
                <!-- /.box -->

                <div class="row">

                    <div class="col-md-6">


                        <!-- /.box -->


                        <!-- /.box -->

                    </div>


                    <!-- /.col (left) -->
                    <div class="col-md-6">

                        <!-- /.box -->
                        <div class="box box-tools">
                            <div class="box-header">
                                <h3 class="box-title">请确认权限分配完成</h3>
                            </div>
                            <div class="box-body">
                                <!-- Date -->
                                <div class="btn">
                                    <button type="submit" class="btn btn-google"><b>确认分配</b></button>
                                </div>


                            </div>
                            <!-- /.form group -->


                            <!-- /.form group -->

                            <!-- Date and time range -->

                            <!-- /.form group -->

                        </div>
                        <!-- /.box-body -->
                    </div>

                    <!-- iCheck -->

                </div>



                <!-- /.col (right) -->

                <!-- /.row -->
            </form:form>
            </section>
            <!-- /.content -->

    <!-- /.content-wrapper -->
    <footer class="main-footer">
        <!-- To the right -->
        <div class="pull-right hidden-xs">
            邓茜文 李泽世 陈叔甫 韩震博 王子月
        </div>
        <!-- Default to the left -->
        <strong>Copyright &copy; 2017 <a href="#">JavaEE第二项目组</a>.</strong> All rights reserved.
    </footer>


    <!-- Control Sidebar -->

    <!-- /.control-sidebar -->
    <!-- Add the sidebar's background. This div must be placed
         immediately after the control sidebar -->
    <div class="control-sidebar-bg"></div>

<!-- ./wrapper -->

<!-- jQuery 2.2.3 -->
<script src="${ctxStatic}/plugins/jQuery/jquery-2.2.3.min.js"></script>
<!-- Bootstrap 3.3.6 -->
<script src="${ctxStatic}/bootstrap/js/bootstrap.min.js"></script>
<!-- Select2 -->
<script src="${ctxStatic}/plugins/select2/select2.full.min.js"></script>
<!-- InputMask -->
<script src="${ctxStatic}/plugins/input-mask/jquery.inputmask.js"></script>
<script src="${ctxStatic}/plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
<script src="${ctxStatic}/plugins/input-mask/jquery.inputmask.extensions.js"></script>
<!-- date-range-picker -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.11.2/moment.min.js"></script>
<script src="${ctxStatic}/plugins/daterangepicker/daterangepicker.js"></script>
<!-- bootstrap datepicker -->
<script src="${ctxStatic}/plugins/datepicker/bootstrap-datepicker.js"></script>
<!-- bootstrap color picker -->
<script src="${ctxStatic}/plugins/colorpicker/bootstrap-colorpicker.min.js"></script>
<!-- bootstrap time picker -->
<script src="${ctxStatic}/plugins/timepicker/bootstrap-timepicker.min.js"></script>
<!-- SlimScroll 1.3.0 -->
<script src="${ctxStatic}/../../plugins/slimScroll/jquery.slimscroll.min.js"></script>
<!-- iCheck 1.0.1 -->
<script src="${ctxStatic}/../../plugins/iCheck/icheck.min.js"></script>
<!-- FastClick -->
<script src="${ctxStatic}/../../plugins/fastclick/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="${ctxStatic}/../../dist/js/app.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="${ctxStatic}/../../dist/js/demo.js"></script>
<!-- Page script -->
<script>
    $(function () {
        //Initialize Select2 Elements
        $(".select2").select2();

        //Datemask dd/mm/yyyy
        $("#datemask").inputmask("dd/mm/yyyy", {"placeholder": "dd/mm/yyyy"});
        //Datemask2 mm/dd/yyyy
        $("#datemask2").inputmask("mm/dd/yyyy", {"placeholder": "mm/dd/yyyy"});
        //Money Euro
        $("[data-mask]").inputmask();

        //Date range picker
        $('#reservation').daterangepicker();
        //Date range picker with time picker
        $('#reservationtime').daterangepicker({timePicker: true, timePickerIncrement: 30, format: 'MM/DD/YYYY h:mm A'});
        //Date range as a button
        $('#daterange-btn').daterangepicker(
            {
                ranges: {
                    'Today': [moment(), moment()],
                    'Yesterday': [moment().subtract(1, 'days'), moment().subtract(1, 'days')],
                    'Last 7 Days': [moment().subtract(6, 'days'), moment()],
                    'Last 30 Days': [moment().subtract(29, 'days'), moment()],
                    'This Month': [moment().startOf('month'), moment().endOf('month')],
                    'Last Month': [moment().subtract(1, 'month').startOf('month'), moment().subtract(1, 'month').endOf('month')]
                },
                startDate: moment().subtract(29, 'days'),
                endDate: moment()
            },
            function (start, end) {
                $('#daterange-btn span').html(start.format('MMMM D, YYYY') + ' - ' + end.format('MMMM D, YYYY'));
            }
        );

        //Date picker
        $('#datepicker').datepicker({
            autoclose: true
        });

        //iCheck for checkbox and radio inputs
        $('input[type="checkbox"].minimal, input[type="radio"].minimal').iCheck({
            checkboxClass: 'icheckbox_minimal-blue',
            radioClass: 'iradio_minimal-blue'
        });
        //Red color scheme for iCheck
        $('input[type="checkbox"].minimal-red, input[type="radio"].minimal-red').iCheck({
            checkboxClass: 'icheckbox_minimal-red',
            radioClass: 'iradio_minimal-red'
        });
        //Flat red color scheme for iCheck
        $('input[type="checkbox"].flat-red, input[type="radio"].flat-red').iCheck({
            checkboxClass: 'icheckbox_flat-green',
            radioClass: 'iradio_flat-green'
        });

        //Colorpicker
        $(".my-colorpicker1").colorpicker();
        //color picker with addon
        $(".my-colorpicker2").colorpicker();

        //Timepicker
        $(".timepicker").timepicker({
            showInputs: false
        });
    });
</script>
</div>
</body>
</html>

