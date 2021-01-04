package com.myboot02.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myboot02.vo.User;

@Repository("userDaoImpl")
public class UserDaoImpl implements UserDao {

	@Autowired
	SqlSession sqlSession;
	
	public UserDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addUser(User user) throws Exception {
		sqlSession.insert("UserMapper.addUser", user);

	}

	@Override
	public User getUser() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
