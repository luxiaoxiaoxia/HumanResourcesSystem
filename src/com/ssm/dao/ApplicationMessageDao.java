package com.ssm.dao;

import java.util.List;

import com.ssm.entity.ApplicationMessage;

public interface ApplicationMessageDao {
	
	/**
	 * ���һ��ӦƸ��Ϣ
	 * @param applicationMessage ӦƸ��Ϣ
	 * @return int ��ʾ����Ƿ�ɹ�
	 */
	public int insertApplicationMessage(ApplicationMessage applicationMessage);
	
	/**
	 * ͨ��ӦƸ��Ϣidɾ��һ����Ϣ
	 * @param amId ӦƸ��Ϣid
	 * @return int ��ʾɾ���Ƿ�ɹ�
	 */
	public int deleteApplicationMessage(Integer amId);
	
	/**
	 * �޸�һ��ӦƸ��Ϣ
	 * @param applicationMessage ӦƸ��Ϣ
	 * @return int ��ʾ�޸��Ƿ�ɹ�
	 */
	public int updateApplicationMessage(ApplicationMessage applicationMessage);
	
	/**
	 * ͨ��ӦƸ��Ϣid��ѯһ��ӦƸ��Ϣ
	 * @param amId
	 * @return ApplicationMessage ӦƸ��Ϣ
	 */
	public ApplicationMessage queryApplicationMessageByAmId(Integer amId);
	
	/**
	 * ͨ����Ƹ��Ϣid��ѯӦƸ��Ϣ
	 * @param amRmId ��Ƹ��Ϣid
	 * @return ӦƸ��Ϣ����
	 */
	public List<ApplicationMessage> queryApplicationMessageByAmRmId(Integer amRmId);
	
	/**
	 * ��ѯ����ӦƸ��Ϣ
	 * @return ӦƸ��Ϣ����
	 */
	public List<ApplicationMessage> queryAllApplicationMessage();
	
	/**
	 * ͨ���ο�id��ѯ���ο͵�ӦƸ��Ϣ
	 * @param amUId �ο�id
	 * @return ӦƸ��Ϣ����
	 */
	public List<ApplicationMessage> queryApplicationMessageByAmUId(Integer amUId);

}
