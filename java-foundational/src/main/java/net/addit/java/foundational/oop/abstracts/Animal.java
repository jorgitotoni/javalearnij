package net.addit.java.foundational.oop.abstracts;

/**
 * 动物（父类）
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/19 下午1:13
 * @since JDK8
 */
public abstract class Animal {
    /**
     * 国籍
     */
    private String nationality;

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public Animal(){

    }
    public Animal(String nationality){
        this.nationality=nationality;
    }
    /**
     * 动物吃东西
     */
    public abstract void eat();
    /**
     * 动物睡觉
     */
    public abstract void sleep(String nationality);
}
