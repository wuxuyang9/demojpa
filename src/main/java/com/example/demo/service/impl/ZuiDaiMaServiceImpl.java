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
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.result.HighlightPage;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

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

    @Override
    public Page<ZuiDaiMa> findList(Pageable pageable) {
        Page<ZuiDaiMa> all = zuiDaiMaRepository.findAll(pageable);
        return all;
    }

    @Override
    @Transactional
    public ZuiDaiMa save(ZuiDaiMa zuiDaiMa) {
        zuiDaiMa.setCreatetime(new Date());
        zuiDaiMa.setUpdatetime(new Date());
        return zuiDaiMaRepository.save(zuiDaiMa);
    }

    @Override
    public ZuiDaiMa findById(Integer id) {
        return zuiDaiMaRepository.findById(id).get();
    }

    @Override
    @Transactional
    public ZuiDaiMa updateZuiDaiMa(ZuiDaiMa zuiDaiMa) {
        zuiDaiMa.setUpdatetime(new Date());
        return zuiDaiMaRepository.save(zuiDaiMa);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        zuiDaiMaRepository.deleteById(id);
    }

    @Override
    public HighlightPage solrList(Pageable pageable, String title) {
        return zuiDaiMaSolrRepository.findZuiDaiMaSolrByTitleContaining(title,pageable);
    }


    @Autowired
    private SolrClient client;

    @Autowired
    private SolrTemplate solrTemplate;
    @Override
    public List<ZuiDaiMaSolr> getListSerach(String kw) throws IOException, SolrServerException {


        SolrQuery query = new SolrQuery();
        query.setQuery("title:"+kw);
        query.setHighlight(true);
        query.addHighlightField("title");
        query.setHighlightSimplePre("<font color='red'>");
        query.setHighlightSimplePost("</font>");
        query.setHighlightFragsize(100);
        QueryResponse query1 = client.query(query);
        List<ZuiDaiMaSolr> beans = query1.getBeans(ZuiDaiMaSolr.class);
        Map<String, Map<String, List<String>>> highlighting = query1.getHighlighting();

        return null;
    }


}
