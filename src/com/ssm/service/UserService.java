package com.ssm.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.entity.ApplicationMessage;
import com.ssm.entity.RecruitmentMessage;
import com.ssm.entity.Resume;
import com.ssm.entity.User;

public interface UserService {
	
	/**
	 * 通过uName查询一个游客
	 * @param uName 游客name
	 * @return User 游客
	 */
	public User findUserByUName(String uName);
	
	/**
	 * 添加一个游客
	 * @param user 游客
	 * @return boolean 表示添加是否成功
	 */
	public boolean addUser(User user);
	
	/**
	 * 通过uName和uPassword查询一个游客
	 * @param uName 游客name
	 * @param uPassword 游客password
	 * @return User 游客
	 */
	public User findUserByUNameAndUPassword(String uName,String uPassword);
	
	public List<RecruitmentMessage> findRecruitmentMessageByType(Integer rmType);
	
	public List<Resume> findResumeByUId(Integer uId);
	
	public ApplicationMessage findApplicationMessageByByAmRmIdAndAmUId(Integer amRmId,Integer amUId);
	
	public RecruitmentMessage findRecruitmentMessageByRmId(Integer rmId);
	
	public Resume findResumeByUIdAndRType(Integer rUId,Integer rType);
	
	public boolean addResume(Resume resume);
	
	public boolean updateResume(Resume resume);

}
