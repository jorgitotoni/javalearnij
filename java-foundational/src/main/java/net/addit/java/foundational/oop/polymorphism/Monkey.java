package net.addit.java.foundational.oop.polymorphism;

/**
 * 猴子
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/24 下午7:52
 * @since JDK11
 */
public class Monkey extends Animal{

    public Monkey(String name){
        super(name);
    }

    @Override
    public void eat(Food food){
        System.out.println(this.getName()+"正在吃"+food.getName());
    }

    public void play(){
        System.out.println(this.getName()+"正在玩杂耍");
    }
}
