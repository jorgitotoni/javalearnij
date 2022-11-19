package net.addit.java.api.lang;

/**
 * 同步代码块的死锁
 * 需求：AB两个线程，A线程要先获取A锁再获取B锁，只有获取到AB两把锁后才执行A线程的任务，B同理
 * @author tony 241963698@qq.com
 * @version 2022/10/21 下午1:53
 * @since JDK11
 */
public class SynchronizedBlockDeadLock {
    /**
     * 两把锁A、B
     */
    private static final Object lockA=new Object();
    private static final Object lockB=new Object();

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                String name=Thread.currentThread().getName();
                synchronized (lockA){
                    System.out.println(name+"已经获取到A锁");
                    synchronized (lockB){
                        System.out.println(name+"已经获取到B锁");
                        System.out.println(name+"正在执行线程任务");
                    }
                }
            }
        },"线程A：").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                String name=Thread.currentThread().getName();
                synchronized (lockB){
                    System.out.println(name+"已经获取到B锁");
                    synchronized (lockA){
                        System.out.println(name+"已经获取到A锁");
                        System.out.println(name+"正在执行线程任务");
                    }
                }
            }
        },"线程B：").start();
    }
}
