<%@ taglib prefix="v-on" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- 页面meta -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>用户注册</title>



	<link rel="icon" href="${pageContext.request.contextPath}/img/logo.ico">
	<link rel="shortcut icon" href="${pageContext.request.contextPath}/img/logo.ico">
	<link rel="bookmark" href="${pageContext.request.contextPath}/img/logo.ico">

	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/ionicons/css/ionicons.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/adminLTE/css/AdminLTE.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/bootstrap-slider/slider.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/adminLTE/css/skins/skin-blue-light-co.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css">

</head>

<body class="hold-transition skin-blue-light sidebar-mini">

	<div class="wrapper">

		<!-- 页面头部 -->
		<jsp:include page="header-user.jsp"/>
		<!-- 页面头部 /-->
		<!-- 导航侧栏 -->
		<jsp:include page="aside-user.jsp"/>
		<!-- 导航侧栏 /-->

		<!-- 内容区域 -->
		<div class="content-wrapper">

			<!-- 内容头部 -->
			<section class="content-header">
			<h1>
				用户管理 <small>用户表单</small>
			</h1>
			<ol class="breadcrumb">
				<li><a href="${pageContext.request.contextPath}/index.jsp"><i
						class="fa fa-dashboard"></i> 首页</a></li>
				<li><a
					href="${pageContext.request.contextPath}/user/findAll.do">用户管理</a></li>
				<li class="active">用户表单</li>
			</ol>
			</section>
			<!-- 内容头部 /-->

			<form action="${pageContext.request.contextPath}/user/register.do"
				method="post">
				<!-- 正文区域 -->
				<section class="content">

				<div class="panel panel-default">
					<div class="panel-heading">用户注册</div>
					<div class="row data-type">

						<div class="col-md-2 title">用户名</div>
						<div class="col-md-4 data">
							<input type="text" class="form-control" name="userName"
								   placeholder="用户名" value="">
						</div>
						<div class="col-md-2 title">用户姓名</div>
						<div class="col-md-4 data">
							<input type="text" class="form-control" name="name"
								placeholder="用户姓名" value="">
						</div>
						<div class="col-md-2 title">密码</div>
						<div class="col-md-4 data">
							<input type="password" class="form-control" name="password"
								placeholder="密码" value="">
						</div>

						<div class="col-md-2 title">联系电话</div>
						<div class="col-md-4 data">
							<input type="text" class="form-control" name="phoneNum" id="phoneNum" v-on:keydown="fun1($event)"
								placeholder="联系电话" value="">
						</div>
						<div class="col-md-2 title">QQ号码</div>
						<div class="col-md-4 data">
							<input type="text" class="form-control" name="qqNum" id="qqNum" onkeydown="pressNum()"
								   placeholder="QQ号码" value="">
						</div>
					</div>
				</div>
				<!--订单信息/--> <!--工具栏-->
				<div class="box-tools text-center">
					<button type="submit" class="btn bg-maroon">提交</button>
					<button type="button" class="btn bg-default"
						onclick="history.back(-1);">返回</button>
				</div>
				<!--工具栏/--> </section>
				<!-- 正文区域 /-->
			</form>
		</div>
		<!-- 内容区域 /-->


	</div>
	<script src="${pageContext.request.contextPath}/plugins/jQuery/jquery-2.2.3.min.js"></script>
	<script src="${pageContext.request.contextPath}/plugins/jQueryUI/jquery-ui.min.js"></script>
	<script src="${pageContext.request.contextPath}/plugins/select2/select2.full.min.js"></script>
	<script src="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
	<script src="${pageContext.request.contextPath}/plugins/adminLTE/js/app.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/vue.js"></script>
	<script src="${pageContext.request.contextPath}/js/header-common.js"></script>
	<script>

		//设置格式
		new Vue({
			el:"#qqNum,#phoneNum",
			methods:{
				fun1:function (event){
					var keyCode=event.keyCode;
					if ((keyCode!==46&&keyCode!==8&&keyCode<48)||(keyCode>57&&keyCode<96)||keyCode>105){
						event.preventDefault();
					}
				}
			}
		})
		function pressNum(){
			var keyCode=event.keyCode;
			if ((keyCode!==46&&keyCode!==8&&keyCode<48)||(keyCode>57&&keyCode<96)||keyCode>105){
				event.preventDefault();
			}
		}

		$(document).ready(function() {
			// 选择框
			$(".select2").select2();

			// WYSIHTML5编辑器
			$(".textarea").wysihtml5({
				locale : 'zh-CN'
			});
		});

		// 设置激活菜单
		function setSidebarActive(tagUri) {
			var liObj = $("#" + tagUri);
			if (liObj.length > 0) {
				liObj.parent().parent().addClass("active");
				liObj.addClass("active");
			}
		}
	</script>


</body>

</html>