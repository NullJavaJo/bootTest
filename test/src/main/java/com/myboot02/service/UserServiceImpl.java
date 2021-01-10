package com.myboot02.service;

import com.myboot02.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.myboot02.dao.UserDao;
import com.myboot02.domain.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	@Qualifier("userDaoImpl")
	UserDao userDao;

	public UserServiceImpl() {
	}

	@Override
	public void addUser(UserDto.signUpDto user) throws Exception {
		userDao.addUser(user.addUser());//converting
	}

//	@Override
//	public User login(UserDto.loginDto user) throws Exception {
//
//		return userDao.login(user.getUserId());
//	}

	@Override
	public User getUser() throws Exception {
		// TODO Auto-generated method stub
		return userDao.getUser();
	}

}
