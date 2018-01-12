package com.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.entity.RecruitmentMessage;

public interface RecruitmentMessageDao {
	
	/**
	 * 添加一条招聘信息
	 * @param recruitmentMessage 招聘信息
	 * @return int 表示添加招聘信息是否成功
	 */
	public int insertRecruitmentMessage(RecruitmentMessage recruitmentMessage);
	
	/**
	 * 通过招聘信息id删除一条招聘信息
	 * @param rmId 招聘信息id
	 * @return int 表示删除招聘信息是否成功
	 */
	public int deleteRecruitmentMessage(Integer rmId);
	
	/**
	 * 修改一条招聘信息
	 * @param recruitmentMessage 招聘信息
	 * @return int 表示修改是否成功
	 */
	public int updateRecruitmentMessage(RecruitmentMessage recruitmentMessage);
	
	/**
	 * 通过招聘信息id查询一条招聘信息
	 * @param rmId 招聘信息id
	 * @return RecruitmentMessage 查询出的招聘信息
	 */
	public RecruitmentMessage queryRecruitmentMessageByRmId(Integer rmId);
	
	/**
	 * 通过部门id查询该部门的招聘信息
	 * @param rmDId 部门id
	 * @return 招聘信息集合
	 */
	public List<RecruitmentMessage> queryRecruitmentMessageByRmDId(Integer rmDId);
	
	/**
	 * 通过部门id和职位id查询一条招聘信息
	 * @param rmDId 部门id
	 * @param rmPId 职位id
	 * @return RecruitmentMessage 招聘信息
	 */
	public RecruitmentMessage queryRecruitmentMessageByRmDIdAndRmPId(@Param("rmDId")Integer rmDId,@Param("rmPId")Integer rmPId);
	
	/**
	 * 通过职位id查询该职位的招聘信息
	 * @param rmPId 职位id
	 * @return RecruitmentMessage 相应的招聘信息
	 */
	public RecruitmentMessage queryRecruitmentMessageByRmPId(Integer rmPId);
	
	/**
	 * 查询所有招聘信息
	 * @return 招聘信息集合
	 */
	public List<RecruitmentMessage> queryAllRecruitmentMessage();

}
