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
import java.util.*;

/**
 *
 * @author trinh
 */
public class ProductDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public int countProduct() {
        String query = "SELECT COUNT(*) FROM Product_HE153468_SE1606";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public List<Product> pagingProduct(int index) {
        List<Product> list = new ArrayList<>();
        String query = "SELECT * FROM Product_HE153468_SE1606 ORDER BY id OFFSET ? ROWS FETCH NEXT 6 ROWS ONLY";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, (index - 1) * 6);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> pagingByCategory(int index, int CategoryID) {
        List<Product> list = new ArrayList<>();
        if (CategoryID == 0) {
            list = pagingProduct(index);
        } else {
            String query = "SELECT * FROM Product_HE153468_SE1606 WHERE CategoryID = ? ORDER BY ProductID OFFSET ? ROWS FETCH NEXT 6 ROWS ONLY";
            try {
                conn = new DBContext().getConnection();
                ps = conn.prepareStatement(query);
                ps.setInt(1, CategoryID);
                ps.setInt(2, (index - 1) * 6);
                rs = ps.executeQuery();
                while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8)));
                }
            } catch (Exception e) {
            }
        }
        return list;
    }

    public List<Product> pagingManagerProduct(int index, int SellerID) {
        List<Product> list = new ArrayList<>();
        if (SellerID == 0) {
            list = pagingProduct(index);
        } else {
            String query = "SELECT * FROM Product_HE153468_SE1606 WHERE SellerID = ? ORDER BY ProductID OFFSET ? ROWS FETCH NEXT 6 ROWS ONLY";
            try {
                conn = new DBContext().getConnection();
                ps = conn.prepareStatement(query);
                ps.setInt(1, SellerID);
                ps.setInt(2, (index - 1) * 6);
                rs = ps.executeQuery();
                while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8)));
                }
            } catch (Exception e) {
            }
        }
        return list;
    }

    //count total product
    public int countProductByCategory(int CategoryID) {
        if (CategoryID == 0) {
            return countProduct();
        } else {
            String query = "SELECT COUNT(*) FROM Product_HE153468_SE1606 WHERE cateID = ?";
            try {
                conn = new DBContext().getConnection();
                ps = conn.prepareStatement(query);
                ps.setInt(1, CategoryID);
                rs = ps.executeQuery();
                while (rs.next()) {
                    return rs.getInt(1);
                }
            } catch (Exception e) {
            }
        }
        return 0;
    }

    public int countProductBySeller(int SellerID) {
        if (SellerID == 0) {
            return countProduct();
        } else {
            String query = "SELECT COUNT(*) FROM Product_HE153468_SE1606 WHERE Sell_ID = ?";
            try {
                conn = new DBContext().getConnection();
                ps = conn.prepareStatement(query);
                ps.setInt(1, SellerID);
                rs = ps.executeQuery();
                while (rs.next()) {
                    return rs.getInt(1);
                }
            } catch (Exception e) {
            }
        }
        return 0;
    }

    public void AddInfoAccount(int uid, String description, String address,
            String phone, String image, String fullname) {
        String query = "INSERT INTO [dbo].[InformationAccount_HE153468_SE1606]\n"
                + "           ([uid],[description],[address],[phone],[image],[fullname])\n"
                + "     VALUES(?,?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, uid);
            ps.setString(2, description);
            ps.setString(3, address);
            ps.setString(4, phone);
            ps.setString(5, image);
            ps.setString(6, fullname);
            ps.executeUpdate();
        } catch (Exception e) {

        }
    }

    public void EditInfoAccount(int uid, String description, String address,
            String phone, String image, String fullname) {
        String query = "UPDATE [dbo].[InformationAccount_HE153468_SE1606]\n"
                + "               SET [description] = ?,\n"
                + "               [address] = ?,\n"
                + "                 [phone] = ?,\n"
                + "               [image] = ?,\n"
                + "                 [FullName] = ?\n"
                + "                 WHERE uid = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);

            ps.setString(1, description);
            ps.setString(2, address);
            ps.setString(3, phone);
            ps.setString(4, image);
            ps.setString(5, fullname);
            ps.setInt(6, uid);
            ps.executeUpdate();
        } catch (Exception e) {

        }
    }

    public Information getInfoAccount(int id) {
        String query = "select * from InformationAccount_HE153468_SE1606 where uid = ? ";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                return new Information(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDouble(5),
                        rs.getString(6),
                        rs.getString(7));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void EditAccount(String user, String email, int uid) {
        String query = "UPDATE [dbo].[Account_HE153468_SE1606]\n"
                + "   SET [user] = ?,\n"
                + "      [email] = ?\n"
                + " WHERE uid = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, email);
            ps.setInt(3, uid);
            ps.executeUpdate();
        } catch (Exception e) {

        }
    }

}
