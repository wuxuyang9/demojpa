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
public class Interviewer implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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