/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-10-28 06:55:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <title>计协首页</title>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/logo.ico\">\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/logo.ico\">\r\n");
      out.write("    <link rel=\"bookmark\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/logo.ico\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/index.css\">\r\n");
      out.write("\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery.mousewheel.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/index.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/echarts.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"see-window\">\r\n");
      out.write("\r\n");
      out.write("    <div id=\"first-box\" class=\"box\">\r\n");
      out.write("        <div class=\"logo\">\r\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/logo-Part.png\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"first-line\">\r\n");
      out.write("            <h1>计算机协会</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"second-line\">\r\n");
      out.write("            <h2>—追求永无止境</h2>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"third-line\">\r\n");
      out.write("            <h3>大学生计算机协会归属于学术科技类型，为我校优秀的综合性计算机社团。自成立以来，协会坚持服务师生，技术输出和人才培养，引导丰富、活跃学生的课余文化生活。十余年风雨兼程，IT讲座、内部培训、竞技比赛、电脑维修等活动薪火相传。协会曾获得A类社团，并在2019年百余个社团考核中排名第二，荣获‘十佳社团’等殊荣。</h3>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"register\" style=\"display: none\">\r\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/form/toRegistrant.do\">点我报名</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"second-box\" class=\"box\">\r\n");
      out.write("        <div class=\"logo\">\r\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/logo-Part.png\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"first-line\">\r\n");
      out.write("            <h1>秘书处</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"second-line\">\r\n");
      out.write("            <h2>—追求永无止境</h2>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"third-line\">\r\n");
      out.write("            <h3>听说秘书处可以每天见会长？来秘书处偶遇会长吧！小伙伴们，如果你擅长写作，这里是你展示才华的舞台；如果你乐于规划整理，这里是你挥洒汗水的乐园。我们会组织与其他部门的联谊，培训ppt,word,excel等各种办公软件，让你轻轻松松‘身怀绝技’！</h3>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"register\" style=\"display: none\">\r\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/form/toRegistrant.do\">点我报名</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"thrid-box\" class=\"box\">\r\n");
      out.write("        <div class=\"logo\">\r\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/logo-Part.png\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"first-line\">\r\n");
      out.write("            <h1>新媒体</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"second-line\">\r\n");
      out.write("            <h2>—追求永无止境</h2>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"third-line\">\r\n");
      out.write("            <h3>我是新媒体的人，可以多给我几个镜头吗? <br>哼，我们部门都是凭颜值说话的! （开个玩笑） 这里是新媒体，也是小计的大本营，一个活动的成功，我们功不可没。 用镜头记录美好，以文字宣传精彩，挥洒才艺，激扬文字，醉心创作，快加入我们，一起‘茄子’吧！</h3>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"register\" style=\"display: none\">\r\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/form/toRegistrant.do\">点我报名</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"fourth-box\" class=\"box\">\r\n");
      out.write("        <div class=\"logo\">\r\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/logo-Part.png\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"first-line\">\r\n");
      out.write("            <h1>外联部</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"second-line\">\r\n");
      out.write("            <h2>—追求永无止境</h2>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"third-line\">\r\n");
      out.write("            <h3>小计小计，外联部能帮我搞钱吗？<br>我们坚持合法搞钱！ 报名外联部，你可以与商家交流为社团活动拉取赞助，为协会提供资金支持；也可以与计算机大佬交流学习，是锻炼交际能力和语言表达能力的绝佳平台。服务协会，搭建桥梁，外联部门带你感受谈吐的魅力！</h3>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"register\" style=\"display: none\">\r\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/form/toRegistrant.do\">点我报名</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"fifth-box\" class=\"box\">\r\n");
      out.write("        <div class=\"logo\">\r\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/logo-Part.png\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"first-line\">\r\n");
      out.write("            <h1>视觉设计部</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"second-line\">\r\n");
      out.write("            <h2>—追求永无止境</h2>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"third-line\">\r\n");
      out.write("            <h3>想要视觉设计带我P照片？<br>当然可以！除此之外，你还在为刚买的电脑不知道干什么而迷茫吗?快来加入视觉设计部门吧。学习简单又实用的Pr，Ps 小技巧，作出漂亮的图片和流畅的小视频，让你的大学生活更加闪亮 ！</h3>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"register\" style=\"display: none\">\r\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/form/toRegistrant.do\">点我报名</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div id=\"sixth-box\" class=\"box\">\r\n");
      out.write("        <div class=\"logo\">\r\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/logo-Part.png\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"first-line\">\r\n");
      out.write("            <h1>维修部</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"second-line\">\r\n");
      out.write("            <h2>—追求永无止境</h2>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"third-line\">\r\n");
      out.write("            <h3>学长学姐，在维修部拆电脑是不是很爽？<br>那当然！从GTX 到RTX,我们体验画质的变革，从I3到I9，我们领略速度的极限，从Athlon到Ryzen,我们见证时代的更迭。没有基础不要紧，有学长和学姐保驾护航，愿你乘风破浪，行走千里与我们相会！</h3>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"register\" style=\"display: none\">\r\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/form/toRegistrant.do\">点我报名</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div id=\"seventh-box\" class=\"box\">\r\n");
      out.write("        <div class=\"logo\">\r\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/logo-Part.png\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"first-line\">\r\n");
      out.write("            <h1>编程开发部</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"second-line\">\r\n");
      out.write("            <h2>—追求永无止境</h2>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"third-line\">\r\n");
      out.write("            <h3>编程开发?我什么时候可以奔赴赛场 ！\r\n");
      out.write("                来一场说走就走的旅行…… 年轻人你渴望力量吗？<br>从萌新到大佬的升仙之路即可启程，专业团队加持神奇技术。我们的服务宗旨是给每个喜欢编程的同学一个进步的平台，分享经验，共同学习。</h3>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"register\" style=\"display: none\">\r\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/form/toRegistrant.do\">点我报名</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"eighth-box\" class=\"box\">\r\n");
      out.write("        <div class=\"logo\">\r\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/logo-Part.png\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"first-line\">\r\n");
      out.write("            <h1>电竞部</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"second-line\">\r\n");
      out.write("            <h2>—追求永无止境</h2>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"third-line\">\r\n");
      out.write("            <h3>我又菜又爱玩儿，电竞部还要人吗？\r\n");
      out.write("                要!浴血作战，奋斗不止。无快乐，不电竞，为梦想，战起来！<br>如果你也热爱电子竞技，那么这里有属于你的荣耀。在这里，体验比赛的乐趣，收获竞技之精神，我们在梦想的原点，等你战出新的高度！</h3>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"night-box\" class=\"box\">\r\n");
      out.write("\r\n");
      out.write("        <div id=\"echarts\">\r\n");
      out.write("            <div id=\"echart-one\"></div>\r\n");
      out.write("            <div id=\"echart-two\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <a class=\"register\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/form/toRegistrant.do\">点我报名</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div style=\"margin: 0 auto;width: 200px;position: relative;top: 42%\">\r\n");
      out.write("            <span style=\"font-size: 10px;font-weight: 700;color: #3c3c3c\">&copy;fuswx.cn</span>\r\n");
      out.write("            <a href=\"http://beian.miit.gov.cn/\" style=\"color: rgba(0,0,0,0.6);text-decoration: none;font-size: 10px;font-weight: 700;\">豫ICP备2021026784号</a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    var a1=5,a2=20,a3=36,a4=10,a5=10,a6=20\r\n");
      out.write("\r\n");
      out.write("    setInterval(function (){\r\n");
      out.write("        a1++\r\n");
      out.write("        a2++\r\n");
      out.write("        a3++\r\n");
      out.write("        a4++\r\n");
      out.write("        a5++\r\n");
      out.write("        a6++\r\n");
      out.write("        console.log(a1)\r\n");
      out.write("\r\n");
      out.write("        //初始化echarts实例\r\n");
      out.write("        var echartOne=echarts.init(document.getElementById(\"echart-one\"));\r\n");
      out.write("        var echartTwo=echarts.init(document.getElementById(\"echart-two\"));\r\n");
      out.write("        //指定图表的配置项和数据\r\n");
      out.write("        var option1={\r\n");
      out.write("            title: {\r\n");
      out.write("                text:'第一志愿',\r\n");
      out.write("                textStyle:{\r\n");
      out.write("                    fontFamily:\"华文中宋,宋体\",\r\n");
      out.write("                    fontSize:\"20px\",\r\n");
      out.write("                    color: \"#3c3c3c\"\r\n");
      out.write("                }\r\n");
      out.write("            },\r\n");
      out.write("            tooltip:{},\r\n");
      out.write("            legend:{\r\n");
      out.write("                data:['报名人数分布'],\r\n");
      out.write("                textStyle:{\r\n");
      out.write("                    fontFamily:\"华文中宋,宋体\",\r\n");
      out.write("                    fontWeight:\"600\",\r\n");
      out.write("                    color: \"#3c3c3c\"\r\n");
      out.write("                }\r\n");
      out.write("            },\r\n");
      out.write("            xAxis:{\r\n");
      out.write("                data: ['编程开发部', '信息安全部', '维修部', '电竞部', '秘书处', '外联部','新媒体中心','视觉设计中心'],\r\n");
      out.write("                textStyle:{\r\n");
      out.write("                    fontFamily:\"华文中宋,宋体\",\r\n");
      out.write("                    fontSize:\"20px\",\r\n");
      out.write("                    color: \"#3c3c3c\"\r\n");
      out.write("                }\r\n");
      out.write("            },\r\n");
      out.write("            yAxis:{},\r\n");
      out.write("            series:[\r\n");
      out.write("                {\r\n");
      out.write("                    name:'报名人数分布',\r\n");
      out.write("                    type:'bar',\r\n");
      out.write("                    data:[a1,a2,a3,a4,a5,a6]\r\n");
      out.write("                }\r\n");
      out.write("            ],\r\n");
      out.write("            color:\"cornflowerblue\",\r\n");
      out.write("        };\r\n");
      out.write("        var option2={\r\n");
      out.write("            title: {\r\n");
      out.write("                text:'第二志愿'\r\n");
      out.write("            },\r\n");
      out.write("            tooltip:{},\r\n");
      out.write("            legend:{\r\n");
      out.write("                data:['报名人数分布']\r\n");
      out.write("            },\r\n");
      out.write("            xAxis:{\r\n");
      out.write("                data: ['衬衫', '羊毛衫', '雪纺衫', '裤子', '高跟鞋', '袜子']\r\n");
      out.write("            },\r\n");
      out.write("            yAxis:{},\r\n");
      out.write("            series:[\r\n");
      out.write("                {\r\n");
      out.write("                    name:'报名人数分布',\r\n");
      out.write("                    type:'bar',\r\n");
      out.write("                    data:[a1,a2,a3,a4,a5,a6]\r\n");
      out.write("                }\r\n");
      out.write("            ]\r\n");
      out.write("        };\r\n");
      out.write("        //使用刚指定的配置项和数据项显示图表\r\n");
      out.write("        echartOne.setOption(option1)\r\n");
      out.write("        echartTwo.setOption(option2)\r\n");
      out.write("    },200)\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
