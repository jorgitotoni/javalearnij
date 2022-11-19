package net.addit.java.foundational.oop.interfaces.service;

/**
 * 下载完成回调
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/26 下午1:48
 * @since JDK11
 */
public interface DownloadCompleteCallBack {
    /**
     * 迅雷下载完成后相关处理（回调）
     * @param data
     */
    void doCompleteCallBack(String data);
}
