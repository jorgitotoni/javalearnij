package net.addit.java.api.lang;

/**
 * 使用synchronized解决多线程卖票的线程安全问题
 *
 * @author tony 241963698@qq.com
 * @version 2022/10/20 下午1:32
 * @since JDK11
 */
public class SynchronizedBlockedTest {

    public static void main(String[] args) {

        TicketWindowSynchronizedBlocked ticketWindowSynchronizedBlocked=new TicketWindowSynchronizedBlocked();

        new Thread(ticketWindowSynchronizedBlocked,"窗口1：").start();
        new Thread(ticketWindowSynchronizedBlocked,"窗口2：").start();
        new Thread(ticketWindowSynchronizedBlocked,"窗口3：").start();
        new Thread(ticketWindowSynchronizedBlocked,"窗口4：").start();
    }
}

/**
 * 售票任务
 */
class TicketWindowSynchronizedBlocked implements Runnable{
    /**
     * 四个窗口共享100张票
     * 此时ticket是一个共享变量，由四个线程共享
     */
    int ticket=100;

    private static final Object lock=new Object();
    /**
     * 售票
     * 使用同步代码块解决重复票、漏票、0票或负数票
     */
    @Override
    public void run() {
        synchronized (lock) {
            while(ticket>0){
                //模拟其他业务逻辑的耗时操作
                //出现了漏票
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //模拟其他业务逻辑的耗时操作
                //出现了0票负数票
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //有重复票
                System.out.println(Thread.currentThread().getName()+"正在出售第"+ticket+"张票。");
                ticket--;
            }
        }
    }
}