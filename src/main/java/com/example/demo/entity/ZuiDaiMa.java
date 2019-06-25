package com.example.demo.entity;/**
 * @author user
 * @date 2019/6/25
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.solr.client.solrj.beans.Field;
import org.hibernate.annotations.SelectBeforeUpdate;
import org.springframework.data.solr.core.mapping.SolrDocument;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @program: demojpa
 * @description:
 * @author: wxy
 * @create: 2019-06-25 11:53
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SelectBeforeUpdate
@Table(name = "zuidaima")
public class ZuiDaiMa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Field("id")
    private Integer id;

    @Field("title")
    private String title;

    @Field("url")
    private String url;


    private Date createtime;
    private Date updatetime;

}