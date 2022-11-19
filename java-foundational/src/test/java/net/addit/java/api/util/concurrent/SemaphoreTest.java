package net.addit.java.api.util.concurrent;

import java.util.concurrent.Semaphore;

/**
 * Semaphore的使用
 *
 * @author tony 241963698@qq.com
 * @version 2022/10/26 下午1:02
 * @since JDK11
 */
public class SemaphoreTest {
    public static void main(String[] args) {
        //创建一个教室
        ClassRoom classRoom=new ClassRoom();
        //创建听课任务
        ListenRunnable listenRunnable=new ListenRunnable(classRoom);
        for (int i = 0; i < 100; i++) {
            new Thread(listenRunnable,"同学"+i).start();
        }
    }
}

class ListenRunnable implements Runnable{
    final ClassRoom classRoom;

    public ListenRunnable(final ClassRoom classRoom){
        this.classRoom=classRoom;
    }

    @Override
    public void run() {
        classRoom.listen();
    }
}

class ClassRoom{
    /**
     * 同时只能让3个人听课
     */
    Semaphore semaphore=new Semaphore(3);

    public void listen(){
        //听课前要获得许可
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String name=Thread.currentThread().getName();
        System.out.println(name+"进入了教室");
        System.out.println(name+"正在听课");
        //模拟听课
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name+"离开了教室******************************");
        //听完课要释放许可
        semaphore.release();
    }
}