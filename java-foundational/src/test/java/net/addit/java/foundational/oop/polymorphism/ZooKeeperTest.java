package net.addit.java.foundational.oop.polymorphism;

/**
 * 多态应用的测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/24 下午8:20
 * @since JDK11
 */
public class ZooKeeperTest {
    public static void main(String[] args) {
        ZooKeeper zooKeeper=new ZooKeeper();
        Animal animal=new Monkey("金丝猴");
        Food food=new Banana("泰国香蕉");

        //向下转型
        Monkey monkey=(Monkey) animal;
        monkey.play();

        //类型转换异常
        //Tiger tiger=(Tiger) animal;
        if(animal instanceof Tiger){
            Tiger tiger=(Tiger) animal;
        }

        zooKeeper.feed(animal,food);

        animal=new Tiger("东北虎");
        food=new Meat("牛排");
        zooKeeper.feed(animal,food);

        animal=new Giraffe("非洲长颈鹿");
        food=new Leaf("桉树叶");
        zooKeeper.feed(animal,food);

        Animal animalReturnValue= zooKeeper.getAnimal(monkey);
        System.out.println("动物的信息:"+animalReturnValue.getName());
    }
}
