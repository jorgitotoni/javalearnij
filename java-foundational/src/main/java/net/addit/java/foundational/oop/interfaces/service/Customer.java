package net.addit.java.foundational.oop.interfaces.service;

/**
 * 用户
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/26 下午1:45
 * @since JDK11
 */
public class Customer {

    private final DownloadCompleteCallBack downloadCompleteCallBack;

    public Customer(DownloadCompleteCallBack downloadCompleteCallBack){
        this.downloadCompleteCallBack=downloadCompleteCallBack;
    }
    /**
     * 根据指定的url下载数据
     * @param url
     */
    public void downloadData(String url){
        Thunder thunder=new Thunder();
        thunder.handleDownload(url,downloadCompleteCallBack);
    }
}
