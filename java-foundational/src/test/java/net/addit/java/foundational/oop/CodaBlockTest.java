package net.addit.java.foundational.oop;

/**
 * 代码块测试
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/21 下午12:51
 * @since JDK8
 */
public class CodaBlockTest {

    /**
     * 演示局部代码块
     */
    static void localCodeBlock(){
        int number=10;
        {
            int value=20;
            System.out.println("value="+value);
        }
        System.out.println("number="+number);
    }

    public static void main(String[] args) {
        Window window3=new Window("window3");
        House house=new House(window3);
        System.out.println("当前房屋的窗户数量是"+Window.getWindowCount());

        localCodeBlock();
    }
}

class House{
    static Window window1;

    Window window2;

    final Window window3;

    static {
        System.out.println("1.在静态代码块中初始化第一块窗户");
        window1=new Window("window1");
        System.out.println(window1);
    }

    {
        System.out.println("2.在构造代码块中初始化第二块窗户");
        window2=new Window("window2");
        System.out.println(window2);
    }

    public House(){
        window3=null;
    }

    public House(Window window3){
        System.out.println("3.在构造方法初始化第三块窗户");
        this.window3=window3;
        System.out.println(window3);
    }
}

class Window{
    /**
     * 统计窗户总数
     */
    private static int windowCount;

    /**
     * 窗户名称
     */
    private String name;

    {
        windowCount++;
    }

    /**
     * 获取窗户数量
     * @return
     */
    public static int getWindowCount(){
        return windowCount;
    }

    public Window(){

    }

    public Window(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "房屋的窗户信息{" +
                "窗户名称='" + name + '\'' +
                '}';
    }
}