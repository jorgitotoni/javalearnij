package net.addit.java.api.lang;

/**
 * 生产者/消费者模式实现
 *
 * @author tony 241963698@qq.com
 * @version 2022/10/30 下午6:33
 * @since JDK11
 */
public class ThreadProducerConsumerTest {
    public static void main(String[] args) {
        final StatusHolder statusHolder=new StatusHolder();
        final Object lock=new Object();

        new Consumer(statusHolder,lock).start();
        new Producer(statusHolder,lock).start();
    }
}

/**
 * 生产者
 * 负责生产商品
 * 持有StatusHolder，根据status判断是否需要生产，如果status为true则进入无限等待，否则就生产商品
 * 生产完成后将status修改为true，然后通知消费者可以消费商品
 */
class Producer extends Thread{
    final StatusHolder statusHolder;
    final Object lock;
    Producer(final StatusHolder statusHolder,final Object lock){
        this.statusHolder=statusHolder;
        this.lock=lock;
        setName("生产者线程：");
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock){
                String name=getName();
                if(statusHolder.getStatus()==true){
                    System.out.println(name+"现在有商品，生产者不需要生产商品，生产者将进入等待");
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if(statusHolder.getStatus()==false){
                    System.out.println(name+"现在没有商品，生产者需要生产商品");
                    //耗时操作，模拟生产商品
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //商品生产完成，修改状态
                    statusHolder.setStatus(true);
                    System.out.println(name+"生产商品完成");
                    lock.notify();
                    System.out.println(name+"通知消费者可以来消费商品了");

                }
            }
        }
    }
}

/**
 * 消费者
 * 负责消费商品
 * 持有StatusHolder，根据status判断是否可以消费，如果status为false则进入无限等待，否则就消费商品
 * 消费完成后将status修改为false，然后通知生产者可以生产商品
 */
class Consumer extends Thread{
    final StatusHolder statusHolder;
    final Object lock;
    Consumer(final StatusHolder statusHolder,final Object lock){
        this.statusHolder=statusHolder;
        this.lock=lock;
        setName("消费者线程：");
    }

    @Override
    public void run() {
        String name=getName();
        while (true) {
            synchronized (lock){
                if(statusHolder.getStatus()==false){
                    System.out.println(name+"没有商品，消费者进入无限等待");
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if(statusHolder.getStatus()==true){
                    System.out.println(name+"消费者开始消费商品");
                    //耗时操作，模拟消费商品
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //商品消费完成，修改状态
                    statusHolder.setStatus(false);
                    System.out.println(name+"已经消费完商品");
                    lock.notify();
                    System.out.println(name+"通知生产者可以生产商品");
                }
            }
        }
    }
}

/**
 * 状态维护者
 * status等于true表示有商品
 * status等于false表示没有商品
 */
class StatusHolder{
    boolean status;

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}