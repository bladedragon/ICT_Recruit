package team.ict.recruit.model;

import lombok.Data;

@Data
public class Applicant {
    private String stuname;
    private String classid;
    private String stuid;
    private String telephone;
    private int college;
    private int grade;
    private String qid;
    private int rank_com;
    private int rank_spec;
    private String hobby;
    private String fill_time;
    private String experience;

    public Applicant(String stuname, String classid, String stuid, String telephone, int college, int grade, String qid, int rank_com, int rank_spec, String hobby, String fill_time, String experience) {
        this.stuname = stuname;
        this.classid = classid;
        this.stuid = stuid;
        this.telephone = telephone;
        if (college <= 5 && college > 0) {
            this.college = college;
        } else {
            this.college = 400;
        }

        if (grade <= 5 && grade > 0) {
            this.grade = grade;
        } else {
            this.grade = 400;
        }

        this.qid = qid;
        this.rank_com = rank_com;
        this.rank_spec = rank_spec;
        this.hobby = hobby;
        this.fill_time = fill_time;
        this.experience = experience;
    }


}
