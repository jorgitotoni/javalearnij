package net.addit.java.foundational.oop.polymorphism;

/**
 * 老虎
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/24 下午7:58
 * @since JDK11
 */
public class Tiger extends Animal{

    public Tiger(String name){
        super(name);
    }

    @Override
    public void eat(Food food){
        System.out.println(this.getName()+"正在吃"+food.getName());
    }
}
