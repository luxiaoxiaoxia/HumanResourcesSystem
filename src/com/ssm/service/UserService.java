package com.ssm.service;

import com.ssm.entity.User;

public interface UserService {
	
	/**
	 * ͨ��uName��ѯһ���ο�
	 * @param uName �ο�name
	 * @return User �ο�
	 */
	public User findUserByUName(String uName);
	
	/**
	 * ���һ���ο�
	 * @param user �ο�
	 * @return boolean ��ʾ����Ƿ�ɹ�
	 */
	public boolean addUser(User user);
	
	/**
	 * ͨ��uName��uPassword��ѯһ���ο�
	 * @param uName �ο�name
	 * @param uPassword �ο�password
	 * @return User �ο�
	 */
	public User findUserByUNameAndUPassword(String uName,String uPassword);

}
