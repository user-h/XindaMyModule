package com.example.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.Comovement;
import com.example.service.ComovementService;

@Controller
public class ComovementController {
	@Resource
	ComovementService comovementService;
	
	@RequestMapping("/findprovince")
	public String findProvinceController(Map<String,Object> map) {
		List<Comovement> province = comovementService.findProvinceService();
		map.put("province", province);
		//System.out.println("hello");
		return "e-commerce_register";
	}
	@ResponseBody		//ajax相关注解
	@RequestMapping("/findcity")
	public Object findCityController(String pr_name) {
		List<Comovement> city= comovementService.findCityService(pr_name);
		//System.out.println("world" + pr_name + "!!!" + city);
		//System.out.println("world");
		return city;
	}
	@ResponseBody		//ajax相关注解
	@RequestMapping("/findcounty")
	public Object findCountyController(String ci_name) {
		List<Comovement> county = comovementService.findCountyService(ci_name);
		//System.out.println("!!!" + ci_name + "====" + county);
		return county;
	}

	
}
