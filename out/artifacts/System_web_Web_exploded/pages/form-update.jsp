<%--
  User: Mr.Yu
  Date: 2021/8/3
  Time: 21:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">




    <title>数据 - AdminLTE2定制版</title>

    <link rel="icon" href="${pageContext.request.contextPath}/img/logo.ico">
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/logo.ico">
    <link rel="bookmark" href="${pageContext.request.contextPath}/img/logo.ico">




    <!-- Tell the browser to be responsive to screen width -->
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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.skinNice.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/bootstrap-slider/slider.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.css">

    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/adminLTE/css/skins/skin-blue-light-co.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/form-create.css">
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
    <div class="content-wrapper" id="content">

        <!-- 内容头部 -->
        <section class="content-header">
            <h1>
                创建表单 <small>新的表单</small>
            </h1>
            <ol class="breadcrumb" id="navigation">
                <li><a href="${pageContext.request.contextPath}/index.jsp"><i
                        class="fa fa-dashboard"></i> 首页</a></li>
                <li><a href="all-order-manage-list.html">XXX</a></li>
                <li class="active">XXX</li>
            </ol>
        </section>
        <!-- 内容头部 /-->

        <header id="main-header">

            <span class="header" id="form-submit"><i class="fa fa-chevron-circle-down"></i> 完成编辑</span>
            <span class="header"><i class="fa fa-eye"></i> 预览</span>
            <span class="header"><i class="fa fa-cogs"></i> 题目随机设置</span>
            <span class="header"><i class="fa fa-opencart"></i> 隐藏系统题号</span>
        </header>


        <div id="left-box">

            <!--树表格-->
            <div class="tab-pane" id="tab-treetable">
                <table id="collapse-table" class="table table-bordered table-hover dataTable">
                    <thead>
                    <tr id="option-head">
                        <th>类型选择</th>
                    </tr>
                    </thead>
                    <tr data-tt-id="1" class="option-title">
                        <td>选择题</td>
                    </tr>

                    <tbody>

                    <tr data-tt-id="1-1" data-tt-parent-id="1" class="option" inputId="1">
                        <td>单选</td>
                    </tr>
                    <tr data-tt-id="1-2" data-tt-parent-id="1" class="option">
                        <td>多选</td>
                    </tr>
                    <tr data-tt-id="1-3" data-tt-parent-id="1" class="option">
                        <td>下拉框</td>
                    </tr>

                    <tr data-tt-id="2" class="option-title">
                        <td>填空题</td>
                    </tr>
                    <tr data-tt-id="2-1" data-tt-parent-id="2" class="option">
                        <td>单项填空</td>
                    </tr>
                    <tr data-tt-id="2-2" data-tt-parent-id="2" class="option">
                        <td>多项填空</td>
                    </tr>
                    <tr data-tt-id="2-3" data-tt-parent-id="2" class="option">
                        <td>矩阵填空</td>
                    </tr>
                    <tr data-tt-id="2-4" data-tt-parent-id="2" class="option">
                        <td>表格填空</td>
                    </tr>

                    <tr data-tt-id="3" class="option-title">
                        <td>矩阵题</td>
                    </tr>
                    <tr data-tt-id="3-1" data-tt-parent-id="3" class="option">
                        <td>矩阵单选</td>
                    </tr>
                    <tr data-tt-id="3-2" data-tt-parent-id="3" class="option">
                        <td>矩阵量表</td>
                    </tr>
                    <tr data-tt-id="3-3" data-tt-parent-id="3" class="option">
                        <td>矩阵滑动条</td>
                    </tr>
                    <tr data-tt-id="3-4" data-tt-parent-id="3" class="option">
                        <td>表格下拉框</td>
                    </tr>

                    <tr data-tt-id="4" class="option-title">
                        <td>评分题</td>
                    </tr>
                    <tr data-tt-id="4-1" data-tt-parent-id="4" class="option">
                        <td>量表题</td>
                    </tr>
                    <tr data-tt-id="4-2" data-tt-parent-id="4" class="option">
                        <td>NPS量表</td>
                    </tr>
                    <tr data-tt-id="4-3" data-tt-parent-id="4" class="option">
                        <td>评分单选</td>
                    </tr>
                    <tr data-tt-id="4-4" data-tt-parent-id="4" class="option">
                        <td>评分多选</td>
                    </tr>
                    <tr data-tt-id="4-5" data-tt-parent-id="4" class="option">
                        <td>矩阵量表</td>
                    </tr>
                    <tr data-tt-id="4-6" data-tt-parent-id="4" class="option">
                        <td>评价题</td>
                    </tr>


                    <tr data-tt-id="5" class="option-title">
                        <td>个人信息</td>
                    </tr>
                    <tr data-tt-id="5-1" data-tt-parent-id="5" class="option">
                        <td>姓名</td>
                    </tr>
                    <tr data-tt-id="5-2" data-tt-parent-id="5" class="option">
                        <td>基本信息</td>
                    </tr>
                    <tr data-tt-id="5-3" data-tt-parent-id="5" class="option">
                        <td>性别</td>
                    </tr>
                    <tr data-tt-id="5-4" data-tt-parent-id="5" class="option">
                        <td>年龄段</td>
                    </tr>
                    <tr data-tt-id="5-5" data-tt-parent-id="5" class="option">
                        <td>省市</td>
                    </tr>
                    <tr data-tt-id="5-6" data-tt-parent-id="5" class="option">
                        <td>省市区</td>
                    </tr>
                    <tr data-tt-id="6-1" data-tt-parent-id="5" class="option">
                        <td>手机</td>
                    </tr>
                    <tr data-tt-id="5-7" data-tt-parent-id="5" class="option">
                        <td>日期</td>
                    </tr>
                    <tr data-tt-id="5-8" data-tt-parent-id="5" class="option">
                        <td>时间</td>
                    </tr>
                    <tr data-tt-id="5-9" data-tt-parent-id="5" class="option">
                        <td>职业</td>
                    </tr>
                    <tr data-tt-id="5-10" data-tt-parent-id="5" class="option">
                        <td>行业</td>
                    </tr>
                    <tr data-tt-id="5-11" data-tt-parent-id="5" class="option">
                        <td>高校</td>
                    </tr>
                    <tr data-tt-id="5-12" data-tt-parent-id="5" class="option">
                        <td>邮寄地址</td>
                    </tr>

                    </tbody>
                </table>
            </div>
            <!--树表格/-->
        </div>
        <div id="right-box">
                <div id="title-div">
                    <div id="title">
                        <span>
                            <h1><input name="title" type="text" id="title-text" placeholder="请输入标题名称"/></h1>
                        </span>
                    </div>
                </div>

                <div id="right-box-content">

                </div>
            <form method="post" id="total-content" action="${pageContext.request.contextPath}/form/submit.do">
                <div id="none-box" style="display: none">
                    <input type="text" id="pageTitle" name="pageTitle">
                    <input type="text" id="totalTitle" name="totalTitle">
                    <input type="text" id="totalText" name="totalText">
                    <input type="text" id="submitType" name="submitType" value="update">
                    <input type="text" id="inputId" name="formId" value="${formId}">
                </div>
            </form>

            <div id="show-box">
                <span id="input-title">标题</span>
                <div id="input-contents">
                    <div id="box-checked">
                        <span id="input-content">
                            <h5>啥都没</h5>
                        </span>
                    </div>
                </div>
            </div>




<%--    编辑器        <div id="form-text">--%>
<%--                <div class="box box-success" id="form-text-son">--%>
<%--                    <div class="box-header">--%>
<%--                        <!-- tools box -->--%>
<%--                        <div class="pull-right box-tools">--%>
<%--                            <button type="button" class="btn btn-default btn-sm" data-widget="collapse" data-toggle="tooltip" title="Collapse">--%>
<%--                                <i class="fa fa-minus"></i></button>--%>
<%--                            <button type="button" class="btn btn-default btn-sm" data-widget="remove" data-toggle="tooltip" title="Remove" id="text-close">--%>
<%--                                <i class="fa fa-times"></i></button>--%>
<%--                        </div>--%>
<%--                        <!-- /. tools -->--%>
<%--                    </div>--%>
<%--                    <!-- /.box-header -->--%>
<%--                    <div class="box-body pad">--%>
<%--                        <form>--%>
<%--                            <textarea id="textarea" class="textarea" placeholder="请在此输入内容" style="text-align:left;width: 100%; height: 200px; font-size: 14px; line-height: 18px; border: 1px solid #dddddd; padding: 10px;"></textarea>--%>
<%--                        </form>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>

        </div>


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
<%--<script src="${pageContext.request.contextPath}/plugins/ckeditor/ckeditor.js"></script>--%>
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
<script src="${pageContext.request.contextPath}/js/form-update.js"></script>
<script src="${pageContext.request.contextPath}/js/form-create-update.js"></script>
<script src="${pageContext.request.contextPath}/js/header-common.js"></script>
<script>
    $(function (){
        var status=false;
        mypost=$.post("${pageContext.request.contextPath}/form/update.do",{id:${formId}},function (inputList){
            $("#pageTitle h3").text(inputList.title);
            for (var i = 0; i < inputList.addInputs.length; i++) {
                $("#right-box-content").append(inputList.addInputs[i].inputContent)
                $("#right-box-content").children(":last-child").children(":first-child").children(":first-child").val(inputList.addInputs[i].titleContent)
                $("#right-box-content").children(":last-child").children(":nth-child(2)").children(".detail-warp").each(function (index,ele){
                    if (inputList.addInputs[i].type===1){
                        $("#right-box-content").children(":last-child").prop("inputId",1);
                    }
                    if (inputList.addInputs[i].type===5||inputList.addInputs[i].type===3){
                        $(ele).children(":first-child").val(inputList.addInputs[i].textContents[index])
                    } else if (inputList.addInputs[i].type===6){}else{
                        $(ele).children(":nth-child(2)").val(inputList.addInputs[i].textContents[index])
                    }
                })
            }
            status=true;
        })
    })

    //通用添加移除按钮事件
    $(document).on("click",".removeButton",function (){
        if ($(this).parent().parent().children("span").length===1){
            $(this).parent().parent().parent().remove()
        }else {
            $(this).parent().remove()
        }
    })
    $(document).on("click",".addButton",function (){
        var inputId=$(this).parent().parent().parent().attr("inputId")
        var input=$(this)
        $.post("${pageContext.request.contextPath}/input/addOne.do",{id:inputId},function (data){
            input.parent().after(data.content)
        },"json")
    })
    //预览类型选择
    $(".option").mouseenter(function (){
        $("#input-contents").empty();
        var inputId=$(this).attr("inputId");
        $.post("${pageContext.request.contextPath}/input/showOne.do",{id:inputId},function (data){
            $("#input-contents").append(data.content)
        },"json")
    })
    //点击预览添加到右侧
    $(".option").click(function (){
        var inputId=$(this).attr("inputId");
        $.post("${pageContext.request.contextPath}/input/initOne.do",{id:inputId},function (data){
            $("#right-box-content").append(data.content)
        },"json")
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

        // 颜色选取器
        $(".my-colorpicker1").colorpicker();
        $(".my-colorpicker2").colorpicker();

    });




    $(document).ready(function() {
        // 选择框
        $(".select2").select2();
    });




    $(document).ready(function() {

        //Date picker
        $('#datepicker').datepicker({
            autoclose: true,
            language: 'zh-CN'
        });

        // datetime picker
        $('#dateTimePicker').datetimepicker({
            format: "mm/dd/yyyy - hh:ii",
            autoclose: true,
            todayBtn: true,
            language: 'zh-CN'
        });

        //Date range picker
        $('#reservation').daterangepicker({
            locale: {
                applyLabel: '确认',
                cancelLabel: '取消',
                fromLabel: '起始时间',
                toLabel: '结束时间',
                customRangeLabel: '自定义',
                firstDay: 1
            },
            opens: 'left', // 日期选择框的弹出位置
            separator: ' 至 '
            //showWeekNumbers : true,     // 是否显示第几周
        });

        //Date range picker with time picker
        $('#reservationtime').daterangepicker({
            timePicker: true,
            timePickerIncrement: 30,
            format: 'MM/DD/YYYY h:mm A',
            locale: {
                applyLabel: '确认',
                cancelLabel: '取消',
                fromLabel: '起始时间',
                toLabel: '结束时间',
                customRangeLabel: '自定义',
                firstDay: 1
            },
            opens: 'right', // 日期选择框的弹出位置
            separator: ' 至 '
        });

        //Date range as a button
        $('#daterange-btn').daterangepicker({
                locale: {
                    applyLabel: '确认',
                    cancelLabel: '取消',
                    fromLabel: '起始时间',
                    toLabel: '结束时间',
                    customRangeLabel: '自定义',
                    firstDay: 1
                },
                opens: 'right', // 日期选择框的弹出位置
                separator: ' 至 ',
                ranges: {
                    '今日': [moment(), moment()],
                    '昨日': [moment().subtract(1, 'days'), moment().subtract(1, 'days')],
                    '最近7日': [moment().subtract(6, 'days'), moment()],
                    '最近30日': [moment().subtract(29, 'days'), moment()],
                    '本月': [moment().startOf('month'), moment().endOf('month')],
                    '上个月': [moment().subtract(1, 'month').startOf('month'), moment().subtract(1, 'month').endOf('month')]
                },
                startDate: moment().subtract(29, 'days'),
                endDate: moment()
            },
            function(start, end) {
                $('#daterange-btn span').html(start.format('MMMM D, YYYY') + ' - ' + end.format('MMMM D, YYYY'));
            }
        );

    });




    $(document).ready(function() {

        /*table tree*/
        $("#collapse-table").treetable({
            expandable: true
        });

    });




    $(document).ready(function() {

        // CKEDITOR.replace('editor1');

        // $(".textarea").wysihtml5({
        //     locale:'zh-CN'
        // });

        $("#markdown-textarea").markdown({
            language: 'zh',
            autofocus: false,
            savable: false
        });

    });



    $(document).ready(function() {

        // 激活导航位置
        setSidebarActive("admin-dataform");

    });
</script>
</body>

</html>
