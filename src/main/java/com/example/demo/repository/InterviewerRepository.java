package com.example.demo.repository;

import com.example.demo.entity.Interviewer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface InterviewerRepository extends JpaRepository<Interviewer,Integer>, JpaSpecificationExecutor {

    @Query(value = "select  iv  from Interviewer iv where 1=1 and (:company is not null or iv.company like concat('%',trim(:company),'%') )  and (:interviewSite is not null or iv.interviewSite like concat('%',trim(:interviewSite),'%' ) )")
    Page<Interviewer> findAllBySearchKey(@Param("company") String company, @Param("interviewSite")String interviewSite,Pageable pageable);
}
