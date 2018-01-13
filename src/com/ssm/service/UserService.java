package com.ssm.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.entity.ApplicationMessage;
import com.ssm.entity.RecruitmentMessage;
import com.ssm.entity.Resume;
import com.ssm.entity.User;

public interface UserService {
	
	/**
	 * ͨ��uName��ѯһ���ο�
	 * @param uName �ο�name
	 * @return User �ο�
	 */
	public User findUserByUName(String uName);
	
	/**
	 * ���һ���ο�
	 * @param user �ο�
	 * @return boolean ��ʾ����Ƿ�ɹ�
	 */
	public boolean addUser(User user);
	
	/**
	 * ͨ��uName��uPassword��ѯһ���ο�
	 * @param uName �ο�name
	 * @param uPassword �ο�password
	 * @return User �ο�
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
