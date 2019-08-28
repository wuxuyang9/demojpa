package com.example.demo.repository;

import com.example.demo.entity.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleModeRepository extends JpaRepository<VehicleModel,Integer> {


        List<VehicleModel> findAllByParentId(Integer parentId);
}
