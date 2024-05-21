/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Admin
 */
public class SkillSet {
    int skill_set_ID;
    String skill_set_name;

    public SkillSet() {
    }

    public SkillSet(int skill_set_ID, String skill_set_name) {
        this.skill_set_ID = skill_set_ID;
        this.skill_set_name = skill_set_name;
    }

    public int getSkill_set_ID() {
        return skill_set_ID;
    }

    public void setSkill_set_ID(int skill_set_ID) {
        this.skill_set_ID = skill_set_ID;
    }

    public String getSkill_set_name() {
        return skill_set_name;
    }

    public void setSkill_set_name(String skill_set_name) {
        this.skill_set_name = skill_set_name;
    }
    
    
}
