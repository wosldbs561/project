/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.43
 * Generated at: 2023-06-09 07:18:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(7);
    _jspx_dependants.put("/WEB-INF/views/include/config.jsp", Long.valueOf(1683533443000L));
    _jspx_dependants.put("/WEB-INF/views/include/footer.jsp", Long.valueOf(1686294993592L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1527726294253L));
    _jspx_dependants.put("jar:file:/C:/JaeYun/work-space/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/mall/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/views/include/header.jsp", Long.valueOf(1686213821043L));
    _jspx_dependants.put("jar:file:/C:/JaeYun/work-space/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/mall/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/views/include/categoryMenu.jsp", Long.valueOf(1685792859373L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"Mark Otto, Jacob Thornton, and Bootstrap contributors\">\r\n");
      out.write("    <meta name=\"generator\" content=\"Hugo 0.101.0\">\r\n");
      out.write("    <title>Pricing example · Bootstrap v4.6</title>\r\n");
      out.write("\t <!-- slick 스와이퍼  -->\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css\"/>\r\n");
      out.write("    <link rel=\"canonical\" href=\"https://getbootstrap.com/docs/4.6/examples/pricing/\">\r\n");
      out.write("\t\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("<!-- jQuery library -->\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Popper JS -->\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled JavaScript -->\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script> \r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap core CSS -->\r\n");
      out.write("<link href=\"https://getbootstrap.com/docs/4.6/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N\" crossorigin=\"anonymous\">\r\n");
      out.write("<!-- Custom styles for this template -->\r\n");
      out.write("<link href=\"https://getbootstrap.com/docs/4.6/examples/pricing/pricing.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Favicons \r\n");
      out.write("<link rel=\"apple-touch-icon\" href=\"/docs/4.6/assets/img/favicons/apple-touch-icon.png\" sizes=\"180x180\">\r\n");
      out.write("<link rel=\"icon\" href=\"/docs/4.6/assets/img/favicons/favicon-32x32.png\" sizes=\"32x32\" type=\"image/png\">\r\n");
      out.write("<link rel=\"icon\" href=\"/docs/4.6/assets/img/favicons/favicon-16x16.png\" sizes=\"16x16\" type=\"image/png\">\r\n");
      out.write("<link rel=\"manifest\" href=\"/docs/4.6/assets/img/favicons/manifest.json\">\r\n");
      out.write("<link rel=\"mask-icon\" href=\"/docs/4.6/assets/img/favicons/safari-pinned-tab.svg\" color=\"#563d7c\">\r\n");
      out.write("<link rel=\"icon\" href=\"/docs/4.6/assets/img/favicons/favicon.ico\">\r\n");
      out.write("<meta name=\"msapplication-config\" content=\"/docs/4.6/assets/img/favicons/browserconfig.xml\">\r\n");
      out.write("-->\r\n");
      out.write("<meta name=\"theme-color\" content=\"#563d7c\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css\"/>\r\n");
      out.write("\t<!-- CSS only -->\r\n");
      out.write("\t<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\r\n");
      out.write("<!--\t<link href=\"/docs/4.6/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N\" crossorigin=\"anonymous\">  -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\r\n");
      out.write("    \r\n");
      out.write("    <style>\r\n");
      out.write("    \t@import url('https://fonts.googleapis.com/css2?family=Nanum+Myeongjo&display=swap');}\r\n");
      out.write("    \t<!--Noto Serif Korean -->\r\n");
      out.write("    \t@import url('https://fonts.googleapis.com/css2?family=Nanum+Myeongjo&family=Noto+Serif+KR:wght@300;400;500&display=swap');\r\n");
      out.write("    \t@import url('https://fonts.googleapis.com/css2?family=Nanum+Myeongjo&family=Noto+Serif+KR:wght@500&display=swap');\r\n");
      out.write("    \t\t\t\r\n");
      out.write("\t\t.bd-placeholder-img {\r\n");
      out.write("\t\t  font-size: 1.125rem;\r\n");
      out.write("\t\t  text-anchor: middle;\r\n");
      out.write("\t\t  -webkit-user-select: none;\r\n");
      out.write("\t\t  -moz-user-select: none;\r\n");
      out.write("\t\t  -ms-user-select: none;\r\n");
      out.write("\t\t  user-select: none;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t@media (min-width: 768px) {\r\n");
      out.write("\t\t  .bd-placeholder-img-lg {\r\n");
      out.write("\t\t    font-size: 3.5rem;\r\n");
      out.write("\t\t  }\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t.swiper-container {\r\n");
      out.write("\t\t\tmargin-left: 5%;\r\n");
      out.write("\t\t\tmargin-right: 5%;\r\n");
      out.write("\t\t}\r\n");
      out.write("      \r\n");
      out.write("      \tbody {\r\n");
      out.write("      \t\tfont-family: 'Nanum Myeongjo', serif;\r\n");
      out.write("      \r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("\t\t    \r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("\t<script type=\"text/javascript\" src=\"//code.jquery.com/jquery-1.11.0.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\r\n");
      out.write("\t   $(document).ready(function() {\r\n");
      out.write("\t\t   \r\n");
      out.write("\t\t   $('.swiper-container').slick({\r\n");
      out.write("\t\t   \t  \tprevArrow: $('.prev'),\r\n");
      out.write("\t\t      \tnextArrow: $('.next'),\r\n");
      out.write("\t\t   \t\tslidesToShow: 1,\r\n");
      out.write("\t\t   \t  \tslidesToScroll: 3,\r\n");
      out.write("\t\t   \t    autoplay: true,\r\n");
      out.write("\t\t   \t    autoplaySpeed: 3000,\r\n");
      out.write("\t\t   \t \tfade: true,\r\n");
      out.write("\t\t   \t    responsive: [\r\n");
      out.write("\t\t   \t    {\r\n");
      out.write("\t\t   \t      breakpoint: 4000,\r\n");
      out.write("\t\t   \t      settings: {\r\n");
      out.write("\t\t   \t        slidesToShow: 2,\r\n");
      out.write("\t\t   \t        slidesToScroll: 2,\r\n");
      out.write("\t\t   \t     \tinfinite: true,\r\n");
      out.write("\t\t         \tdots: true\r\n");
      out.write("\t\t   \t      }\r\n");
      out.write("\t\t   \t    },\r\n");
      out.write("\t\t   \t    {\r\n");
      out.write("\t\t   \t      breakpoint: 2000,\r\n");
      out.write("\t\t   \t      settings: {\r\n");
      out.write("\t\t   \t        slidesToShow: 1,\r\n");
      out.write("\t\t   \t        slidesToScroll: 1,\r\n");
      out.write("\t\t   \t      }\r\n");
      out.write("\t\t   \t    }\r\n");
      out.write("\t\t   \t    // You can unslick at a given breakpoint now by adding:\r\n");
      out.write("\t\t   \t    // settings: \"unslick\"\r\n");
      out.write("\t\t   \t    // instead of a settings object\r\n");
      out.write("\t\t   \t  ]\r\n");
      out.write("\t\t   \t});   \r\n");
      out.write("\t   });\r\n");
      out.write("   \t\r\n");
      out.write("   \t \r\n");
      out.write("   </script>  \r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"swiper-slide pop2 show\" data-time-start=\"2023/02/27 00:00:00\" data-time-end=\"2025/03/01 23:59:59\" style=\"background: #000000; text-align: center; text-decoration: none;\"><a href=\"/member/join\"><span style=\"color: #ffffff;\">신규회원 무료배송</span></a></div>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\t@import url('https://fonts.googleapis.com/css2?family=Noto+Serif+KR:wght@200;500;600;700&display=swap');\r\n");
      out.write("\t\n");
      out.write("\t.d-flex {\r\n");
      out.write("\t\tfont-family: 'Noto Serif KR', serif;\r\n");
      out.write("\t\tfont-weight: 200;\r\n");
      out.write("\t}\t\r\n");
      out.write("\t\r\n");
      out.write("\ta.my-0 {\r\n");
      out.write("\t\tfont-weight: 700;\r\n");
      out.write("\t\tfont-size: 1.5em;\r\n");
      out.write("\t\ttext-decoration: none;\r\n");
      out.write("\t}\r\n");
      out.write("\ta {\r\n");
      out.write("\t\ttext-decoration: none;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tspan {\r\n");
      out.write("\t\tmargin: 10px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tnav {\r\n");
      out.write("\t\tmargin-left: 20px;\r\n");
      out.write("\t}\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom shadow-sm\">\r\n");
      out.write("  <a class=\"my-0 mr-md-auto font-weight-normal text-dark\" href=\"/\">FromHearts</a>\r\n");
      out.write("  ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("  <nav class=\"my-2 my-md-0 mr-md-3\">\r\n");
      out.write("    <!-- 로그인 이전 표시 -->\r\n");
      out.write("    ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    <!--  로그인 이후 표시 -->\r\n");
      out.write("    ");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <a class=\"p-2 text-dark\" href=\"/member/mypage\">Mypage</a>\r\n");
      out.write("    <a class=\"p-2 text-dark\" href=\"/order/order_info\">Order</a>\r\n");
      out.write("    <a class=\"p-2 text-dark\" href=\"/cart/cart_list\">Cart</a>\r\n");
      out.write("  </nav>\r\n");
      out.write("</div>");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("a {\r\n");
      out.write("\ttext-decoration : none; \r\n");
      out.write("\tcolor: khaki !important;\t\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<div id=\"categoryMenu\">\r\n");
      out.write("  <ul class=\"nav justify-content-center\" id=\"mainCategory\">\r\n");
      out.write("    ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("  </ul>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("  // 1차 카테고리 클릭\r\n");
      out.write("  $(\"ul.nav li.nav-item a\").on(\"mouseover\", function(e) {\r\n");
      out.write("    e.preventDefault();\r\n");
      out.write("\r\n");
      out.write("    //console.log(\"1차카테고리 선택\");\r\n");
      out.write("    let selectdCategory = $(this);\r\n");
      out.write("    let cat_code = $(this).attr(\"href\");\r\n");
      out.write("    //let cat_name = \"<b>\" + $(this).html() + \"</b>\";\r\n");
      out.write("    let url = \"/product/subCategory/\" + cat_code;\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    $.getJSON(url, function(subCategory) {\r\n");
      out.write("      console.log(\"test\");\r\n");
      out.write("\r\n");
      out.write("      let subCategoryStr = '<ul class=\"nav justify-content-center\" id=\"subCategory\">';\r\n");
      out.write("      for(let i=0; i<subCategory.length; i++) {\r\n");
      out.write("        subCategoryStr += '<li class=\"nav-item\">';\r\n");
      out.write("        subCategoryStr +=  '<a class=\"nav-link\" href=\"' + subCategory[i].cat_code  + '\">' + subCategory[i].cat_name + '</a>';\r\n");
      out.write("        subCategoryStr +=  '</li>';\r\n");
      out.write("      }\r\n");
      out.write("      subCategoryStr += '</ul>';\r\n");
      out.write("\r\n");
      out.write("      //console.log(subCategoryStr);\r\n");
      out.write("      selectdCategory.parent().parent().next().remove();\r\n");
      out.write("      selectdCategory.parent().parent().after(subCategoryStr);\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    // 2차 카테고리 선택\r\n");
      out.write("    $(\"div#categoryMenu\").on(\"click\", \"ul#subCategory li.nav-item a\", function(e) {\r\n");
      out.write("      e.preventDefault();\r\n");
      out.write("\r\n");
      out.write("      //console.log(\"2차 카테고리 선택\");\r\n");
      out.write("\r\n");
      out.write("      let url = \"/product/pro_list/\" + $(this).attr(\"href\") + \"/\" + $(this).html();\r\n");
      out.write("      location.href = url;\r\n");
      out.write("    });\r\n");
      out.write("  });\r\n");
      out.write("\r\n");
      out.write("</script>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"pricing-header px-3 py-3 pt-md-5 pb-md-4 mx-auto text-center\">\r\n");
      out.write("\t  <h1 class=\"display-4\">FROM HEARTS</h1>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"swiper-container\">\r\n");
      out.write("\t    <div><img style=\"width: 100%; height: 600px\" src=\"/resources/img/forment.jpg\"></div>\r\n");
      out.write("\t    <div><img style=\"width: 100%; height: 600px\" src=\"/resources/img/nature1.jpg\"></div>\r\n");
      out.write("\t    <div><img style=\"width: 100%; height: 600px\" src=\"/resources/img/nature2.jpg\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<footer class=\"pt-4 my-md-5 pt-md-5 border-top\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      <div class=\"col-12 col-md\">\r\n");
      out.write("        <!-- \r\n");
      out.write("        <img class=\"mb-2\" src=\"/docs/4.6/assets/brand/bootstrap-solid.svg\" alt=\"\" width=\"24\" height=\"24\">\r\n");
      out.write("         -->\r\n");
      out.write("        <small class=\"d-block mb-3 text-muted\">© 2023-2023</small>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-6 col-md\">\r\n");
      out.write("        <h5>Features</h5>\r\n");
      out.write("        <ul class=\"list-unstyled text-small\">\r\n");
      out.write("          <li><a class=\"text-muted\" href=\"#\">Cool stuff</a></li>\r\n");
      out.write("          <li><a class=\"text-muted\" href=\"#\">Random feature</a></li>\r\n");
      out.write("          <li><a class=\"text-muted\" href=\"#\">Team feature</a></li>\r\n");
      out.write("          <li><a class=\"text-muted\" href=\"#\">Stuff for developers</a></li>\r\n");
      out.write("          <li><a class=\"text-muted\" href=\"#\">Another one</a></li>\r\n");
      out.write("          <li><a class=\"text-muted\" href=\"#\">Last time</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-6 col-md\">\r\n");
      out.write("        <h5>Resources</h5>\r\n");
      out.write("        <ul class=\"list-unstyled text-small\">\r\n");
      out.write("          <li><a class=\"text-muted\" href=\"#\">Resource</a></li>\r\n");
      out.write("          <li><a class=\"text-muted\" href=\"#\">Resource name</a></li>\r\n");
      out.write("          <li><a class=\"text-muted\" href=\"#\">Another resource</a></li>\r\n");
      out.write("          <li><a class=\"text-muted\" href=\"#\">Final resource</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-6 col-md\">\r\n");
      out.write("        <h5>About</h5>\r\n");
      out.write("        <ul class=\"list-unstyled text-small\">\r\n");
      out.write("          <li><a class=\"text-muted\" href=\"#\">Team</a></li>\r\n");
      out.write("          <li><a class=\"text-muted\" href=\"#\">Locations</a></li>\r\n");
      out.write("          <li><a class=\"text-muted\" href=\"#\">Privacy</a></li>\r\n");
      out.write("          <li><a class=\"text-muted\" href=\"#\">Terms</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </footer>");
      out.write("  \r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/include/header.jsp(37,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginStatus != null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("  <span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginStatus.mbsp_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write(" 님</span> /\r\n");
          out.write("  <span>포인트 : ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginStatus.mbsp_point}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write(" </span> /\r\n");
          out.write("  <span>최근접속 : \r\n");
          out.write("  \t");
          if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("   </span>\r\n");
          out.write("  ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    boolean _jspx_th_fmt_005fformatDate_005f0_reused = false;
    try {
      _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fformatDate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
      // /WEB-INF/views/include/header.jsp(41,3) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginStatus.mbsp_lastlogin}", java.util.Date.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /WEB-INF/views/include/header.jsp(41,3) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f0.setPattern("yyyy-MM-dd HH:mm");
      int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
      if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      _jspx_th_fmt_005fformatDate_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fformatDate_005f0, _jsp_getInstanceManager(), _jspx_th_fmt_005fformatDate_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /WEB-INF/views/include/header.jsp(46,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginStatus == null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    <a class=\"p-2 text-dark\" href=\"/member/login\">Login</a>\r\n");
          out.write("    <a class=\"p-2 text-dark\" href=\"/member/join\">Join</a>\r\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f2_reused = false;
    try {
      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f2.setParent(null);
      // /WEB-INF/views/include/header.jsp(51,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginStatus != null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    <a class=\"p-2 text-dark\" href=\"/member/logout\">Logout</a>\r\n");
          out.write("    <a class=\"p-2 text-dark\" href=\"/member/modify\">Modify</a>\r\n");
          out.write("     ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      _jspx_th_c_005fif_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/include/categoryMenu.jsp(14,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/include/categoryMenu.jsp(14,4) '${cateList }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${cateList }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/views/include/categoryMenu.jsp(14,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("categoryVO");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("      <li class=\"nav-item\">\r\n");
            out.write("        <a class=\"nav-link\" href=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${categoryVO.cat_code }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('"');
            out.write('>');
            if (_jspx_meth_c_005fout_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("</a>\r\n");
            out.write("      </li>\r\n");
            out.write("    ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f0_reused = false;
    try {
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /WEB-INF/views/include/categoryMenu.jsp(16,59) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${categoryVO.cat_name }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
      if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      _jspx_th_c_005fout_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f0_reused);
    }
    return false;
  }
}