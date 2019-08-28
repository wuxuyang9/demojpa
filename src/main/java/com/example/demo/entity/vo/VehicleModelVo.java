package com.example.demo.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @program: demojpa
 * @description:
 * @author: wxy
 * @create: 2019-08-28 11:43
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleModelVo implements Serializable {

    private String value;

    private String label;

    private List<VehicleModelVo> children;
}
