package net.addit.java.foundational.control.whilestatement;

/**
 * 折纸计算
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/1 下午12:32
 * @since JDK8
 */
public class Paper {
    public static void main(String[] args) {
        int height=88488600;
        int paperHeight=1;

        int count=0;

        while(paperHeight<=height){
            paperHeight*=2;
            count++;
        }
        System.out.println("一共折叠了"+count+"次，纸张高度为"+paperHeight);
    }
}
