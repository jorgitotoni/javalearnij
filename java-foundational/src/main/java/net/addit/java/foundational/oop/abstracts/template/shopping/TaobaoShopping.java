package net.addit.java.foundational.oop.abstracts.template.shopping;

/**
 * 淘宝购物
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/19 下午1:38
 * @since JDK8
 */
public class TaobaoShopping extends AbstractShoppingTemplate{
    @Override
    protected void register() {
        System.out.println("欢迎注册淘宝");
        super.realName();
    }

    @Override
    protected void login() {
        System.out.println("欢迎登录淘宝");

    }

    @Override
    protected void search() {
        System.out.println("淘宝用户搜索淘宝商品");

    }

    @Override
    protected void addShoppingCart() {
        System.out.println("淘宝用户添加商品到购物车");

    }

    @Override
    protected void pay() {
        System.out.println("淘宝用户用支付宝支付");

    }

    @Override
    protected void commitOrder() {
        System.out.println("淘宝用户提交订单");

    }
}
