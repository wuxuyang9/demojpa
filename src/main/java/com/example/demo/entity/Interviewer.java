package com.example.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@ApiModel(value = "Interviewer类", description = "请求参数类")
public class Interviewer implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(example = "1", notes = "ID")
    private Integer id;

    @ApiModelProperty(example = "1", notes = "interviewTime")
    private Date interviewTime;

    private String record;

    private String company;

    private String offer;

    private String platform;


    @Column(updatable = false)
    private Date createTime;

    private Date updateTime;

    private String interviewSite;

    private String interviewers;

    private String feeling;


}