<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- 页面meta -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>管理员申请</title>

<!-- Tell the browser to be responsive to screen width -->
<meta
	content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no"
	name="viewport">

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
				管理员申请 <small>管理员申请表单</small>
			</h1>
			<ol class="breadcrumb">
				<li><a href="${pageContext.request.contextPath}/index.jsp"><i
						class="fa fa-dashboard"></i> 首页</a></li>
				<li class="active">管理员申请表单</li>
			</ol>
			</section>
			<!-- 内容头部 /-->

			<form action="${pageContext.request.contextPath}/admin/register.do"
				method="post">
				<!-- 正文区域 -->
				<section class="content"> <!--订单信息-->
					<div class="panel panel-default">
						<div class="panel-heading">管理员信息</div>
						<div class="row data-type">
							<input name="id" value="" name="id" style="display: none!important;">

							<div class="col-md-2 title">用户名</div>
							<div class="col-md-4 data">
								<input type="text" class="form-control" placeholder="用户名" value="" name="userName">
							</div>

							<div class="col-md-2 title">用户姓名</div>
							<div class="col-md-4 data">
								<input type="text" class="form-control" placeholder="用户姓名" value="" name="name">
							</div>

							<div class="col-md-2 title">密码</div>
							<div class="col-md-4 data">
								<input type="text" class="form-control" placeholder="密码" value="" name="password">
							</div>

							<div class="col-md-2 title">电话号码</div>
							<div class="col-md-4 data">
								<input type="text" class="form-control" placeholder="电话号码" value="" name="phoneNum" id="phoneNum" v-on:keydown="fun1($event)">
							</div>

							<div class="col-md-2 title">QQ号码</div>
							<div class="col-md-4 data">
								<input type="text" class="form-control" placeholder="QQ号码" value="" name="qqNum" id="qqNum" onkeydown="pressNum()">
							</div>

							<div class="col-md-2 title">帐号状态</div>
							<div class="col-md-4 data">
								<input type="text" class="form-control" placeholder="帐号状态" value="未开启使用" readonly="readonly" name="statusStr">
							</div>

						</div>
					</div>

					<div class="box-tools text-center">
						<button type="submit" class="btn bg-maroon layui-btn layui-btn-normal" id="submit" data-method="offset" data-type="auto">修改</button>
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
	<script src="${pageContext.request.contextPath}/plugins/bootstrap/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/bootstrap-markdown.js"></script>
	<script src="${pageContext.request.contextPath}/plugins/bootstrap-slider/bootstrap-slider.js"></script>

	<script src="${pageContext.request.contextPath}/js/vue.js"></script>
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