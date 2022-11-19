package net.addit.java.api.math;

import org.testng.annotations.Test;

import javax.annotation.Tainted;
import java.math.BigInteger;

/**
 * BigInteger类常用方法的测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/8/3 下午12:22
 * @since JDK11
 */
public class BigIntegerTest {

    /**
     * int和long的取值范围
     */
    @Test
    public void testIntLongLimit(){
        int intMaxValue=Integer.MAX_VALUE;
        System.out.println("int类的最大范围是"+intMaxValue);

        long longMaxValue=Long.MAX_VALUE;
        System.out.println("long类的最大范围是"+longMaxValue);

    }

    /**
     * 测试biginteger类构造方法
     */
    @Test
    public void testBigIntegerConstructor(){
        BigInteger bigInteger=new BigInteger("9223372036854775807000");
        String data=bigInteger.toString();
        System.out.println("data="+data);
    }

    /**
     * 测试biginteger四则运算
     */
    @Test
    public void testBigIntegerMath(){
        BigInteger left=new BigInteger("9223372036854775807000");
        BigInteger right=new BigInteger("1000000000000000000000");
        BigInteger addResult=left.add(right);
        System.out.printf("%s+%s=%s\n",left,right,addResult);
        System.out.println("****************************");

        BigInteger subResult=left.subtract(right);
        System.out.printf("%s-%s=%s\n",left,right,subResult);
        System.out.println("****************************");


        BigInteger multiResult=left.multiply(right);
        System.out.printf("%s*%s=%s\n",left,right,multiResult);
        System.out.println("****************************");


        BigInteger divResult=left.divide(right);
        System.out.printf("%s/%s=%s\n",left,right,divResult);
        System.out.println("****************************");

        int intValue=divResult.intValue();
        long longValue=divResult.longValue();


    }

}
