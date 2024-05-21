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
public class Company {
    int companyID, teamNumber;
    Date establishedOn;
    String companyName, website,describe, location;

    public Company() {
    }

    public Company(int companyID, String companyName, int teamNumber, Date establishedOn, String website, String describe, String location) {
        this.companyID = companyID;
        this.teamNumber = teamNumber;
        this.establishedOn = establishedOn;
        this.companyName = companyName;
        this.website = website;
        this.describe = describe;
        this.location = location;
    }

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public int getTeamNumber() {
        return teamNumber;
    }

    public void setTeamNumber(int teamNumber) {
        this.teamNumber = teamNumber;
    }

    public Date getEstablishedOn() {
        return establishedOn;
    }

    public void setEstablishedOn(Date establishedOn) {
        this.establishedOn = establishedOn;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    
    
    
}
