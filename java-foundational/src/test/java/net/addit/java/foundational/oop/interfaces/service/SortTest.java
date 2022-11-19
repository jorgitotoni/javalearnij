package net.addit.java.foundational.oop.interfaces.service;

import java.util.Arrays;

/**
 * 接口的案例：接口作为方法的形参-对象数组排序的测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/25 下午1:34
 * @since JDK11
 */
public class SortTest {
    public static void main(String[] args) {

        Cellphone[] cellphones={
                new Cellphone("小米11Ultra","小米",6999,"黑色",228),
                new Cellphone("三星S21Ultra","三星",10999,"黑色",198),
                new Cellphone("华为Mate40","华为",7999,"白色",200),

        };

        //增强for循环
        System.out.println("排序之前");
        for (Cellphone cellphone : cellphones) {
            System.out.println(cellphone);
        }

        sort(cellphones,new SortByPrice());

        System.out.println("排序之后");
        for (Cellphone cellphone : cellphones) {
            System.out.println(cellphone);
        }
        //打成一行
        //System.out.println(Arrays.toString(cellphones));

        sort(cellphones,new SortByWeight());

        System.out.println("排序之后");
        for (Cellphone cellphone : cellphones) {
            System.out.println(cellphone);
        }
    }

    public static void sort(Cellphone[] cellphones,Comparator comparator){
        for (int i = 0; i < cellphones.length-1; i++) {
            for (int j = 0; j < cellphones.length-1-i; j++) {
                if(comparator.compare(cellphones[j],cellphones[j+1])>0){
                    Cellphone temp=cellphones[j];
                    cellphones[j]=cellphones[j+1];
                    cellphones[j+1]=temp;
                }
            }
        }
    }
}
