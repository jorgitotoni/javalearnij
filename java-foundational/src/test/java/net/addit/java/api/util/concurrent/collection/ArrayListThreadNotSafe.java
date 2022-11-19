package net.addit.java.api.util.concurrent.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList线程不安全问题
 *
 * @author tony 241963698@qq.com
 * @version 2022/10/24 下午1:06
 * @since JDK11
 */
public class ArrayListThreadNotSafe {
    public static void main(String[] args) {
        ArrayListHolder arrayListHolder=new ArrayListHolder();
        arrayListHolder.start();
        //在主线程中往list中添加20万个元素
        for (int i = 0; i < 20_0000; i++) {
            ArrayListHolder.list.add(i);
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"list集合的元素数量是"+ArrayListHolder.list.size());
        /**
         * 期待是40万
         * 结果小于40万
         * 有时候还会引发异常
         */
    }
}

class ArrayListHolder extends Thread{
    static List<Integer> list=new ArrayList<>();

    @Override
    public void run() {
        for (int i = 0; i < 20_0000; i++) {
            list.add(i);
        }
        System.out.println(Thread.currentThread().getName()+"list集合的元素数量是"+list.size());
    }

}
