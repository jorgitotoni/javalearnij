package net.addit.java.api.lang;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 原子类解决线程安全之原子性问题
 *
 * @author tony 241963698@qq.com
 * @version 2022/10/23 下午8:52
 * @since JDK11
 */
public class ThreadSafeAtomicityAtomicIntegerTest {
    public static void main(String[] args) {
        ThreadSafeAtomicityAtomicInteger threadSafeAtomicity = new ThreadSafeAtomicityAtomicInteger();
        threadSafeAtomicity.setName("子线程");
        //启动子线程
        threadSafeAtomicity.start();
        //在主线程对共享变量自增20万次
        for (int i = 0; i < 20_0000; i++) {
            //ThreadSafeAtomicityAtomicInteger.number++;
            ThreadSafeAtomicityAtomicInteger.number.getAndIncrement();
        }

        System.out.println(Thread.currentThread().getName() + "对共享变量自增20万次 number=" + ThreadSafeAtomicityAtomicInteger.number.get());

        /**
         * 期望结果number=400000
         * 实际结果number=400000
         */
    }
}

class ThreadSafeAtomicityAtomicInteger extends Thread{
    /**
     * 共享变量，多个线程共同使用一个变量
     */
    //static int number=0;
    //即使加上volatile关键字仍然不能避免原子性问题
    //volatile static int number=0;
    static AtomicInteger number=new AtomicInteger();

    @Override
    public void run() {
        //对共享变量自增20万次
        for (int i = 0; i < 20_0000; i++) {
            //number++;
            number.getAndIncrement();
        }
        //增加耗时操作，确保子线程和主线程对共享变量自增20万次
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"对共享变量自增20万次 number="+number.get());
    }
}
