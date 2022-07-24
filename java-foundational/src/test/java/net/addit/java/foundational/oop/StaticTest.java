package net.addit.java.foundational.oop;

/**
 * static关键字测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/21 下午12:25
 * @since JDK8
 */
public class StaticTest {

    public static void main(String[] args) {
        RegisterInfo android=new RegisterInfo();
        android.setUserName("tony");
        android.setSource("app");

        RegisterInfo ios=new RegisterInfo();
        ios.setUserName("jack");
        //ios.setSource("app");

        System.out.println(android);
        System.out.println(ios);
    }
}

/**
 * 注册信息
 */
class RegisterInfo{
    /**
     * 用户名
     */
    private String userName;

    /**
     * 默认的注册来源
     */
    private static String source;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "注册信息{" +
                "用户名='" + userName + '\'' +
                ", 默认的注册来源='" + source + '\'' +
                '}';
    }
}