showbox(".option");
//点击显示预览
function showbox(options){
    $(options).mouseenter(function (){
        $("#input-contents").empty();
        $("#show-box").css("top",$(window).scrollTop()+300)
        $("#show-box").css("left",$(options).offset().left+$(options).width+20)
        $("#show-box").stop().fadeIn(300)
    })
    $(options).mouseleave(function (){
        $("#show-box").stop().fadeOut(300,function (){
            $("#input-contents").empty();
        })

    })

}
$(function (){
    //为每个input设置inputId
    $(".option").each(function (index,element){
        $(element).attr("inputId",index+1);
    })
    //窗口改变大小时，树列表大小也改变
    $("#tab-treetable").height(document.body.clientHeight-140)
})
//窗口改变大小时，树列表大小也改变
$(window).resize(function (){
    $("#tab-treetable").height(document.body.clientHeight-140+$(window).scrollTop())
})


//设置题目与标题的一一对应关系
$(document).on("blur",".detail-warp",function (){
    var inputName=$(this).parent().parent().attr("inputid")+"~";
    var title=$(this).parent().parent().children(":first-child").children(":nth-child(1)")
    var max=$(this).parent().parent();
    if (title.attr("uuId")===""||title.attr("uuId")===null||title.attr("uuId")===undefined){
        title.attr("uuId",generateUUID());
    }
    inputName+=title.attr("uuId");
    if (max.attr("inputid")==="1"||max.attr("inputid")==="2"){
        var min=$(this).children(":nth-child(2)")
        inputName+="~"+(min.val()===""?min.attr("placeholder"):min.val())
    } else {
        var min=$(this).children(":nth-child(1)")
        inputName+="~"+(min.val()===""?min.attr("placeholder"):min.val())
    }

    $(this).attr("name",inputName)
    titleName="";
    title.val()===""?titleName+=title.prop("placeholder"):titleName+=title.val();
    title.prop("name",title.parent().parent().attr("inputid")+"~"+titleName+"~title~"+title.attr("uuId"));
})

$(document).on("blur",".question-title",function (){
    var titleName=$(this).parent().parent().attr("inputid")+"~";
    if ($(this).val()===""){
        titleName+=$(this).attr("placeholder")
    }else {
        titleName+=$(this).val()
    }
    titleName+="~title~"
    if ($(this).attr("uuId")===""||$(this).attr("uuId")===null||$(this).attr("uuId")===undefined){
        $(this).attr("uuId",generateUUID());
    }
    titleName+=$(this).attr("uuid");
    $(this).attr("name",titleName)
})
//生成唯一标识符
function generateUUID(){
    var d=new Date().getTime();
    var uuID='xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx'.replace(/[xy]/g,function (c){
        var r=(d+Math.random()*16)%16|0;
        d=Math.floor(d/16);
        return (c==='x'?r:(r&0x3|0x8)).toString(16);
    });
    return uuID;
}


// //点击显示文本输入器
// $("#title-text").click(function (){
//     showtextbox(this)
// })
// $("#others-content").click(function (){
//     showtextbox(this)
// })
// function showtextbox(element){
//         $(element).attr("ischecked","true");
//         $("#textarea").val($(element).html())
//         $("#form-text").stop().fadeIn()
//         $("#form-text-son").stop().fadeIn()
//     $("#text-close").click(function (){
//         $(".form-content").each(function (i,e){
//             if ($(e).attr("ischecked")){
//                 console.log(i)
//                 $(e).html($("#textarea").val())
//                 $(e).prop("ischecked","false")
//                 $("#form-text").stop().fadeOut()
//                 $("#textarea").val('')
//             }
//         })
//     })
// }






