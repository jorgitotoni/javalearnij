package net.addit.java.foundational.oop.polymorphism;

/**
 * 食物
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/24 下午8:04
 * @since JDK11
 */
public abstract class Food {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Food(){

    }

    public Food(String name) {
        this.name = name;
    }

}
