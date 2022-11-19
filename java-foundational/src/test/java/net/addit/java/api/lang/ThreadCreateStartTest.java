package net.addit.java.api.lang;

/**
 * 线程的创建和启动的两种方式
 *
 * @author tony 241963698@qq.com
 * @version 2022/10/12 上午11:37
 * @since JDK11
 */
public class ThreadCreateStartTest {
    /**
     * main方法也是一个线程，即主线程
     * 主线程由JVM创建
     * JVM启动的时候，还创建了一些其他的线程
     * @param args
     */
    public static void main(String[] args) {

        /*
        //第一种创建方式：创建新的类继承Thread类，重写run方法
        CustomThread customThread=new CustomThread();
        customThread.start();
         */

        Thread thread=new Thread(new CustomRunnable());
        thread.start();

        for (int i = 0; i <100; i++) {
            System.out.println("主线程 i ="+i);
        }

        //匿名内部类创建线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类创建线程");
            }
        }).start();

        //lambda表达式创建线程
        new Thread(()->{
            System.out.println("lambda表达式创建线程");
        }).start();
    }
}

/**
 * 第一种创建线程的方式
 * 继承Thread类，重写run方法
 */
class CustomThread extends Thread{

    /**
     *
     */
    @Override
    public void run(){
        for (int j = 0; j < 100; j++) {
            System.out.println("子线程 j ="+j);
        }
    }
}

/**
 * 第二种实现线程的方式
 * 实现Runnable接口，重写run方法
 */
class CustomRunnable implements Runnable{

    @Override
    public void run() {
        for (int j = 0; j < 100; j++) {
            System.out.println("子线程 j ="+j);
        }
    }
}