package net.addit.java.api.util.concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * CountDownLatch的使用
 *
 * @author tony 241963698@qq.com
 * @version 2022/10/26 下午12:31
 * @since JDK11
 */
public class CountDownLatchTest {
    public static void main(String[] args) {
        final CountDownLatch countDownLatch=new CountDownLatch(1);

        new ThreadA(countDownLatch).start();
        new ThreadB(countDownLatch).start();
    }
}

class ThreadA extends Thread{
    final CountDownLatch countDownLatch;
    ThreadA(final CountDownLatch countDownLatch){
        this.countDownLatch=countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("1");
        //等待其他线程打印2
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("3");
    }
}

class ThreadB extends Thread{
    final CountDownLatch countDownLatch;
    ThreadB(final CountDownLatch countDownLatch){
        this.countDownLatch=countDownLatch;
    }
    @Override
    public void run() {
        System.out.println("2");
        //当countDown()将计数器值减1之后，计数器的值变成0，会结束等待
        countDownLatch.countDown();
    }
}