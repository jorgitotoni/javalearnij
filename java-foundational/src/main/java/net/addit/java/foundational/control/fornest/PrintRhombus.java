package net.addit.java.foundational.control.fornest;

/**
 * 打印菱形
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/2 下午10:12
 * @since JDK8
 */
public class PrintRhombus {
    public static void main(String[] args) {
        int row=5;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        for (int i = 0; i < row-1; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j < row-i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        for (int i = 0; i < row; i++) {
            int count=0;
            for (int j = 0; j < row-i-1; j++) {
                System.out.print(" ");
            }
            System.out.print("* ");
            for (int j = 2; j <=i; j++) {
                System.out.print("  ");
                count++;
            }
            if(count>0 || i>=1){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < row-1; i++) {
            int count=0;
            for (int j = 0; j <=i; j++) {
                System.out.print(" ");
            }
            System.out.print("* ");
            for (int j = 2; j < row-i-1; j++) {
                System.out.print("  ");
                count++;
            }
            if(count>0 ||i<row-2){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
