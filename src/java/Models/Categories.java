/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Admin
 */
public class Categories {
    int caID;
    String categoriesName;
    String image;

    public Categories() {
    }

    public Categories(int caID, String categoriesName, String image) {
        this.caID = caID;
        this.categoriesName = categoriesName;
        this.image = image;
    }

    public int getCaID() {
        return caID;
    }

    public void setCaID(int caID) {
        this.caID = caID;
    }

    public String getCategoriesName() {
        return categoriesName;
    }

    public void setCategoriesName(String categoriesName) {
        this.categoriesName = categoriesName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Categories{" + "caID=" + caID + ", categoriesName=" + categoriesName + ", image=" + image + '}';
    }

    
    
    
}
