package net.addit.java.foundational.method;

import java.util.Arrays;

/**
 * 方法的基本应用
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/8 下午1:38
 * @since JDK8
 */
public class BasicUtils {
    /**
     * 比较两个整数是否相等
     * @param left 第一个操作数
     * @param right 第二个操作数
     * @return
     */
    public static boolean compare(int left,int right){
        return left==right;
    }

    /**
     * 返回一个区间的整数和
     * @param start 开始整数
     * @param end 结束整数
     * @return
     */
    public static int sum(int start,int end){
        int result=0;
        for (int i = start; i <=end ; i++) {
            result+=i;
        }
        return result;
    }

    public static void printContent(int count,String content){
        if(count>0){
            for (int i = 0; i <count ; i++) {
                System.out.println(content);
            }
        }else{
            System.out.println("count必须大于0");
        }
    }

    /**
     * 冒泡排序
     * @param numbers 数组
     */
    public static void bubbleSort(int[] numbers){

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

    public static int binaryResearch(int target,int[] numbers){
        int start=0;
        int end=numbers.length-1;
        int targetIndex=-1;
        int count=0;
        //不明确循环次数，所以用while循环
        while (start<=end){
            count++;
            int mid=(start+end)/2;

            if(numbers[mid]==target){
                targetIndex=mid;
                break;
            }else if(numbers[mid]>target){
                end=mid-1;
            }else if(numbers[mid]<target){
                start=mid+1;
            }
        }
        if(targetIndex!=-1){
            System.out.println("要寻找的"+target+"序号是"+targetIndex+"，共计查找次数为"+count);
        }else{
            System.out.println("要寻找的"+target+"不存在，共计查找次数为"+count);
        }
        return targetIndex;
    }

    public static void printContent2(String[] contentes){
        for (int i = 0; i < contentes.length; i++) {
            System.out.println(contentes[i]);
        }
    }

    public static void printContent3(String... contentes){
        for (int i = 0; i < contentes.length; i++) {
            System.out.println(contentes[i]);
        }
    }

    public static int[] add(int[] numbers,int number){
        if(numbers==null){
            return null;
        }
        int[] newNumbers=new int[numbers.length+1];
        for (int i = 0; i < numbers.length; i++) {
            newNumbers[i]=numbers[i];
        }
        newNumbers[numbers.length]=number;
        return newNumbers;
    }

    public static int[] deleteIndex(int[] numbers, int index){
        if(index>numbers.length-1 || index<0){
            return null;
        }
        int[] newNumbers=new int[numbers.length-1];
        for (int i = 0; i < numbers.length; i++) {
            if(i<index){
                newNumbers[i]=numbers[i];
            }else if(i>index){
                newNumbers[i-1]=numbers[i];
            }
        }
        return newNumbers;
    }

    public static int[] deleteElement(int[] numbers,int number){
        int[] newNumbers=new int[numbers.length-1];
        int index=-1;
        for (int i = 0; i < numbers.length; i++) {
            if(i==numbers.length-1){
                if(numbers[i]==number){
                    index=i;
                    break;
                }else {
                    continue;
                }
            }else if(numbers[i]!=number){
                newNumbers[i]=numbers[i];
            }else{
                index=i;
                break;
            }
        }
        if(index!=-1) {
            if(index==numbers.length-1) {
                return newNumbers;
            }else {
                for (int j = index; j < numbers.length; j++) {
                    newNumbers[j] = numbers[j + 1];
                }
                return newNumbers;

            }
        }else{
                return null;
        }
    }
}

