$("#form-submit").click(function (){

    var totalName="";
    var totalText="";
    var flag=true;

    $(".detail input:text").each(function (index,element){
        if ($(element).val()===""){
            // $(element).val($(element).prop("placeholder"))
            flag=false
            var detail=$(element).parent().parent().parent()
            if (detail.attr("inputid")==="4"){
                $(element).parent().append("<span class='error-Div'><span class='error-Inf'><i class='fa fa-close'></i>"+detail.children(":first-child").children("div").text()+" 未填!</span></span>")
                $(".error-Inf").stop().fadeIn(1500)
                setTimeout(function (){
                    $(".error-Inf").stop().fadeOut(1500)
                    $(element).parent().children(":last-child").remove()
                },5000)
            }else if (detail.attr("inputid")==="5") {
                $(element).parent().append("<span class='error-Div'><span class='error-Inf'><i class='fa fa-close'></i>" + $(element).parent().children("span").html() + " 未填!</span></span>")
                $(".error-Inf").stop().fadeIn(1500)
                setTimeout(function (){
                    $(".error-Inf").stop().fadeOut(1500)
                    $(element).parent().children(":last-child").remove()
                },5000)
            }
        }
        totalName+=$(element).attr("name")+"·";
        totalText+=$(element).val()+"·";

    })
    $(".detail textarea").each(function (index,element){
        if ($(element).val()===""){
            //$(element).val($(element).prop("placeholder"))
            flag=false
            var detail=$(element).parent().parent().parent()
            detail.children(":first-child").append("<span class='error-Div'><span class='error-Inf'><i class='fa fa-close'></i>" + detail.children(":first-child").children("div").text() + " 未填!</span></span>")
            $(".error-Inf").stop().fadeIn(1500)
            setTimeout(function (){
                $(".error-Inf").stop().fadeOut(1500)
                $(element).parent().parent().parent().children(":first-child").children(":last-child").remove()
            },5000)
        }
        totalName+=$(element).attr("name")+"6·";
        totalText+=$(element).val()+"·";
    })
    var inx=0;
    var radioflag=false;
    $(".detail input:radio,.detail input:checkbox").each(function (index,element){
        if ($(element).prop("checked")===true){
            totalName+=$(element).attr("name")+"·";
            totalText+=$(element).val()+"·";
            radioflag=true;
        }
        inx++;
        if (!radioflag&&inx===$(element).parent().parent().children().length){
            var detail=$(element).parent().parent().parent()
            detail.children(":first-child").append("<span class='error-Div'><span class='error-Inf'><i class='fa fa-close'></i>" + detail.children(":first-child").children("div").text() + " 未填!</span></span>")
            $(".error-Inf").stop().fadeIn(1500)
            setTimeout(function (){
                $(".error-Inf").stop().fadeOut(1500)
                $(element).parent().parent().parent().children(":first-child").children(":last-child").remove()
            },5000)
            radioflag=false;
            inx=0;
        }else if (radioflag&&inx===$(element).parent().parent().children().length){
            inx=0
            radioflag=false;
        }
        flag=radioflag?flag:radioflag
    })
    $(".detail select").each(function (index,element){
        var radioflags=false;
        totalName+=$(element).attr("name")+"~3·";
        $(element).children().each(function (i,e){
            if (i<$(element).children().length-1){
                if ($(e).prop("selected")===true){
                    totalText+=$(e).val()+"·";
                    radioflags=true
                }
            }
            inx++;
            if (!radioflags&&inx===$(element).children().length){
                var detail=$(element).parent().parent()
                detail.children(":first-child").append("<span class='error-Div'><span class='error-Inf'><i class='fa fa-close'></i>" + detail.children(":first-child").children("div").text() + " 未填!</span></span>")
                $(".error-Inf").stop().fadeIn(1500)
                setTimeout(function (){
                    $(".error-Inf").stop().fadeOut(1500)
                    $(element).parent().parent().children(":first-child").children(":last-child").remove()
                },5000)
                inx=0;
            }else if (radioflags&&inx===$(element).children().length){
                inx=0;
            }
        })
        flag=radioflags?flag:radioflags
    })
    totalName+="uuId~uuId·"
    totalText+=generateUUID()+"·"
    $("#totalName").val(totalName)
    $("#totalText").val(totalText)
    if (flag){
        $("#total-content").submit();
    }else {
        alert("还有空没填哦，请注意提示信息")
    }
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
