package com.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.entity.User;

public interface UserDao {
	
	/**
	 * 添加一个游客
	 * @param user 游客
	 * @return int 表示游客是否添加成功
	 */
	public int insertUser(User user);
	
	/**
	 * 删除一条游客
	 * @param uId 游客id
	 * @return int 表示游客是否删除
	 */
	public int deleteUser(Integer uId);
	
	/**
	 * 修改一个游客
	 * @param user 游客
	 * @return int 表示游客是否修改成功
	 */
	public int updateUser(User user);
	
	/**
	 * 通过uid查询一个游客
	 * @param uId 游客id
	 * @return User 查询出的游客
	 */
	public User queryUserByUId(Integer uId);
	
	/**
	 * 通过uName查询一个游客
	 * @param uName 游客name
	 * @return User 查询出的游客
	 */
	public User queryUserByUName(String uName);
	
	/**
	 * 通过uName和uPassword查询一个游客
	 * @param uName
	 * @param uPassword
	 * @return User 查询出的游客
	 */
	public User queryUserByUNameAndUPassword(@Param("uName")String uName,@Param("uPassword")String uPassword);
	
	/**
	 * 查询所有游客
	 * @return 游客集合
	 */
	public List<User> queryAllUser();

}
