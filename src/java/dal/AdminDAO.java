/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import Models.Role;
import Models.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author kudol
 */
public class AdminDAO extends DBContext{
   public int getNumberUsers(){
        String query = " SELECT COUNT(DISTINCT username) AS total_user FROM [user]";
        try {
            PreparedStatement ps = connection.prepareStatement(query);           
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {               
                return rs.getInt("total_user");
            }
        } catch (SQLException e) {
        }       
       return -1;       
   }
    public static void main(String[] args) {
        System.out.println(new AdminDAO().getNumberUsers());
    }
}
