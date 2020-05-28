package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.model.Comovement;

@Mapper
public interface ComovementMapper {
	List<Comovement> findProvince();
	List<Comovement> findCity(String pr_name);
	List<Comovement> findCounty(String ci_name);
}
