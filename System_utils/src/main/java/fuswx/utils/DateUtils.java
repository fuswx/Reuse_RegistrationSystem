package fuswx.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    //日期转换成字符串
    public static String dateToString(Date date, String patt){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(patt);
        return simpleDateFormat.format(date);
    }

    //字符串转换为日期
    public static Date stringToDate(String str,String patt) throws ParseException {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(patt);
        return simpleDateFormat.parse(str);
    }
}
