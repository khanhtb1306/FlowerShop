package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_forEach_var_end_begin.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \n");
      out.write("        <script> defer src = \"https://use.fontawesome.com/releases/v5.0.6/js/all.js\" ></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- header section starts  -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <!-- header section ends -->\n");
      out.write("\n");
      out.write("        <!-- home section starts  -->\n");
      out.write("\n");
      out.write("        <section class=\"home\" id=\"home\">\n");
      out.write("\n");
      out.write("                        <div class=\"content\">\n");
      out.write("                            <h3>fresh flowers</h3>\n");
      out.write("                            <span> natural & beautiful flowers </span>\n");
      out.write("                            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Beatae laborum ut minus corrupti dolorum dolore assumenda iste voluptate dolorem pariatur.</p>\n");
      out.write("                            <a href=\"#\" class=\"btn\">shop now</a>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- home section ends -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <section >\n");
      out.write("\n");
      out.write("        </section>  \n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- prodcuts section starts  -->\n");
      out.write("\n");
      out.write("        <section class=\"products\" id=\"products\">\n");
      out.write("\n");
      out.write("            <h1 class=\"heading\"><span>products</span> </h1>\n");
      out.write("            <form action=\"search\" method=\"post\">\n");
      out.write("                <div  class=\"search-box\">\n");
      out.write("                    <button type=\"submit\" href=\"#produts\" class=\"search-btn\">\n");
      out.write("                        <i class=\"fas fa-search\"></i>\n");
      out.write("                    </button>\n");
      out.write("                    <input oninput=\"searchByName(this)\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${txt$}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"txt\" type=\"text\" class=\"Search-txt\" aria-label=\"Small\"  placeholder=\"Type to search\">\n");
      out.write("                </div> \n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            <div class = \"category\">\n");
      out.write("                <nav class=\"category-list\">\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("                       \n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"box-container\" id=\"content\">\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!--            <div>\n");
      out.write("                            <button onclick=\"loadMore()\" class=\"btn btn-primary\">Load more</button>\n");
      out.write("                        </div>-->\n");
      out.write("        </section>\n");
      out.write("        <!-- prodcuts section ends -->\n");
      out.write("\n");
      out.write("        <div class=\"paging\">\n");
      out.write("            <ul class=\"pagination\">\n");
      out.write("                <li><a href=\"Home?index=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tag-1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&cid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cateID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"prev\">< Prev</a></li>\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                <li><a href=\"Home?index=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tag+1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&cid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cateID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"next\">Next ></a></li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- icons section starts  -->\n");
      out.write("\n");
      out.write("        <section class=\"icons-container\">\n");
      out.write("\n");
      out.write("            <div class=\"icons\">\n");
      out.write("                <img src=\"images/icon-1.png\" alt=\"\">\n");
      out.write("                <div class=\"info\">\n");
      out.write("                    <h3>free delivery</h3>\n");
      out.write("                    <span>on all orders</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"icons\">\n");
      out.write("                <img src=\"images/icon-2.png\" alt=\"\">\n");
      out.write("                <div class=\"info\">\n");
      out.write("                    <h3>10 days returns</h3>\n");
      out.write("                    <span>moneyback guarantee</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"icons\">\n");
      out.write("                <img src=\"images/icon-3.png\" alt=\"\">\n");
      out.write("                <div class=\"info\">\n");
      out.write("                    <h3>offer & gifts</h3>\n");
      out.write("                    <span>on all orders</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"icons\">\n");
      out.write("                <img src=\"images/icon-4.png\" alt=\"\">\n");
      out.write("                <div class=\"info\">\n");
      out.write("                    <h3>secure paymens</h3>\n");
      out.write("                    <span>protected by paypal</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- icons section ends -->\n");
      out.write("\n");
      out.write("        <!-- about section starts  -->\n");
      out.write("\n");
      out.write("        <section class=\"about\" id=\"about\">\n");
      out.write("\n");
      out.write("            <h1 class=\"heading\"> <span> about </span> us </h1>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                <div class=\"video-container\">\n");
      out.write("                    <video src=\"images/about-vid.mp4\" loop autoplay muted></video>\n");
      out.write("                    <h3>best flower sellers</h3>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <h3>why choose us?</h3>\n");
      out.write("                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Rem cumque sit nemo pariatur corporis perspiciatis aspernatur a ullam repudiandae autem asperiores quibusdam omnis commodi alias repellat illum, unde optio temporibus.</p>\n");
      out.write("                    <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Accusantium ea est commodi incidunt magni quia molestias perspiciatis, unde repudiandae quidem.</p>\n");
      out.write("                    <a href=\"#\" class=\"btn\">learn more</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- about section ends -->\n");
      out.write("\n");
      out.write("        <!-- review section starts  -->\n");
      out.write("\n");
      out.write("        <section class=\"review\" id=\"review\">\n");
      out.write("\n");
      out.write("            <h1 class=\"heading\"> customer's <span>review</span> </h1>\n");
      out.write("\n");
      out.write("            <div class=\"box-container\">\n");
      out.write("\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <div class=\"stars\">\n");
      out.write("                        <i class=\"fas fa-star\"></i>\n");
      out.write("                        <i class=\"fas fa-star\"></i>\n");
      out.write("                        <i class=\"fas fa-star\"></i>\n");
      out.write("                        <i class=\"fas fa-star\"></i>\n");
      out.write("                        <i class=\"fas fa-star\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Corrupti asperiores laboriosam praesentium enim maiores? Ad repellat voluptates alias facere repudiandae dolor accusamus enim ut odit, aliquam nesciunt eaque nulla dignissimos.</p>\n");
      out.write("                    <div class=\"user\">\n");
      out.write("                        <img src=\"images/pic-1.png\" alt=\"\">\n");
      out.write("                        <div class=\"user-info\">\n");
      out.write("                            <h3>john deo</h3>\n");
      out.write("                            <span>happy customer</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <span class=\"fas fa-quote-right\"></span>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <div class=\"stars\">\n");
      out.write("                        <i class=\"fas fa-star\"></i>\n");
      out.write("                        <i class=\"fas fa-star\"></i>\n");
      out.write("                        <i class=\"fas fa-star\"></i>\n");
      out.write("                        <i class=\"fas fa-star\"></i>\n");
      out.write("                        <i class=\"fas fa-star\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Corrupti asperiores laboriosam praesentium enim maiores? Ad repellat voluptates alias facere repudiandae dolor accusamus enim ut odit, aliquam nesciunt eaque nulla dignissimos.</p>\n");
      out.write("                    <div class=\"user\">\n");
      out.write("                        <img src=\"images/pic-2.png\" alt=\"\">\n");
      out.write("                        <div class=\"user-info\">\n");
      out.write("                            <h3>john deo</h3>\n");
      out.write("                            <span>happy customer</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <span class=\"fas fa-quote-right\"></span>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <div class=\"stars\">\n");
      out.write("                        <i class=\"fas fa-star\"></i>\n");
      out.write("                        <i class=\"fas fa-star\"></i>\n");
      out.write("                        <i class=\"fas fa-star\"></i>\n");
      out.write("                        <i class=\"fas fa-star\"></i>\n");
      out.write("                        <i class=\"fas fa-star\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Corrupti asperiores laboriosam praesentium enim maiores? Ad repellat voluptates alias facere repudiandae dolor accusamus enim ut odit, aliquam nesciunt eaque nulla dignissimos.</p>\n");
      out.write("                    <div class=\"user\">\n");
      out.write("                        <img src=\"images/pic-3.png\" alt=\"\">\n");
      out.write("                        <div class=\"user-info\">\n");
      out.write("                            <h3>john deo</h3>\n");
      out.write("                            <span>happy customer</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <span class=\"fas fa-quote-right\"></span>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- review section ends -->\n");
      out.write("\n");
      out.write("        <!-- contact section starts  -->\n");
      out.write("\n");
      out.write("        <section class=\"contact\" id=\"contact\">\n");
      out.write("\n");
      out.write("            <h1 class=\"heading\"> <span> contact </span> us </h1>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                <form action=\"\">\n");
      out.write("                    <input type=\"text\" placeholder=\"name\" class=\"box\">\n");
      out.write("                    <input type=\"email\" placeholder=\"email\" class=\"box\">\n");
      out.write("                    <input type=\"number\" placeholder=\"number\" class=\"box\">\n");
      out.write("                    <textarea name=\"\" class=\"box\" placeholder=\"message\" id=\"\" cols=\"30\" rows=\"10\"></textarea>\n");
      out.write("                    <input type=\"submit\" value=\"send message\" class=\"btn\">\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                <div class=\"image\">\n");
      out.write("                    <img src=\"images/contact-img.svg\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- contact section ends -->\n");
      out.write("\n");
      out.write("        <!-- footer section starts  -->\n");
      out.write("\n");
      out.write("        <section class=\"footer\">\n");
      out.write("\n");
      out.write("            <div class=\"box-container\">\n");
      out.write("\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <h3>quick links</h3>\n");
      out.write("                    <a href=\"#\">home</a>\n");
      out.write("                    <a href=\"#\">about</a>\n");
      out.write("                    <a href=\"#\">products</a>\n");
      out.write("                    <a href=\"#\">review</a>\n");
      out.write("                    <a href=\"#\">contact</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <h3>extra links</h3>\n");
      out.write("                    <a href=\"#\">my account</a>\n");
      out.write("                    <a href=\"#\">my order</a>\n");
      out.write("                    <a href=\"#\">my favorite</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <h3>locations</h3>\n");
      out.write("                    <a href=\"#\">india</a>\n");
      out.write("                    <a href=\"#\">USA</a>\n");
      out.write("                    <a href=\"#\">japan</a>\n");
      out.write("                    <a href=\"#\">france</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <h3>contact info</h3>\n");
      out.write("                    <a href=\"#\">+84 898637030</a>\n");
      out.write("                    <a href=\"#\">trinhbaokhanh1306@gmail.com</a>\n");
      out.write("                    <a href=\"#\">ĐH-FPT</a>\n");
      out.write("                    <img src=\"images/payment.png\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"credit\"> created by <span> Trịnh Bảo Khánh</span> | all rights reserved </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- footer section ends -->\n");
      out.write("        <script src=\"http://code.jquery.com/jquery-3.4.1.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('.next').click(function () {\n");
      out.write("                    $('.pagination').find('.pageNumber.active').next().\n");
      out.write("                            addClass('active');\n");
      out.write("                    $('.pagination').find('.pageNumber.active').prev().\n");
      out.write("                            removeClass('active');\n");
      out.write("                });\n");
      out.write("                $('.prev').click(function () {\n");
      out.write("                    $('.pagination').find('.pageNumber.active').prev().\n");
      out.write("                            addClass('active');\n");
      out.write("                    $('.pagination').find('.pageNumber.active').next().\n");
      out.write("                            removeClass('active');\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("\n");
      out.write("\n");
      out.write("            function loadMore() {\n");
      out.write("                var amount = document.getElementsByClassName(\"productLoad\").length;\n");
      out.write("                $.ajax({\n");
      out.write("                    url: \"/FlowerShop/load\",\n");
      out.write("                    type: 'get',\n");
      out.write("                    data: {\n");
      out.write("                        exits: amount\n");
      out.write("                    },\n");
      out.write("                    success: function (data) {\n");
      out.write("                        var row = document.getElementById(\"content\");\n");
      out.write("                        row.innerHTML += data;\n");
      out.write("                    },\n");
      out.write("                    error: function (xhr) {\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function searchByName(param) {\n");
      out.write("                var txtSearch = param.value;\n");
      out.write("                $.ajax({\n");
      out.write("                    url: \"/FlowerShop/searchAjax\",\n");
      out.write("                    type: 'get',\n");
      out.write("                    data: {\n");
      out.write("                        txt: txtSearch\n");
      out.write("                    },\n");
      out.write("                    success: function (data) {\n");
      out.write("                        var row = document.getElementById(\"content\");\n");
      out.write("                        row.innerHTML = data;\n");
      out.write("                    },\n");
      out.write("                    error: function (xhr) {\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ListC}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \n");
          out.write("                        <li class=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cateID == o.cid ? \"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><a href=\"Home?cid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>    \n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ListP}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("o");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <div class=\"box productLoad\">\n");
          out.write("                        <span class=\"discount\">-10%</span>\n");
          out.write("                        <div class=\"image\">\n");
          out.write("                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\n");
          out.write("                            <div class=\"icons\">\n");
          out.write("                                <a href=\"#\" class=\"fas fa-heart\"></a>\n");
          out.write("                                <a href=\"addCart?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"class=\"cart-btn\">add to cart</a>\n");
          out.write("                                <if></if>\n");
          out.write("                                <a href=\"detail?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"fas fa-share\"></a>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"content\">\n");
          out.write("                            <h3>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h3>\n");
          out.write("<!--                            <div class=\"price\"> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" <span>$15.5</span> </div>-->\n");
          out.write("                            <div class=\"price\"> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("VND</div>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setBegin(1);
    _jspx_th_c_forEach_2.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${end}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_2.setVar("i");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <li class=\"pageNumber ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tag==i?\"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><a href=\"Home?index=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&cid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cateID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }
}
