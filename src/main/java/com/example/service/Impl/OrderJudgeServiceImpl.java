package com.example.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.mapper.OrderJudgeMapper;
import com.example.model.BusinessOrder;
import com.example.service.OrderJudgeService;
@Service
public class OrderJudgeServiceImpl implements OrderJudgeService{
	@Resource
	OrderJudgeMapper orderJudgeMapper;
	@Override
	public List<BusinessOrder> selectOrderJudge(String status,String memberId) {
		return orderJudgeMapper.selectOrderJudge(status,memberId);
	}

}
