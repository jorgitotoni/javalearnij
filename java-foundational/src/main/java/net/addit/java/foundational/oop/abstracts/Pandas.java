package net.addit.java.foundational.oop.abstracts;

/**
 * 熊猫（子类）
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/19 下午1:16
 * @since JDK8
 */
public class Pandas extends Animal{
    public Pandas(){

    }

    public Pandas(String nationality){
        super(nationality);
    }

    @Override
    public void eat(){
        System.out.println("熊猫吃竹子");
    }

    @Override
    public void sleep(String nationality) {
        System.out.println(nationality+"的熊猫在睡觉");

    }
}
