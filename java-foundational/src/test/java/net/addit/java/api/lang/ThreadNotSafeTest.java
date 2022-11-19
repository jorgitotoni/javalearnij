package net.addit.java.api.lang;

/**
 * 线程安全问题的测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/10/20 上午11:31
 * @since JDK11
 */
public class ThreadNotSafeTest {
    public static void main(String[] args) {
        //创建售票任务对象
        TicketWindow ticketWindow=new TicketWindow();

        //创建并启动4个线程，模拟4个窗口卖票
        new Thread(ticketWindow,"窗口1：").start();
        new Thread(ticketWindow,"窗口2：").start();
        new Thread(ticketWindow,"窗口3：").start();
        new Thread(ticketWindow,"窗口4：").start();
    }
}

/**
 * 售票任务
 */
class TicketWindow implements Runnable{
    /**
     * 四个窗口共享100张票
     * 此时ticket是一个共享变量，由四个线程共享
     */
    int ticket=100;

    /**
     * 售票 未考虑线程安全问题
     */
    @Override
    public void run() {
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