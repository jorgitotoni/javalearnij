package net.addit.java.api.util.concurrent.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap线程不安全问题
 *
 * @author tony 241963698@qq.com
 * @version 2022/10/24 下午1:49
 * @since JDK11
 */
public class HashMapThreadNotSafeTest {
    public static void main(String[] args) {
        HashMapHolder hashMapHolder=new HashMapHolder();
        hashMapHolder.setName("子线程");
        hashMapHolder.start();

        for (int i = 0; i < 5_0000; i++) {
            HashMapHolder.map.put(i,i);
        }
        System.out.println(Thread.currentThread().getName()+" map集合的元素个数"+HashMapHolder.map.size());

        /**
         * 期待结果5万，因为HashMap的Key不可重复
         * 结果可能大于5万，可能小于5wan
         */
    }
}

class HashMapHolder extends Thread{
    static Map<Integer,Integer> map=new HashMap<>();

    @Override
    public void run() {
        for (int i = 0; i < 5_0000; i++) {
            map.put(i,i);
        }
        System.out.println(Thread.currentThread().getName()+" map集合的元素个数"+map.size());
    }
}
