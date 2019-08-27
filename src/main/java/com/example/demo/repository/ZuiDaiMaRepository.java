package com.example.demo.repository;/**
 * @author user
 * @date 2019/6/25
 */

import com.example.demo.entity.ZuiDaiMa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: demojpa
 * @description:
 * @author: wxy
 * @create: 2019-06-25 11:57
 **/

public interface ZuiDaiMaRepository extends JpaRepository<ZuiDaiMa,Integer>, JpaSpecificationExecutor {
}
