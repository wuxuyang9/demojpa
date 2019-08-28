package com.example.demo.controller;

import com.example.demo.common.model.JsonResult;
import com.example.demo.entity.CarUpkeep;
import com.example.demo.entity.vo.CarUpkeepVo;
import com.example.demo.service.CarUpkeepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

/**
 * @program: demojpa
 * @description:
 * @author: wxy
 * @create: 2019-08-28 12:51
 **/
@RestController
@RequestMapping("/api/carUpkeep")
//@CrossOrigin("http://192.168.10.227:8080")
public class CarUpkeepController extends ControllerBase{

    @Autowired
    private CarUpkeepService carUpkeepService;


    @PostMapping("/")
    public Object save(@RequestBody CarUpkeep carUpkeep){
        CarUpkeep save = carUpkeepService.save(carUpkeep);
        return JsonResult.success(save);
    }


    @GetMapping("/list")
    public Object list(@RequestParam(required = false, defaultValue = "1") Integer page,
                       @RequestParam(required = false, defaultValue = "20") Integer size,
                       @RequestParam(required = false, defaultValue = "createtime,desc") String sort){

        Pageable pageable = this.getPageable(page, size, sort);
        Page<CarUpkeepVo> allList = carUpkeepService.findAllList(pageable);
        return JsonResult.success(allList);
    }
}
