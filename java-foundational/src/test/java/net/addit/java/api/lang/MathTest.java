package net.addit.java.api.lang;

import org.testng.annotations.Test;

/**
 * 数学工具类常用方法的测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/8/3 下午1:14
 * @since JDK11
 */
public class MathTest {

    @Test
    public void testMath(){
        System.out.println("-10.32的绝对值是"+Math.abs(-10.32));

        int left=10;
        int right=20;
        System.out.println("两个数的最大值是"+Math.max(left,right));
        System.out.println("两个数的最小值是"+Math.min(left,right));

        System.out.println(Math.ceil(10.3));
        System.out.println(Math.floor(10.3));
        System.out.println(Math.pow(3.3, 2.2));
        System.out.println(Math.sqrt(4));
    }
}
