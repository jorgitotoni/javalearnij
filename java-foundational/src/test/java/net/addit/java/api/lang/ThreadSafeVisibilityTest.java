package net.addit.java.api.lang;

/**
 * 线程安全之可见性问题
 *
 * @author tony 241963698@qq.com
 * @version 2022/10/22 下午7:48
 * @since JDK11
 */
public class ThreadSafeVisibilityTest {
    public static void main(String[] args) {
        ThreadSafeVisibility threadSafeVisibility=new ThreadSafeVisibility();
        threadSafeVisibility.setName("子线程");
        threadSafeVisibility.start();

        while (true){
            if(threadSafeVisibility.flag==true){
                System.out.println("主线程的死循环结束");
                break;
            }
        }
    }
}

class ThreadSafeVisibility extends Thread{
    /**
     * 共享变量
     */
    static boolean flag=false;

    @Override
    public void run() {
        String name = Thread.currentThread().getName();

        try {
            System.out.println(name+"线程即将睡5秒钟");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        flag=true;
        System.out.println(name+"线程将flag改为true");
    }
}