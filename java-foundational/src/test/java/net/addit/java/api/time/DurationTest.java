package net.addit.java.api.time;

import org.testng.annotations.Test;

import java.time.Duration;
import java.time.LocalTime;

/**
 * 时间差Duration类测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/8/19 下午12:52
 * @since JDK11
 */
public class DurationTest {

    /**
     * between方法
     */
    @Test
    public void testDurationBetween(){
        LocalTime startTime= LocalTime.of(5,30,00);
        LocalTime endTime = LocalTime.of(7, 00, 00);
        Duration duration = Duration.between(startTime, endTime);
        System.out.println(duration);
        System.out.println("两个时间相隔"+duration.getSeconds()+"秒");
    }
}
