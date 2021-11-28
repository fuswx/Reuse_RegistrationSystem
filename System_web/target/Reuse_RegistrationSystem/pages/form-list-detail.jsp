<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- 页面meta -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<title>所有用户</title>

<!-- Tell the browser to be responsive to screen width -->
<meta
	content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no"
	name="viewport">

	<link rel="icon" href="${pageContext.request.contextPath}/img/logo.ico">
	<link rel="shortcut icon" href="${pageContext.request.contextPath}/img/logo.ico">
	<link rel="bookmark" href="${pageContext.request.contextPath}/img/logo.ico">

	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/iCheck/square/blue.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/datatables/dataTables.bootstrap.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/adminLTE/css/AdminLTE.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/adminLTE/css/skins/_all-skins.min.css">

	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/bootstrap-slider/slider.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/adminLTE/css/skins/skin-blue-light-co.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>


<body class="hold-transition skin-blue-light sidebar-mini">

	<div class="wrapper">

		<!-- 页面头部 -->
		<jsp:include page="header.jsp"/>
		<!-- 页面头部 /-->

		<!-- 导航侧栏 -->
		<jsp:include page="aside.jsp"/>
		<!-- 导航侧栏 /-->

		<!-- 内容区域 -->
		<div class="content-wrapper">

			<!-- 内容头部 -->
			<section class="content-header">
			<h1>
				问卷管理 <small>${formName}</small>
			</h1>
			<ol class="breadcrumb">
				<li><a href="${pageContext.request.contextPath}/index.jsp"><i
						class="fa fa-dashboard"></i> 首页</a></li>
				<li><a href="${pageContext.request.contextPath}/form/findAll.do">我的问卷</a></li>

				<li class="active">${formName}</li>
			</ol>
			</section>
			<!-- 内容头部 /-->

				<!-- 正文区域 -->
				<section class="content"> <!-- .box-body -->
				<div class="box box-primary">
					<div class="box-header with-border">
						<h3 class="box-title">列表</h3>
					</div>

					<div class="box-body">

						<!-- 数据表格 -->
						<div class="table-box">

							<!--工具栏-->
							<div class="pull-left">
								<div class="form-group form-inline">
									<div class="btn-group">
										<button type="button" class="btn btn-default" title="新建" onclick="location.href='${pageContext.request.contextPath}/pages/form-create.jsp'">
											<i class="fa fa-file-o"></i> 新建
										</button>
										
										<button type="button" class="btn btn-default" title="刷新" onclick="location.href='${pageContext.request.contextPath}/form/formDetail.do?formId=${formId}'">
											<i class="fa fa-refresh"></i> 刷新
										</button>
									</div>
								</div>
							</div>
							<div class="box-tools pull-right">
								<div class="has-feedback">
									<input type="text" class="form-control input-sm" placeholder="列名:内容+回车" id="search" onkeydown="searchUser(this)">
									<span
										class="glyphicon glyphicon-search form-control-feedback"  style="cursor: pointer!important;background-color: cornflowerblue"></span>
								</div>
							</div>
							<!--工具栏/-->

							<!--数据列表-->
							<table id="dataList"
								class="table table-bordered table-striped table-hover dataTable">
								<thead>
									<tr>
										<th class="" style="padding-right: 0px">
											<input id="selall" type="checkbox" class="icheckbox_square-blue">
										</th>
										<c:forEach items="${formTitle}" var="title">
											<th style="text-align: center!important; padding: 5px!important;">${title}</th>
										</c:forEach>
										<th style="text-align: center!important; padding: 5px!important;">其它</th>
									</tr>
								</thead>
								<tbody id="users">
								<c:forEach items="${pageInfo.list}" var="formDetail">
									<tr>
										<td><input name="ids" type="checkbox"></td>
										<c:forEach items="${formTitle}" var="title">
											<td style="text-align: center;max-width: 200px">${formDetail.totalTexts.get(title)}</td>
										</c:forEach>
										<td class="text-center">
											<a href="${pageContext.request.contextPath}/form/writeOneRequest.do?formName=${formName}&formId=${formDetail.totalTexts.get("id")}&newTableId=${formId}" class="btn bg-olive btn-xs">详情</a>
											<a id="delete" class="btn bg-olive btn-xs" onclick="deleteForm('${formDetail.totalTexts.get("id")}')">删除</a>
										</td>
									</tr>
									</c:forEach>

								</tbody>

							</table>
							<!--数据列表/-->

						</div>
						<!-- 数据表格 /-->

					</div>
					<!-- /.box-body -->

					<!-- .box-footer-->
					<div class="box-footer">
						<div class="pull-left">
							<div class="form-group form-inline" onchange="changePageSize()">
								总共${pageInfo.pages} 页，共${pageInfo.total} 条数据。 每页
								<select class="form-control" id="changePageSize">
									<option>4</option>
									<option>5</option>
									<option>6</option>
									<option>7</option>
									<option>8</option>
									<option>All</option>
								</select> 条
							</div>
						</div>

						<div class="box-tools pull-right">
							<ul class="pagination" id="pageNum">
								<li><a href="${pageContext.request.contextPath}/form/formDetail.do?formId=${formId}&pageNum=1&pageSize=${pageInfo.pageSize}" aria-label="Previous">首页</a></li>
								<li><a href="${pageContext.request.contextPath}/form/formDetail.do?formId=${formId}&pageNum=${pageInfo.pageNum-1}&pageSize=${pageInfo.pageSize}">上一页</a></li>
								<c:forEach begin="1" end="${pageInfo.pages}" varStatus="status">
									<li><a href="${pageContext.request.contextPath}/form/formDetail.do?formId=${formId}&pageNum=${status.index}&pageSize=${pageInfo.pageSize}">${status.index}</a> </li>
								</c:forEach>
								<li><a href="${pageContext.request.contextPath}/form/formDetail.do?formId=${formId}&pageNum=${pageInfo.pageNum+1}&pageSize=${pageInfo.pageSize}">下一页</a></li>
								<li><a href="${pageContext.request.contextPath}/form/formDetail.do?formId=${formId}&pageNum=${pageInfo.pageSize}&pageSize=${pageInfo.pageSize}" aria-label="Next">尾页</a></li>
							</ul>
						</div>

					</div>
					<!-- /.box-footer-->

				</div>

				</section>
				<!-- 正文区域 /-->

			</div>
			<!-- @@close -->
			<!-- 内容区域 /-->

		</div>

	<script src="${pageContext.request.contextPath}/plugins/jQuery/jquery-2.2.3.min.js"></script>
	<script src="${pageContext.request.contextPath}/plugins/jQueryUI/jquery-ui.min.js"></script>
	<script src="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
	<script src="${pageContext.request.contextPath}/plugins/iCheck/icheck.min.js"></script>
	<script src="${pageContext.request.contextPath}/plugins/adminLTE/js/app.min.js"></script>
	<script src="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.js"></script>
	<script src="${pageContext.request.contextPath}/plugins/select2/select2.full.min.js"></script>
	<script src="${pageContext.request.contextPath}/plugins/ckeditor/ckeditor.js"></script>
	<script src="${pageContext.request.contextPath}/js/header-common.js"></script>
		<script>

			//json
			function searchUser(obj){
				var values=$(obj).val()
				var keyCode=event.keyCode;
				if (keyCode===13){
					if (values===null||values===""){
						location.href="${pageContext.request.contextPath}/form/formDetail.do?formId=${formId}";
					}else {
						location.href="${pageContext.request.contextPath}/form/findByAny.do?formId=${formId}&formName=${formName}&data="+values+"&pageNum=${pageInfo.pageNum}&pageSize=${pageInfo.pageSize}";
					}
				}


			}


			//删除确定
			function deleteForm(formId){
				if (confirm("您确定要删除吗?")){
					location.href="${pageContext.request.contextPath}/form/formDelete.do?pageNum=${pageInfo.pageNum}&pageSize=${pageInfo.pageSize}&totalFormId=${formId}&formName=${formName}&formId="+formId;
				}else {
					$("#delete").prop("href","#");
				}
			}

			//下拉框
			function changePageSize() {
				//获取下拉框的值
				var pageSize = $("#changePageSize ").val();
				//向服务器发送请求，改变没页显示条数
				if (pageSize==="All"){
					location.href = "${pageContext.request.contextPath}/form/formDetail.do?formId=${formId}&pageNum=1&pageSize=-1";
				}else{
					location.href = "${pageContext.request.contextPath}/form/formDetail.do?formId=${formId}&pageNum=${pageInfo.pageNum}&pageSize="+pageSize;
				}
			}

			$(function (){
				var changePage=$("#changePageSize");
				//选择下拉框内容
				if ((${pageInfo.pageSize})===-1){
					changePage.children(":last-child").prop("selected","selected");
				}else {
					for (var i = changePage.children("option")[0].text;i <= changePage.children("option")[changePage.children("option").length-2].text; i++) {
						if ((${pageInfo.pageSize})===i){
							changePage.children("option")[i-(changePage.children("option")[0].text)].setAttribute("selected","selected");
						}
					}
				}

				//页数变色
				if ((${pageInfo.pageSize})===-1){
					$("#pageNum").children("li")[2].children[0].style.backgroundColor="cornflowerblue"
					$("#pageNum").children("li")[2].children[0].style.color="#f4f4f4"
				}else {
					for (var i = 1; i < ${pageInfo.pageSize}+1; i++) {
						if ((${pageInfo.pageNum})===i){
							$("#pageNum").children("li")[i+1].children[0].style.backgroundColor="cornflowerblue"
							$("#pageNum").children("li")[i+1].children[0].style.color="#f4f4f4"
						}
					}
				}


			})

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

			$(document)
					.ready(
							function() {

								// 激活导航位置
								setSidebarActive("admin-datalist");

								// 列表按钮 
								$("#dataList td input[type='checkbox']")
										.iCheck(
												{
													checkboxClass : 'icheckbox_square-blue',
													increaseArea : '20%'
												});
								// 全选操作 
								$("#selall")
										.click(
												function() {
													var clicks = $(this).is(
															':checked');
													if (!clicks) {
														$(
																"#dataList td input[type='checkbox']")
																.iCheck(
																		"uncheck");
													} else {
														$(
																"#dataList td input[type='checkbox']")
																.iCheck("check");
													}
													$(this).data("clicks",
															!clicks);
												});
							});
		</script>
</body>

</html>