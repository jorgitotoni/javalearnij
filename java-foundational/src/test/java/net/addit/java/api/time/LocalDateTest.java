package net.addit.java.api.time;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * Java8-日期API-本地日期常用方法的测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/8/18 下午12:50
 * @since JDK11
 */
public class LocalDateTest {

    LocalDate now = LocalDate.now();

    @BeforeClass
    public void initLocalDate(){
        System.out.println("当前的日期信息："+now);
    }

    /**
     * 获取LocalDate实例
     */
    @Test
    public void testLocalDateInstance(){
        //LocalDate now = LocalDate.now();
        System.out.println("当前的日期信息："+now);

        LocalDate date = LocalDate.of(2021, 05, 04);
        System.out.println("设置日期信息："+date);
    }

    /**
     * 获取LocalDate对象中的信息
     */
    @Test
    public void testLocalDateGetDateInfo(){
        int year = now.getYear();
        Month month = now.getMonth();
        int dayOfMonth = now.getDayOfMonth();
        System.out.printf("当前日期为： %d年 %d月 %d日\n",year,month.getValue(),dayOfMonth);

        boolean leapYear = now.isLeapYear();
        System.out.println("当前的年份是否是闰年："+leapYear);

        LocalDate customDate=LocalDate.of(2016,02,02);
        leapYear=customDate.isLeapYear();
        System.out.println("2016年是否是闰年："+leapYear);

        System.out.printf("今年有%d天\n",now.lengthOfYear());
        System.out.printf("本月有%d天\n",now.lengthOfMonth());

        System.out.printf("今天是本周的第%d天\n",now.getDayOfWeek().getValue());
        System.out.printf("今天是今年的第%d天\n",now.getDayOfYear());

    }

    /**
     * LocalDate日期的修改
     */
    @Test
    public void testLocalDateUpdate(){
        LocalDate withYearDate = now.withYear(2018);
        System.out.println("将当前日期的年份改成2018年后的日期信息："+withYearDate);
        LocalDate withMonthDate = now.withMonth(3);
        System.out.println("将当前日期的月份改成3后的日期信息："+withMonthDate);
        LocalDate withDayOfMonthDate = now.withDayOfMonth(1);
        System.out.println("将当前日期的天改成1后的日期信息："+withDayOfMonthDate);

        //链式编程
        LocalDate offsetDate = now.withYear(2018).withMonth(4).withDayOfMonth(1);
        System.out.println("将当前日期修改后的日期信息："+offsetDate);

        LocalDate withDate = now.with(ChronoField.YEAR, 2019);
        System.out.println("将当前日期修改后的日期信息："+withDate);

    }

    /**
     * 日期的运算
     */
    @Test
    public void testLocalDatePlusMinus(){
        LocalDate oneYearAfterDate = now.plusYears(1);
        System.out.println("一年以后的日期是："+oneYearAfterDate);
        LocalDate threeMonthAfterDate = now.plusMonths(3);
        System.out.println("三个月以后的日期是："+threeMonthAfterDate);
        LocalDate oneYearBeforeDate = now.minusYears(1);
        System.out.println("一年以前的日期是："+oneYearBeforeDate);
        LocalDate fiveDaysBeforeDate = now.minus(5, ChronoUnit.DAYS);
        System.out.println("5天以前的日期是："+fiveDaysBeforeDate);

    }

    /**
     * 日期的比较
     */
    @Test
    public void testLocalDateIsBeforeIsAfter(){
        LocalDate oneYearAfterDate = now.plusYears(1);
        System.out.println("一年以后的日期是："+oneYearAfterDate);
        LocalDate oneYearBeforeDate = now.minusYears(1);
        System.out.println("一年以前的日期是："+oneYearBeforeDate);
        boolean before = now.isBefore(oneYearAfterDate);
        boolean after = now.isAfter(oneYearBeforeDate);
        System.out.println("now.isBefore(oneYearAfterDate)"+before);
        System.out.println("now.isAfter(oneYearBeforeDate)"+after);
    }
}
