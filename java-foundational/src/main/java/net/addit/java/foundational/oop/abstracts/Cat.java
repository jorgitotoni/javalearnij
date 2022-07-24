package net.addit.java.foundational.oop.abstracts;

/**
 * 猫（子类）
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/19 下午1:14
 * @since JDK8
 */
public class Cat extends Animal{
    public Cat(){

    }

    public Cat(String nationality){
        super(nationality);
    }

    @Override
    public void eat(){
        System.out.println("小猫吃鱼");
    }

    @Override
    public void sleep(String nationality) {

        System.out.println(nationality+"的小猫在睡觉");
    }

}
