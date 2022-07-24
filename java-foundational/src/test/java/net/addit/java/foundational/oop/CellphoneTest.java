package net.addit.java.foundational.oop;

/**
 * 对象的创建和使用
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/11 下午1:38
 * @since JDK8
 */
public class CellphoneTest {
    public static void main(String[] args) {
        //创建手机类的对象
        Cellphone iphone12=new Cellphone();
        //访问手机类的成员变量
        System.out.println("iphone12的默认型号"+iphone12.model);
        //给对象的成员变量赋值
        iphone12.model="iphone12";
        iphone12.brand="苹果";
        iphone12.price=6999;
        iphone12.color="黑色";
        System.out.println("iphone12的型号"+iphone12.model);
        System.out.println("iphone12的品牌"+iphone12.brand);
        System.out.println("iphone12的价格"+iphone12.price);
        System.out.println("iphone12的颜色"+iphone12.color);

        //访问手机类的成员方法
        iphone12.call(13810432885l);
        iphone12.sendMessage(13810432885l,"你好");

    }
}
