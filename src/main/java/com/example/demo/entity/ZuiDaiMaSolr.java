package com.example.demo.entity;/**
 * @author user
 * @date 2019/6/25
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.io.Serializable;

/**
 * @program: demojpa
 * @description:
 * @author: wxy
 * @create: 2019-06-25 17:10
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@SolrDocument(solrCoreName = "test")
public class ZuiDaiMaSolr implements Serializable {

    @Field("id")
    private Integer id;

    @Field("title")
    private String title;

    @Field("url")
    private String url;
}
