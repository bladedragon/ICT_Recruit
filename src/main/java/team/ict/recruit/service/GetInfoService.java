package team.ict.recruit.service;

import com.alibaba.fastjson.JSONObject;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public interface GetInfoService {
    HSSFWorkbook getAllInfo();
}