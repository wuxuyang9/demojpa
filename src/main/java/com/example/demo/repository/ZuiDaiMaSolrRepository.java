package com.example.demo.repository;/**
 * @author user
 * @date 2019/6/25
 */

import com.example.demo.entity.ZuiDaiMa;
import com.example.demo.entity.ZuiDaiMaSolr;
import org.springframework.data.domain.Pageable;
import org.springframework.data.solr.core.query.result.HighlightPage;
import org.springframework.data.solr.repository.Highlight;
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
    List<ZuiDaiMaSolr> findByQueryAnnotation(String title);

    @Highlight(prefix = "<font color='red'>", postfix = "</font>")
    HighlightPage<ZuiDaiMaSolr> findZuiDaiMaSolrByTitleContaining(String title, Pageable pageable);
}
