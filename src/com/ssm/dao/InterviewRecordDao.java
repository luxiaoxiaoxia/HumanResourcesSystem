package com.ssm.dao;

import java.util.List;

import com.ssm.entity.InterviewRecord;

public interface InterviewRecordDao{
	
	/**
	 * 添加一条面试信息
	 * @param interviewRecord 面试信息
	 * @return int 表示添加是否成功
	 */
	public int insertInterviewRecord(InterviewRecord interviewRecord);
	
	/**
	 * 通过面试记录id删除一条面试记录
	 * @param irId 面试记录id
	 * @return int 表示删除是否成功
	 */
	public int deleteInterviewRecord(Integer irId);
	
	/**
	 * 修改一条面试记录
	 * @param interviewRecord 面试记录
	 * @return int 表示修改是否成功
	 */
	public int updateInterviewRecord(InterviewRecord interviewRecord);
	
	/**
	 * 通过面试记录id查询一条面试记录
	 * @param irId 面试记录id
	 * @return 查询出的记录
	 */
	public InterviewRecord queryInterviewRecordByIrId(Integer irId);
	
	/**
	 * 通过部门id查询面试记录
	 * @param irDEId 部门主管id
	 * @return 面试记录集合
	 */
	public List<InterviewRecord> queryInterviewRecordByIrDEId(Integer irDEId);
	
	/**
	 * 通过员工id查询面试记录
	 * @param irEId 面试官id
	 * @return 面试记录集合
	 */
	public List<InterviewRecord> queryInterviewRecordByIrEId(Integer irEId);
	
	/**
	 * 查询全部面试记录
	 * @return 面试记录集合
	 */
	public List<InterviewRecord> queryAllInterviewRecord();

}
