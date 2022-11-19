package net.addit.java.api.util.concurrent;

import net.addit.java.api.util.DateTimeUtils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池的使用
 *
 * @author tony 241963698@qq.com
 * @version 2022/10/27 下午1:15
 * @since JDK11
 */
public class ExecutorsTest {
    public static void main(String[] args) {
        //创建一个线程池
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {
            //提交任务
            executorService.submit(new PrintTask());
        }

        //main线程会等到所有业务线程执行完毕后才会销毁
        //销毁线程池
        executorService.shutdown();
    }
}

class PrintTask implements Runnable{
    @Override
    public void run() {
        String name=Thread.currentThread().getName();
        System.out.println(name+": "+ DateTimeUtils.getCurrentTime());
        try {
            System.out.println(name+": 准备等3秒");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name+": "+ DateTimeUtils.getCurrentTime());
    }
}