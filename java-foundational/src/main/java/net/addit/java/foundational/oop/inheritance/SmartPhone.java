package net.addit.java.foundational.oop.inheritance;

import java.util.Objects;

/**
 * 智能手机类（子类）
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/17 上午8:15
 * @since JDK8
 */
public class SmartPhone extends Cellphone{
    /**
     * 智能手机新变量：无线充电
     */
    boolean wirelessCharging;

    public boolean isWirelessCharging() {
        return wirelessCharging;
    }

    public void setWirelessCharging(boolean wirelessCharging) {
        this.wirelessCharging = wirelessCharging;
    }

    public SmartPhone(){

    }

    SmartPhone(String model){
        super(model);
    }

    /**
     * 智能手机新功能：刷抖音
     * @param model 手机型号
     */
    public void playVideo(String model){
        System.out.println(model+"正在刷抖音...");
    }

    /**
     * 智能手机改变功能：发短信&&发微信
     * @param number 对象号码
     * @param message 微信内容
     */
    @Override
    public void sendMessage(long number, String message) {
        super.sendMessage(number, message);
        System.out.println("正在给"+number+"发微信，微信内容是："+message);
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "手机型号："+super.getModel()+
                "是否支持无线充电：" + wirelessCharging +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmartPhone that = (SmartPhone) o;
        return wirelessCharging == that.wirelessCharging && this.getModel().equals(that.getModel());
    }

}
