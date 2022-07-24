package net.addit.java.foundational.array;

/**
 * 数组的二分法查找
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/7 下午1:43
 * @since JDK8
 */
public class ArrayBinaryResearch {
    public static void main(String[] args) {
        int[] numbers=new int[]{1,2,3,4,5,6,7,8,9,10};
        int target=6;

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
    }
}
