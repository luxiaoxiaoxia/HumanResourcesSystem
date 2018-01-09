package com.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.UserDao;
import com.ssm.entity.User;
import com.ssm.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	@Override
	public User findUserByUName(String uName) {
		return userDao.queryUserByUName(uName);
	}

	@Override
	public boolean addUser(User user) {
		int res = userDao.insertUser(user);
		boolean flag = false;
		if(res > 0) {
			flag = true;
		}
		return flag;
	}

	@Override
	public User findUserByUNameAndUPassword(String uName, String uPassword) {
		return userDao.queryUserByUNameAndUPassword(uName, uPassword);
	}

}
