/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import contextss.DBContext;
import entity.Account;
import entity.Category;
import entity.Product;
import java.sql.*;
import java.util.*;

/**
 *
 * @author trinh
 */
public class DAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public String status = "";

    public List<Product> getAllProduct() {
        List<Product> list = new ArrayList<>();
        String query = "select * from product_HE153468_SE1606";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
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

    public List<Product> getTop4() {
        List<Product> list = new ArrayList<>();
        String query = "select top 4 * from product_HE153468_SE1606";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
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

    public List<Product> getNext4Product(int amount) {
        List<Product> list = new ArrayList<>();
        String query = "SELECT * FROM Product_HE153468_SE1606 \n"
                + "ORDER BY id \n"
                + "OFFSET ? ROWS FETCH NEXT 4 ROWS ONLY";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, amount);
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

    public List<Product> getProductByCategory(String cid) {
        List<Product> list = new ArrayList<>();
        String query = "select * from product_HE153468_SE1606\n"
                + "where cateID = ?;";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, cid);
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

    public Product getProductById(String id) {

        String query = "select * from product_HE153468_SE1606\n"
                + "where id = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(9));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<Product> searchByName(String txtSearch) {
        List<Product> list = new ArrayList<>();
        String query = "select * from product_HE153468_SE1606\n"
                + "where [name] like ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txtSearch + "%");
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

    public List<Category> getAllCategory() {
        List<Category> list = new ArrayList<>();
        String query = "select * from Category_HE153468_SE1606";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Category(rs.getInt(1),
                        rs.getString(2)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Account login(String user, String pass) {
        String query = "select * from account_HE153468_SE1606\n"
                + "where [user] = ?\n"
                + "and pass =?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6));
            }
        } catch (Exception e) {
        }

        return null;
    }

    public Account CheckAccountExist(String user) {
        String query = "SELECT * FROM Account_HE153468_SE1606\n"
                + "where [user] = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6));
            }
        } catch (Exception e) {
        }

        return null;
    }

    public void singUp(String user, String pass, String email) {
        String query = "INSERT INTO Account_HE153468_SE1606\n"
                + "VALUES (?,?,?,0,0)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.setString(3, email);
            ps.executeUpdate();
        } catch (Exception e) {

        }
    }

    public List<Product> getProductBySell_Id(int id) {
        List<Product> list = new ArrayList<>();
        String query = "select * from product_HE153468_SE1606\n"
                + "where sell_ID = ?;";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
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

    public List<Account> getAllAccount() {
        List<Account> listA = new ArrayList<>();
        String query = "select * from Account_HE153468_SE1606\n";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                listA.add(new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6)));
            }
        } catch (Exception e) {
        }
        return listA;
    }

    public void deleteProduct(String pid) {
        String query = "delete from product_HE153468_SE1606\n"
                + "where id = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, pid);
            ps.executeUpdate();
        } catch (Exception e) {

        }
    }

    public void AddProduct(String name, String image, String price,
            String title, String description, String category, int sid) {
        String query = "INSERT [dbo].[product_HE153468_SE1606] \n"
                + "([name], [image], [price], [title], [description], [cateID], [sell_ID]) \n"
                + "VALUES (?,?,?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, image);
            ps.setString(3, price);
            ps.setString(4, title);
            ps.setString(5, description);
            ps.setString(6, category);
            ps.setInt(7, sid);
            ps.executeUpdate();
        } catch (Exception e) {

        }
    }

    public void AddCategory(String name) {
        String query = "INSERT INTO [dbo].[Category_HE153468_SE1606]\n"
                + "           ([cname])\n"
                + "     VALUES(?)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.executeUpdate();
        } catch (Exception e) {

        }
    }

    public void DeleteCategory(String id) {
        String query = "DELETE FROM [dbo].[Category_HE153468_SE1606]\n"
                + "      WHERE cid = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception e) {

        }
    }

    public void EditProduct(String name, String image, String price,
            String title, String description, String category, String quantity,  String pid) {
        String query = "UPDATE [dbo].[product_HE153468_SE1606]\n"
                + "   SET [name] = ?,\n"
                + "      [image] = ?,\n"
                + "      [price] = ?,\n"
                + "      [title] = ?,\n"
                + "      [description] = ?,\n"
                + "      [cateID] = ?,\n"
                + "      [quantity] = ? \n"
                + " WHERE id = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, image);
            ps.setString(3, price);
            ps.setString(4, title);
            ps.setString(5, description);
            ps.setString(6, category);
            ps.setString(7, quantity);
            ps.setString(8, pid);
            ps.executeUpdate();
        } catch (Exception e) {

        }
    }

    public int getTotalProductBySellId(int id) {
        String query = "select count(*) from product_HE153468_SE1606 where sell_ID = ? ";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public List<Product> pagingProductBySellId(int index, int id) {
        List<Product> list = new ArrayList<>();
        String query = "SELECT * FROM Product_HE153468_SE1606 where sell_ID = ? \n"
                + "ORDER BY id \n"
                + "OFFSET ? ROWS FETCH NEXT 3 ROWS ONLY";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(2, (index - 1) * 3);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(9)));
            }
        } catch (Exception e) {

        }
        return list;
    }

    public List<Product> pagingProduct(int index) {
        List<Product> list = new ArrayList<>();
        String query = "SELECT * FROM Product_HE153468_SE1606\n"
                + "ORDER BY id \n"
                + "OFFSET ? ROWS FETCH NEXT 6 ROWS ONLY";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
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
            String query = "SELECT * FROM Product_HE153468_SE1606 where cateID = ? \n"
                    + "ORDER BY id \n"
                    + "OFFSET ? ROWS FETCH NEXT 6 ROWS ONLY";
            try {
                conn = new DBContext().getConnection();//mo ket noi voi sql
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

    public void AddAccount(String user, String pass, String email, String isSell, String isAdmin) {
        String query = "INSERT [dbo].[account_HE153468_SE1606] \n"
                + "([user], [pass], [email], [isSell], [isAdmin])\n"
                + "VALUES (?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.setString(3, email);
            ps.setString(4, isSell);
            ps.setString(5, isAdmin);
            ps.executeUpdate();
        } catch (Exception e) {

        }
    }

    public void deleteAccount(String Aid) {
        String query = "delete from Account_HE153468_SE1606\n"
                + "where uID = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, Aid);
            ps.executeUpdate();
        } catch (Exception e) {

        }
    }

    public Account getAccountById(int id) {

        String query = "select * from Account_HE153468_SE1606\n"
                + "where uid = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void EditAccount(String user, String pass, String email,
            String isSell, String isAdmin, String uid) {
        String query = "UPDATE [dbo].[Account_HE153468_SE1606]\n"
                + "   SET [user] = ?,\n"
                + "      [pass] = ?,\n"
                + "      [email] = ?,\n"
                + "      [isSell] = ?,\n"
                + "      [isAdmin] =? \n"
                + " WHERE uid = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.setString(3, email);
            ps.setString(4, isSell);
            ps.setString(5, isAdmin);
            ps.setString(6, uid);
            ps.executeUpdate();
        } catch (Exception e) {

        }
    }

    public void EditPass(String pass, String email) {
        String query = "UPDATE [dbo].[Account_HE153468_SE1606]\n"
                + "   SET [pass] = ?\n"
                + " WHERE email = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, pass);
            ps.setString(2, email);
            ps.executeUpdate();
        } catch (Exception e) {

        }
    }

    public void EditPassById(String pass, int uid) {
        String query = "UPDATE [dbo].[Account_HE153468_SE1606]\n"
                + "   SET [pass] = ?\n"
                + " WHERE uID = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, pass);
            ps.setInt(2, uid);
            ps.executeUpdate();
        } catch (Exception e) {

        }
    }

    public String getPassById(int id) {

        String query = "select pass from Account_HE153468_SE1606\n"
                + "where uID = ?";

        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getString(1);
            }
        } catch (Exception e) {
        }
        return null;
    }

    public static void main(String[] args) {
        DAO dao = new DAO();
        Account list = dao.getAccountById(2);
        System.out.println(list);
    }

}
