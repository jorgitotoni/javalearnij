package net.addit.java.foundational.array;

/**
 * 二维数组
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/7 下午1:56
 * @since JDK8
 */
public class ArrayArray {
    public static void main(String[] args) {
        int[][] numbers=new int[][] {{1,2,3},{4,5},{6,7,8}};

        System.out.println("二维数组的信息"+numbers);
        //[[I@6e0be858
        System.out.println("二维数组的第0个元素"+numbers[0]);
        //[I@61bbe9ba
        System.out.println("二维数组第2个元素的第2个元素"+numbers[2][2]);


        int[][] numbers2=new int[3][2];
        System.out.println(numbers2);
        //[[I@610455d6
        numbers2[0][0]=100;

        System.out.printf("%10s%10s%10s%10s%10s\n","员工编号","员工姓名","员工年龄","员工性别","员工薪水");
        String[][] employeeList=new String[][]{{"001","tony","30","男","10000"},{"002","david","30","男","8000"},{"003","sala","25","女","9000"},{"004","jack","35","男","11000"}};
        for (int i = 0; i < employeeList.length; i++) {
            for (int j = 0; j < employeeList[i].length; j++) {
                System.out.printf("%12s",employeeList[i][j]);

            }
            System.out.println();
        }
    }
}
