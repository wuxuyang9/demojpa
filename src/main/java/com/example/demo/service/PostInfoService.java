package com.example.demo.service;

import com.example.demo.entity.PostinfoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by goodwuxuyang on 2019/5/6.
 */
public interface PostInfoService {
    Page<PostinfoEntity> getPostInfoList(Integer tid,Pageable pageable);
}
