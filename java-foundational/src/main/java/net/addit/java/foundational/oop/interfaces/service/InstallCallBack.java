package net.addit.java.foundational.oop.interfaces.service;

/**
 * 安装
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/26 下午1:49
 * @since JDK11
 */
public class InstallCallBack implements DownloadCompleteCallBack{
    private static final String soft="IDEA.exe";
    @Override
    public void doCompleteCallBack(String data) {
        System.out.println("迅雷下载到的数据是"+data);
        if(soft.equals(data)){
            System.out.println("用户执行安装"+data);
        }
    }
}
