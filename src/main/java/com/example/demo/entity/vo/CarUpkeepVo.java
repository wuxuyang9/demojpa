package com.example.demo.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Date;

/**
 * @program: demojpa
 * @description:
 * @author: wxy
 * @create: 2019-08-28 14:26
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarUpkeepVo implements Serializable {

    private Integer id;

    private String customerName;

    private String customerPhone;

    private Integer vehicleModelId; // 车型Id

    private String upkeepOperation; // 保养业务

    private Long cost; // 费用

    private Date date; // 日期

    private Date createtime;

    private Date updatetime;

    private String vehicleModelName;

}
