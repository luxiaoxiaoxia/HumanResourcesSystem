package com.ssm.dao;

import java.util.List;

import com.ssm.entity.ApplicationMessage;

public interface ApplicationMessageDao {
	
	/**
	 * 
	 * @param applicationMessage
	 * @return
	 */
	public int insertApplicationMessage(ApplicationMessage applicationMessage);
	
	/**
	 * 
	 * @param amId
	 * @return
	 */
	public int deleteApplicationMessage(Integer amId);
	
	/**
	 * 
	 * @param applicationMessage
	 * @return
	 */
	public int updateApplicationMessage(ApplicationMessage applicationMessage);
	
	/**
	 * 
	 * @param amId
	 * @return
	 */
	public ApplicationMessage queryApplicationMessageByAmId(Integer amId);
	
	/**
	 * 
	 * @param amRmId
	 * @return
	 */
	public List<ApplicationMessage> queryApplicationMessageByAmRmId(Integer amRmId);
	
	/**
	 * 
	 * @return
	 */
	public List<ApplicationMessage> queryAllApplicationMessage();

}
