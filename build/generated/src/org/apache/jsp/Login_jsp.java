package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/Login.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"blueBg\">\n");
      out.write("\n");
      out.write("                <div class=\"box signin\">\n");
      out.write("                    <h2>Already Have an Account ?</h2>\n");
      out.write("                    <button type=\"submit\" class=\"signinBtn\">Sign in</button>\n");
      out.write("                </div>  \n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"box signup\">\n");
      out.write("                    <h2>Don't Have an Account ?</h2>\n");
      out.write("                    <button type=\"submit\" class=\"signupBtn\">Sign up</button>\n");
      out.write("                </div>  \n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"formBx\">\n");
      out.write("                <div class=\"form signinForm\">\n");
      out.write("                    <form action=\"login\" method=\"post\">\n");
      out.write("                        <h3>Sign in</h3>\n");
      out.write("                        <p class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        <input name=\"user\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" placeholder=\"Username\">\n");
      out.write("                        <input name=\"pass\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${passWord}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"Password\" placeholder=\"Password\">\n");
      out.write("                        <div class=\"form-group form-check\">\n");
      out.write("                            <input name=\"remember\" value=\"1\" type=\"checkbox\" class=\"form-check-input\" id=\"exampleCheck1\">\n");
      out.write("                            <label class=\"form-check-label\" for=\"exampleCheck1\">Remember me</label>\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"submit\" value=\"Login\">\n");
      out.write("                        <a href=\"ForgotPass.jsp\" class=\"forgot\">Forgot Password</a>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form signupForm\">\n");
      out.write("                    <form id=\"form\" action=\"signup\" method=\"post\">\n");
      out.write("                        <h3>Sign up</h3>\n");
      out.write("                        <input name = \"user\" type=\"text\" placeholder=\"Username\">\n");
      out.write("                        <span style=\"font-size: 10px\" id=\"text\"></span>\n");
      out.write("                        <input id=\"email\" name = \"email\" type=\"Email\" placeholder=\"Email Address\" onkeydown=\"\n");
      out.write("                                validation()\">\n");
      out.write("                        <input id=\"pass\" name= \"pass\" type=\"Password\" placeholder=\"Password\">\n");
      out.write("                        <span style=\"font-size: 10px\" id=\"textt\"></span>\n");
      out.write("                        <input id=\"repass\" name= \"repass\" type=\"Password\" placeholder=\"Confirm Password\" onkeyup=\"\n");
      out.write("                                checkRepass()\">\n");
      out.write("                        <input type=\"submit\" value=\"Register\">\n");
      out.write("<!--                        <a href=\"#\" class=\"forgot\">Forgot Password</a>-->\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            const signinBtn = document.querySelector('.signinBtn');\n");
      out.write("            const signupBtn = document.querySelector('.signupBtn');\n");
      out.write("            const formBx = document.querySelector('.formBx');\n");
      out.write("            const body = document.querySelector('body');\n");
      out.write("            signupBtn.onclick = function () {\n");
      out.write("                formBx.classList.add('active')\n");
      out.write("                body.classList.add('active')\n");
      out.write("            }\n");
      out.write("            signinBtn.onclick = function () {\n");
      out.write("                formBx.classList.remove('active')\n");
      out.write("                body.classList.remove('active')\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function validation() {\n");
      out.write("                var from = document.getElementById(\"form\");\n");
      out.write("                var email = document.getElementById(\"email\").value;\n");
      out.write("                var text = document.getElementById(\"text\");\n");
      out.write("                var pattern = /^[^ ]+@[^ ]+\\.[a-z]{2,3}$/;\n");
      out.write("\n");
      out.write("                if (email.match(pattern))\n");
      out.write("                {\n");
      out.write("                    from.classList.add(\"valid\");\n");
      out.write("                    from.classList.remove(\"invalid\");\n");
      out.write("                    text.innerHTML = \"Your Email Address invalid.\";\n");
      out.write("                    text.style.color = \"#00ff00\";\n");
      out.write("\n");
      out.write("                } else\n");
      out.write("                {\n");
      out.write("                    from.classList.remove(\"valid\");\n");
      out.write("                    from.classList.add(\"invalid\");\n");
      out.write("                    text.innerHTML = \"Please Enter valid Email Address\";\n");
      out.write("                    text.style.color = \"#ff0000\";\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (email == \"\")\n");
      out.write("                {\n");
      out.write("                    from.classList.remove(\"valid\");\n");
      out.write("                    from.classList.remove(\"invalid\");\n");
      out.write("//                    text.innerHTML = \"Your Email Address in valid.\";\n");
      out.write("                    text.style.color = \"#00ff00\";\n");
      out.write("\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function checkRepass() {\n");
      out.write("                var from = document.getElementById(\"form\");\n");
      out.write("                let pass = document.getElementById(\"pass\").value;\n");
      out.write("                let repass = document.getElementById(\"repass\").value;\n");
      out.write("                console.log(pass, repass);\n");
      out.write("                var textt = document.getElementById(\"textt\");\n");
      out.write("                if (pass == repass) {\n");
      out.write("                    from.classList.add(\"equals\");\n");
      out.write("                    from.classList.remove(\"notequals\");\n");
      out.write("                    textt.textContent = \"Confirm Password Invalid\";\n");
      out.write("                    textt.style.color = \"#00ff00\";\n");
      out.write("                } else {\n");
      out.write("                    from.classList.remove(\"equals\");\n");
      out.write("                    from.classList.add(\"notequals\");\n");
      out.write("                    textt.textContent = \"Confirm Password don't match Password.\";\n");
      out.write("                    textt.style.color = \"#ff0000\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
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
