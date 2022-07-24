package net.addit.java.foundational.oop.polymorphism;

/**
 * 动物管理员
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/24 下午7:54
 * @since JDK11
 */
public class ZooKeeper {
    /**
     * 动物管理员给动物喂食物
     * @param animal
     * @param food
     */
    public void feed(Animal animal,Food food){
        animal.eat(food);
    }

    /**
     * 获取动物信息
     * @param animal
     * @return
     */
    public Animal getAnimal(Animal animal){
        return animal;
    }
}
