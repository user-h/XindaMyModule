package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Comovement;

@Service
public interface ComovementService {
	List<Comovement> findProvinceService();
	List<Comovement> findCityService(String pr_name);
	List<Comovement> findCountyService(String ci_name);
}
