package com.example.demo.controller;/**
 * @author user
 * @date 2019/6/27
 */

import com.example.demo.common.model.JsonResult;
import com.example.demo.entity.ZuiDaiMa;
import com.example.demo.service.ZuiDaiMaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
@RequestMapping("/api/zuiDaiMa")
@CrossOrigin("http://localhost:8080")
public class ZuiDaiMaController extends ControllerBase{

    @Autowired
    private ZuiDaiMaService zuiDaiMaService;


    @GetMapping("/mq/list")
    public Object list(ZuiDaiMa zuiDaiMa,Pageable pageable){
        return JsonResult.success(zuiDaiMaService.zuiDaiMaList(zuiDaiMa.getTitle(),pageable));
    }


    @GetMapping("/list")
    public  Object list(@RequestParam(required = false, defaultValue = "1") Integer page,
                        @RequestParam(required = false, defaultValue = "20") Integer size,
                        @RequestParam(required = false, defaultValue = "createtime,desc") String sort){
        Pageable pageable = this.getPageable(page, size, sort);
        Page<ZuiDaiMa> list = zuiDaiMaService.findList(pageable);
        return JsonResult.success(list);
    }

    @PostMapping("/")
    public Object save(@RequestBody ZuiDaiMa zuiDaiMa){
        ZuiDaiMa zuiDaiMa1=zuiDaiMaService.save(zuiDaiMa);
        return JsonResult.success(zuiDaiMa1);
    }

    @GetMapping("/{id}")
    public Object getOne(@PathVariable(value = "id")Integer id){
        ZuiDaiMa zuiDaiMa=zuiDaiMaService.findById(id);
        return JsonResult.success(zuiDaiMa);
    }

    @PutMapping("/")
    public Object update(@RequestBody ZuiDaiMa zuiDaiMa){
        ZuiDaiMa zuiDaiMa1=zuiDaiMaService.updateZuiDaiMa(zuiDaiMa);
        return JsonResult.success(zuiDaiMa1);
    }

    @DeleteMapping("/{id}")
    public Object delete(@PathVariable(value = "id")Integer id){
        zuiDaiMaService.deleteById(id);
        return JsonResult.success();
    }
}
