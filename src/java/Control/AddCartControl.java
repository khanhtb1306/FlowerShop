/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

//import dao.CartDAO;
import dao.*;
import entity.*;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author trinh
 */
public class AddCartControl extends HttpServlet {

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

//        DAO dao = new DAO();
//        List<Product> list = dao.getAllProduct();
//        Cookie[] arr = request.getCookies();
//        String txt ="";
//        if (arr!=null) {
//            for (Cookie o : arr) {
//                if (o.getName().equals("cart")) {
//                    txt += o.getValue();
//                }
//            }
//        }
//        Cart cart = new Cart(txt, list);
//        List<Item> listItem = cart.getItems();
//        int n;
//        if (listItem!=null) {
//            n = listItem.size();
//        }else{
//           n = 0; 
//        }
//        request.setAttribute("size", n);
//        request.getRequestDispatcher("Home").forward(request, response);


        HttpSession session = request.getSession(true);
        Cart cart = null;
        Object o = session.getAttribute("cart");
        DAO dao = new DAO();
        //       co roi
        if (o != null) {
            cart = (Cart) o;
        } else {
            cart = new Cart();
        }
//        String tnum = request.getParameter("num");
        String tid = request.getParameter("pid");
        int num, id;
        try {
//            num = Integer.parseInt(tnum);
            id = Integer.parseInt(tid);
            DAO pdb = new DAO();
            Product p = pdb.getProductById(tid);
            double price = p.getPrice() * 1;
            Item t = new Item(p, 1, price);
            cart.addItem(t);
        } catch (Exception e) {
//            num = 1;
        }
        List<Item> list = cart.getItems();
        session.setAttribute("cart", cart);
        session.setAttribute("size", list.size());
        request.getRequestDispatcher("Home").forward(request, response);

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
