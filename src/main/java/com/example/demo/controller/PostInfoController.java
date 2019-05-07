package com.example.demo.controller;

import com.example.demo.common.model.AjaxResult;
import com.example.demo.entity.PostinfoEntity;
import com.example.demo.service.PostInfoService;
import com.example.demo.service.TypeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by goodwuxuyang on 2019/5/6.
 */
@RestController
@RequestMapping("/postInfo")
public class PostInfoController  extends ControllerBase{


    @Autowired
    private PostInfoService postInfoService;
    @GetMapping("/postInfos/{tid}")
    public Object getPostInfoList(@PathVariable(name = "tid") Integer tid,Pageable pageable){

        Page<PostinfoEntity> postInfoList = postInfoService.getPostInfoList(tid, pageable);
        return AjaxResult.ok().data(postInfoList.getContent()).total(postInfoList.getTotalElements());
    }


    /*@GetMapping("/postInfos/{tid}")
    public String getPostInfoListExcel(@PathVariable(name = "tid") Integer tid,Pageable pageable){

        Page<PostinfoEntity> postInfoList = postInfoService.getPostInfoList(tid, pageable);
        Map<String,String> cellName=new LinkedHashMap<>();
        cellName.put("标题","posttitle");
        cellName.put("手机号","utelephone");
        try {
            exportExcel(postInfoList.getContent(),cellName,"帖子信息");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return  "";
    }*/

    @Autowired
    private TypeInfoService typeInfoService;

    @PostMapping("/import")
    public boolean addUser(@RequestParam("file") MultipartFile file) {
        boolean a = false;
        String fileName = file.getOriginalFilename();
        try {
            a = typeInfoService.batchImport(fileName, file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  a;
    }

}
