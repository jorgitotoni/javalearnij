package net.addit.java.foundational.oop.innerclass;


import net.addit.java.foundational.oop.abstracts.Animal;

/**
 * 匿名内部类的测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/27 下午1:45
 * @since JDK11
 */
public class AnonymousInnerClassTest {
    public static void main(String[] args) {

        //匿名内部类 没有名字的局部内部类
        Animal animal=new Animal(){
            @Override
            public void eat(){
                System.out.println("大熊猫在吃竹子");
            }
            @Override
            public void sleep(String nationality){
                System.out.println(nationality+"大熊猫在睡觉");
            }
        };

        animal.eat();
        animal.sleep("中国四川");
    }

}
