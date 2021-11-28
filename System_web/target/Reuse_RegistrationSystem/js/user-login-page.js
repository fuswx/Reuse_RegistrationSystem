//提交表单前检查是否为空
window.onload=function () {
    var submit = document.getElementsByClassName("login")[0];
    var name = document.getElementsByName("UserName")[0];
    var password = document.getElementsByName("UserPassword")[0];
    var checkcode = document.getElementsByName("checkCode")[0];
    submit.onclick = function isEmpty(e) {
        if (this.parentNode.parentNode.childNodes[1].childNodes[1].value === '') {
            alert("用户名不能为空");
            return false
        } else if (this.parentNode.parentNode.childNodes[3].childNodes[1].value === '') {
            alert("密码不能为空")
            return false
        } else if (this.parentNode.parentNode.childNodes[5].childNodes[3].value === '') {
            alert("验证码不能为空")
            return false
        }  else{
            return true;
        }
    }
}
$(function (){
    //鼠标移进移出反馈
    moveAndChangeColor("#userLogin")
    moveAndChangeColor("#register")

    //鼠标移进移出反馈
    function moveAndChangeColor(a){
        $(a).mouseleave(function (){
            $(a).css("backgroundColor","cornflowerblue")
        })
        $(a).mouseenter(function (){
            $(a).css("backgroundColor","dodgerblue")
        })
    }
    //设置按键反馈-弹起
    $("#userLogin").mousedown(function (){
        $("#userLogin").css("width","295px");
        $("#userLogin").css("height","50px");
    })
    $("#userLogin").mouseup(function (){
        $("#userLogin").css("width","300px");
        $("#userLogin").css("height","50px");
    })
    $("#register").mousedown(function (){
        $("#register").css("width","295px");
        $("#register").css("height","48px");
        $("#register").css("margin","0 auto 22px auto");
    })
    $("#register").mouseup(function (){
        $("#register").css("width","300px");
        $("#register").css("height","50px");
        $("#register").css("margin","0 auto 20px auto");
    })
    $("#userLogin").click(function (){
        $("#chooseLogin").slideUp();
        $("#screen").slideDown();
        $("#manager").css("display","none");
        setTimeout(function (){
            $("#user").slideDown();
        },300)

    })

    moveAndChangeColor(".login")
    moveAndChangeColor(".reset")

    $(".close").click(function (){
        $(this).parent().slideDown();
        $("#screen").slideUp();
        setTimeout(function (){
            $("#chooseLogin").slideDown();
        },300)

    })

    /*重置键*/
    $(".reset").click(function (){
        $("#"+$(this).parent().parent().attr("id")+" input[type='text']").prop("value","");
        $("#"+$(this).parent().parent().attr("id")+" input[type='password']").prop("value","");
        // $($(this).parent().parent()+" input[type='text']").attr("value","");
        // $($(this).parent().parent()+" input[type='password']").attr("value","");
    })
    //提交表单前检查是否为空
    // function checkNull(){
    //     $(this).click(function (){
    //
    //         if (($(this).parent().parent().find("input").eq(3).prop("value"))===''){//验证码
    //             alert("验证码为空！");
    //             return false;
    //         }
    //         if (($(this).parent().parent().find("input").eq(1).prop("value"))===''){//用户名为空
    //             alert("用户名为空！");
    //             return false;
    //         }
    //         if (($(this).parent().parent().find("input").eq(2).prop("value"))==='') {//密码为空
    //             alert("密码为空！");
    //             return false;
    //         }else
    //             return true;
    //     })
    // }

})
