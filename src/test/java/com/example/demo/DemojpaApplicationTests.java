package com.example.demo;

import com.example.demo.entity.ZuiDaiMa;
import com.example.demo.entity.ZuiDaiMaSolr;
import com.example.demo.repository.ZuiDaiMaRepository;
import com.example.demo.repository.ZuiDaiMaSolrRepository;
import com.example.demo.service.ZuiDaiMaService;
import com.example.demo.service.impl.ZuiDaiMaServiceImpl;
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
import org.springframework.data.solr.core.query.result.HighlightPage;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.text.SimpleDateFormat;
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


	@Autowired
    private ZuiDaiMaService zuiDaiMaService;

	@Autowired
    private ZuiDaiMaServiceImpl zuiDaiMaServiceImpl;

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
		Document doc = Jsoup.connect("http://www.zuidaima.com/share/p5-s1.htm")
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
       /* List<ZuiDaiMa> zuiDaiMas = repository.saveAll(list);
        System.out.println(zuiDaiMas.size());*/
       zuiDaiMaService.savaAll(list);
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
       /* List<ZuiDaiMaSolr> text = zuiDaiMaSolrRepository.findByQueryAnnotation("JavaScript");
        System.out.println(text.size());*/

      /* zuiDaiMaSolrRepository.findAll().forEach((a)->{
           System.out.println(a.getTitle());
       });
*/
     /*   PageRequest pageRequest = new PageRequest(0,10);

        HighlightPage<ZuiDaiMaSolr> result = zuiDaiMaSolrRepository.findZuiDaiMaSolrByTitleContaining("管理系统", pageRequest);
        System.out.println(result.getContent());*/

        Iterable<ZuiDaiMaSolr> all = zuiDaiMaSolrRepository.findAll();
        all.forEach((a)->{
            System.out.println(a.getTitle());
        });

    }


    @Test
    public void test3r(){

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date date = new Date(1566921600000L);

        String format = simpleDateFormat.format(date);

        System.out.println(format);
    }


}
