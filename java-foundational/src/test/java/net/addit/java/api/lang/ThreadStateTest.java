package net.addit.java.api.lang;

/**
 * 线程的状态信息
 *
 * @author tony 241963698@qq.com
 * @version 2022/10/19 下午2:14
 * @since JDK11
 */
public class ThreadStateTest {
    public static void main(String[] args) {
        PrintThread printThread=new PrintThread();
        printThread.setName("打印线程：");
        //状态为NEW
        System.out.println(printThread.getName()+"线程状态："+printThread.getState());

        printThread.start();
        //状态为RUNNABLE
        System.out.println(printThread.getName()+"线程状态："+printThread.getState());

        //等待打印线程任务执行完成
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //状态为TERMINATED
        System.out.println(printThread.getName()+"线程状态："+printThread.getState());

    }
}
