package com.example.demo.service.impl;

import com.example.demo.entity.VehicleModel;
import com.example.demo.entity.vo.VehicleModelVo;
import com.example.demo.repository.VehicleModeRepository;
import com.example.demo.service.VehicleModeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: demojpa
 * @description:
 * @author: wxy
 * @create: 2019-08-28 11:52
 **/
@Service
@Transactional(readOnly = true)
public class VehicleModeServiceImpl implements VehicleModeService {


    @Autowired
    private VehicleModeRepository vehicleModeRepository;


    /**
     * 查询车型级联选项菜单
     * @return
     */
    @Override
    public List<VehicleModelVo> getVehicleModeVoList() {
        List<VehicleModelVo> list = new ArrayList<>();
        // 查询一级选项 parentId==0
        List<VehicleModel> allByParentId = vehicleModeRepository.findAllByParentId(0);
        allByParentId.forEach((parent)->{
            VehicleModelVo vehicleModelVo = new VehicleModelVo();
            vehicleModelVo.setLabel(parent.getVehicleModelName());
            vehicleModelVo.setValue(parent.getId()+"");
            List<VehicleModel> chrild = vehicleModeRepository.findAllByParentId(parent.getId());
            List<VehicleModelVo> chrildList = new ArrayList<>();
            chrild.forEach((childs)->{
                VehicleModelVo vehicleModelVo2 = new VehicleModelVo();
                vehicleModelVo2.setLabel(childs.getVehicleModelName());
                vehicleModelVo2.setValue(childs.getId()+"");
                /*vehicleModelVo2.setChildren(new ArrayList<>());*/
                chrildList.add(vehicleModelVo2);
            });

            vehicleModelVo.setChildren(chrildList);

            list.add(vehicleModelVo);
        });

        return list;
    }
}
