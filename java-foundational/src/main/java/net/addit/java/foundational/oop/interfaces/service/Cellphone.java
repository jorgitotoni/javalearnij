package net.addit.java.foundational.oop.interfaces.service;

/**
 * 手机
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/25 下午1:28
 * @since JDK11
 */
public class Cellphone {
    /*********************成员变量************************/

    /**
     * 手机型号
     *
     */
    private String model;

    /**
     * 手机品牌
     */
    private String brand;

    /**
     * 价格
     */
    private Integer price;

    /**
     * 颜色
     */
    private String color;

    /**
     * 重量
     */
    private Integer weight;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Cellphone(){

    }

    public Cellphone(String model){
        this.model=model;
    }

    public Cellphone(String model,Integer price){
        this(model);
        this.price=price;
    }

    public Cellphone(String model,Integer price, Integer weight){
        this(model,price);
        this.weight=weight;
    }

    public Cellphone(String model, String brand, Integer price, String color, Integer weight) {
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cellphone{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
