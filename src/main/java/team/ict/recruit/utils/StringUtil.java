package team.ict.recruit.utils;

import java.util.regex.Pattern;

public class StringUtil {
    public StringUtil() {
    }

    public static String clean_xss(String value) {

            if (value != null && value != null) {
                Pattern scriptPattern = Pattern.compile("<script>(.*?)</script>", 2);
                value = scriptPattern.matcher(value).replaceAll("");
                scriptPattern = Pattern.compile("</script>", 2);
                value = scriptPattern.matcher(value).replaceAll("");
                scriptPattern = Pattern.compile("<script(.*?)>", 42);
                value = scriptPattern.matcher(value).replaceAll("");
                scriptPattern = Pattern.compile("eval\\((.*?)\\)", 42);
                value = scriptPattern.matcher(value).replaceAll("");
                scriptPattern = Pattern.compile("e\u00adxpression\\((.*?)\\)", 42);
                value = scriptPattern.matcher(value).replaceAll("");
                scriptPattern = Pattern.compile("javascript:", 2);
                value = scriptPattern.matcher(value).replaceAll("");
                scriptPattern = Pattern.compile("vbscript:", 2);
                value = scriptPattern.matcher(value).replaceAll("");
                scriptPattern = Pattern.compile("onload(.*?)=", 42);
                value = scriptPattern.matcher(value).replaceAll("");
            }

            return value;
    }

    public static String clean_char(String value) {
        value = value.replaceAll("[`#$^&*+=|{}\\\\[\\\\]<>/#￥&——+|{}【】=]", "");
        return value;
    }

    public static boolean iscorrect_TelString(String value) {
        Pattern numberString = Pattern.compile("1[0-9]{10}");
        return numberString.matcher(value).matches();
    }

    public static boolean iscorrect_NumberString(String value) {
        Pattern numberString = Pattern.compile("[1-9][0-9]{4,14}");
        return numberString.matcher(value).matches();
    }
}
