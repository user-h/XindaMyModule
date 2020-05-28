package com.example.service.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.mapper.ServiceJudgeMapper;
import com.example.model.ServiceJudge;
import com.example.model.ServiceJudgeExample;
import com.example.service.ServiceJudgeService;
@Service
public class ServiceJudgeServiceImpl implements ServiceJudgeService{
	@Resource
	ServiceJudgeMapper serviceJudgeMapper;

	@Override
	public ServiceJudge selectByPrimaryKey(String judgeId) {
		return serviceJudgeMapper.selectByPrimaryKey(judgeId);
	}

	@Override
	public int updateByExampleSelective(ServiceJudge serviceJudge) {
		ServiceJudgeExample serviceJudgeExample = new ServiceJudgeExample();
		ServiceJudgeExample.Criteria criteria = serviceJudgeExample.createCriteria();
		criteria.andIdEqualTo(serviceJudge.getId());
		
		return serviceJudgeMapper.updateByExample(serviceJudge, serviceJudgeExample);
	}

	@Override
	public int insertServiceJudge(ServiceJudge serviceJudge) {
		return serviceJudgeMapper.insertSelective(serviceJudge);
	}

}
