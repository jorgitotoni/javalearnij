package net.addit.java.foundational.oop;

/**
 * 手机类
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/11 下午1:31
 * @since JDK8
 */
public class Cellphone {
    /*********************成员变量************************/

    /**
     * 手机型号
     *
     */
    String model;

    /**
     * 手机品牌
     */
    String brand;

    /**
     * 价格
     */
    Integer price;

    /**
     * 颜色
     */
    String color;

    /******************成员方法************************/

    /**
     * 给指定的手机号打电话
     * @param number
     */
    public void call(long number){
        System.out.println("正在给"+number+"打电话");
    }

    public void sendMessage(long number,String message){
        System.out.println("正在给"+number+"发短信，短信内容是："+message);
    }
}
