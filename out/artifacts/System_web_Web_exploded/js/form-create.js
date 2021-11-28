//提交表单
$("#form-submit").click(function (){
    //解决空值问题
    $(".detail").each(function (index,ele){
        //标题空值
        var title=$(ele).children(":first-child").children(":first-child");
        if (title.attr("name")===null||title.attr("name")===undefined||title.attr("name")===""){
            var inputname="";
            inputname+=$(ele).attr("inputid")+"~";
            inputname+=title.prop("placeholder")+"~title~";
            var uuid=generateUUID()
            title.attr("uuid",uuid)
            inputname+=uuid;
            title.attr("name",inputname)
        }
        //问题空值
        $(ele).children(":nth-child(2)").children().each(function (i,e){
            var text=$(e)
            if (text.attr("name")===null||text.attr("name")===undefined||text.attr("name")===""){
                var textname="";
                textname+=$(ele).attr("inputid")+"~";
                textname+=title.attr("uuid")+"~"
                if ($(ele).attr("inputid")==="1"||$(ele).attr("inputid")==="2"){
                    textname+=$(e).children(":nth-child(2)").prop("placeholder")
                }else {
                    textname+=$(e).children(":first-child").prop("placeholder")
                }
                $(e).attr("name",textname)
            }
        })

    })
    //解决空值问题


    var question_title="";
    var question="";
    var title="";
    $(".question-title").each(function (index,element) {
        if (index>=$(".question-title").length-1){
            question_title+=$(element).attr("name")
        }else {
            question_title+=$(element).attr("name")+"·"
        }
    })
    $(".detail-warp").each(function (index,element) {
        if (index>=$(".detail-warp").length-1){
            question+=$(element).attr("name")
        }else {
            question+=$(element).attr("name")+"·"
        }
    })
    if ($("#title-text").val()===""){
        title+=$("#title-text").prop("placeholder")
    }else {
        title+=$("#title-text").val();
    }
    $("#pageTitle").val(title)
    $("#totalTitle").val(question_title)
    $("#totalText").val(question)
    $("#total-content").submit();
})





