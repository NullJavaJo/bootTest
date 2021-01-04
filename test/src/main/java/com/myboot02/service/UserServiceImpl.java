package com.myboot02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.myboot02.dao.UserDao;
import com.myboot02.vo.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	@Qualifier("userDaoImpl")
	UserDao userDao;

	public UserServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addUser(User user) throws Exception {
		// TODO Auto-generated method stub
		userDao.addUser(user);

	}

	@Override
	public User getUser() throws Exception {
		// TODO Auto-generated method stub
		return userDao.getUser();
	}

}
