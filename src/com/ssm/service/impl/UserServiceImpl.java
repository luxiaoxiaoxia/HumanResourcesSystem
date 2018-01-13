package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.ApplicationMessageDao;
import com.ssm.dao.RecruitmentMessageDao;
import com.ssm.dao.ResumeDao;
import com.ssm.dao.UserDao;
import com.ssm.entity.ApplicationMessage;
import com.ssm.entity.RecruitmentMessage;
import com.ssm.entity.Resume;
import com.ssm.entity.User;
import com.ssm.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	@Autowired
	private RecruitmentMessageDao recruitmentMessageDao;
	@Autowired
	private ResumeDao resumeDao;
	@Autowired
	private ApplicationMessageDao applicationMessageDao;

	@Override
	public User findUserByUName(String uName) {
		return userDao.queryUserByUName(uName);
	}

	@Override
	public boolean addUser(User user) {
		int res = userDao.insertUser(user);
		boolean flag = false;
		if(res > 0) {
			flag = true;
		}
		return flag;
	}

	@Override
	public User findUserByUNameAndUPassword(String uName, String uPassword) {
		return userDao.queryUserByUNameAndUPassword(uName, uPassword);
	}
	
	@Override
	public List<RecruitmentMessage> findRecruitmentMessageByType(Integer rmType) {
		return recruitmentMessageDao.queryRecruitmentMessageByType(1);
	}

	@Override
	public List<Resume> findResumeByUId(Integer uId) {
		return resumeDao.queryResumeByUId(uId);
	}

	@Override
	public ApplicationMessage findApplicationMessageByByAmRmIdAndAmUId(Integer amRmId, Integer amUId) {
		return applicationMessageDao.queryApplicationMessageByAmRmIdAndAmUId(amRmId, amUId);
	}

	@Override
	public RecruitmentMessage findRecruitmentMessageByRmId(Integer rmId) {
		return recruitmentMessageDao.queryRecruitmentMessageByRmId(rmId);
	}

	@Override
	public Resume findResumeByUIdAndRType(Integer rUId, Integer rType) {
		return resumeDao.queryResumeByUIdAndRType(rUId, rType);
	}

	@Override
	public boolean addResume(Resume resume) {
		int res = resumeDao.insertResume(resume);
		boolean flag = false;
		if(res > 0) {
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean updateResume(Resume resume) {
		int res = resumeDao.updateResume(resume);
		boolean flag = false;
		if(res > 0) {
			flag = true;
		}
		return flag;
	}

}
