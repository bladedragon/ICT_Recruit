package team.ict.recruit.service;

import com.alibaba.fastjson.JSONObject;
import org.apache.poi.ss.formula.functions.T;

import java.util.List;
import java.util.Set;

public interface AddInfoService {
    List<String> addInfo(JSONObject postMsg);
}
