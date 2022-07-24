package net.addit.java.foundational.oop.abstracts.template.shopping;

/**
 * 模板方法模式测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/19 下午1:44
 * @since JDK8
 */
public class TemplateMethodPatternTest {
    public static void main(String[] args) {
        TaobaoShopping taobaoShopping=new TaobaoShopping();
        taobaoShopping.shopping();

        JDshopping jDshopping=new JDshopping();
        jDshopping.shopping();

    }

}
