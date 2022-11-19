package net.addit.java.api.util;

import org.testng.annotations.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 日历的常用方法测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/8/17 下午12:50
 * @since JDK11
 */
public class CalenderTest {

    /**
     * 创建calendar对象
     */
    public void testCalenderInstance(){
        //Calendar gregorianCalendar=new GregorianCalendar();

        Calendar calendar=Calendar.getInstance();
    }

    /**
     * get方法获取日期时间信息
     */
    @Test
    public void testCalendarGet(){
        Calendar calendar=Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.printf("日历的日期时间信息为：%d年 %d月 %d日 %d时 %d分 %d秒\n",year,month,day,hour,minute,second);

    }

    /**
     * 设置日期时间
     */
    @Test
    public void testCalendarSetAdd(){
        Calendar calendar=Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.printf("日历的日期时间信息为：%d年 %d月 %d日 %d时 %d分 %d秒\n",year,month,day,hour,minute,second);

        calendar.set(Calendar.YEAR,1999);
        year = calendar.get(Calendar.YEAR);
        System.out.printf("set后的日期时间信息为：%d年 %d月 %d日 %d时 %d分 %d秒\n",year,month,day,hour,minute,second);

        calendar.add(Calendar.YEAR,22);
        year = calendar.get(Calendar.YEAR);
        System.out.printf("add后的日期时间信息为：%d年 %d月 %d日 %d时 %d分 %d秒\n",year,month,day,hour,minute,second);

    }

    /**
     * setTime方法将Date对象转换为Calendar对象
     */
    @Test
    public void testCalendarSetTime(){
        Date currentDate=new Date();
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(currentDate);

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.printf("date的日期时间信息为：%d年 %d月 %d日 %d时 %d分 %d秒\n",year,month,day,hour,minute,second);

    }

    /**
     * before和after方法比较Calendar对象
     */
    @Test
    public void testCalendarBeforeAfter(){
        Calendar calendar1=Calendar.getInstance();

        Date offsetDate=new Date(2000);

        Calendar calendar2=Calendar.getInstance();
        calendar2.setTime(offsetDate);

        System.out.println("calendar1 日历对象对应的年份："+calendar1.get(Calendar.YEAR));
        System.out.println("calendar2 日历对象对应的年份："+calendar2.get(Calendar.YEAR));

        System.out.println("calendar1.before(calendar2):"+calendar1.before(calendar2));
        System.out.println("calendar1.after(calendar2):"+calendar1.after(calendar2));

    }
}
