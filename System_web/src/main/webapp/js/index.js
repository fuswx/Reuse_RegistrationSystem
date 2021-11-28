var delta=null;
var delta2=null;
var timeAlert=null;
$(function (){
    $("#see-window").css("top","0")
    delta2=1;
    doChange();
    if (timeAlert==null){
        setAlert(timeAlert)//轮播
    }
    delta=1;
    $(".logo img").click(function (){
        if (delta<=$(".box").length){
            if (timeAlert!=null){
                clearInterval(timeAlert)
                timeAlert=null
            }
            delta=$(".box").length
            $("#see-window").stop().animate({top:-(delta-1)*($("#see-window").height()/$(".box").length)},1000)
            setAlert(timeAlert)
        }
    })
})
function setAlert(){
    timeAlert=setInterval(function (){
        var distance;
        if (delta2==null&&delta!=null){
            distance=0.058;
            delta=alertFun(delta,distance)
        }else if (delta2!=null&&delta==null){
            distance=0.016;
            delta2=alertFun(delta2,distance)
        }else {
            distance=0.016;
            delta2=alertFun(delta2,distance)
        }
    },5000)
}

function alertFun(deltas,distance){
    if (deltas<$(".box").length){
        $("#see-window").stop().animate({top:-deltas*($("#first-box").height()+($("#first-box").height()*distance))},1000)
        deltas++;
    }else if (deltas===$(".box").length){
        $("#see-window").stop().animate({top:0},1000);
        deltas=1;
    }
    return deltas;
}

function doChange(){
    $(".first-line h1").css("font-size",$(".first-line").children(":first-child").parent().parent().height()/11);
    $(".second-line h2").css("font-size",$(".second-line").children(":first-child").parent().parent().height()/17.5);
    $(".third-line h3").css("font-size",$(".third-line").children(":first-child").parent().parent().height()/40);

    $(".first-line").css("width",$(".first-line h1").css("font-size"))
    $(".second-line").css("width",$(".second-line h2").css("font-size"))
    $(".third-line").css("width",$(".box").width()-$(".first-line").width()-$(".second-line").width()-($("#first-box").width()/4))
    // $("#goToT>a").css("width",$(".first-line").children(":first-child").parent().parent().height()/11)
    // $("#goToT>a").css("height",$(".first-line").children(":first-child").parent().parent().height()/14)

    $(".register").css("font-size",$(".register").css("width")/6)
    //$("#goToT > a").css("font-size",$("#goToT > a").css("width")/2)

}

window.onbeforeunload=function (){
    $("#see-window").css("top","0")
    delta=1
    delta2=1;
}
$(window).resize(function (){
    doChange()
})

$(window).mousewheel(function (event){
    delta2=null;
    if (timeAlert!=null){
        clearInterval(timeAlert)
        timeAlert=null
    }
    //var distance=0.058;
    if(event.deltaY > 0){
        if (delta<=$(".box").length){
            delta--;
            if (delta<=0){
                delta=$(".box").length;
                //$("#see-window").stop().animate({top:-(delta-1)*($("#first-box").height()+($("#first-box").height()*distance))},1000)
            }
            $("#see-window").stop().animate({top:-(delta-1)*($("#see-window").height()/$(".box").length)},1000)
            if (delta===1){
                $("#see-window").stop().animate({top:0},1000)
            }
        }
    }else{
        if (delta<$(".box").length){
            delta++;
            //$("#see-window").stop().animate({top:-(delta-1)*($("#first-box").height()+($("#first-box").height()*distance))},1000)
            $("#see-window").stop().animate({top:-(delta-1)*($("#see-window").height()/$(".box").length)},1000)
        }else if (delta===$(".box").length){
            $("#see-window").stop().animate({top:0},1000)
            delta=1;
        }
    }
    if (timeAlert==null){
        setAlert(timeAlert)//轮播
    }
})
var yDistance;
var ydistance;
window.addEventListener("touchstart",function (event){
    delta=null
    yDistance=event.touches[0].pageY
    if (timeAlert!=null){
        clearInterval(timeAlert)
        timeAlert=null
    }
})
window.addEventListener("touchend",function (e){
    //var distance=0.016;
    ydistance=e.changedTouches[0].pageY
    if (ydistance-yDistance<100){
        if (delta2<$(".box").length){
            delta2++;
            $("#see-window").stop().animate({top:-(delta2-1)*($("#see-window").height()/$(".box").length)},1000)
        }
    }else if (ydistance-yDistance>100){
        if (delta2<=$(".box").length){
            delta2--;
            if (delta2===0){
                delta2=$(".box").length
            }
            $("#see-window").stop().animate({top:-(delta2-1)*($("#see-window").height()/$(".box").length)},1000)
        }
    }
    if (timeAlert==null){
        setAlert(timeAlert)//轮播
    }
})



