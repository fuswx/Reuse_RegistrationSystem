<%--
  User: Mr.Yu
  Date: 2021/5/21
  Time: 19:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>计协用户登录系统</title>
</head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/user-login-page.css" type="text/css">

<link rel="icon" href="${pageContext.request.contextPath}/img/logo.ico">
<link rel="shortcut icon" href="${pageContext.request.contextPath}/img/logo.ico">
<link rel="bookmark" href="${pageContext.request.contextPath}/img/logo.ico">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css">

<script src="${pageContext.request.contextPath}/js/jquery-3.6.0.min.js"></script>
<script src="${pageContext.request.contextPath}/js/user-login-page.js"></script>
<body style="background-image: url('${pageContext.request.contextPath}/img/200.心之空穴.png')">
<div id="chooseLogin">
    <p>亲爱的同学：</p>
    <p>欢迎您使用计协用户登录系统！</p>
    <p>请选择你的登录方式：</p>
    <input type="button" id="userLogin" value="管理员登录">
    <a href="${pageContext.request.contextPath}/pages/admin-register.jsp" id="registerA">
        <span id="register">管理员申请</span>
    </a>
</div>
<div id="screen">
    <div id="user">
        <p>用户登录：</p>
        <form name="UserLogin" action="#" method="post" onsubmit="return isEmpty()">
            <div id="userName"><span>用户名：</span><input type="text" name="UserName" placeholder="请输入用户名"></div>
            <div id="userPassword"><span>密&nbsp;&nbsp;&nbsp;&nbsp;码：</span><input type="password" name="UserPassword" placeholder="请输入密码"></div>
            <div class="checkCode"><a href="#"><img width="100px" height="50px" src="#" title="请刷新"></a><span>验证码：</span><input type="text" name="checkCode1" class="checkText" placeholder="请输入验证码"> </div>
            <div class="button" id="button2">
                <input type="submit" class="login" value="登录">
            </div>
        </form>
        <span class="close">x</span>
    </div>

</div>
<div id="error">
    <strong>${checkError}${loginError}</strong>
</div>
<script>
    /*刷新验证码*/
    $(".checkCode img").click(function (){
        $(".checkCode img").prop("src","#?time="+new Date().getTime());
    })
    //动画形式显示错误信息
    $(function (){
            if ($("#error").children("strong")[0].innerText.length===0){
                $("#error").stop().slideUp();
            }
            else{
                $("#error").stop().slideDown();
                setTimeout(function (){
                    $("#error").stop().slideUp();
                },3000)
    }
    })

</script>
</body>
</html>
