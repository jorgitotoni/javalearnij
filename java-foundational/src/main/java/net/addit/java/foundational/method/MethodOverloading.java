package net.addit.java.foundational.method;

/**
 * 方法重载
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/9 下午1:48
 * @since JDK8
 */
public class MethodOverloading {
    public static boolean compare(int left,int right){
        System.out.println("compare(int)");
        return left==right;
    }

    public static boolean compare(String left,String right){
        System.out.println("compare(String)");
        return left==right;
    }

    public static boolean compare(long left,long right){
        System.out.println("compare(long)");
        return left==right;
    }

    public static boolean compare(boolean left,boolean right){
        System.out.println("compare(boolean)");
        return left==right;
    }

}
