package net.addit.java.api.lang;

/**
 * 线程协作
 * 1.下载图片
 * 2.显示图片
 * @author tony 241963698@qq.com
 * @version 2022/10/19 下午2:36
 * @since JDK11
 */
public class ThreadJoinTest {

    public static boolean isFinish=false;

    public static void main(String[] args) {
        Thread download=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"开始下载图片");
                //模拟进度条
                for (int i = 0; i <= 100; i++) {
                    System.out.println("已经下载完成"+i+"%");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+"图片下载完成");
                isFinish=true;
            }
        },"下载线程:");
        //启动下载图片的线程
        download.start();

        Thread showImage=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"准备显示图片");
                try {
                    //等待下载图片线程下载完成以后再显示图片
                    download.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(!isFinish){
                    throw new RuntimeException("图片下载失败");
                }
                System.out.println(Thread.currentThread().getName()+"图片显示完成");
            }
        },"显示图片线程：");
        showImage.start();
    }
}
