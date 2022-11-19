package net.addit.java.api.time;

import org.testng.annotations.Test;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * 时间戳的常用方法测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/8/22 下午1:02
 * @since JDK11
 */
public class InstantTest {

    /**
     * 获取实例
     */
    @Test
    public void testInstantGetInstance(){
        Instant currentInstant = Instant.now();
        System.out.println("当前的时间戳："+currentInstant);

        Instant plusThreeSecondsInstant = Instant.ofEpochSecond(3);
        System.out.println("当前标准基准时间（UTC时间）加上3秒的时间戳"+plusThreeSecondsInstant);

        Instant plusFourSecondsInstant = Instant.ofEpochSecond(3, 1_000_000_000);
        System.out.println("当前标准基准时间（UTC时间）加上4秒的时间戳"+plusFourSecondsInstant);

    }

    /**
     * Instant转换为ZonedDateTime
     */
    @Test
    public void testInstant2ZonedDateTime(){
        Instant currentInstant = Instant.now();

        ZoneId shanghaiZoneId = ZoneId.of("Asia/Shanghai");
        ZonedDateTime shanghaiZoneDateTime = currentInstant.atZone(shanghaiZoneId);
        System.out.println("亚洲/上海时区的日期时间是："+shanghaiZoneDateTime);

        ZoneId tokyoZoneId = ZoneId.of("Asia/Tokyo");
        ZonedDateTime tokyoZoneDateTime = currentInstant.atZone(tokyoZoneId);
        System.out.println("亚洲/东京时区的日期时间是："+tokyoZoneDateTime);
    }
}
