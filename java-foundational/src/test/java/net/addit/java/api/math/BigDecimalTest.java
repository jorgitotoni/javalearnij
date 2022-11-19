package net.addit.java.api.math;

import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 超大浮点数常用方法的测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/8/3 下午12:47
 * @since JDK11
 */
public class BigDecimalTest {

    /**
     * 浮点数的精度问题
     */
    @Test
    public void testFloatPrecision(){
        System.out.println("1.0 - 0.32 = "+(1.0-0.32));
    }

    /**
     * bigdecimal类构造方法
     */
    @Test
    public void testBigDecimalConstructor(){
//        BigDecimal left=new BigDecimal(1.0);
//        BigDecimal right=new BigDecimal(0.32);
        BigDecimal left=new BigDecimal("1.0");
        BigDecimal right=new BigDecimal("0.32");

        BigDecimal subResult = left.subtract(right);
        System.out.printf("%s+%s=%s\n",left,right,subResult);

        BigDecimal divResult=left.divide(right,2, RoundingMode.HALF_UP);
        System.out.printf("%s/%s=%s\n",left,right,divResult);


    }
}
