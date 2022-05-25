/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import contextss.DBContext;
import entity.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;

/**
 *
 * @author trinh
 */
public class CartDAO extends DBContext {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public void addOrder(Account u, Cart cart) {
        LocalDate curDate = java.time.LocalDate.now();
        String date = curDate.toString();
        try {
            //add vao bang order;
            String query = "insert into [order_HE153468_SE1606] values(?,?,?,0,0,0)";
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, date);
            ps.setInt(2, u.getId());
            ps.setDouble(3, cart.getTotalMoney());
            ps.executeUpdate();
            //lay ra id cua order vua add
            String sql = "select top 1 id from[Order_HE153468_SE1606] order by id desc";
            PreparedStatement pss = conn.prepareStatement(sql);
            rs = pss.executeQuery();
            
            //add vao ban orderline
            if (rs.next()) {
                int oid = rs.getInt(1);
                for (Item i : cart.getItems()) {
                 String sql2 = "insert into [orderline_HE153468_SE1606] values(?,?,?,?)";
                PreparedStatement st2 = conn.prepareStatement(sql2);
                st2.setInt(1, oid);
                st2.setInt(2, i.getProduct().getId());
                st2.setInt(3, i.getQuantity()); 
                st2.setDouble(4, i.getPrice());
                st2.executeUpdate();
                }
            }
        } catch (Exception e) {
            
        }
    }
}
