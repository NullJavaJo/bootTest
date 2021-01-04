package com.myboot02.service;

import org.apache.ibatis.annotations.Mapper;

import com.myboot02.vo.User;

@Mapper
public interface UserService {

	public void addUser(User user) throws Exception;
	
	public User getUser() throws Exception;

}
