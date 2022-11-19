package net.addit.java.foundational.oop.interfaces.service;

/**
 * 百度网盘
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/26 下午2:02
 * @since JDK11
 */
public class BaiduDiskCallBack implements DownloadCompleteCallBack{
    @Override
    public void doCompleteCallBack(String data) {
        System.out.println("迅雷下载到的数据"+data);
        System.out.println("用户存储"+data+"到百度网盘");
    }
}
