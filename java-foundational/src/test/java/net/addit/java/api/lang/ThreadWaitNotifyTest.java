package net.addit.java.api.lang;

/**
 * 并发编程之等待唤醒机制
 *
 * @author tony 241963698@qq.com
 * @version 2022/10/30 下午6:19
 * @since JDK11
 */
public class ThreadWaitNotifyTest {
    static final Object lock=new Object();

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock){
                    String name=Thread.currentThread().getName();
                    System.out.println(name+"任务执行完成");
                    try {
                        System.out.println(name+"准备进入无限等待状态");
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(name+"被唤醒之后的状态"+Thread.currentThread().getState());
                }
            }
        },"线程A：").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock){
                    String name=Thread.currentThread().getName();
                    System.out.println(name+"任务执行完成");
                    System.out.println(name+"准备唤醒A线程");
                    lock.notify();

                }
            }
        },"线程B：").start();
    }
}
