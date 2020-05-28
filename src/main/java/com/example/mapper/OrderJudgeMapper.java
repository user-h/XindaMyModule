package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.model.BusinessOrder;
@Mapper
public interface OrderJudgeMapper {
	List<BusinessOrder> selectOrderJudge(String status, String memberId);
}
