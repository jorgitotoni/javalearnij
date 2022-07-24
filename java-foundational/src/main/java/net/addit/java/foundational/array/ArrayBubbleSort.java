package net.addit.java.foundational.array;

import java.util.Arrays;

/**
 * 数组冒泡排序
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/5 下午1:34
 * @since JDK8
 */
public class ArrayBubbleSort {
    public static void main(String[] args) {
        int[] numbers=new int[]{1,3,5,7,9,2,4,6,8};
        System.out.println("冒泡排序前的数组为："+ Arrays.toString(numbers));

        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = 0; j < numbers.length-i-1; j++) {
                if(numbers[j]>numbers[j+1]){
                    numbers[j]=numbers[j]^numbers[j+1];
                    numbers[j+1]=numbers[j]^numbers[j+1];
                    numbers[j]=numbers[j]^numbers[j+1];
                }else {
                    continue;
                }
            }
        }
        System.out.println("冒泡排序后的数组为："+ Arrays.toString(numbers));
    }
}
