package com.example.demo.controller;/**
 * @author user
 * @date 2019/6/27
 */

import com.example.demo.common.model.JsonResult;
import com.example.demo.entity.ZuiDaiMa;
import com.example.demo.service.ZuiDaiMaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

/**
 * @program: demojpa
 * @description:
 * @author: wxy
 * @create: 2019-06-27 09:04
 **/

@RestController
@RequestMapping("/zuiDaiMa")
public class ZuiDaiMaController {

    @Autowired
    private ZuiDaiMaService zuiDaiMaService;


    @GetMapping("/list")
    public Object list(ZuiDaiMa zuiDaiMa,Pageable pageable){
        return JsonResult.success(zuiDaiMaService.zuiDaiMaList(zuiDaiMa.getTitle(),pageable));
    }
}
