package net.addit.java.api.util;

import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * 自定义数组工具类的测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/31 下午2:35
 * @since JDK11
 */
public class ArrayUtilsTest {

    /**
     * 测试生成随机数组
     */
    @Test
    public void testGeneratorArray(){
        int[] numbers=ArrayUtils.generatorArray(10);
        System.out.println(Arrays.toString(numbers));
    }

    /**
     * 测试生成随机数组
     */
    @Test
    public void testGeneratorArrayBound(){
        int[] numbers=ArrayUtils.generatorArray(10,100);
        System.out.println(Arrays.toString(numbers));
    }
}
