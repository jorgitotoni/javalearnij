package net.addit.java.foundational.oop.interfaces.service;

/**
 * 回调的测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/26 下午1:58
 * @since JDK11
 */
public class CustomerTest {
    public static void main(String[] args) {

        DownloadCompleteCallBack downloadCompleteCallBack=new BaiduDiskCallBack();

        Customer tony=new Customer(downloadCompleteCallBack);
        tony.downloadData("http://www.baidu.com");

    }
}
