/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import SendMail.SendMail;
import dao.DAO;
import dao.ProductDAO;
import entity.Account;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author trinh
 */
public class SignUpControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String userName = request.getParameter("user");
        String passWord = request.getParameter("pass");
        String email = request.getParameter("email");
        String rePassWord = request.getParameter("repass");
        
        if (!passWord.equals(rePassWord)) {
            response.sendRedirect("Login.jsp");
        } else {
            DAO dao = new DAO();
            Account a = dao.CheckAccountExist(userName);
            if (a == null) {
                dao.singUp(userName, passWord, email);
                //create instance object of the SendEmail Class
                SendMail sm = new SendMail();
                //get the 6-digit code
                String code = sm.getRandom();

                SendMail.send(email, code, "handbookgreenfairy.fpt@gmail.com", "handbookgreenfairy", "User Email Verification", "Registered successfully.Please verify your account using this code: ");;

                HttpSession session = request.getSession();
                session.setAttribute("authcode", code);
                response.sendRedirect("SendCode.jsp");
            } else {
                response.sendRedirect("Login.jsp");
            }
        }
        

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
