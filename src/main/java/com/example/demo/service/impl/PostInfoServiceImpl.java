package com.example.demo.service.impl;

import com.example.demo.entity.PostinfoEntity;
import com.example.demo.repository.PostInfoRepository;
import com.example.demo.service.PostInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by goodwuxuyang on 2019/5/6.
 */
@Service
@Transactional(readOnly = true)
public class PostInfoServiceImpl implements PostInfoService {

    @Autowired
    private PostInfoRepository postInfoRepository;
    @Override
    public Page<PostinfoEntity> getPostInfoList(Integer tid, Pageable pageable) {
        return postInfoRepository.getPostinfoEntityByTid(tid,pageable);
    }
}
