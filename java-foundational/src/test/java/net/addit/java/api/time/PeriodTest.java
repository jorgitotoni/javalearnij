package net.addit.java.api.time;

import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.Period;

/**
 * Period类的常用方法测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/8/18 下午2:47
 * @since JDK11
 */
public class PeriodTest {

    @Test
    public void testPeriodBetween(){
        LocalDate startDate = LocalDate.of(2021, 05, 04);
        LocalDate endDate = LocalDate.of(2023, 04, 05);

        Period dif = Period.between(startDate, endDate);
        System.out.println(dif);
        System.out.println(dif.getYears());
    }
}
