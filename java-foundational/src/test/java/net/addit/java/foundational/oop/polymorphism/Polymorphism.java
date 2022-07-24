package net.addit.java.foundational.oop.polymorphism;

import net.addit.java.foundational.oop.abstracts.Animal;
import net.addit.java.foundational.oop.abstracts.Cat;
import net.addit.java.foundational.oop.abstracts.Pandas;

/**
 * 多态测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/24 下午6:59
 * @since JDK8
 */
public class Polymorphism {
    public static void main(String[] args) {
        //父类的引用指向子类的对象
        Animal animal=new Cat();
        animal.eat();

        animal=new Pandas();
        animal.eat();

    }
}
