package com.example.demo.service;

import com.example.demo.entity.Interviewer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface InterviewerService {
    Interviewer save(Interviewer interviewer);

    Page<Interviewer> findInterviewersList(Pageable pageable,Interviewer interviewer);

    void deleteById(Integer id);
}
