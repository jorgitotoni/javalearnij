package net.addit.java.api.lang;

/**
 * 同步代码块与同步方法的综合使用
 *
 * @author tony 241963698@qq.com
 * @version 2022/10/20 下午1:55
 * @since JDK11
 */
public class SynchronizedBlockedSynchronizedMethodTest {
    public static void main(String[] args) {

        ShoppingThreadB shoppingThreadB=new ShoppingThreadB();
        shoppingThreadB.setName("B线程： ");
        shoppingThreadB.start();

        ShoppingThreadA shoppingThreadA=new ShoppingThreadA(shoppingThreadB);
        shoppingThreadA.setName("A线程： ");
        shoppingThreadA.start();
    }
}

/**
 * A线程
 */
class ShoppingThreadA extends Thread {
    public final Object lock;
    ShoppingThreadA(Object lock){
        this.lock=lock;
    }

    @Override
    public void run() {
        synchronized (lock) {//加锁
            String name=Thread.currentThread().getName();
            System.out.println(name+"1.注册淘宝成功");
            System.out.println(name+"2.登录淘宝成功");
            System.out.println(name+"3.浏览商品");
            System.out.println(name+"4.添加商品到购物车");
            System.out.println(name+"5.支付订单成功");
            System.out.println(name+"6.提交订单成功");
        }//释放锁
    }
}

/**
 * B线程
 */
class ShoppingThreadB extends Thread {
    @Override
    public void run() {
        doShopping();
    }

    private synchronized void doShopping() {//加锁
        String name=Thread.currentThread().getName();
        System.out.println(name+"1.注册淘宝成功");
        System.out.println(name+"2.登录淘宝成功");
        System.out.println(name+"3.浏览商品");
        System.out.println(name+"4.添加商品到购物车");
        System.out.println(name+"5.支付订单成功");
        System.out.println(name+"6.提交订单成功");
    }//释放锁
}