package net.addit.java.api.lang;

import net.addit.java.api.util.StringUtiles;
import org.testng.annotations.Test;

/**
 * 字符串工具类测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/8/15 下午12:47
 * @since JDK11
 */
public class StringUtilsTest {

    /**
     * reverse方法进行字符串反转
     */
    @Test
    public void testStringUtilesReverse(){
        String str="Java";
        System.out.println(StringUtiles.reverse(str));
    }

    /**
     * arrayToString方法
     */
    @Test
    public void testStringUtilesArrayToString(){
        int[] array={1,2,3,4,5,6,7,8,9};
        System.out.println(StringUtiles.arrayToString(array));
    }

}
