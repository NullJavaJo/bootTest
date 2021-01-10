package com.myboot02.dao;

import com.myboot02.domain.User;

/*
DB를 사용해 데이터를 조회하거나 조작하는 기능을 전담하도록 만든 객체
 */
public interface UserDao {

	//회원가입
	public void addUser(User user) throws Exception;

	//로그인
//	public User login(String userId) throws Exception;

	public User getUser() throws Exception;
}
