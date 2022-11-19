package net.addit.java.api.util.concurrent;

import java.util.concurrent.Exchanger;

/**
 * Exchange的使用
 * C线程有200块钱，D线程有5斤龙虾
 * 需要用C线程的钱去交换D线程的龙虾
 *
 * @author tony 241963698@qq.com
 * @version 2022/10/26 下午1:19
 * @since JDK11
 */
public class ExchangerTest {
    public static void main(String[] args) {
        final Exchanger<String> exchanger=new Exchanger<>();

        new ThreadC(exchanger).start();
        new ThreadD(exchanger).start();
    }
}

class ThreadC extends Thread{
    final Exchanger<String> exchanger;

    ThreadC(Exchanger<String> exchanger){
        this.exchanger=exchanger;
        setName("C线程");
    }
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name+"准备把200块钱给D线程");
        try {
            String returnValue = exchanger.exchange("200块钱");
            System.out.println("D线程给"+name+"的数据是"+returnValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadD extends Thread{
    final Exchanger<String> exchanger;

    ThreadD(Exchanger<String> exchanger){
        this.exchanger=exchanger;
        setName("D线程");
    }
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name+"准备把5斤龙虾给C线程");
        try {
            String returnValue = exchanger.exchange("5斤龙虾");
            System.out.println("C线程给"+name+"的数据是"+returnValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}