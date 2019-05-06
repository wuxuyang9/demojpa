package com.example.demo.controller;

import com.example.demo.common.model.AjaxResult;
import com.example.demo.entity.PostinfoEntity;
import com.example.demo.service.PostInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

/**
 * Created by goodwuxuyang on 2019/5/6.
 */
@RestController
@RequestMapping("/postInfo")
public class PostInfoController {


    @Autowired
    private PostInfoService postInfoService;
    @GetMapping("/postInfos/{tid}")
    public Object getPostInfoList(@PathVariable(name = "tid") Integer tid,Pageable pageable){

        Page<PostinfoEntity> postInfoList = postInfoService.getPostInfoList(tid, pageable);
        return AjaxResult.ok().data(postInfoList.getContent()).total(postInfoList.getTotalElements());
    }


}
