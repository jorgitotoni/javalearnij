package net.addit.java.foundational.oop.inheritance;

/**
 * 功能手机类（父类）
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/11 下午1:31
 * @since JDK8
 */
public class Cellphone extends Product {
    /*********************成员变量************************/

    /**
     * 手机型号
     *
     */
    private String model;

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model=model;
    }

    /**
     * 手机品牌
     */
    private String brand;

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }

    /**
     * 价格
     */
    private Integer price;

    public Integer getPrice(){
        return price;
    }

    public void setPrice(Integer price){
        if(price<0){
            this.price=-1;
            return;
        }
        this.price=price;
    }

    /**
     * 颜色
     */
    private String color;

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }

    private Integer weight;

    public Integer getWeight(){
        return weight;
    }

    public void setWeight(Integer weight){
        this.weight=weight;
    }

    /******************成员方法************************/

    /**
     * 给指定的手机号打电话
     * @param number 对象电话号码
     */
    public void call(long number){

        System.out.println("正在给"+number+"打电话");
    }

    public void sendMessage(long number,String message){

        System.out.println("正在给"+number+"发短信，短信内容是："+message);
    }

    public Cellphone(){

        System.out.println("Cellphone()无参构造器"+this);
    }

    public Cellphone(String model){
        this.model=model;
    }

    public Cellphone(String model, String brand, Integer price, String color, Integer weight){
        this.model=model;
        this.brand=brand;
        this.price=price;
        this.color=color;
        this.weight=weight;
    }

}
