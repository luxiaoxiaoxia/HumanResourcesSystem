package com.ssm.dao;

import java.util.List;

import com.ssm.entity.InterviewRecord;

public interface InterviewRecordDao{
	
	/**
	 * ���һ��������Ϣ
	 * @param interviewRecord ������Ϣ
	 * @return int ��ʾ����Ƿ�ɹ�
	 */
	public int insertInterviewRecord(InterviewRecord interviewRecord);
	
	/**
	 * ͨ�����Լ�¼idɾ��һ�����Լ�¼
	 * @param irId ���Լ�¼id
	 * @return int ��ʾɾ���Ƿ�ɹ�
	 */
	public int deleteInterviewRecord(Integer irId);
	
	/**
	 * �޸�һ�����Լ�¼
	 * @param interviewRecord ���Լ�¼
	 * @return int ��ʾ�޸��Ƿ�ɹ�
	 */
	public int updateInterviewRecord(InterviewRecord interviewRecord);
	
	/**
	 * ͨ�����Լ�¼id��ѯһ�����Լ�¼
	 * @param irId ���Լ�¼id
	 * @return ��ѯ���ļ�¼
	 */
	public InterviewRecord queryInterviewRecordByIrId(Integer irId);
	
	/**
	 * ͨ������id��ѯ���Լ�¼
	 * @param irDEId ��������id
	 * @return ���Լ�¼����
	 */
	public List<InterviewRecord> queryInterviewRecordByIrDEId(Integer irDEId);
	
	/**
	 * ͨ��Ա��id��ѯ���Լ�¼
	 * @param irEId ���Թ�id
	 * @return ���Լ�¼����
	 */
	public List<InterviewRecord> queryInterviewRecordByIrEId(Integer irEId);
	
	/**
	 * ��ѯȫ�����Լ�¼
	 * @return ���Լ�¼����
	 */
	public List<InterviewRecord> queryAllInterviewRecord();

}
