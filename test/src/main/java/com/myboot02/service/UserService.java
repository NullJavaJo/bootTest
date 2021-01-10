package com.myboot02.service;

import org.apache.ibatis.annotations.Mapper;

import com.myboot02.domain.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.myboot02.dto.UserDto.*;
/*
Service Layer단에서 세분화된 비즈니스로직을 처리하는 객체
 */
//@Service
@Mapper
@Transactional(readOnly = true)
public interface UserService {

	//회원가입
	@Transactional
	public void addUser(signUpDto user) throws Exception;

	//public User login(loginDto user) throws Exception;
	
	public User getUser() throws Exception;

}
