package net.addit.java.foundational.array;

import java.util.Arrays;

/**
 * 数组反转
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/4 下午1:33
 * @since JDK8
 */
public class ArrayTransverse {
    public static void main(String[] args) {
        int[] scores=new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(scores));
        for (int i = 0; i < scores.length/2; i++) {
            scores[i]=scores[scores.length-i-1]^scores[i];
            scores[scores.length-i-1]=scores[scores.length-i-1]^scores[i];
            scores[i]=scores[scores.length-i-1]^scores[i];
        }
        System.out.println(Arrays.toString(scores));

        int startIndex=0;
        int endIndex=scores.length-1;
        while(startIndex<endIndex){
            scores[startIndex]=scores[endIndex]^scores[startIndex];
            scores[endIndex]=scores[startIndex]^scores[endIndex];
            scores[startIndex]=scores[startIndex]^scores[endIndex];
            startIndex++;
            endIndex--;
        }
        System.out.println(Arrays.toString(scores));
    }
}
