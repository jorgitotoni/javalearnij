package net.addit.java.foundational.oop.abstracts.template.shopping;

/**
 * 京东购物
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/19 下午1:40
 * @since JDK8
 */
public class JDshopping extends AbstractShoppingTemplate {
    @Override
    protected void register() {
        System.out.println("欢迎注册京东");
        super.realName();
    }

    @Override
    protected void login() {
        System.out.println("欢迎登录京东");

    }

    @Override
    protected void search() {
        System.out.println("京东用户搜索京东商品");

    }

    @Override
    protected void addShoppingCart() {
        System.out.println("京东用户添加商品到购物车");

    }

    @Override
    protected void pay() {
        System.out.println("京东用户支付");

    }

    @Override
    protected void commitOrder() {
        System.out.println("京东用户提交订单");

    }
    
}
