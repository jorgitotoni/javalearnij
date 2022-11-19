package net.addit.java.api.util.concurrent.collection;

import java.util.HashSet;

/**
 * HashSet线程不安全问题
 *
 * @author tony 241963698@qq.com
 * @version 2022/10/24 下午1:34
 * @since JDK11
 */
public class HashSetThreadNotSafe {
    public static void main(String[] args) {
        HashSetHolder hashSetHolder=new HashSetHolder();
        hashSetHolder.setName("子线程");
        hashSetHolder.start();

        for (int i = 0; i < 5_0000; i++) {
            HashSetHolder.hashSet.add(i);
        }
        System.out.println(Thread.currentThread().getName()+" hashSet集合元素的数量"+HashSetHolder.hashSet.size());

        /**
         * HashSet会去掉重复的元素
         * 期待结果50000
         * 实际结果可能小于50000，也可能大于50000
         */
    }
}

class HashSetHolder extends Thread{
    static HashSet<Integer> hashSet=new HashSet<>();

    @Override
    public void run() {
        for (int i = 0; i < 5_0000; i++) {
            hashSet.add(i);
        }
        System.out.println(Thread.currentThread().getName()+" hashSet集合元素的数量"+hashSet.size());
    }
}