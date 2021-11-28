$("#form-submit").click(function (){

    var totalName="";
    var totalText="";

    $(".detail input:text").each(function (index,element){
        if ($(element).val()===""){
            $(element).val($(element).prop("placeholder"))
        }
        totalName+=$(element).attr("name")+"·";
        totalText+=$(element).val()+"·";
    })
    $(".detail textarea").each(function (index,element){
        if ($(element).val()===""){
            $(element).val($(element).prop("placeholder"))
        }
        totalName+=$(element).attr("name")+"6·";
        totalText+=$(element).val()+"·";
    })
    $(".detail input:radio").each(function (index,element){
        if ($(element).prop("checked")===true){
            totalName+=$(element).attr("name")+"·";
            totalText+=$(element).val()+"·";
        }
    })
    $(".detail input:checkbox").each(function (index,element){
        if ($(element).prop("checked")===true){
            totalName+=$(element).attr("name")+"·";
            totalText+=$(element).val()+"·";
        }
    })
    $(".detail select").each(function (index,element){
        totalName+=$(element).attr("name")+"~3·";
        $(element).children().each(function (i,e){
            if ($(e).prop("selected")===true){
                totalText+=$(e).val()+"·";
            }
        })
    })

    $("#totalName").val(totalName)
    $("#totalText").val(totalText)
    console.log(totalText)
    console.log(totalName)
    $("#total-content").submit();
})