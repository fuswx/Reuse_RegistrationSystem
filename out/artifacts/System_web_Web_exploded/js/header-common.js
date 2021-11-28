//滚动行为
$(window).scroll(function (){
    if ($(window).scrollTop()===0){
        $("#main-header").css("top",100-$(window).scrollTop())
        $("#tab-treetable").css("top",140-$(window).scrollTop())
        $("#tab-treetable").height(document.body.clientHeight-140+$(window).scrollTop())
        $("body").attr("class","skin-blue-light sidebar-mini wysihtml5-supported")
    }
    else if ($(window).scrollTop()<100&&$(window).scrollTop()>0){
        $("#main-header").css("top",100-$(window).scrollTop())
        $("#tab-treetable").css("top",140-$(window).scrollTop())
        $("#tab-treetable").height(document.body.clientHeight-140+$(window).scrollTop())
        if ($("body").attr("class")==="skin-blue-light sidebar-mini wysihtml5-supported sidebar-collapse") {
            $("body").attr("class","skin-blue-light sidebar-mini wysihtml5-supported sidebar-collapse")
        }else {
            $("body").attr("class","skin-blue-light sidebar-mini wysihtml5-supported")
        }
    }

    else {
        $("#main-header").css("top",0)
        $("#tab-treetable").css("top",40)
        $("body").attr("class","skin-blue-light sidebar-mini wysihtml5-supported sidebar-collapse")
    }
})

//点击头像显示大侧条
$("#userImg").click(function (){
    if ($("body").attr("class")==="skin-blue-light sidebar-mini wysihtml5-supported"){
        $("body").attr("class","skin-blue-light sidebar-mini wysihtml5-supported sidebar-collapse")
    }else if ($("body").attr("class")==="skin-blue-light sidebar-mini wysihtml5-supported sidebar-collapse"){
        $("body").attr("class","skin-blue-light sidebar-mini wysihtml5-supported")
    }
})

//防止分割异常
$(document).on("keydown",".question-title,.detail-text",function (e){
    if (e.keyCode===192||e.keyCode===229){
        e.preventDefault();
    }
})