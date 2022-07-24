package net.addit.java.foundational.method;

import java.util.Arrays;

/**
 * 测试方法的基本应用
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/8 下午1:40
 * @since JDK8
 */
public class BasicUtilsTest {
    public static void main(String[] args) {
        int left=10;
        int right=20;
        boolean result=BasicUtils.compare(left,right);
        System.out.println(result==true?"两个整数相等":"两个整数不相等");

        int start=1;
        int end=100;
        int sum=BasicUtils.sum(start,end);
        System.out.printf("%d到%d之间的整数相加等于%d\n",start,end,sum);

        int count=5;
        String content="hello world";
        BasicUtils.printContent(count,content);

        int[] numbers=new int[]{1,3,5,7,9,2,4,6,8};
        BasicUtils.bubbleSort(numbers);

        int target=6;
        BasicUtils.binaryResearch(target,numbers);

        String[] texts=new String[]{"1ge","2ge","3ge"};
        BasicUtils.printContent2(texts);
        BasicUtils.printContent3("1");

        System.out.println(Arrays.toString(BasicUtils.add(numbers,100)));
        System.out.println(Arrays.toString(BasicUtils.deleteIndex(numbers,3)));
        System.out.println(Arrays.toString(BasicUtils.deleteElement(numbers,9)));

    }
}
