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
public class Education {
    int educationID;
    String university_name;
    Date start_date, end_date;
    Freelancer freelanceID;
    Dregee degreeID;

    public Education() {
    }

    public Education(int educationID, String university_name, Date start_date, Date end_date, Freelancer freelanceID, Dregee degreeID) {
        this.educationID = educationID;
        this.university_name = university_name;
        this.start_date = start_date;
        this.end_date = end_date;
        this.freelanceID = freelanceID;
        this.degreeID = degreeID;
    }

    public int getEducationID() {
        return educationID;
    }

    public void setEducationID(int educationID) {
        this.educationID = educationID;
    }

    public String getUniversity_name() {
        return university_name;
    }

    public void setUniversity_name(String university_name) {
        this.university_name = university_name;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public Freelancer getFreelanceID() {
        return freelanceID;
    }

    public void setFreelanceID(Freelancer freelanceID) {
        this.freelanceID = freelanceID;
    }

    public Dregee getDegreeID() {
        return degreeID;
    }

    public void setDegreeID(Dregee degreeID) {
        this.degreeID = degreeID;
    }

    @Override
    public String toString() {
        return "Education{" + "educationID=" + educationID + ", university_name=" + university_name + ", start_date=" + start_date + ", end_date=" + end_date + ", freelanceID=" + freelanceID + ", degreeID=" + degreeID + '}';
    }
     
    
}
