package com.example.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.mapper.ComovementMapper;
import com.example.model.Comovement;
import com.example.service.ComovementService;

@Service
public class ComovementServiceImpl implements ComovementService{
	@Resource
	ComovementMapper comovementMapper;
	
	@Override
	public List<Comovement> findProvinceService() {
		return comovementMapper.findProvince();
	}

	@Override
	public List<Comovement> findCityService(String pr_name) {
		return comovementMapper.findCity(pr_name);
	}

	@Override
	public List<Comovement> findCountyService(String ci_name) {
		return comovementMapper.findCounty(ci_name);
	}

}
