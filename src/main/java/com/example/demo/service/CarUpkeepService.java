package com.example.demo.service;

import com.example.demo.entity.CarUpkeep;
import com.example.demo.entity.vo.CarUpkeepVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CarUpkeepService {

    CarUpkeep save(CarUpkeep carUpkeep);

    Page<CarUpkeepVo> findAllList(Pageable pageable);
}
