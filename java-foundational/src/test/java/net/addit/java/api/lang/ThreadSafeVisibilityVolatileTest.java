package net.addit.java.api.lang;

/**
 * 线程安全问题-使用Volatile解决可见性问题
 *
 * @author tony 241963698@qq.com
 * @version 2022/10/22 下午11:32
 * @since JDK11
 */
public class ThreadSafeVisibilityVolatileTest {
    public static void main(String[] args) {
        ThreadSafeVisibilityVolatile threadSafeVisibilityVolatile=new ThreadSafeVisibilityVolatile();
        threadSafeVisibilityVolatile.setName("子线程");
        threadSafeVisibilityVolatile.start();

        while (true){
            if(threadSafeVisibilityVolatile.flag==true){
                System.out.println("主线程的死循环结束");
                break;
            }
        }
    }
}


class ThreadSafeVisibilityVolatile extends Thread{
    /**
     * 共享变量
     * 加了volatile后可以强制操作共享变量的线程每次都从主内存中获取最新的值，可以解决可见性问题
     */
    volatile static boolean flag=false;

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