package net.addit.java.foundational.oop.abstracts;

/**
 * 抽象类的测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/19 下午1:17
 * @since JDK8
 */
public class AbstractClassTest {

    public static void main(String[] args) {
        //Animal animal=new Animal();
        Cat cat=new Cat();
        cat.eat();

        Pandas pandas=new Pandas();
        pandas.eat();

        Pandas china=new Pandas("中国");
        china.sleep(china.getNationality());

    }
}
