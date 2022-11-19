package net.addit.java.foundational.oop.interfaces.service;

/**
 * 迅雷
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/26 下午1:46
 * @since JDK11
 */
public class Thunder {

    /**
     * 根据用户传递的url下载数据
     * @param url
     */
    public void handleDownload(String url,DownloadCompleteCallBack downloadCompleteCallBack){
        System.out.println("解析地址"+url);
        System.out.println("正在下载数据。。。");
        String data="Java编程的逻辑.pdf";
        System.out.println(data+"已经下载完成");
        //回调
        downloadCompleteCallBack.doCompleteCallBack(data);
    }
}
