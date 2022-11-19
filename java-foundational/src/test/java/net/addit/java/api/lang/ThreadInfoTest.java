package net.addit.java.api.lang;

import net.addit.java.api.util.DateTimeUtils;

/**
 * 线程信息测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/10/19 下午1:02
 * @since JDK11
 */
public class ThreadInfoTest {
    public static void main(String[] args) {
        System.out.println("当前正在执行的线程名称是"+Thread.currentThread().getName());

        PrintThread printThread=new PrintThread();
        printThread.setName("打印线程");
        printThread.start();
    }
}

class PrintThread extends Thread{
    /**
     * 定义线程任务
     */
    @Override
    public void run() {
        for (int j = 0; j < 5; j++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程名称"+getName()+" 当前时间："+ DateTimeUtils.getCurrentTime());
        }
    }
}