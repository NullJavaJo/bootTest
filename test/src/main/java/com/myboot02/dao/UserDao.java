package com.myboot02.dao;

import com.myboot02.vo.User;

public interface UserDao {

	public void addUser(User user) throws Exception;
	
	public User getUser() throws Exception;
}
