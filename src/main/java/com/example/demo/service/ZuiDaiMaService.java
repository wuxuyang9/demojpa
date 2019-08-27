package com.example.demo.service;/**
 * @author user
 * @date 2019/6/27
 */

import com.example.demo.entity.ZuiDaiMa;
import com.example.demo.entity.ZuiDaiMaSolr;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @program: demojpa
 * @description:
 * @author: wxy
 * @create: 2019-06-27 09:05
 **/

public interface ZuiDaiMaService {
    Page<ZuiDaiMaSolr> zuiDaiMaList(String title, Pageable pageable);
    void savaAll(List<ZuiDaiMa> list);
    void insert(String str);

    Page<ZuiDaiMa> findList(Pageable pageable);

    ZuiDaiMa save(ZuiDaiMa zuiDaiMa);

    ZuiDaiMa findById(Integer id);

    ZuiDaiMa updateZuiDaiMa(ZuiDaiMa zuiDaiMa);

    void deleteById(Integer id);
}
