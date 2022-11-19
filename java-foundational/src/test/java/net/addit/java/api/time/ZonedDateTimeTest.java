package net.addit.java.api.time;

import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;
import java.util.TreeSet;

/**
 * 带时区的时期时间常用方法的测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/8/22 下午12:42
 * @since JDK11
 */
public class ZonedDateTimeTest {

    /**
     * 获取可用的时区信息
     */
    @Test
    public void testGetZoneInfo(){
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
//        for (String availableZoneId : availableZoneIds) {
//            System.out.println(availableZoneId);
//        }

        TreeSet<String> avilableZoneIdsTreeSet=new TreeSet<>(availableZoneIds);
        //将可用的时区信息变成有序而且打印输出在控制台，每行打印一个时区
        avilableZoneIdsTreeSet.forEach(System.out::println);

        ZoneId zoneId = ZoneId.of("Asia/Tokyo");
        System.out.println("东京的时区信息："+zoneId);

        ZoneId defaultZoneId = ZoneId.systemDefault();
        System.out.println("系统默认的时区信息："+defaultZoneId);

    }

    /**
     * ZonedDateTime实例
     */
    @Test
    public void testZonedDateTimeGetInstance(){
        ZonedDateTime defaultZonedDateTime = ZonedDateTime.now();
        System.out.println("系统默认时区的日期时间信息："+defaultZonedDateTime);

        ZoneId tokyoZoneId = ZoneId.of("Asia/Tokyo");
        ZonedDateTime tokyoZoneDateTime = ZonedDateTime.now(tokyoZoneId);
        System.out.println("亚洲/东京时区的日期时间信息："+tokyoZoneDateTime);

        LocalDateTime currentDateTime= LocalDateTime.now();
        ZonedDateTime wrapperCurrentDateTimeToTokyoZoneDateTime = ZonedDateTime.of(currentDateTime,tokyoZoneId);
        System.out.println("将当前日期时间包装成亚洲/东京时区的日期时间："+wrapperCurrentDateTimeToTokyoZoneDateTime);
    }

}
