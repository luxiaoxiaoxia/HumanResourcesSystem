package com.ssm.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.dao.UserDao;
import com.ssm.entity.User;
import com.ssm.util.MD5Util;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring*.xml"})
public class TestUserDao {
	
	@Autowired
	private UserDao userDao;
	
	@Test
	public void insertUser() {
		User user = new User(-1, "ccc", MD5Util.md5("111"), 0, new Date());
		int res = userDao.insertUser(user);
		System.out.println(res);
	}
	
	@Test
	public void deleteUser() {
		int res = userDao.deleteUser(2);
		System.out.println(res);
	}
	
	@Test
	public void updateUser() {
		User user = new User(3, "ddd", MD5Util.md5("222"), 0, new Date());
		int res = userDao.updateUser(user);
		System.out.println(res);
	}
	
	@Test
	public void queryAllUser() {
		List<User> uList = userDao.queryAllUser();
		System.out.println(uList);
	}
	
	@Test
	public void queryUserByUId() {
		User u = userDao.queryUserByUId(3);
		System.out.println(u);
	}
	
	@Test
	public void queryUserByUName() {
		User u = userDao.queryUserByUName("ddd");
		System.out.println(u);
	}
	
	@Test
	public void queryUserByUNameAndUPassword() {
		User u = userDao.queryUserByUNameAndUPassword("ddd", MD5Util.md5("222"));
		System.out.println(u);
	}

}
