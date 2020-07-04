package com.zd.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ProjectName: SSM_Demo1
 * @Package: com.zd.utils
 * @ClassName: DateUtils
 * @Author: 晴天
 * @Date: 2020/4/7 16:42
 * @Version: 1.0
 */
public class DateUtils {
    //日期转换为字符串
    public static String date2String(Date date, String patt){
        SimpleDateFormat sdf = new SimpleDateFormat(patt);
        String format = sdf.format(date);
        return format;
    }
    //字符串转换为日期
    public static Date string2Date(String str,String patt) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat(patt);
        Date parse = sdf.parse(str);
        return parse;
    }

}
