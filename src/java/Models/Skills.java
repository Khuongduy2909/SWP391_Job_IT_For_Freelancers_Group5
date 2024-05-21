/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Admin
 */
public class Skills {
    int skillID;
    SkillSet skill_set_ID;
    Freelancer freelancerID;

    public Skills() {
    }

    public Skills(int skillID, SkillSet skill_set_ID, Freelancer freelancerID) {
        this.skillID = skillID;
        this.skill_set_ID = skill_set_ID;
        this.freelancerID = freelancerID;
    }

    public int getSkillID() {
        return skillID;
    }

    public void setSkillID(int skillID) {
        this.skillID = skillID;
    }

    public SkillSet getSkill_set_ID() {
        return skill_set_ID;
    }

    public void setSkill_set_ID(SkillSet skill_set_ID) {
        this.skill_set_ID = skill_set_ID;
    }

    public Freelancer getFreelancerID() {
        return freelancerID;
    }

    public void setFreelancerID(Freelancer freelancerID) {
        this.freelancerID = freelancerID;
    }
     
    
}
