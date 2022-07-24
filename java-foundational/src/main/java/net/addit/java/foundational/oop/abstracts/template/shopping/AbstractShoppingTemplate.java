package net.addit.java.foundational.oop.abstracts.template.shopping;

/**
 * 网上买东西
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/19 下午1:32
 * @since JDK8
 */
public abstract class AbstractShoppingTemplate {
    /**
     * 买东西
     */
    protected void shopping(){
        register();
        login();
        search();
        addShoppingCart();
        pay();
        commitOrder();
    }

    /**
     * 注册
     */
    protected abstract void register();

    /**
     * 实名认证
     * 通用功能
     */
    public void realName(){
        System.out.println("你的实名认证已经通过");
    }

    /**
     * 登录
     */
    protected abstract void login();

    /**
     * 搜索商品
     */
    protected abstract void search();

    /**
     * 添加购物车
     */
    protected abstract void addShoppingCart();

    /**
     * 支付
     */
    protected abstract void pay();

    /**
     * 提交订单
     */
    protected abstract void commitOrder();
}
