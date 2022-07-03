package net.addit.java.foundational.control.fornest;

/**
 * 循环嵌套-99乘法表
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/1 下午1:15
 * @since JDK8
 */
public class ForNest9multiple9 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                if(i>=j){
                    System.out.printf("%d * %d = %d\t",j,i,i*j);
                }
            }
            System.out.println();
        }
    }
}
