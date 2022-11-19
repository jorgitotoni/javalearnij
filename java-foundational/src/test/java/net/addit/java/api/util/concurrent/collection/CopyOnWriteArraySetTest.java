package net.addit.java.api.util.concurrent.collection;

import net.addit.java.api.util.DateTimeUtils;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * CopyOnWriteArraySet解决HashSet集合线程安全问题
 *
 * @author tony 241963698@qq.com
 * @version 2022/10/24 下午1:38
 * @since JDK11
 */
public class CopyOnWriteArraySetTest {
    public static void main(String[] args) {
        CopyOnWriteArraySetHolder copyOnWriteArraySetHolder=new CopyOnWriteArraySetHolder();
        copyOnWriteArraySetHolder.setName("子线程");
        copyOnWriteArraySetHolder.start();

        for (int i = 0; i < 5_0000; i++) {
            CopyOnWriteArraySetHolder.copyOnWriteArraySet.add(i);
        }
        System.out.println(Thread.currentThread().getName()+" hashSet集合元素的数量"+CopyOnWriteArraySetHolder.copyOnWriteArraySet.size());

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /**
         * HashSet会去掉重复的元素
         * 期待结果50000
         * 实际结果50000
         */
    }
}

class CopyOnWriteArraySetHolder extends Thread{
    static Set<Integer> copyOnWriteArraySet=new CopyOnWriteArraySet<>();

    @Override
    public void run() {
        //System.out.println("开始时间"+System.currentTimeMillis());
        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < 5_0000; i++) {
            copyOnWriteArraySet.add(i);
        }
        //System.out.println("结束时间"+System.currentTimeMillis());
        long endTime = System.currentTimeMillis();
        long time = DateTimeUtils.calculatorTime(beginTime, endTime);
        System.out.println("copyOnWriteArraySet集合 添加5万个元素耗时"+time);
        System.out.println(Thread.currentThread().getName()+" hashSet集合元素的数量"+copyOnWriteArraySet.size());
    }
}