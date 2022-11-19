package net.addit.java.api.lang;

import net.addit.java.api.util.DateTimeUtils;

/**
 * 线程优先级测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/10/19 下午2:23
 * @since JDK11
 */
public class ThreadPriorityTest {
    public static void main(String[] args) {
        Thread thread1=new Thread("最高优先级"){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(getName()+ DateTimeUtils.getCurrentTime()+"线程优先级"+getPriority());
                }
            }
        };
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread1.start();

        Thread thread3=new Thread("最低优先级"){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(getName()+ DateTimeUtils.getCurrentTime()+"线程优先级"+getPriority());
                }
            }
        };
        thread3.setPriority(Thread.MIN_PRIORITY);
        thread3.start();

        Thread thread2=new Thread("普通优先级"){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(getName()+ DateTimeUtils.getCurrentTime()+"线程优先级"+getPriority());
                }
            }
        };
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread2.start();


    }
}
