package net.addit.java.foundational.oop.polymorphism;

/**
 * 长颈鹿
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/24 下午8:28
 * @since JDK11
 */
public class Giraffe extends Animal{

    public Giraffe(String name){
        super(name);
    }

    @Override
    public void eat(Food food) {
        System.out.println(this.getName()+"正在吃"+food.getName());
    }
}
