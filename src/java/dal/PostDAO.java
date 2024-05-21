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
import Models.Categories;
import Models.Company;
import Models.Duration;
import Models.JobType;
import Models.Post;
import Models.Recruiter;


/**
 *
 * @author Admin
 */
public class PostDAO extends DBContext {

    public List<Post> TopPost() {
        List<Post> list = new ArrayList<>();
        String query = "  SELECT TOP(3) * FROM Post p \n"
                + "                 join JobType j on p.job_type_ID =  j.jobID\n"
                + "                 join Duration du on p.durationID =  du.durationID\n"
                + "                 join Recruiter re on p.recruiterID =  re.recruiterID\n"
                + "                 join Categories ca on p.caID = ca.caID\n"
                + "				 join Company co on re.companyID = co.companyID\n"
                + "                 ORDER BY quantity;";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Categories ca = new Categories(rs.getInt("caID"), rs.getString("categories_name"), rs.getString("categories_img"));
                Duration du = new Duration(rs.getInt("durationID"), rs.getString("duration_name"));
                Company com = new Company(rs.getInt("companyID"), rs.getString("company_name"), rs.getInt("team_number"), rs.getDate("established_on"), rs.getString("website"), rs.getString("describe"), rs.getString("location"));                       
                Recruiter re = new Recruiter(rs.getInt("recruiterID"), rs.getString("first_name"), rs.getString("last_name"), rs.getBoolean("gender"), rs.getDate("dob"), rs.getString("image"), rs.getString("email"), rs.getString("phone"), com);
                JobType job = new JobType(rs.getInt("jobID"), rs.getString("job_name"));
                list.add(new Post(rs.getInt("postID"), rs.getString("title"), rs.getString("image"), job, du, rs.getDate("date_post"), rs.getInt("quantity"), rs.getString("description"), rs.getInt("budget"), rs.getString("location"), rs.getString("skill"), re, ca));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        PostDAO p = new PostDAO();
        List<Post> c = p.TopPost();
        for (Post post : c) {
            System.out.println(post.toString());
        }
    }
}
