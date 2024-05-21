/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Models.Categories;
import Models.Role;
import Models.User;

/**
 *
 * @author Admin
 */
public class DAO extends DBContext {

    public User getLogin(String user, String pass) {
        String query = " select u.userID, u.username, u.password, u.email, u.status, r.roleID, r.role_name, u.LevelPass  \n"
                + "                       from [User] u \n"
                + "                       join Role r on u.roleID = r.roleID\n"
                + "                       where u.username = ? and u.password = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Role role = new Role(rs.getInt("roleID"), rs.getString("role_name"));
                return new User(rs.getInt("userID"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("email"),
                        rs.getString("status"),
                        role,
                        rs.getBoolean("LevelPass"));
            }
        } catch (SQLException e) {
        }
        return null;
    }

    public List<Categories> getAllCategory() {
        List<Categories> list = new ArrayList<>();
        String query = "select * from Categories";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Categories(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3)));
            }
        } catch (SQLException e) {
        }
        return list;
    }

    public Categories getCategoryByID(int categoryId) {
        String query = "select * from Categories where caID=?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, categoryId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Categories c = new Categories(rs.getInt("caID"), rs.getString("categories_name"), rs.getString("image"));
                return c;
            }
        } catch (SQLException e) {
        }
        return null;
    }

    public static void main(String[] args) {
        DAO dao = new DAO();
        User u = dao.getLogin("freelacer", "abc123");
        System.out.println(u.toString());
    }
}
