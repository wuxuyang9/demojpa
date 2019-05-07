package com.example.demo.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by goodwuxuyang on 2019/5/7.
 */
public interface TypeInfoService {
    boolean batchImport(String fileName, MultipartFile file) throws Exception;
}
