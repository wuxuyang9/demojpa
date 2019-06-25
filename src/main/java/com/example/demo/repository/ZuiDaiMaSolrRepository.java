package com.example.demo.repository;/**
 * @author user
 * @date 2019/6/25
 */

import com.example.demo.entity.ZuiDaiMa;
import com.example.demo.entity.ZuiDaiMaSolr;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;

import java.util.List;

/**
 * @program: demojpa
 * @description:
 * @author: wxy
 * @create: 2019-06-25 17:07
 **/

public interface ZuiDaiMaSolrRepository extends SolrCrudRepository<ZuiDaiMaSolr,Integer> {

    @Query(" title:*?0* ")
    public List<ZuiDaiMaSolr> findByQueryAnnotation(String title);
}
