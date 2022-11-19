package net.addit.java.api.lang;

/**
 * 线程安全之原子性问题
 *
 * @author tony 241963698@qq.com
 * @version 2022/10/23 下午8:25
 * @since JDK11
 */
public class ThreadSafeAtomicityTest {
    public static void main(String[] args) {
        ThreadSafeAtomicity threadSafeAtomicity=new ThreadSafeAtomicity();
        threadSafeAtomicity.setName("子线程");
        //启动子线程
        threadSafeAtomicity.start();
        //在主线程对共享变量自增20万次
        for (int i = 0; i < 20_0000; i++) {
            threadSafeAtomicity.number++;
        }
        System.out.println(Thread.currentThread().getName()+"对共享变量自增20万次 number="+threadSafeAtomicity.number);

        /**
         * 期望结果number=400000
         * 实际结果number<400000
         */
    }
}

class ThreadSafeAtomicity extends Thread{
    /**
     * 共享变量，多个线程共同使用一个变量
     */
    static int number=0;
    //即使加上volatile关键字仍然不能避免原子性问题
    //volatile static int number=0;

    @Override
    public void run() {
        //对共享变量自增20万次
        for (int i = 0; i < 20_0000; i++) {
            number++;
        }
        System.out.println(Thread.currentThread().getName()+"对共享变量自增20万次 number="+number);
    }
}
