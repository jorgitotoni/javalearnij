package net.addit.java.api.time;

import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * TemporalAdjusters类的常用方法测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/8/22 下午1:16
 * @since JDK11
 */
public class TemporalAdjustersTest {

    /**
     * 测试TemporalAdjusters常用方法
     */
    @Test
    public void testTemporalAdjusters(){

        LocalDate currentDate= LocalDate.now();
        TemporalAdjuster temporalAdjuster = TemporalAdjusters.firstDayOfMonth();
        System.out.println("将当前日期改为这个月第一天的日期信息："+currentDate.with(temporalAdjuster));
        System.out.println("将当前日期改为今年第一天的日期信息："+currentDate.with(TemporalAdjusters.firstDayOfYear()));

        System.out.println("将当前日期改为这个月最后一天的日期信息："+currentDate.with(TemporalAdjusters.lastDayOfMonth()));
        System.out.println("将当前日期改为今年最后一天的日期信息："+currentDate.with(TemporalAdjusters.lastDayOfYear()));

    }
}
