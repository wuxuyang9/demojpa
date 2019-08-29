package com.example.demo.repository;

import com.example.demo.entity.CarUpkeep;
import com.example.demo.entity.vo.CarUpkeepVo;
import com.example.demo.entity.vo.CarUpkeepVo2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CarUpkeepRepository extends JpaRepository<CarUpkeep,Integer> {


    @Query(value = "select new com.example.demo.entity.vo.CarUpkeepVo(c.id,c.customerName,c.customerPhone,c.vehicleModelId,c.upkeepOperation,c.cost,c.date,c.createtime,c.updatetime,v.vehicleModelName) from CarUpkeep  c left join  VehicleModel v on c.vehicleModelId=v.id")
    Page<CarUpkeepVo> findCarUpkeepVoPage(Pageable pageable);


    @Query(value = "select new com.example.demo.entity.vo.CarUpkeepVo2(c.id,c.customerName,c.customerPhone,c.vehicleModelId,c.upkeepOperation,c.cost,c.date,c.createtime,c.updatetime,v.vehicleModelName) from CarUpkeep  c left join  VehicleModel v on c.vehicleModelId=v.id where  c.id=?1")
    CarUpkeepVo2 findCarUpkeepVo2ById(Integer id);
}
