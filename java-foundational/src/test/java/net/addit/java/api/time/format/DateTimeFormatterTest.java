package net.addit.java.api.time.format;

import net.addit.java.api.util.DateTimeUtils;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author tony 241963698@qq.com
 * @version 2022/8/19 下午12:57
 * @since JDK11
 */
public class DateTimeFormatterTest {

    LocalDate currentDate=LocalDate.now();

    /**
     * 转换日期时间格式
     */
    @Test
    public void testLocalDateFormat(){
        System.out.println("标准日期格式："+currentDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
        DateTimeFormatter customDateTimeFormatter = DateTimeFormatter.ofPattern(DateTimeUtils.STANDARD_DATE_FORMAT);
        System.out.println("自定义日期格式："+currentDate.format(customDateTimeFormatter));

    }

    /**
     * 日期字符串转为日期对象
     */
    @Test
    public void testLocalDateParse(){
        //标准日期格式：2022-08-19
        System.out.println("日期字符串转换为LocalDate对象后日期信息："+LocalDate.parse("2022-08-19"));
        DateTimeFormatter customDateTimeFormatter = DateTimeFormatter.ofPattern(DateTimeUtils.STANDARD_DATE_FORMAT);

        System.out.println("日期字符串转换为LocalDate对象后日期信息："+LocalDate.parse("2022年08月19日",customDateTimeFormatter));

    }
}
