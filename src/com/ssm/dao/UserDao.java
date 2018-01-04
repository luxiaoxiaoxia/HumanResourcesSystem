package com.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.entity.User;

public interface UserDao {
	
	/**
	 * ���һ���ο�
	 * @param user �ο�
	 * @return int ��ʾ�ο��Ƿ���ӳɹ�
	 */
	public int insertUser(User user);
	
	/**
	 * ɾ��һ���ο�
	 * @param uId �ο�id
	 * @return int ��ʾ�ο��Ƿ�ɾ��
	 */
	public int deleteUser(Integer uId);
	
	/**
	 * �޸�һ���ο�
	 * @param user �ο�
	 * @return int ��ʾ�ο��Ƿ��޸ĳɹ�
	 */
	public int updateUser(User user);
	
	/**
	 * ͨ��uid��ѯһ���ο�
	 * @param uId �ο�id
	 * @return User ��ѯ�����ο�
	 */
	public User queryUserByUId(Integer uId);
	
	/**
	 * ͨ��uName��ѯһ���ο�
	 * @param uName �ο�name
	 * @return User ��ѯ�����ο�
	 */
	public User queryUserByUName(String uName);
	
	/**
	 * ͨ��uName��uPassword��ѯһ���ο�
	 * @param uName
	 * @param uPassword
	 * @return User ��ѯ�����ο�
	 */
	public User queryUserByUNameAndUPassword(@Param("uName")String uName,@Param("uPassword")String uPassword);
	
	/**
	 * ��ѯ�����ο�
	 * @return �οͼ���
	 */
	public List<User> queryAllUser();

}
