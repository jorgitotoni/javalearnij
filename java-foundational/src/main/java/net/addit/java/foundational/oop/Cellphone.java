package net.addit.java.foundational.oop;

import net.addit.java.foundational.oop.interfaces.service.Comparator;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * 手机类
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/11 下午1:31
 * @since JDK8
 */
public class Cellphone implements Comparable<Cellphone>, Serializable {
    /*********************成员变量************************/

    /**
     * 手机型号
     */
    String model;

    /**
     * 手机品牌
     */
    String brand;

    /**
     * 价格
     */
    transient Integer price;

    /**
     * 颜色
     */
    String color;

    /**
     * 重量
     */
    private Integer weight;

    public Cellphone() {
    }

    public Cellphone(String model) {
        this.model = model;
    }

    public Cellphone(String model, Integer price) {
        this(model);
        this.price = price;
    }

    public Cellphone(String model, Integer price, Integer weight) {
        this(model, price);
        this.weight = weight;
    }


    /******************成员方法************************/
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
        if(price<0 || price>1000_000){
            throw new RuntimeException("价格异常");
        }
        System.out.println("价格设置成功");
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

    /**
     * 给指定的手机号打电话
     *
     * @param number
     */
    public void call(long number) {
        System.out.println("正在给" + number + "打电话");
    }

    public void sendMessage(long number, String message) {
        System.out.println("正在给" + number + "发短信，短信内容是：" + message);
    }

    @Override
    public String toString() {
        return "Cellphone{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                ", Color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cellphone cellphone = (Cellphone) o;
        return model.equals(cellphone.model) && price.equals(cellphone.price) && weight.equals(cellphone.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price, weight);
    }

    @Override
    public int compareTo(Cellphone cellphone) {
        //按照价格降序排序
        //降序：后面减前面
        return cellphone.getPrice() - this.getPrice();
    }

}
