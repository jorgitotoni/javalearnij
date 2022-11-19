package net.addit.java.foundational.oop.interfaces.service;

/**
 * 读取文件回调
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/26 下午1:55
 * @since JDK11
 */
public class ReadCallBack implements DownloadCompleteCallBack{
    @Override
    public void doCompleteCallBack(String data) {
        System.out.println("下载的数据是"+data);
        System.out.println("用户正在使用PDF工具阅读"+data);
    }
}
