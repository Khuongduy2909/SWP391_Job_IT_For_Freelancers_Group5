/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Admin
 */
public class User {
    private int userID;
    private String username, password, email,status;
    private Role roleID;
    private boolean levelPass;
    public User() {
    }

    public User(int userID, String username, String password, String email, String status, Role roleID, boolean levelPass) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.email = email;
        this.status = status;
        this.roleID = roleID;
        this.levelPass = levelPass;
    }
    
    

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Role getRoleID() {
        return roleID;
    }

    public void setRoleID(Role roleID) {
        this.roleID = roleID;
    }

    public boolean isLevelPass() {
        return levelPass;
    }

    public void setLevelPass(boolean levelPass) {
        this.levelPass = levelPass;
    }

    @Override
    public String toString() {
        return "User{" + "userID=" + userID + ", username=" + username + ", password=" + password + ", email=" + email + ", status=" + status + ", roleID=" + roleID + ", levelPass=" + levelPass + '}';
    }

   
    
    
    
}
