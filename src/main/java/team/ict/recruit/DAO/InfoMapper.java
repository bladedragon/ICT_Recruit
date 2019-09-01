package team.ict.recruit.DAO;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import team.ict.recruit.model.Applicant;
import team.ict.recruit.model.VerifyGroup;

import java.util.List;

@Mapper
@Component
public interface InfoMapper {
    @Insert({"Insert into apply_t (stuname,classid,stuid,telephone,college,grade,qid,rank_com,rank_spec,hobby,fill_time,experience) value(#{stuname},#{classid},#{stuid},#{telephone},#{college},#{grade},#{qid},#{rank_com},#{rank_spec},#{hobby},#{fill_time},#{experience})"})
    void insertInfo(Applicant applicant);

    @Select({"SELECT stuname,stuid FROM apply_t WHERE stuname = #{stuname} AND stuid = #{stuid}"})
    VerifyGroup selectRepeat(@Param("stuname") String stuname, @Param("stuid") String stuid);

    @Select({"SElECT stuname,classid,stuid,telephone,college,grade,qid,rank_com,rank_spec,hobby,fill_time,experience FROM apply_t"})
    List<Applicant> getAllInfo();
    }
