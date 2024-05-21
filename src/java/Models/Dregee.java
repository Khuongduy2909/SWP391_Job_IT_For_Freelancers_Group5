/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Admin
 */
public class Dregee {
    int dregeeID;
    String degree_name;

    public Dregee() {
    }

    public Dregee(int dregeeID, String degree_name) {
        this.dregeeID = dregeeID;
        this.degree_name = degree_name;
    }

    public int getDregeeID() {
        return dregeeID;
    }

    public void setDregeeID(int dregeeID) {
        this.dregeeID = dregeeID;
    }

    public String getDegree_name() {
        return degree_name;
    }

    public void setDegree_name(String degree_name) {
        this.degree_name = degree_name;
    }

    @Override
    public String toString() {
        return "Dregee{" + "dregeeID=" + dregeeID + ", degree_name=" + degree_name + '}';
    }
    
    
    
}
