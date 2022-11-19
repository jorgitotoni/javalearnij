package net.addit.java.api.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

/**
 * 日期时间工具类
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/31 下午2:53
 * @since JDK11
 */
public class DateTimeUtils {

    public static final String STANDARD_DATE_FORMAT="yyyy-MM-dd HH:mm:ss";

    /**
     * 统计耗时
     * @param startTime 开始时间
     * @param endTime 结束时间
     * @return 耗时
     */
    public static long calculatorTime(long startTime,long endTime){
        if(startTime>endTime){
            throw new RuntimeException("结束时间早于起始时间");
        }
        //System.out.println("起始时间："+startTime);
        //System.out.println("结束时间："+endTime);
        long time=endTime-startTime;
        //System.out.println("程序耗时："+time+"毫秒");
        return time;
    }

    /**
     * 将指定日期对象按照标准的日期格式转换为字符串
     * @param date
     * @return
     */
    public static String date2Str(Date date){
        DateFormat dateFormat=new SimpleDateFormat(STANDARD_DATE_FORMAT);
        return dateFormat.format(date);
    }

    /**
     * 将指定日期对象按照指定的日期格式转换为字符串
     * @param date 日期对象
     * @return 日期字符串
     */
    public static String date2Str(Date date,String pattern){
        DateFormat dateFormat=new SimpleDateFormat(pattern);
        return dateFormat.format(date);
    }

    /**
     * 将日期字符串按照指定的日期格式转化为日期对象
     * @param source 日期字符串
     * @param pattern 字符格式
     * @return 日期对象
     */
    public static Date str2Date(String source, String pattern){
        DateFormat dateFormat=new SimpleDateFormat(pattern);
        Date parseDate=null;
        try {
            parseDate=dateFormat.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parseDate;
    }

    /**
     * 获取当前时间
     * @return
     */
    public static String getCurrentTime(){
        LocalTime localTime=LocalTime.now();
        return localTime.toString();
    }
}
