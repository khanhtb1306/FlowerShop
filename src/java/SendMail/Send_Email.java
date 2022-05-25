/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SendMail;

import dao.DAO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author trinh
 */
public class Send_Email extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String email = request.getParameter("useremail");

            //create instance object of the SendEmail Class
            SendMail sm = new SendMail();
            //get the 6-digit code
            String code = sm.getRandom();

            SendMail.send(email, code, "handbookgreenfairy.fpt@gmail.com", "handbookgreenfairy", "ResetPass Successfuly", "New your pass: ");;

            HttpSession session = request.getSession();
            session.setAttribute("authcode", code);
            DAO dao = new DAO();
            dao.EditPass(code, email);
            response.sendRedirect("login");

        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
