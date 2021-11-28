<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  User: Mr.Yu
  Date: 2021/7/27
  Time: 9:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>

<head>
    <!-- 页面meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>计协报名表单</title>

    <link rel="icon" href="${pageContext.request.contextPath}/img/logo.ico">
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/logo.ico">
    <link rel="bookmark" href="${pageContext.request.contextPath}/img/logo.ico">

    <meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" name="viewport">
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/ionicons/css/ionicons.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/iCheck/square/blue.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/morris/morris.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/datepicker/datepicker3.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/datatables/dataTables.bootstrap.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.theme.default.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/select2/select2.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/colorpicker/bootstrap-colorpicker.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/bootstrap-markdown/css/bootstrap-markdown.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/adminLTE/css/AdminLTE.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/adminLTE/css/skins/_all-skins.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/adminLTE/css/skins/skin-blue-light-co.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.skinNice.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/bootstrap-slider/slider.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.css">

    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/adminLTE/css/skins/skin-blue-light-co.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/user-registration.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css">


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
                报名表单
                <small>计协</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="${pageContext.request.contextPath}/index.jsp"><i class="fa fa-dashboard"></i> 首页</a></li>
            </ol>
        </section>
        <!-- 内容头部 /-->
        <header id="main-header">
            <span class="header" id="form-submit"><i class="fa fa-chevron-circle-down"></i> 返回上一页</span>
        </header>

        <!-- 正文区域 -->
        <div class="content">
            <div id="pageTitle"><h3>计算机协会报名表单</h3></div>

                <div id="right-box-content">
                </div>


        </div>
        <!-- 正文区域 /-->

    </div>
    <!-- 内容区域 /-->


</div>



<script src="${pageContext.request.contextPath}/plugins/jQuery/jquery-2.2.3.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/jQueryUI/jquery-ui.min.js"></script>
<script>
    $.widget.bridge('uibutton', $.ui.button);
</script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/raphael/raphael-min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/morris/morris.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/sparkline/jquery.sparkline.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<script src="${pageContext.request.contextPath}/plugins/knob/jquery.knob.js"></script>
<script src="${pageContext.request.contextPath}/plugins/daterangepicker/moment.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.js"></script>
<script src="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.zh-CN.js"></script>
<script src="${pageContext.request.contextPath}/plugins/datepicker/bootstrap-datepicker.js"></script>
<script src="${pageContext.request.contextPath}/plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/slimScroll/jquery.slimscroll.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/fastclick/fastclick.js"></script>
<script src="${pageContext.request.contextPath}/plugins/iCheck/icheck.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/adminLTE/js/app.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.js"></script>
<script src="${pageContext.request.contextPath}/plugins/select2/select2.full.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/colorpicker/bootstrap-colorpicker.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/bootstrap-markdown.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/markdown.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/to-markdown.js"></script>
<script src="${pageContext.request.contextPath}/plugins/ckeditor/ckeditor.js"></script>
<script src="${pageContext.request.contextPath}/plugins/input-mask/jquery.inputmask.js"></script>
<script src="${pageContext.request.contextPath}/plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
<script src="${pageContext.request.contextPath}/plugins/input-mask/jquery.inputmask.extensions.js"></script>
<script src="${pageContext.request.contextPath}/plugins/datatables/jquery.dataTables.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/datatables/dataTables.bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/chartjs/Chart.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.resize.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.pie.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.categories.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-slider/bootstrap-slider.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-datetimepicker/locales/bootstrap-datetimepicker.zh-CN.js"></script>
<script src="${pageContext.request.contextPath}/js/header-common.js"></script>
<script src="${pageContext.request.contextPath}/js/user-registration.js"></script>
<script>
    $(function (){
        var status=false;
        mypost=$.post("${pageContext.request.contextPath}/form/writeAll.do",{id:${newTableId}},function (inputList){
            $("#pageTitle h3").text(inputList.title);
            for (var i = 0; i < inputList.addInputs.length; i++) {
                //结构
                $("#right-box-content").append(inputList.addInputs[i].inputContent)
                //题目
                $("#right-box-content").children(":last-child").children(":first-child").children(":first-child").text(inputList.addInputs[i].titleContent)
                $("#right-box-content").children(":last-child").children(":nth-child(2)").children().each(function (index,ele){
                    if (inputList.addInputs[i].type===3){
                        $(ele).attr("name",inputList.addInputs[i].titleContent)
                        $(ele).children().each(function (ind,e){
                            if (ind!==$(ele).children().length-1){
                                $(e).text(inputList.addInputs[i].textContents[ind])
                                $(e).val(inputList.addInputs[i].textContents[ind])
                            }else {
                                $(e).prop("selected","selected")
                                $(e).prop("disabled","disabled")
                            }
                        })
                    }else {
                        if (inputList.addInputs[i].type===1){
                            $("#right-box-content").children(":last-child").prop("inputId",1);
                            $(ele).children(":first-child").val(inputList.addInputs[i].textContents[index])
                        }else if (inputList.addInputs[i].type===2){
                            $(ele).children(":first-child").val(inputList.addInputs[i].textContents[index])
                        }else if (inputList.addInputs[i].type===4){
                            $("#right-box-content").children(":last-child").prop("inputId",4);
                        }
                        $(ele).children("span").html(inputList.addInputs[i].textContents[index])
                    }
                })
            }
            status=true;
        })

        $.when(mypost).done(function (){
            if (status){
                $(".detail-content").each(function (i,e){
                    if ($(e).children().length>1){
                        $(e).children().each(function (index,element){
                            var title=$(element).parent().parent().children(":first-child").children(":first-child").text()
                            var smallTitle=$(element).parent().parent().attr("inputid")==="2"?$(element).children(":first-child").val():$(element).children(":first-child").text()
                            if ($(element).parent().parent().attr("inputid")==="5"){
                                $.post("${pageContext.request.contextPath}/form/setMulRequestText.do",{formName:'${formName}',formId:'${formId}',newTableId:'${newTableId}',title:title,smallTitle:smallTitle},function (datas){
                                    $(element).children(":nth-child(2)").val(datas)
                                },"text")
                            }else if ($(element).parent().parent().attr("inputid")==="2"){
                                $.post("${pageContext.request.contextPath}/form/setMulRequestText.do",{formName:'${formName}',formId:'${formId}',newTableId:'${newTableId}',title:title,smallTitle:smallTitle},function (datas){
                                    if ($(element).children("input").val()===datas) {
                                        $(element).children("input").attr("checked", "checked")
                                        $(element).children("span").css("font-weight", 600)
                                    }
                                },"text")
                            }else if ($(element).parent().parent().attr("inputid")==="1"){
                                $.post("${pageContext.request.contextPath}/form/setRequestText.do",{formName:'${formName}',formId:'${formId}',newTableId:'${newTableId}',title:title},function (datas){
                                    if ($(element).children("input").val()===datas){
                                        $(element).children("input").attr("checked","checked")
                                        $(element).children("span").css("font-weight",600)
                                    }
                                },"text")
                            }
                        })
                    }else {
                        var title=$(e).parent().children(":first-child").children(":first-child").text()
                        $.post("${pageContext.request.contextPath}/form/setRequestText.do",{formName:'${formName}',formId:'${formId}',newTableId:'${newTableId}',title:title},function (datas){
                            if ($(e).parent().attr("inputid")==="4"||$(e).parent().attr("inputid")==="6"){
                                $(e).children(":first-child").children(":first-child").val(datas)
                            }else if ($(e).parent().attr("inputid")==="3"){
                                $(e).children(":first-child").children().each(function (index,element){
                                    if ($(element).val()===datas){
                                        $(element).prop("selected","selected")
                                    }
                                })
                            }
                        },"text")
                    }
                })
                $(".detail-warp input,.detail-warp textarea,.detail-content select").attr("disabled","disabled");
            }
        })
    })

    $(document).ready(function() {
        // 选择框
        $(".select2").select2();

        // WYSIHTML5编辑器
        $(".textarea").wysihtml5({
            locale: 'zh-CN'
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


    $(document).ready(function() {
        // 激活导航位置
        setSidebarActive("admin-index");
    });
</script>
</body>

</html>
