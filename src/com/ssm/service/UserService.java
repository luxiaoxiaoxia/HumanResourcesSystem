package com.ssm.service;

import com.ssm.entity.User;

public interface UserService {
	
	/**
	 * 通过uName查询一个游客
	 * @param uName 游客name
	 * @return User 游客
	 */
	public User findUserByUName(String uName);
	
	/**
	 * 添加一个游客
	 * @param user 游客
	 * @return boolean 表示添加是否成功
	 */
	public boolean addUser(User user);
	
	/**
	 * 通过uName和uPassword查询一个游客
	 * @param uName 游客name
	 * @param uPassword 游客password
	 * @return User 游客
	 */
	public User findUserByUNameAndUPassword(String uName,String uPassword);

}
