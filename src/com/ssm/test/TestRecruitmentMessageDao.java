package com.ssm.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.dao.RecruitmentMessageDao;
import com.ssm.entity.Department;
import com.ssm.entity.Position;
import com.ssm.entity.RecruitmentMessage;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring*.xml"})
public class TestRecruitmentMessageDao {
	
	@Autowired
	private RecruitmentMessageDao recruitmentMessageDao;
	
	/*@Test
	public void insertRecruitmentMessage() {
		RecruitmentMessage rm = new RecruitmentMessage(-1, new Department(3, null, null, 1), new Position(3, null, null, 0, null,0), "Ì°ÍæÀ¶ÔÂ3", new Date(), 0);
		int res = recruitmentMessageDao.insertRecruitmentMessage(rm);
		System.out.println(res);
	}*/
	
	@Test
	public void deleteRecruitmentMessage() {
		int res = recruitmentMessageDao.deleteRecruitmentMessage(2);
		System.out.println(res);
	}
	
	/*@Test
	public void updateRecruitmentMessage() {
		RecruitmentMessage rm = new RecruitmentMessage(3, new Department(3, null, null, 1), new Position(3, null, null, 0, null,0), "Ì°ÍæÀ¶ÔÂ4", new Date(), 1);
		int res = recruitmentMessageDao.updateRecruitmentMessage(rm);
		System.out.println(res);
	}*/
	
	@Test
	public void queryRecruitmentMessageByRmId() {
		RecruitmentMessage rm = recruitmentMessageDao.queryRecruitmentMessageByRmId(1);
		System.out.println(rm);
	}
	
	@Test
	public void queryRecruitmentMessageByRmDId() {
		List<RecruitmentMessage> rList = recruitmentMessageDao.queryRecruitmentMessageByRmDId(3);
		System.out.println(rList);
		System.out.println(rList.size());
	}
	
	@Test
	public void queryRecruitmentMessageByRmPId() {
		
	}
	
	@Test
	public void queryAllRecruitmentMessage() {
		List<RecruitmentMessage> rList = recruitmentMessageDao.queryAllRecruitmentMessage();
		System.out.println(rList);
		System.out.println(rList.size());
	}

}
