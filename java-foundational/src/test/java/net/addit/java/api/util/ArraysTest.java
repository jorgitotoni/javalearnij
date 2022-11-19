package net.addit.java.api.util;

import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * Arrays类方法的测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/31 下午2:25
 * @since JDK11
 */
public class ArraysTest {

    private static final int LENGTH=1_0000;

    /**
     * sort()方法的测试
     * @see Arrays#sort(int[]) 
     */
    @Test
    public void testArraysSort(){
        int[] numbers=ArrayUtils.generatorArray(10);
        System.out.println("排序前的数组："+Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("排序后的数组："+Arrays.toString(numbers));
    }

    /**
     * 测试Arrays.sort()方法耗时
     */
    @Test
    public void testArraySortTime(){
        int[] numbers=ArrayUtils.generatorArray(LENGTH);
        long startTime=System.currentTimeMillis();
        Arrays.sort(numbers);
        long endTime=System.currentTimeMillis();
        DateTimeUtils.calculatorTime(startTime,endTime);
    }

    /**
     * 测试ArrayUtils包自写冒泡排序用时
     */
    @Test
    public void testArrayUtilsBubbleSortTime(){
        int[] numbers=ArrayUtils.generatorArray(LENGTH);
        long startTime=System.currentTimeMillis();
        net.addit.java.foundational.method.ArrayUtils.bubbleSort(numbers);
        long endTime=System.currentTimeMillis();
        DateTimeUtils.calculatorTime(startTime,endTime);
    }

    /**
     * 测试Arrays二分法查找方法
     */
    @Test
    public void testArraysBinarySearch(){
        int[] numbers=ArrayUtils.generatorArray(LENGTH,100_0000);
        Arrays.sort(numbers);
        int target=60000;
        long startTime=System.currentTimeMillis();
        int targetIndex=Arrays.binarySearch(numbers,target);
        long endTime=System.currentTimeMillis();
        System.out.println("目标索引为："+targetIndex);
        DateTimeUtils.calculatorTime(startTime,endTime);
    }
}
