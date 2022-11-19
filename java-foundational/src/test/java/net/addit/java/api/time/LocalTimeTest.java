package net.addit.java.api.time;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.LocalTime;

/**
 * java8时间api-LocalTime常用方法的测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/8/19 下午12:06
 * @since JDK11
 */
public class LocalTimeTest {

    LocalTime now= null;

    @BeforeClass
    public void initLocalTime(){
        now= LocalTime.now();
        System.out.println("当前时间是："+now);

    }

    /**
     * LocalTime对象实例获取
     */
    @Test
    public void testLocalTimeInstance(){

        LocalTime time = LocalTime.of(12, 07, 01);
        System.out.println("自定义时间是："+time);
    }

    /**
     * 获取时间相关信息
     */
    @Test
    public void testLocalTimeGetTimeInfo(){
        System.out.println("当前时间："+now.getHour()+"时"+now.getMinute()+"分");
    }

    /**
     * 修改时间信息
     */
    @Test
    public void testLocalTimeUpdateTime(){
        LocalTime withEightHour = now.withHour(8);
        System.out.println("修改时间"+withEightHour);
    }

    /**
     * 时间比较
     */
    @Test
    public void testLocalTimeIsBeforeIsAfter(){
        LocalTime withEightHour = now.withHour(8);

        System.out.println("当前时间是否在8点之前"+now.isBefore(withEightHour));
        System.out.println("当前时间是否在8点之后"+now.isAfter(withEightHour));
    }

    /**
     * 时间计算
     */
    @Test
    public void testLocalTimePlusMinus(){
        System.out.println("当前时间加1小时候时间信息："+now.plusHours(1));
    }
}
