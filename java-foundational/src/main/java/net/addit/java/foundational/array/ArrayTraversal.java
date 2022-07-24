package net.addit.java.foundational.array;

import java.util.Arrays;

/**
 * 数组的遍历
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/4 下午12:53
 * @since JDK8
 */
public class ArrayTraversal {
    public static void main(String[] args) {
        int[] scores=new int[]{100,90,80,85,75};
        for (int i = 0; i < scores.length; i++) {
            System.out.println("数组中第"+i+"个元素是："+scores[i]);
        }
        System.out.println(Arrays.toString(scores));
        System.out.print("[");
        for (int i = 0; i < scores.length; i++) {
            if(scores.length-1==i){
                System.out.println(scores[i]+"]");
            }else{
                System.out.print(scores[i]+", ");
            }


            }
        int sum=0;
        for (int i = 0; i < scores.length; i++) {
            sum+=scores[i];
        }
        int max=scores[0];
        for (int i = 1; i < scores.length; i++) {
            if(scores[i]>max){
                max=scores[i];
            }
        }
        System.out.println("最大值是："+max);
        int mean=0;
        int min=10000;
        max=0;
        for (int i = 0; i < scores.length; i++) {
            mean+=scores[i];
            if(scores[i]<min){
                min=scores[i];
            }
            if(scores[i]>max){
                max=scores[i];
            }
        }
        System.out.printf("(%d-%d-%d)/(%d-2)=%.1f",mean,min,max,scores.length,(mean-min-max)/(scores.length-2.0));
        System.out.println("数组平均值（去掉最大和最小值）是："+(mean-min-max)/(scores.length-2));
        }
    }

