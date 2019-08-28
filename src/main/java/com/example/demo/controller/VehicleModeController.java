package com.example.demo.controller;

import com.example.demo.common.model.JsonResult;
import com.example.demo.entity.vo.VehicleModelVo;
import com.example.demo.service.VehicleModeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: demojpa
 * @description:
 * @author: wxy
 * @create: 2019-08-28 11:46
 **/
@RestController
@RequestMapping("/api/vehicleMode")
//@CrossOrigin("http://192.168.10.227:8080")
public class VehicleModeController {


    @Autowired
    private VehicleModeService vehicleModeService;


    @GetMapping("/list")
    public Object list(){
        List<VehicleModelVo> vehicleModeVoList = vehicleModeService.getVehicleModeVoList();
        return JsonResult.success(vehicleModeVoList);
    }


}
