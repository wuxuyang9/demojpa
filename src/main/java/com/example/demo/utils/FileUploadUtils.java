package com.example.demo.utils;

import org.csource.common.MyException;
import org.csource.fastdfs.*;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

/**
 * @program: demojpa
 * @description:
 * @author: wxy
 * @create: 2019-09-17 11:44
 **/
public class FileUploadUtils {

    public static String uploadFile(byte[] byteFile, String ext_file) {
        // 拼接服务区的文件路径
        StringBuffer sbPath = new StringBuffer();
        sbPath.append("http://192.168.70.130:8080");
        try {
            String filePath = new ClassPathResource("fdfs_client.conf").getFile().getAbsolutePath();
            // 1、加载配置文件，配置文件中的内容就是 tracker 服务的地址。
            ClientGlobal.init(filePath);

            // 链接FastDFS服务器，创建tracker和Stroage
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getConnection();
            StorageServer storageServer = null;
            StorageClient storageClient = new StorageClient(trackerServer,
                    storageServer);
            //利用字节流上传文件
            String[] strings = storageClient.upload_file(byteFile, ext_file, null);

            for (String string : strings) {
                sbPath.append("/" + string);
                System.out.println(string);
            }
            // 全路径
            System.out.println(sbPath);
        } catch (IOException | MyException e) {
            e.printStackTrace();
        }
        return sbPath.toString();

    }
}
