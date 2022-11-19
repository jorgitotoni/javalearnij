package net.addit.java.api.util.concurrent.collection;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ConcurrentHashMap解决HashMap线程不安全问题
 *
 * @author tony 241963698@qq.com
 * @version 2022/10/24 下午1:53
 * @since JDK11
 */
public class ConcurrentHashMapTest {
    public static void main(String[] args) {
        ConcurrentHashMapHolder hashMapHolder=new ConcurrentHashMapHolder();
        hashMapHolder.setName("子线程");
        hashMapHolder.start();

        for (int i = 0; i < 5_0000; i++) {
            ConcurrentHashMapHolder.map.put(i,i);
        }
        System.out.println(Thread.currentThread().getName()+" map集合的元素个数"+ConcurrentHashMapHolder.map.size());

        /**
         * 期待结果5万，因为HashMap的Key不可重复
         * 结果5万
         */
    }
}

class ConcurrentHashMapHolder extends Thread{
    static Map<Integer,Integer> map=new ConcurrentHashMap<>();

    @Override
    public void run() {
        for (int i = 0; i < 5_0000; i++) {
            map.put(i,i);
        }
        System.out.println(Thread.currentThread().getName()+" map集合的元素个数"+map.size());
    }
}
