package net.addit.java.foundational.oop.innerclass;

/**
 * 静态内部类的单例模式
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/27 下午1:22
 * @since JDK11
 */
public class StaticInnerClassSingleton {
    /**
     * 私有化构造器
     */
    private StaticInnerClassSingleton(){}

    public static StaticInnerClassSingleton getInstance(){
        return StaticInnerClassSingletonHolder.INSTANCE;
    }

    private static class StaticInnerClassSingletonHolder{
        private static final StaticInnerClassSingleton INSTANCE=new StaticInnerClassSingleton();
    }
}
