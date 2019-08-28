package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SelectBeforeUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SelectBeforeUpdate
public class CarUpkeep implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String customerName;

    private String customerPhone;

    private Integer vehicleModelId; // 车型Id

    private String upkeepOperation; // 保养业务

    private Long cost; // 费用

    private Date date; // 日期

    @Column(updatable = false)
    private Date createtime;

    private Date updatetime;


}