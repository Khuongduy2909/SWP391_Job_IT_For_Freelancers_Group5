/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Freelancer {
    int freelanceID;
    String first_name, last_name, image, describe, email, phone;
    boolean gender;
    Date dob;

    public Freelancer() {
    }

    public Freelancer(int freelanceID, String first_name, String last_name, String image, boolean gender, Date dob, String describe, String email, String phone) {
        this.freelanceID = freelanceID;
        this.first_name = first_name;
        this.last_name = last_name;
        this.image = image;
        this.describe = describe;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.dob = dob;
    }

    public int getFreelanceID() {
        return freelanceID;
    }

    public void setFreelanceID(int freelanceID) {
        this.freelanceID = freelanceID;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Freelancer{" + "freelanceID=" + freelanceID + ", first_name=" + first_name + ", last_name=" + last_name + ", image=" + image + ", describe=" + describe + ", email=" + email + ", phone=" + phone + ", gender=" + gender + ", dob=" + dob + '}';
    }
    
    
    
}
