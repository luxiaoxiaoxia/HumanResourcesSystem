package com.ssm.dao;

import java.util.List;

import com.ssm.entity.ApplicationMessage;

public interface ApplicationMessageDao {
	
	/**
	 * 添加一条应聘信息
	 * @param applicationMessage 应聘信息
	 * @return int 表示添加是否成功
	 */
	public int insertApplicationMessage(ApplicationMessage applicationMessage);
	
	/**
	 * 通过应聘信息id删除一条信息
	 * @param amId 应聘信息id
	 * @return int 表示删除是否成功
	 */
	public int deleteApplicationMessage(Integer amId);
	
	/**
	 * 修改一个应聘信息
	 * @param applicationMessage 应聘信息
	 * @return int 表示修改是否成功
	 */
	public int updateApplicationMessage(ApplicationMessage applicationMessage);
	
	/**
	 * 通过应聘信息id查询一条应聘信息
	 * @param amId
	 * @return ApplicationMessage 应聘信息
	 */
	public ApplicationMessage queryApplicationMessageByAmId(Integer amId);
	
	/**
	 * 通过招聘信息id查询应聘信息
	 * @param amRmId 招聘信息id
	 * @return 应聘信息集合
	 */
	public List<ApplicationMessage> queryApplicationMessageByAmRmId(Integer amRmId);
	
	/**
	 * 查询所有应聘信息
	 * @return 应聘信息集合
	 */
	public List<ApplicationMessage> queryAllApplicationMessage();
	
	/**
	 * 通过游客id查询该游客的应聘信息
	 * @param amUId 游客id
	 * @return 应聘信息集合
	 */
	public List<ApplicationMessage> queryApplicationMessageByAmUId(Integer amUId);

}
