package com.example.demo.service.impl;

import com.example.demo.common.util.StringUtils;
import com.example.demo.entity.Interviewer;
import com.example.demo.repository.InterviewerRepository;
import com.example.demo.service.InterviewerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @program: demojpa
 * @description:
 * @author: wxy
 * @create: 2019-09-17 11:23
 **/

@Service
@Transactional(readOnly = false)
public class InterviewerServiceImpl implements InterviewerService {

    @Autowired
    private InterviewerRepository interviewerRepository;


    @Override
    @Transactional
    public Interviewer save(Interviewer interviewer) {
        interviewer.setCreateTime(new Date());
        interviewer.setUpdateTime(new Date());
        return interviewerRepository.save(interviewer);
    }

    @Override
    public Page<Interviewer> findInterviewersList(Pageable pageable,Interviewer interviewer) {
        return interviewerRepository.findAll(this.getItemSpecification(interviewer),pageable);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        interviewerRepository.deleteById(id);
    }


    private Specification getItemSpecification(Interviewer req) {
        Specification specification = new Specification() {

            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder cb) {
                List<Predicate> predicates = new ArrayList<>();
                if (StringUtils.isNotEmpty(req.getCompany())) {
                    predicates.add(cb.like(root.get("company"), '%'+StringUtils.trim(req.getCompany())+'%'));
                }
                if(StringUtils.isNotEmpty(req.getInterviewSite())){
                    predicates.add(cb.like(root.get("interviewSite"),'%'+StringUtils.trim(req.getInterviewSite())+'%'));
                }

                criteriaQuery.where(cb.and(predicates.toArray(new Predicate[predicates.size()])));
                //criteriaQuery.orderBy(cb.asc(root.get("state")));
                return criteriaQuery.getRestriction();
            }
        };
        return specification;
    }
}
