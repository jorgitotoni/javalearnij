package net.addit.java.foundational.oop.interfaces.service;

/**
 * 接口编程
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/23 上午10:51
 * @since JDK8
 */
public interface UserService extends LoginService,RegisterService{
    /**
     * 网站名称
     */
    public static final String WEB_SITE_NAME="淘宝网";

    /**
     * 登录，抽象方法
     */
    @Override
    public abstract void login();

    /**
     * 重置密码
     */
    public default void resetPassword(){
        System.out.println("请输入你的手机号");
        System.out.println("请输入你收到的验证码");
        System.out.println("请输入新的密码");
        System.out.println("请再次输入新的密码");
        System.out.println("密码重置成功");

    }

    /**
     * 发送验证码
     */
    private void sendCode(){
        System.out.println("您好，您的验证码是1111，请不要告诉别");
    }

    /**
     * 统计信息
     */
    static void statistics(){
        long count=getAllUserInfo();
        System.out.println("当前网站注册总人数为"+count);
    }

    /**
     * 获取用户信息
     * @return 用户数
     */
    private static long getAllUserInfo(){
        System.out.println("从数据库查询所有成员的信息");
        int count=1_000_000_000;
        return count;
    }

}
