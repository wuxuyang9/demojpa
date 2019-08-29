package com.example.demo.service;

import com.example.demo.entity.CarUpkeep;
import com.example.demo.entity.vo.CarUpkeepVo;
import com.example.demo.entity.vo.CarUpkeepVo2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CarUpkeepService {

    CarUpkeep save(CarUpkeep carUpkeep);

    Page<CarUpkeepVo> findAllList(Pageable pageable);

    CarUpkeepVo2 findCarUpkeepVoById(Integer id);

    CarUpkeep update(CarUpkeep carUpkeep);

    void deleteById(Integer id);
}
