package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SendCode_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-vidth\", initial-scale=\"1.0\">\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        @import url('https://fonts.googleapis.com/css?family=Poppins:200,300,400,500,600,700,800,900&display=swap');\n");
      out.write("        *\n");
      out.write("        {\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            font-family: 'Poppins', sans-serif;\n");
      out.write("        }\n");
      out.write("        body\n");
      out.write("        {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            min-height: 100vh;\n");
      out.write("            background: #03a9f4;\n");
      out.write("            transition: 0.5s; \n");
      out.write("        }\n");
      out.write("        .container\n");
      out.write("        {\n");
      out.write("            position: relative;\n");
      out.write("            width: 700px;\n");
      out.write("            height: 500px;\n");
      out.write("            margin: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .formBx\n");
      out.write("        {\n");
      out.write("            position: absolute;\n");
      out.write("            top: 0;\n");
      out.write("            left: 20%;\n");
      out.write("            right: 20%;\n");
      out.write("            width: 60%;\n");
      out.write("            height: 100%;\n");
      out.write("            background: #fff;\n");
      out.write("            z-index: 1000;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            box-shadow: 0 5px 45px rgba(0,0,0,0.25);\n");
      out.write("            transition: 0.5s ease-in-out;\n");
      out.write("            overflow: hidden;\n");
      out.write("        }\n");
      out.write("        .formBx .form\n");
      out.write("        {\n");
      out.write("            position: absolute;\n");
      out.write("            left: 0;\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 50px;\n");
      out.write("            transition: 0.5s;\n");
      out.write("        }\n");
      out.write("        .formBx .signinForm{\n");
      out.write("            transition-delay: 0.25s;\n");
      out.write("        }\n");
      out.write("        .formBx .form form\n");
      out.write("        {\n");
      out.write("            width: 100%;\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("        }\n");
      out.write("        .formBx .form form h3\n");
      out.write("        {\n");
      out.write("            font-size: 1.5em;\n");
      out.write("            color: #333;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            font-weight: 500;\n");
      out.write("        }\n");
      out.write("        .formBx .form form input{\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            padding: 10px;\n");
      out.write("            outline: none;\n");
      out.write("            font-size: 16px;\n");
      out.write("            border: 1px solid #333;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .formBx .form form input[type=\"submit\"]\n");
      out.write("        {\n");
      out.write("            background: #03a9f4;\n");
      out.write("            border: none;\n");
      out.write("            color: #fff;\n");
      out.write("            max-width: 100px;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        .formBx .form form .Other\n");
      out.write("        {\n");
      out.write("            color:  #333;\n");
      out.write("            list-style: none;\n");
      out.write("            text-decoration: none;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("\n");
      out.write("        @media(max-width: 991px)\n");
      out.write("        {\n");
      out.write("            .container\n");
      out.write("            {\n");
      out.write("                max-width: 400px;\n");
      out.write("                height: 650px;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("                margin-right: 30%;\n");
      out.write("                margin-top: 15%;\n");
      out.write("            }\n");
      out.write("            .formBx\n");
      out.write("            {\n");
      out.write("                width: 100%;\n");
      out.write("                height: 500px;\n");
      out.write("                top: 0;\n");
      out.write("                box-shadow: none;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"formBx\">\n");
      out.write("                <div class=\"form signinForm\">\n");
      out.write("                    <form action=\"sendCode\" method=\"post\">\n");
      out.write("                        <h3>We already send a verification  code to your email</h3>\n");
      out.write("                        <input name = \"authcode\" type=\"text\" placeholder=\"code\">\n");
      out.write("                        <div>\n");
      out.write("                        <input type=\"submit\" value=\"verify\">\n");
      out.write("<!--                        <input type=\"submit\" value=\"Cance\">-->\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
}
