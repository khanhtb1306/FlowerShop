package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DetailOrder_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html style=\"font-size: 65%;\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/cartFlower.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        .table-title {        \n");
      out.write("            padding-bottom: 15px;\n");
      out.write("            background: #435d7d;\n");
      out.write("            color: #fff;\n");
      out.write("            padding: 16px 30px;\n");
      out.write("            min-width: 100%;\n");
      out.write("            margin: -20px -25px 10px;\n");
      out.write("            border-radius: 3px 3px 0 0;\n");
      out.write("        }\n");
      out.write("        .table-title h2 {\n");
      out.write("            margin: 5px 0 0;\n");
      out.write("            font-size: 24px;\n");
      out.write("        }\n");
      out.write("        .table-title .btn-group {\n");
      out.write("            float: right;\n");
      out.write("        }\n");
      out.write("        .table-title .btn {\n");
      out.write("            color: #fff;\n");
      out.write("            float: right;\n");
      out.write("            font-size: 13px;\n");
      out.write("            border: none;\n");
      out.write("            min-width: 50px;\n");
      out.write("            border-radius: 2px;\n");
      out.write("            border: none;\n");
      out.write("            outline: none !important;\n");
      out.write("            margin-left: 10px;\n");
      out.write("        }\n");
      out.write("        .Home a {\n");
      out.write("            font-size: 40px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"shopping-cart\">\n");
      out.write("            <div class=\"pb-5\">\n");
      out.write("                <div class=\"px-4 px-lg-0\">\n");
      out.write("                    <div class=\"table-title\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <h2>Mean <b>Order</b></h2>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-5\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"Home col-sm-1\">\n");
      out.write("                                <a type=\"button\" class=\"close\" href=\"managerorder\" aria-hidden=\"true\">&times;</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-12 p-5 bg-white rounded shadow-sm mb-5\">\n");
      out.write("\n");
      out.write("                                <!-- Shopping cart table -->\n");
      out.write("                                <div class=\"table-responsive\">\n");
      out.write("                                    <table class=\"table\">\n");
      out.write("                                        <thead>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th scope=\"col\" class=\"border-0 bg-light\">\n");
      out.write("                                                    <div class=\"p-2 px-3 text-uppercase\">Sản Phẩm</div>\n");
      out.write("                                                </th>\n");
      out.write("                                                <th scope=\"col\" class=\"border-0 bg-light\">\n");
      out.write("                                                    <div class=\"py-2 text-uppercase\">Đơn Giá</div>\n");
      out.write("                                                </th>\n");
      out.write("                                                <th scope=\"col\" class=\"border-0 bg-light\">\n");
      out.write("                                                    <div class=\"py-2 text-uppercase\">Số Lượng</div>\n");
      out.write("                                                </th>\n");
      out.write("                                                <th scope=\"col\" class=\"border-0 bg-light\">\n");
      out.write("                                                    <div class=\"py-2 text-uppercase\">Xóa</div>\n");
      out.write("                                                </th>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tbody>\n");
      out.write("                                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- End -->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"row py-5 p-4 bg-white rounded shadow-sm\">\n");
      out.write("                            <div class=\"col-lg-6\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-6\">\n");
      out.write("                                <div class=\"bg-light rounded-pill px-4 py-3 text-uppercase font-weight-bold\">Information</div>\n");
      out.write("                                <div class=\"p-4\">\n");
      out.write("                                    <ul class=\"list-unstyled mb-4\">\n");
      out.write("                                        <li class=\"d-flex justify-content-between py-3 border-bottom\"><strong class=\"text-muted\">User</strong><strong>Hoang</strong></li>\n");
      out.write("                                        <li class=\"d-flex justify-content-between py-3 border-bottom\"><strong class=\"text-muted\">Date</strong><strong>10-3-2020</strong></li>\n");
      out.write("                                        <li class=\"d-flex justify-content-between py-3 border-bottom\"><strong class=\"text-muted\">Phone</strong><strong>08965321</strong></li>\n");
      out.write("                                        <li class=\"d-flex justify-content-between py-3 border-bottom\"><strong class=\"text-muted\">Email</strong><strong>123@gmail.com</strong></li>\n");
      out.write("                                        <li class=\"d-flex justify-content-between py-3 border-bottom\"><strong class=\"text-muted\">Payments</strong><h5 class=\"font-weight-bold\">Done</h5>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"js/cart.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script>\n");
      out.write("</body>\n");
      out.write("\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${List}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <tr>\n");
          out.write("                                                <th scope=\"row\">\n");
          out.write("                                                    <div class=\"p-2\">\n");
          out.write("                                                        <img src=\"\" alt=\"\" width=\"70\" class=\"img-fluid rounded shadow-sm\">\n");
          out.write("                                                        <div class=\"ml-3 d-inline-block align-middle\">\n");
          out.write("                                                            <h5 class=\"mb-0\"> <a href=\"#\" class=\"text-dark d-inline-block\"></a></h5><span class=\"text-muted font-weight-normal font-italic\"></span>\n");
          out.write("                                                        </div>\n");
          out.write("                                                    </div>\n");
          out.write("                                                </th>\n");
          out.write("                                                <td class=\"align-middle\"><strong>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</strong></td>\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                <td class=\"align-middle\"><a href=\"#\" class=\"text-dark\">\n");
          out.write("                                                        <button type=\"button\" class=\"btn btn-danger\">Delete</button>\n");
          out.write("                                                    </a>\n");
          out.write("                                                </td>\n");
          out.write("                                            </tr> \n");
          out.write("                                            ");
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
}
