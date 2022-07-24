package net.addit.java.foundational.array;

import java.util.Arrays;

/**
 * 数组的选择排序
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/5 下午1:55
 * @since JDK8
 */
public class ArraySelectSort {
    public static void main(String[] args) {
        int[] numbers=new int[]{1,3,5,7,9,2,4,6,8};
        System.out.println("选择排序前的数组为："+ Arrays.toString(numbers));

        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[i]>numbers[j]){
                    numbers[i]=numbers[j]^numbers[i];
                    numbers[j]=numbers[j]^numbers[i];
                    numbers[i]=numbers[j]^numbers[i];
                }else {
                    continue;
                }
            }
        }
        System.out.println("选择排序后的数组为："+ Arrays.toString(numbers));
    }
}
