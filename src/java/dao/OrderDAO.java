/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import contextss.DBContext;
import entity.*;
import java.sql.*;
import java.util.*;

/**
 *
 * @author trinh
 */
public class OrderDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Order> getAllOrderBySellID(int sell_id) {
        List<Order> list = new ArrayList<>();
        String query = "SELECT DISTINCT c.id, c.date, c.uid, c.totalmoney, c.comfirm, c.ship, c.done\n"
                + "                FROM  [Order_HE153468_SE1606] c  inner join [OrderLine_HE153468_SE1606] o  \n"
                + "                on o.oid= c.id inner join Product_HE153468_SE1606 p\n"
                + "                on p.id = o.pid\n"
                + "                where p.sell_ID = ?";

        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, sell_id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Order(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getDouble(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Order> getAllOrderByUid(int uid) {
        List<Order> list = new ArrayList<>();
        String query = "SELECT DISTINCT c.id, c.date, c.uid, c.totalmoney, c.comfirm, c.ship, c.done\n"
                + "               FROM  [Order_HE153468_SE1606] c  inner join [OrderLine_HE153468_SE1606] o \n"
                + "               on o.oid= c.id inner join Product_HE153468_SE1606 p\n"
                + "               on p.id = o.pid\n"
                + "               where c.uid = ?";

        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, uid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Order(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getDouble(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7)));
            }
        } catch (Exception e) {
        }
        return list;
    }

//    public List<OrderDetail> getAllOrderLineBySell_id(int sell_id) {
//        List<OrderDetail> list = new ArrayList<>();
//        String query = "SELECT DISTINCT o.oid, o.pid, o.quantity, o.price\n"
//                + "FROM  [OrderLine] o  inner join  [Order] c \n"
//                + "on o.oid= c.id inner join Product p\n"
//                + "on p.id = o.pid\n"
//                + "where p.sell_ID = ?";
//        try {
//            conn = new DBContext().getConnection();//mo ket noi voi sql
//            ps = conn.prepareStatement(query);
//            ps.setInt(1, sell_id);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                list.add(new OrderDetail(rs.getInt(1),
//                        rs.getInt(2),
//                        rs.getInt(3),
//                        rs.getInt(4)));
//            }
//        } catch (Exception e) {
//        }
//        return list;
//    }
    public List<InforOrder> getAllOrderLineByUidAndSell_id(int id, int sell_id, int oid) {
        List<InforOrder> list = new ArrayList<>();
        String query = "SELECT p.name, p.image, c.oid ,c.pid, c.quantity, c.price\n"
                + "FROM OrderLine_HE153468_SE1606 c, [Order_HE153468_SE1606] o, Product_HE153468_SE1606 p\n"
                + "where c.oid = o.id and p.id = c.pid\n"
                + "and o.uid = ? and p.sell_id = ? and c.oid = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.setInt(2, sell_id);
            ps.setInt(3, oid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new InforOrder(rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<InforOrder> getProductOrderLineByUidAndOid(int id, int oid) {
        List<InforOrder> list = new ArrayList<>();
        String query = "SELECT p.name, p.image, c.oid ,c.pid, c.quantity, c.price\n"
                + "FROM OrderLine_HE153468_SE1606 c, [Order_HE153468_SE1606] o, Product_HE153468_SE1606 p\n"
                + "where c.oid = o.id and p.id = c.pid\n"
                + "and o.uid = ? and c.oid = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.setInt(2, oid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new InforOrder(rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public void deleteOrderByoid(String id) {
        String query = "delete from [order_HE153468_SE1606]\n"
                + "where id = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception e) {

        }
    }

    public void deleteOrder(String oid) {
        try {
            String query = "delete from OrderLine_HE153468_SE1606\n"
                    + "where oid = ?";
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, oid);
            ps.executeUpdate();

            deleteOrderByoid(oid);
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) {

    }

    public void updateComfirmbyOid(String id) {
        String query = "UPDATE [dbo].[Order_HE153468_SE1606]\n"
                + "     SET [comfirm] = 1\n"
                + " WHERE id = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception e) {

        }
    }

    public void updateShipbyOid(String id) {
        String query = "UPDATE [dbo].[Order_HE153468_SE1606]\n"
                + "    SET  [ship] = 1\n"
                + " WHERE id = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception e) {

        }
    }

    public void updatedonebyOid(String id) {
        String query = "UPDATE [dbo].[Order_HE153468_SE1606]\n"
                + "     SET [done] = 1\n"
                + " WHERE id = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception e) {

        }
    }

}
