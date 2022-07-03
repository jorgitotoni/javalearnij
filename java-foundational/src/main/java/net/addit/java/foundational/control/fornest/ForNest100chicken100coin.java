package net.addit.java.foundational.control.fornest;

/**
 * 循环嵌套
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/1 下午1:06
 * @since JDK8
 */
public class ForNest100chicken100coin {
    //公鸡5文1只，母鸡3文1只，小鸡1文3只
    //花光100文，买100只鸡

    public static void main(String[] args) {

        for(int i=0;i<=100;i++){
            for(int j=0;j<=100;j++){
                for(int k=0;k<=100;k++){
                    if(5*i+3*j+k/3==100 && i+j+k==100 && k%3==0){
                        System.out.printf("100文可以买%d只公鸡%d只母鸡%d只小鸡",i,j,k);
                        System.out.println();
                    }
                }
            }
        }
    }
}
