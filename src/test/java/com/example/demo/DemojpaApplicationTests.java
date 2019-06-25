package com.example.demo;

import com.example.demo.entity.ZuiDaiMa;
import com.example.demo.entity.ZuiDaiMaSolr;
import com.example.demo.repository.ZuiDaiMaRepository;
import com.example.demo.repository.ZuiDaiMaSolrRepository;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrServerException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemojpaApplicationTests {


	@Autowired
	private ZuiDaiMaRepository repository;

	@Autowired
    private ZuiDaiMaSolrRepository zuiDaiMaSolrRepository;

	@Autowired
    private SolrClient solrClient;
	@Test
	public void contextLoads() {
	/*	PageRequest pageRequest = new PageRequest(0, 10);
		Page<PostinfoEntity> postInfoList = postInfoService.getPostInfoList(1,pageRequest);
		System.out.println();*/

		repository.findAll().forEach((a)->{
			System.out.println(a.getTitle());
		});
	}


	@Test
	public void testJsoup() throws IOException {
		Document doc = Jsoup.connect("http://www.zuidaima.com/share.htm")
				.timeout(3000)
				.get();

        Elements title = doc.getElementsByClass("title");

        List<ZuiDaiMa> list = new ArrayList<>();
        for (Element e:title) {
            ZuiDaiMa zuiDaiMa = new ZuiDaiMa();
            System.out.println(e.attr("href"));

            System.out.println(e.text());
            zuiDaiMa.setTitle(e.text());
            zuiDaiMa.setUrl("http://www.zuidaima.com/"+e.attr("href"));
            zuiDaiMa.setCreatetime(new Date());
            System.out.println("----------------");
            list.add(zuiDaiMa);
        }
        List<ZuiDaiMa> zuiDaiMas = repository.saveAll(list);
        System.out.println(zuiDaiMas.size());
    }

    @Test
    public void addSolrTest() throws IOException, SolrServerException {
     /*   ZuiDaiMa zuiDaiMa = new ZuiDaiMa();
        zuiDaiMa.setTitle("solr-lrving11");
        zuiDaiMa.setUrl("url");
        zuiDaiMa.setId(1);
        zuiDaiMa.setCreatetime(new Date());
        zuiDaiMa.setUpdatetime(new Date());
        solrClient.addBean(zuiDaiMa);
        solrClient.commit();*/
       /* ZuiDaiMaSolr zuiDaiMaSolr = new ZuiDaiMaSolr();
        zuiDaiMaSolr.setId(1);
        zuiDaiMaSolr.setTitle("testooo1");
        zuiDaiMaSolr.setUrl("urlll");
        ZuiDaiMaSolr save = zuiDaiMaSolrRepository.save(zuiDaiMaSolr);
        System.out.println(save.getId());*/
        List<ZuiDaiMaSolr> text = zuiDaiMaSolrRepository.findByQueryAnnotation("JavaScript");
        System.out.println(text.size());
    }



}
