package team.ict.recruit.controller;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import team.ict.recruit.service.AddInfoService;
import team.ict.recruit.utils.CommonUtil;

import java.util.List;

@Slf4j
@RestController
public class AddInfoController {
    @Autowired
    AddInfoService addInfoServiceImp;

    @PostMapping(value = "/addInfo",produces = "application/json;charset=UTF-8")
    public String addInfo(@RequestBody JSONObject postMsg) {
        if (!postMsg.containsKey("rank_com")) {
            postMsg.put("rank_com", 0);
        }

        if (!postMsg.containsKey("rank_spec")) {
            postMsg.put("rank_spec", 0);
        }

        if (!postMsg.containsKey("qid")) {
            postMsg.put("qid", 44444444);
        }

        if (!postMsg.containsKey("hobby")) {
            postMsg.put("hobby", "");
        }

        log.info(">>>>>添加一条数据：" + postMsg);
        List<String> result = addInfoServiceImp.addInfo(postMsg);

        System.out.println(result.get(0)+result.get(1));
        return CommonUtil.returnFormat(Integer.parseInt(result.get(0)), result.get(1));
    }
}
