package com.example.demo.repository;

import com.example.demo.entity.PostinfoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by goodwuxuyang on 2019/5/6.
 */
public interface PostInfoRepository extends JpaRepository<PostinfoEntity,Integer> {
    Page<PostinfoEntity> getPostinfoEntityByTid(Integer tid,Pageable pageable);
}
