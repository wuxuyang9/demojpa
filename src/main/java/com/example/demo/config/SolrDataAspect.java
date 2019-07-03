package com.example.demo.config;/**
 * @author user
 * @date 2019/7/3
 */

import com.example.demo.entity.ZuiDaiMa;
import com.example.demo.entity.ZuiDaiMaSolr;
import com.example.demo.repository.ZuiDaiMaSolrRepository;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: demojpa
 * @description:
 * @author: wxy
 * @create: 2019-07-03 15:48
 **/


@Aspect
@Component
public class SolrDataAspect {


    @Autowired
    private ZuiDaiMaSolrRepository zuiDaiMaSolrRepository;

    @Pointcut("execution(* com.example.demo.service.*.sava*(..))")
    public void solrDataAdd(){}


    @Pointcut("@annotation(com.example.demo.annotation.SolrInsert)")
    public void test(){}

    @Before("test()")
    public void test1(JoinPoint joinPoint){
        System.out.println(Arrays.toString(joinPoint.getArgs()));
    }

    @After("solrDataAdd()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        System.out.println("ARGS : " + Arrays.toString(joinPoint.getArgs()));
        List<ZuiDaiMa> list= (List<ZuiDaiMa>) joinPoint.getArgs()[0];
        List<ZuiDaiMaSolr> list1 = new ArrayList<>();
        list.forEach((a)->{
            ZuiDaiMaSolr zuiDaiMaSolr = new ZuiDaiMaSolr();
            BeanUtils.copyProperties(a,zuiDaiMaSolr);
            list1.add(zuiDaiMaSolr);
        });
        zuiDaiMaSolrRepository.saveAll(list1);
    }



}