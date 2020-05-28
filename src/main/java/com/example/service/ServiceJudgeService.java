package com.example.service;

import org.springframework.stereotype.Service;

import com.example.model.ServiceJudge;
@Service
public interface ServiceJudgeService {
	int updateByExampleSelective(ServiceJudge serviceJudge);
	int insertServiceJudge(ServiceJudge serviceJudge);
	ServiceJudge selectByPrimaryKey(String judgeId);
}
