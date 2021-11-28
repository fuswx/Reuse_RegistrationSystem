<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<aside class="main-sidebar">
	<!-- sidebar: style can be found in sidebar.less -->
	<section class="sidebar">
		<!-- Sidebar user panel -->
		<div class="user-panel">
			<div class="pull-left image">
				<img src="${pageContext.request.contextPath}/img/user2-160x160.jpg"
					class="img-circle" alt="User Image" id="userImg">
			</div>
			<div class="pull-left info">
				<p>
					<security:authentication property="principal.username"/>
				</p>
				<a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
			</div>
		</div>

		<!-- sidebar menu: : style can be found in sidebar.less -->
		<ul class="sidebar-menu">
			<li class="header">菜单</li>
			<li id="admin-index"><a href="${pageContext.request.contextPath}/index.jsp"><i
					class="fa fa-dashboard"></i> <span>首页</span></a></li>

			<li class="treeview"><a href="#"> <i class="fa fa-tripadvisor"></i>
					<span>用户系统</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>


			</a>
				<ul class="treeview-menu">

					<li id="system-setting">
						<a href="${pageContext.request.contextPath}/user/findAll.do">
						<i class="fa fa-circle-o"></i> 计协风采
					</a>
					</li>

					<li id="system-setting">
						<a href="${pageContext.request.contextPath}/form/toRegistrant.do">
							<i class="fa fa-circle-o"></i> 加入计协
						</a>
					</li>

					<li id="system-setting">
						<a href="${pageContext.request.contextPath}/pages/form-register.jsp">
							<i class="fa fa-circle-o"></i> 用户注册
					</a>
					<li id="system-setting">
						<a href="${pageContext.request.contextPath}/pages/user-login-page.jsp">
							<i class="fa fa-circle-o"></i> 用户登录
						</a>
					</li>
					<li id="system-setting">
						<a href="${pageContext.request.contextPath}/user/findById.do?id=8">
							<i class="fa fa-circle-o"></i> 我的信息
						</a>
					</li>
				</ul></li>
			<li class="treeview">
				<a href="#"> <i class="fa fa-windows"></i>
					<span>管理员系统</span>
				<span class="pull-right-container">
					<i class="fa fa-angle-left pull-right"></i>
				</span>
			</a>

				<ul class="treeview-menu">
					<li id="system-setting">
						<a href="${pageContext.request.contextPath}/pages/admin-login-page.jsp">
							<i class="fa fa-circle-o"></i> 管理员登录
						</a>
					</li>

					<li id="system-setting">
						<a href="${pageContext.request.contextPath}/pages/admin-register.jsp">
							<i class="fa fa-circle-o"></i> 管理员申请
						</a>
					</li>
				</ul>
			</li>

		</ul>
	</section>
	<!-- /.sidebar -->
</aside>