package com.example.service.Impl;


import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.mapper.UserMapper;
import com.example.model.User;
import com.example.service.UserService;
@Service		//声明服务层
public class UserServiceImpl implements UserService{
	
	@Resource		//初始化 一般在业务层访问Dao
	UserMapper userMapper;
	/*
	 * 登录
	 */
	@Override
	public User userLoginService(Map<String, Object> map) {
		return userMapper.userLogin(map);
	}

}
