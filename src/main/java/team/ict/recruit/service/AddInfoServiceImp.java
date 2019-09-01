package team.ict.recruit.service;

import com.alibaba.fastjson.JSONObject;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.ict.recruit.DAO.InfoMapper;
import team.ict.recruit.model.Applicant;
import team.ict.recruit.model.VerifyGroup;
import team.ict.recruit.utils.StringUtil;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class AddInfoServiceImp implements AddInfoService {
    @Autowired
    InfoMapper infoMapper;

    public List<String> addInfo(JSONObject postMsg) {
        List<String> list = new ArrayList<>();
        if (postMsg.getString("stuname") == null) {
            list.add("410");
            list.add("student's name cannot be null");
            return list;
        } else {
            String stuname = StringUtil.clean_char(postMsg.getString("stuname"));
            String classid = postMsg.getString("classid");
            if (classid.length() != 8) {
                list.add("411");
                list.add("classid is incorrect");
                return list;
            } else {
                String stuid = postMsg.getString("stuid");
                if (stuid.length() != 10) {
                    list.add("412");
                    list.add( "stuid is incorrect");
                    return list;
                } else {
                    VerifyGroup verifyGroup = this.infoMapper.selectRepeat(stuname, stuid);
                    if (verifyGroup != null) {
                        list.add("413");
                       list.add("student \"" + stuname + "\",stuID \"" + stuid + "\" has recruited already.");
                        return list;
                    } else {
                        String telephone = postMsg.getString("telephone");
                        if (!StringUtil.iscorrect_TelString(telephone)) {
                            list.add("414");
                            list.add( "telephone is incorrect");
                            return list;
                        } else {
                            String qid = postMsg.getString("qid");
                            if (!StringUtil.iscorrect_NumberString(qid)) {
                                list.add("415");
                                list.add("qq number is incorrect");
                                return list;
                            } else {
                                int college;
                                if (postMsg.getInteger("college") != null) {
                                    college = postMsg.getInteger("college");
                                } else {
                                    college = 5;
                                }

                                int grade;
                                if (postMsg.getInteger("grade") != null) {
                                    grade = postMsg.getInteger("grade");
                                } else {
                                    grade = 5;
                                }

                                int rank_com;
                                if (postMsg.getInteger("rank_com") != null) {
                                    rank_com = postMsg.getInteger("rank_com");
                                } else {
                                    rank_com = 0;
                                }

                                int rank_spec;
                                if (postMsg.getInteger("rank_spec") != null) {
                                    rank_spec = postMsg.getInteger("rank_spec");
                                } else {
                                    rank_spec = 0;
                                }

                                String hobby;
                                String experience;
                                if (postMsg.getString("hobby") != null && postMsg.getString("experience") != null) {
                                    hobby = StringUtil.clean_xss(postMsg.getString("hobby"));
                                    hobby = StringUtil.clean_char(hobby);
                                    experience = StringUtil.clean_xss(postMsg.getString("experience"));
                                    experience = StringUtil.clean_char(experience);
                                } else {
                                    hobby = "";
                                    experience = "";
                                }

                                SimpleDateFormat f_date = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                                String date = f_date.format(new Date());
                                this.infoMapper.insertInfo(new Applicant(stuname, classid, stuid, telephone, college, grade, qid, rank_com, rank_spec, hobby, date, experience));
                                list.add("200");
                                list.add("success");
                                return list;
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        JSONObject demo = new JSONObject();
        demo.put("stuname", "zzz");
        demo.put("stuid", "2017210246");
        demo.put("classid", "01011702");
        demo.put("telephone", "17384705872");
        demo.put("college", 1);
        demo.put("grade", 3);
        demo.put("qid", "1156673039");
        demo.put("rank_spec", 100);
        demo.put("hobby", "hhhhhhh");
        if (!demo.containsKey("rank_com")) {
            demo.put("rank_com", 0);
        }

        AddInfoServiceImp addInfoServiceImp = new AddInfoServiceImp();
        System.out.println(addInfoServiceImp.addInfo(demo));
    }
}

