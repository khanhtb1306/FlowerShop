package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>Product Card/Page</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/DetailProduct.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css\" integrity=\"sha512-+4zCK9k+qNFUR5X+cKL9EIR+ZOhtIloNl9GIKS57V1MyNsYpYcUrUeQc9vNfzsWfV28IaLL3i96P9sdNyeRssA==\" crossorigin=\"anonymous\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("        <div class = \"card-wrapper\">\n");
      out.write("            <div class = \"card\">\n");
      out.write("                <!-- card left -->\n");
      out.write("                <div class = \"product-imgs\">\n");
      out.write("                    <div class = \"img-display\">\n");
      out.write("                        <div class = \"img-showcase\">\n");
      out.write("                            <img src = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt = \"image\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- card right -->\n");
      out.write("                <div class = \"product-content\">\n");
      out.write("                    <h2 class = \"product-title\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\n");
      out.write("                    <a href = \"Home\" class = \"product-link\">visit flower store</a>\n");
      out.write("                    <div class = \"product-rating\">\n");
      out.write("                        <i class = \"fas fa-star\"></i>\n");
      out.write("                        <i class = \"fas fa-star\"></i>\n");
      out.write("                        <i class = \"fas fa-star\"></i>\n");
      out.write("                        <i class = \"fas fa-star\"></i>\n");
      out.write("                        <i class = \"fas fa-star-half-alt\"></i>\n");
      out.write("                        <span>4.7(21)</span>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class = \"product-price\">\n");
      out.write("                        <!--            <p class = \"last-price\">Old Price: <span>$257.00</span></p>-->\n");
      out.write("                        <p class = \"new-price\">Price: <span>$");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class = \"product-detail\">\n");
      out.write("                        <h2>about this item: </h2>\n");
      out.write("                        <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class = \"purchase-info\">\n");
      out.write("                        <input type = \"number\" min = \"0\" value = \"1\">\n");
      out.write("                        <a class = \"btn\" href=\"cartDetail?pid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            Add to Cart <i class = \"fas fa-shopping-cart\"></i>\n");
      out.write("                        </a>\n");
      out.write("\n");
      out.write("                        <a class = \"btn\" style=\"font-size: 13.5px\">Compare</a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class = \"social-links\">\n");
      out.write("                        <p>Share At: </p>\n");
      out.write("                        <a href = \"#\">\n");
      out.write("                            <i class = \"fab fa-facebook-f\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <a href = \"#\">\n");
      out.write("                            <i class = \"fab fa-twitter\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <a href = \"#\">\n");
      out.write("                            <i class = \"fab fa-instagram\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <a href = \"#\">\n");
      out.write("                            <i class = \"fab fa-whatsapp\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <a href = \"#\">\n");
      out.write("                            <i class = \"fab fa-pinterest\"></i>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    <script src=\"js/detail.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
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
}
