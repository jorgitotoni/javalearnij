package net.addit.java.api.time;

import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * java8 日期时间api-LocalDateTime常用方法
 *
 * @author tony 241963698@qq.com
 * @version 2022/8/19 下午12:41
 * @since JDK11
 */
public class LocalDateTimeTest {

    /**
     * 获取实例
     */
    @Test
    public void testLocalDateTimeInstance(){
        LocalDateTime currentDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("当前日期时间信息："+currentDateTime);

        LocalDateTime now = LocalDateTime.now();
        System.out.println("当前日期时间信息："+currentDateTime);

        LocalDateTime offsetTime = LocalDateTime.of(1985, 02, 21, 8, 00, 00);
        System.out.println("设定的日期时间信息："+offsetTime);
    }

    /**
     * 获取Date\Time对象
     */
    @Test
    public void testLocalDateTimeGetLocalDateGetLocalTime(){
        LocalDateTime now = LocalDateTime.now();
        LocalDate currentDate = now.toLocalDate();
        System.out.println("当前日期信息："+currentDate);
        LocalTime currentTime = now.toLocalTime();
        System.out.println("当前时间信息："+currentTime);

    }
}
