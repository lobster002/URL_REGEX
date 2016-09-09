package sky.com.myapplication;

import android.text.TextUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Sky on 2016/9/9.
 */
public class TextUtil {

    private static boolean regexCheck(String text, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text.trim());
        return matcher.matches();
    }

    public static boolean regexCheckUrl(String text) {
        if(TextUtils.isEmpty(text)){
            return false;
        }
        final String URL_REGEX = "^(http://lingpai.2144.cn)(?=.*?qrcodeLogin).+$";
//        final String URL_REGEX = "(lingpai.2144.cn|qrcodeLogin)";
        return regexCheck(text, URL_REGEX);
    }
}
