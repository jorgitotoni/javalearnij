package net.addit.java.foundational.oop.enums;

/**
 * 枚举：季节
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/28 下午1:58
 * @since JDK11
 */
public enum Season {
    /**
     * public static final Season SPRING=new Season("")
     */
    SPRING("春天"),SUMMER("夏天"),AUTUMN("秋天"),WINTER("冬天");

//    private Season(){
//        System.out.println("枚举的实例被初始化了");
//    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

    /**
     * 根据描述获取枚举实例（枚举值）
     * @param description 描述
     * @return 枚举值
     */
    public static Season getSeasonByDescription(String description){
        for (Season value : Season.values()) {
            if(description.equals(value.getDescription())){
                return value;
            }
        }
        return null;
    }

    Season(String description){
        this.description=description;
    }

    @Override
    public String toString() {
        return "季节{" +
                "季节描述='" + description + '\'' +
                '}';
    }
}
