package com.example.demo.service.impl;/**
 * @author user
 * @date 2019/6/27
 */

import com.example.demo.annotation.SolrInsert;
import com.example.demo.entity.ZuiDaiMa;
import com.example.demo.entity.ZuiDaiMaSolr;
import com.example.demo.repository.ZuiDaiMaRepository;
import com.example.demo.repository.ZuiDaiMaSolrRepository;
import com.example.demo.service.ZuiDaiMaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.solr.core.query.result.HighlightPage;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: demojpa
 * @description:
 * @author: wxy
 * @create: 2019-06-27 09:07
 **/

@Service
@Transactional(readOnly = true)
public class ZuiDaiMaServiceImpl implements ZuiDaiMaService {


    @Autowired
    private ZuiDaiMaRepository zuiDaiMaRepository;

    @Autowired
    private ZuiDaiMaSolrRepository zuiDaiMaSolrRepository;

    @Override
    public HighlightPage<ZuiDaiMaSolr> zuiDaiMaList(String title, Pageable pageable) {
        HighlightPage<ZuiDaiMaSolr> page = zuiDaiMaSolrRepository.findZuiDaiMaSolrByTitleContaining(title.trim(), pageable);

        return page;
    }

    @Override
    @Transactional
    public void savaAll(List<ZuiDaiMa> list) {
        zuiDaiMaRepository.saveAll(list);
    }

    @Override
    @SolrInsert
    public void insert(String str){
        System.out.println("ll");
    }


}
