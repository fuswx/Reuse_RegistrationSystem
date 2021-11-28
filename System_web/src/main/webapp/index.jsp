<%--
  User: Mr.Yu
  Date: 2021/7/27
  Time: 9:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>计协首页</title>

    <link rel="icon" href="${pageContext.request.contextPath}/img/logo.ico">
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/logo.ico">
    <link rel="bookmark" href="${pageContext.request.contextPath}/img/logo.ico">

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/index.css">

    <script src="${pageContext.request.contextPath}/js/jquery-3.6.0.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery.mousewheel.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/index.js"></script>
    <script src="${pageContext.request.contextPath}/js/echarts.min.js"></script>
</head>

<body>
<div id="see-window">

    <div id="first-box" class="box">
        <div class="logo">
            <img src="${pageContext.request.contextPath}/img/logo-Part.png"/>
        </div>

        <div class="first-line">
            <h1>计算机协会</h1>
        </div>
        <div class="second-line">
            <h2>—追求永无止境</h2>
        </div>

        <div class="third-line">
            <h3>大学生计算机协会归属于学术科技类型，为我校优秀的综合性计算机社团。自成立以来，协会坚持服务师生，技术输出和人才培养，引导丰富、活跃学生的课余文化生活。十余年风雨兼程，IT讲座、内部培训、竞技比赛、电脑维修等活动薪火相传。协会曾获得A类社团，并在2019年百余个社团考核中排名第二，荣获‘十佳社团’等殊荣。</h3>
        </div>
        <div class="register" style="display: none">
            <a href="${pageContext.request.contextPath}/form/toRegistrant.do">点我报名</a>
        </div>
    </div>

    <div id="second-box" class="box">
        <div class="logo">
            <img src="${pageContext.request.contextPath}/img/logo-Part.png"/>
        </div>

        <div class="first-line">
            <h1>秘书处</h1>
        </div>
        <div class="second-line">
            <h2>—追求永无止境</h2>
        </div>

        <div class="third-line">
            <h3>听说秘书处可以每天见会长？来秘书处偶遇会长吧！小伙伴们，如果你擅长写作，这里是你展示才华的舞台；如果你乐于规划整理，这里是你挥洒汗水的乐园。我们会组织与其他部门的联谊，培训ppt,word,excel等各种办公软件，让你轻轻松松‘身怀绝技’！</h3>
        </div>
        <div class="register" style="display: none">
            <a href="${pageContext.request.contextPath}/form/toRegistrant.do">点我报名</a>
        </div>
    </div>

    <div id="thrid-box" class="box">
        <div class="logo">
            <img src="${pageContext.request.contextPath}/img/logo-Part.png"/>
        </div>

        <div class="first-line">
            <h1>新媒体</h1>
        </div>
        <div class="second-line">
            <h2>—追求永无止境</h2>
        </div>

        <div class="third-line">
            <h3>我是新媒体的人，可以多给我几个镜头吗? <br>哼，我们部门都是凭颜值说话的! （开个玩笑） 这里是新媒体，也是小计的大本营，一个活动的成功，我们功不可没。 用镜头记录美好，以文字宣传精彩，挥洒才艺，激扬文字，醉心创作，快加入我们，一起‘茄子’吧！</h3>
        </div>
        <div class="register" style="display: none">
            <a href="${pageContext.request.contextPath}/form/toRegistrant.do">点我报名</a>
        </div>
    </div>

    <div id="fourth-box" class="box">
        <div class="logo">
            <img src="${pageContext.request.contextPath}/img/logo-Part.png"/>
        </div>

        <div class="first-line">
            <h1>外联部</h1>
        </div>
        <div class="second-line">
            <h2>—追求永无止境</h2>
        </div>

        <div class="third-line">
            <h3>小计小计，外联部能帮我搞钱吗？<br>我们坚持合法搞钱！ 报名外联部，你可以与商家交流为社团活动拉取赞助，为协会提供资金支持；也可以与计算机大佬交流学习，是锻炼交际能力和语言表达能力的绝佳平台。服务协会，搭建桥梁，外联部门带你感受谈吐的魅力！</h3>
        </div>
        <div class="register" style="display: none">
            <a href="${pageContext.request.contextPath}/form/toRegistrant.do">点我报名</a>
        </div>
    </div>

    <div id="fifth-box" class="box">
        <div class="logo">
            <img src="${pageContext.request.contextPath}/img/logo-Part.png"/>
        </div>

        <div class="first-line">
            <h1>视觉设计部</h1>
        </div>
        <div class="second-line">
            <h2>—追求永无止境</h2>
        </div>

        <div class="third-line">
            <h3>想要视觉设计带我P照片？<br>当然可以！除此之外，你还在为刚买的电脑不知道干什么而迷茫吗?快来加入视觉设计部门吧。学习简单又实用的Pr，Ps 小技巧，作出漂亮的图片和流畅的小视频，让你的大学生活更加闪亮 ！</h3>
        </div>
        <div class="register" style="display: none">
            <a href="${pageContext.request.contextPath}/form/toRegistrant.do">点我报名</a>
        </div>
    </div>


    <div id="sixth-box" class="box">
        <div class="logo">
            <img src="${pageContext.request.contextPath}/img/logo-Part.png"/>
        </div>

        <div class="first-line">
            <h1>维修部</h1>
        </div>
        <div class="second-line">
            <h2>—追求永无止境</h2>
        </div>

        <div class="third-line">
            <h3>学长学姐，在维修部拆电脑是不是很爽？<br>那当然！从GTX 到RTX,我们体验画质的变革，从I3到I9，我们领略速度的极限，从Athlon到Ryzen,我们见证时代的更迭。没有基础不要紧，有学长和学姐保驾护航，愿你乘风破浪，行走千里与我们相会！</h3>
        </div>
        <div class="register" style="display: none">
            <a href="${pageContext.request.contextPath}/form/toRegistrant.do">点我报名</a>
        </div>
    </div>


    <div id="seventh-box" class="box">
        <div class="logo">
            <img src="${pageContext.request.contextPath}/img/logo-Part.png"/>
        </div>

        <div class="first-line">
            <h1>编程开发部</h1>
        </div>
        <div class="second-line">
            <h2>—追求永无止境</h2>
        </div>

        <div class="third-line">
            <h3>编程开发?我什么时候可以奔赴赛场 ！
                来一场说走就走的旅行…… 年轻人你渴望力量吗？<br>从萌新到大佬的升仙之路即可启程，专业团队加持神奇技术。我们的服务宗旨是给每个喜欢编程的同学一个进步的平台，分享经验，共同学习。</h3>
        </div>
        <div class="register" style="display: none">
            <a href="${pageContext.request.contextPath}/form/toRegistrant.do">点我报名</a>
        </div>
    </div>

    <div id="eighth-box" class="box">
        <div class="logo">
            <img src="${pageContext.request.contextPath}/img/logo-Part.png"/>
        </div>

        <div class="first-line">
            <h1>电竞部</h1>
        </div>
        <div class="second-line">
            <h2>—追求永无止境</h2>
        </div>

        <div class="third-line">
            <h3>我又菜又爱玩儿，电竞部还要人吗？
                要!浴血作战，奋斗不止。无快乐，不电竞，为梦想，战起来！<br>如果你也热爱电子竞技，那么这里有属于你的荣耀。在这里，体验比赛的乐趣，收获竞技之精神，我们在梦想的原点，等你战出新的高度！</h3>
        </div>

    </div>

    <div id="night-box" class="box">

        <div id="echarts">
            <div id="echart-one"></div>
            <div id="echart-two"></div>
        </div>

        <a class="register" href="${pageContext.request.contextPath}/form/toRegistrant.do">点我报名</a>


        <div style="margin: 0 auto;width: 200px;position: relative;top: 42%">
            <span style="font-size: 10px;font-weight: 700;color: #3c3c3c">&copy;fuswx.cn</span>
            <a href="http://beian.miit.gov.cn/" style="color: rgba(0,0,0,0.6);text-decoration: none;font-size: 10px;font-weight: 700;">豫ICP备2021026784号</a>
        </div>


    </div>


</div>

</body>

<%--<script type="text/javascript">--%>
<%--    var echart1;--%>
<%--    var echart2;--%>

<%--    setInterval(function (){--%>
<%--        $.post("${pageContext.request.contextPath}/form/findApartPeopleNum.do",{formId:"${97}"},function (peopleNum){--%>
<%--            for (var x in peopleNum.get("第一志愿")) {--%>
<%--                echart1.pop(x)--%>
<%--            }--%>
<%--            for (var y in peopleNum.get("第二志愿")) {--%>
<%--                echart2.pop(y)--%>
<%--            }--%>
<%--        })--%>

<%--        //初始化echarts实例--%>
<%--        var echartOne=echarts.init(document.getElementById("echart-one"));--%>
<%--        var echartTwo=echarts.init(document.getElementById("echart-two"));--%>
<%--        //指定图表的配置项和数据--%>
<%--        var option1={--%>
<%--            title: {--%>
<%--                text:'第一志愿',--%>
<%--                textStyle:{--%>
<%--                    fontFamily:"华文中宋,宋体",--%>
<%--                    fontSize:"20px",--%>
<%--                    color: "#3c3c3c"--%>
<%--                }--%>
<%--            },--%>
<%--            tooltip:{},--%>
<%--            legend:{--%>
<%--                data:['报名人数分布'],--%>
<%--                textStyle:{--%>
<%--                    fontFamily:"华文中宋,宋体",--%>
<%--                    fontWeight:"600",--%>
<%--                    color: "#3c3c3c"--%>
<%--                }--%>
<%--            },--%>
<%--            xAxis:{--%>
<%--                data: ['编程开发部', '信息安全部', '维修部', '电竞部', '秘书处', '外联部','新媒体中心','视觉设计中心'],--%>
<%--                textStyle:{--%>
<%--                    fontFamily:"华文中宋,宋体",--%>
<%--                    fontSize:"20px",--%>
<%--                    color: "#3c3c3c"--%>
<%--                }--%>
<%--            },--%>
<%--            yAxis:{},--%>
<%--            series:[--%>
<%--                {--%>
<%--                    name:'报名人数分布',--%>
<%--                    type:'bar',--%>
<%--                    data:[a1,a2,a3,a4,a5,a6]--%>
<%--                }--%>
<%--            ],--%>
<%--            color:"cornflowerblue",--%>
<%--        };--%>
<%--        var option2={--%>
<%--            title: {--%>
<%--                text:'第二志愿'--%>
<%--            },--%>
<%--            tooltip:{},--%>
<%--            legend:{--%>
<%--                data:['报名人数分布']--%>
<%--            },--%>
<%--            xAxis:{--%>
<%--                data: ['衬衫', '羊毛衫', '雪纺衫', '裤子', '高跟鞋', '袜子']--%>
<%--            },--%>
<%--            yAxis:{},--%>
<%--            series:[--%>
<%--                {--%>
<%--                    name:'报名人数分布',--%>
<%--                    type:'bar',--%>
<%--                    data:[a1,a2,a3,a4,a5,a6]--%>
<%--                }--%>
<%--            ]--%>
<%--        };--%>
<%--        //使用刚指定的配置项和数据项显示图表--%>
<%--        echartOne.setOption(option1)--%>
<%--        echartTwo.setOption(option2)--%>
<%--    },200)--%>
<%--</script>--%>

</html>
