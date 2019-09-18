package com.example.demo.controller;

import com.example.demo.common.model.JsonResult;
import com.example.demo.entity.Interviewer;
import com.example.demo.service.InterviewerService;
import com.example.demo.utils.FileUploadUtils;
import org.omg.CORBA.OBJ_ADAPTER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @program: demojpa
 * @description:
 * @author: wxy
 * @create: 2019-09-17 11:24
 **/

@RestController
@RequestMapping("/api/interviewer")
public class InterviewerController extends ControllerBase{



    @Autowired
    private InterviewerService interviewerService;


    @PostMapping("/file")
    public Object uploadFile(@RequestParam("file")MultipartFile file){
        String s =null;
        try {
            String originalFilename = file.getOriginalFilename();
            String suffix = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);
            s=FileUploadUtils.uploadFile(file.getBytes(), suffix);

        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println(file);

        return JsonResult.success(s);
    }


    @PostMapping("/")
    public Object save(@RequestBody Interviewer interviewer){
         Interviewer interviewer1=interviewerService.save(interviewer);
         return JsonResult.success(interviewer1);
    }

    @GetMapping("/list")
    public Object getList(@RequestParam(required = false,defaultValue = "1")Integer pageNo,
                          @RequestParam(required = false,defaultValue = "10")Integer pageSize,
                          Interviewer interviewer){

        Pageable pageable = getPageable(pageNo, pageSize, null);
        Page<Interviewer> page=interviewerService.findInterviewersList(pageable,interviewer);
        return JsonResult.success(page);
    }








    @DeleteMapping("/{id}")
    public Object delete(@PathVariable(value = "id")Integer id){
        interviewerService.deleteById(id);
       return JsonResult.success();
    }

}
