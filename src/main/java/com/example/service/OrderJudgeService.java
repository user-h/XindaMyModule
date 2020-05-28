package com.example.service;

import java.util.List;

import com.example.model.BusinessOrder;

public interface OrderJudgeService {
	public List<BusinessOrder> selectOrderJudge(String status, String memberId);
}
