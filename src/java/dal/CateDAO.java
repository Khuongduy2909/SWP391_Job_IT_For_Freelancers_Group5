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

/**
 *
 * @author Admin
 */
public class CateDAO extends DBContext{
    public List<Models.Categories> getAllCategory() {
        List<Models.Categories> list = new ArrayList<>();
        String query = "select * from Categories";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Models.Categories(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3)));
            }
        } catch (SQLException e) {
        }
        return list;
    }

    public Models.Categories getCategoryByID(int categoryId) {
        String query = "select * from Categories where caID=?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, categoryId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Models.Categories c = new Models.Categories(rs.getInt("caID"), rs.getString("categories_name"), rs.getString("image"));
                return c;
            }
        } catch (SQLException e) {
        }
        return null;
    }
}
