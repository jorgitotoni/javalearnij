package net.addit.java.api.io;

import net.addit.java.foundational.oop.Cellphone;
import org.testng.annotations.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Java语言的序列化和反序列化机制的使用
 *
 * @author tony 241963698@qq.com
 * @version 2022/11/17 下午12:14
 * @since JDK11
 */
public class ObjectOutputStreamObjectInputStreamTest {
    static final String path="/Users/antoniojiang/Downloads/javaIo/cellphone.txt";

    /**
     * 通过ObjectOutputStream的writeObject()方法实现对象的序列化机制
     * 实现cellphone对象的序列化，将cellphone对象以字节的形式写到cellphone.txt文件中
     * cellphone对象的数据都会以字节的方式写入cellphone.txt文件
     */
    @Test
    public void testObjectOutputStreamWriteObject(){
        Cellphone cellphone=new Cellphone();
        cellphone.setPrice(8888);
        cellphone.setColor("黑色");
        cellphone.setWeight(228);
        cellphone.setModel("华为P50 pro plus");
        cellphone.setBrand("华为");

        try(
                OutputStream outputStream=new FileOutputStream(path);
                ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
        ){
        objectOutputStream.writeObject(cellphone);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    /**
     * 通过ObjectInputStream的readObject()方法实现文件的反序列化机制
     * 通过ObjectInputStream读取cellphone.txt文件中存储的字节信息转换为cellphone对象
     */
    @Test
    public void testObjectInputStreamReadObject(){
        try(
                InputStream inputStream=new FileInputStream(path);
                ObjectInputStream objectInputStream=new ObjectInputStream(inputStream);
        ){
        Object object=objectInputStream.readObject();
        if(object instanceof Cellphone){
            Cellphone cellphone=(Cellphone) object;
            System.out.println(object);
        }
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    /**
     * 集合的序列化和反序列化
     */
    @Test
    public void testCollectionSerializationDeserialization(){
        List<Cellphone> cellphoneList=new ArrayList<>();
        Cellphone huawei=new Cellphone();
        huawei.setPrice(8888);
        huawei.setColor("黑色");
        huawei.setWeight(228);
        huawei.setModel("华为P50 pro plus");
        huawei.setBrand("华为");

        Cellphone apple=new Cellphone();
        apple.setPrice(12999);
        apple.setColor("白色");
        apple.setWeight(228);
        apple.setModel("iPhone13 pro plus");
        apple.setBrand("苹果");

        Cellphone samsung=new Cellphone();
        samsung.setPrice(11999);
        samsung.setColor("黑色");
        samsung.setWeight(228);
        samsung.setModel("三星S22 ultra");
        samsung.setBrand("三星");

        cellphoneList.add(huawei);
        cellphoneList.add(apple);
        cellphoneList.add(samsung);

        try(
        OutputStream outputStream=new FileOutputStream("/Users/antoniojiang/Downloads/javaIo/collection.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
        InputStream inputStream=new FileInputStream("/Users/antoniojiang/Downloads/javaIo/collection.txt");
        ObjectInputStream objectInputStream=new ObjectInputStream(inputStream);
        ){
        objectOutputStream.writeObject(cellphoneList);
            Object object = objectInputStream.readObject();
            if(object instanceof List){
                List<Cellphone> deserializationCellphoneList=(List<Cellphone>) object;
                System.out.println("反序列化集合：");
                for (Cellphone cellphone : deserializationCellphoneList) {
                    System.out.println(cellphone);
                }
            }
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
