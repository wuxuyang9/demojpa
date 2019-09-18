package com.example.demo.utils;

import org.csource.fastdfs.*;
import org.springframework.core.io.ClassPathResource;

/**
 * @program: demojpa
 * @description:
 * @author: wxy
 * @create: 2019-09-17 11:38
 **/
public class TestFastDFS {
    public static void main(String[] args) throws Exception {
        String filePath = new ClassPathResource("fdfs_client.conf").getFile().getAbsolutePath();
        // 1、加载配置文件，配置文件中的内容就是 tracker 服务的地址。
        ClientGlobal.init(filePath);
        // 2、创建一个 TrackerClient 对象。直接 new 一个。
        TrackerClient trackerClient = new TrackerClient();
        // 3、使用 TrackerClient 对象创建连接，获得一个 TrackerServer 对象。
        TrackerServer trackerServer = trackerClient.getConnection();
        // 4、创建一个 StorageServer 的引用，值为 null
        StorageServer storageServer = null;
        // 5、创建一个 StorageClient 对象，需要两个参数 TrackerServer 对象、StorageServer 的引用
        StorageClient storageClient = new StorageClient(trackerServer, storageServer);
        // 6、使用 StorageClient 对象上传图片。
        //扩展名不带“.”
        String[] strings = storageClient.upload_file("D:\\screenshot.png", "png",
                null);

        // 7、返回数组。包含组名和图片的路径。
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
