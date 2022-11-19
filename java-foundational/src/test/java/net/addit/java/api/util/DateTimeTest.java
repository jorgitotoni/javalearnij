package net.addit.java.api.util;

import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期时间常用方法的测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/8/15 下午1:17
 * @since JDK11
 */
public class DateTimeTest {

    /**
     * Date构造方法
     */
    @Test
    public void testDateConstructor(){
        Date currentDate=new Date();
        System.out.println("当前日期时间："+currentDate);

        Date offsetDate=new Date(2000);
        //1970年01月01日 08：00：:02
        System.out.println("offset日期时间："+offsetDate);

    }

    /**
     * getTime和setTime方法
     * @see Date#getTime()
     * @see Date#setTime(long)
     */
    @Test
    public void testDateTimeSetTime(){
        Date currentDate=new Date();
        System.out.println("当前时间距离标准时间的毫秒数"+currentDate.getTime());
        System.out.println("当前时间距离标准时间的毫秒数"+System.currentTimeMillis());

        currentDate.setTime(2000);
        System.out.println("currentDate="+currentDate);
    }

    /**
     * 比较日期前后
     */
    @Test
    public void testDateBeforeAfter(){
        Date date1=new Date();
        date1.setTime(2000);

        Date date2=new Date();

        System.out.println("date1.before(date2)"+date1.before(date2));
        System.out.println("date2.before(date1)"+date2.before(date1));

    }

    /**
     * DateFormat构造方法和常用方法
     */
    @Test
    public void testDateFormatConstructor(){
        Date date=new Date();
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = dateFormat.format(date);
        System.out.println("当前日期默认为："+date);
        System.out.println("当前日期格式化后为："+dateString);

        String source="2022-08-16 13:32:29";
        try {
            Date parseDate = dateFormat.parse(source);
            System.out.println("改为日期对象后日期为："+parseDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
