package net.addit.java.api.util.concurrent.collection;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * CopyOnWriteArrayList使用
 *
 * @author tony 241963698@qq.com
 * @version 2022/10/24 下午1:24
 * @since JDK11
 */
public class CopyOnWriteArrayListTest {
    public static void main(String[] args) {
        CopyOnWriteArrayListHolder copyOnWriteArrayListHolder=new CopyOnWriteArrayListHolder();
        copyOnWriteArrayListHolder.start();

        //在主线程中往list中添加5万个元素
        for (int i = 0; i < 5_0000; i++) {
            CopyOnWriteArrayListHolder.list.add(i);
        }
        //睡10秒确认数据写入list
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"list集合的元素数量是"+CopyOnWriteArrayListHolder.list.size());
    }
}


class CopyOnWriteArrayListHolder extends Thread{
    static List<Integer> list=new CopyOnWriteArrayList<>();

    @Override
    public void run() {
        for (int i = 0; i < 5_0000; i++) {
            list.add(i);
        }
        System.out.println(Thread.currentThread().getName()+"list集合的元素数量是"+list.size());
    }

}
