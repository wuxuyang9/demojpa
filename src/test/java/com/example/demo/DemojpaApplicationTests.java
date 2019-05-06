package com.example.demo;

import com.example.demo.entity.PostinfoEntity;
import com.example.demo.repository.PostInfoRepository;
import com.example.demo.service.PostInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemojpaApplicationTests {

	@Autowired
	private PostInfoService postInfoService;
	@Test
	public void contextLoads() {
		PageRequest pageRequest = new PageRequest(0, 10);
		Page<PostinfoEntity> postInfoList = postInfoService.getPostInfoList(1,pageRequest);
		System.out.println();
	}

}
