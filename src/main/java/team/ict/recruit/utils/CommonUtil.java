package team.ict.recruit.utils;

import com.alibaba.fastjson.JSONObject;

public class CommonUtil {
    public CommonUtil() {
    }

    public static String returnFormat(int code, String msg) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("msg", msg);
        jsonObject.put("code", code);
        System.out.println(jsonObject.toString());
        return jsonObject.toString();
    }

    public static String changeToCollege(int num) {
        String college = "";
        switch(num) {
            case 1:
                college = "通信工程";
                break;
            case 2:
                college = "电子信息工程";
                break;
            case 3:
                college = "信息工程";
                break;
            case 4:
                college = "数字媒体技术";
                break;
            case 5:
                college = "其他";
                break;
            default:
                college = "null";
        }

        return college;
    }

    public static String changeToGrade(int num) {
        String college = "";
        switch(num) {
            case 1:
                college = "大一";
                break;
            case 2:
                college = "大二";
                break;
            case 3:
                college = "大三";
                break;
            case 4:
                college = "大四";
                break;
            case 5:
                college = "其他";
                break;
            default:
                college = "null";
        }

        return college;
    }
}
