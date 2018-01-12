package com.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.entity.RecruitmentMessage;

public interface RecruitmentMessageDao {
	
	/**
	 * ���һ����Ƹ��Ϣ
	 * @param recruitmentMessage ��Ƹ��Ϣ
	 * @return int ��ʾ�����Ƹ��Ϣ�Ƿ�ɹ�
	 */
	public int insertRecruitmentMessage(RecruitmentMessage recruitmentMessage);
	
	/**
	 * ͨ����Ƹ��Ϣidɾ��һ����Ƹ��Ϣ
	 * @param rmId ��Ƹ��Ϣid
	 * @return int ��ʾɾ����Ƹ��Ϣ�Ƿ�ɹ�
	 */
	public int deleteRecruitmentMessage(Integer rmId);
	
	/**
	 * �޸�һ����Ƹ��Ϣ
	 * @param recruitmentMessage ��Ƹ��Ϣ
	 * @return int ��ʾ�޸��Ƿ�ɹ�
	 */
	public int updateRecruitmentMessage(RecruitmentMessage recruitmentMessage);
	
	/**
	 * ͨ����Ƹ��Ϣid��ѯһ����Ƹ��Ϣ
	 * @param rmId ��Ƹ��Ϣid
	 * @return RecruitmentMessage ��ѯ������Ƹ��Ϣ
	 */
	public RecruitmentMessage queryRecruitmentMessageByRmId(Integer rmId);
	
	/**
	 * ͨ������id��ѯ�ò��ŵ���Ƹ��Ϣ
	 * @param rmDId ����id
	 * @return ��Ƹ��Ϣ����
	 */
	public List<RecruitmentMessage> queryRecruitmentMessageByRmDId(Integer rmDId);
	
	/**
	 * ͨ������id��ְλid��ѯһ����Ƹ��Ϣ
	 * @param rmDId ����id
	 * @param rmPId ְλid
	 * @return RecruitmentMessage ��Ƹ��Ϣ
	 */
	public RecruitmentMessage queryRecruitmentMessageByRmDIdAndRmPId(@Param("rmDId")Integer rmDId,@Param("rmPId")Integer rmPId);
	
	/**
	 * ͨ��ְλid��ѯ��ְλ����Ƹ��Ϣ
	 * @param rmPId ְλid
	 * @return RecruitmentMessage ��Ӧ����Ƹ��Ϣ
	 */
	public RecruitmentMessage queryRecruitmentMessageByRmPId(Integer rmPId);
	
	/**
	 * ��ѯ������Ƹ��Ϣ
	 * @return ��Ƹ��Ϣ����
	 */
	public List<RecruitmentMessage> queryAllRecruitmentMessage();

}
