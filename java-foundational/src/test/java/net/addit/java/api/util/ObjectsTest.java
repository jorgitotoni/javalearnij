package net.addit.java.api.util;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Objects;

/**
 * Objects常用方法的测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/30 上午9:54
 * @since JDK11
 */
public class ObjectsTest {

    /**
     * 测试String类的equals()方法，体会空指针异常
     * @see String#equals(Object)
     */
    @Test
    public void testStringEquals(){

        String str1=null;
        String str2="tony";

        System.out.println(str2.equals(str1));

        System.out.println(str1.equals(str2));
    }

    /**
     * 测试Objects类的equals()方法
     * @see java.util.Objects#equals(Object, Object)
     */
    @Test
    public void testObjectsEquals(){
        String str1=null;
        String str2="tony";
        System.out.println(Objects.equals(str1, str2));
        System.out.println(Objects.equals(str2, str1));
        boolean result=Objects.equals(str1, str2);
        //如果成立就不报错
        Assert.assertEquals(result,false);
    }

    /**
     * 测试Objects类的nonNull()方法
     * @see Objects#nonNull(Object)
     */
    @Test
    public void testObjectsNonNull(){
        String str="";
        Assert.assertEquals(Objects.nonNull(str),true);
        str=null;
        Assert.assertEquals(Objects.nonNull(str),false);

    }

    /**
     * 测试Objects类的requireNonNull()方法
     * @see Objects#requireNonNull(Object)
     */
    @Test
    public void testObjectsRequireNonNull(){
        String str="tony";
        String result=Objects.requireNonNull(str);
        System.out.println("result="+result);
        str=null;
        Objects.requireNonNull(str);
    }

}
