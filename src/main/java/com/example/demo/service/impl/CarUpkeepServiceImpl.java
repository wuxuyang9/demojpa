package com.example.demo.service.impl;

import com.example.demo.common.exception.RException;
import com.example.demo.common.model.CodeEnum;
import com.example.demo.common.util.Assert;
import com.example.demo.entity.CarUpkeep;
import com.example.demo.entity.VehicleModel;
import com.example.demo.entity.vo.CarUpkeepVo;
import com.example.demo.entity.vo.CarUpkeepVo2;
import com.example.demo.repository.CarUpkeepRepository;
import com.example.demo.repository.VehicleModeRepository;
import com.example.demo.service.CarUpkeepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Optional;

/**
 * @program: demojpa
 * @description:
 * @author: wxy
 * @create: 2019-08-28 12:53
 **/

@Service
@Transactional(readOnly = true)
public class CarUpkeepServiceImpl implements CarUpkeepService {


    @Autowired
    private CarUpkeepRepository carUpkeepRepository;

    @Autowired
    private VehicleModeRepository vehicleModeRepository;

    @Override
    @Transactional
    public CarUpkeep save(CarUpkeep carUpkeep) {
        this.valitation(carUpkeep);
        carUpkeep.setCreatetime(new Date());
        carUpkeep.setUpdatetime(new Date());
        return carUpkeepRepository.save(carUpkeep);
    }

    @Override
    public Page<CarUpkeepVo> findAllList(Pageable pageable) {
        return carUpkeepRepository.findCarUpkeepVoPage(pageable);
    }

    @Override
    public CarUpkeepVo2 findCarUpkeepVoById(Integer id) {
        Assert.isNull(id,"参数id不能为空");
        CarUpkeepVo2 carUpkeepVo2 = carUpkeepRepository.findCarUpkeepVo2ById(id);
        Optional<VehicleModel> byId = vehicleModeRepository.findById(carUpkeepVo2.getVehicleModelId());
        Optional<VehicleModel> vehicleModeParent = vehicleModeRepository.findById(byId.get().getParentId());
        carUpkeepVo2.setVehicleModelParentId(vehicleModeParent.get().getId());
        return carUpkeepVo2;
    }

    @Override
    @Transactional
    public CarUpkeep update(CarUpkeep carUpkeep) {
        this.valitation(carUpkeep);
        carUpkeep.setUpdatetime(new Date());
        return carUpkeepRepository.save(carUpkeep);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        Assert.isNull(id,"参数无效");
        carUpkeepRepository.deleteById(id);
    }

    public void  valitation(CarUpkeep carUpkeep){
        Assert.isNull(carUpkeep.getVehicleModelId(),"选择车型为空");
        VehicleModel vehicleModel = vehicleModeRepository.findById(carUpkeep.getVehicleModelId()).orElse(null);
        if(vehicleModel==null){
            throw new RException("选择车型不存在", CodeEnum.DATA_NOT_EXITS.getCode());
        }
    }
}
