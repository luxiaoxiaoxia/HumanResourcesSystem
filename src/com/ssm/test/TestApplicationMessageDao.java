package com.ssm.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.dao.ApplicationMessageDao;
import com.ssm.entity.ApplicationMessage;
import com.ssm.entity.RecruitmentMessage;
import com.ssm.entity.Resume;
import com.ssm.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring*.xml"})
public class TestApplicationMessageDao {
	
	@Autowired
	private ApplicationMessageDao applicationMessageDao;
	
	@Test
	public void insertApplicationMessage() {
		Resume r = new Resume();
		r.setrId(1);
		ApplicationMessage a = new ApplicationMessage(null, new User(1, null, null, 1, null), new RecruitmentMessage(1, null, null, null, null, 0), r, new Date(), 0);
		applicationMessageDao.insertApplicationMessage(a);
	}
	
	@Test
	public void deleteApplicationMessage() {
		int res = applicationMessageDao.deleteApplicationMessage(2);
		System.out.println(res);
	}
	
	@Test
	public void updateApplicationMessage() {
		Resume r = new Resume();
		r.setrId(3);
		ApplicationMessage a = new ApplicationMessage(1, new User(1, null, null, 1, null), new RecruitmentMessage(3, null, null, null, null, 0), r, new Date(), 1);
		int res = applicationMessageDao.updateApplicationMessage(a);
		System.out.println(res);
	}
	
	@Test
	public void queryApplicationMessageByAmId() {
		ApplicationMessage a = applicationMessageDao.queryApplicationMessageByAmId(1);
		System.out.println(a);
	}
	
	@Test
	public void queryApplicationMessageByAmRmId() {
		List<ApplicationMessage> aList = applicationMessageDao.queryApplicationMessageByAmRmId(3);
		System.out.println(aList);
	}
	
	@Test
	public void queryAllApplicationMessage() {
		List<ApplicationMessage> aList = applicationMessageDao.queryAllApplicationMessage();
		System.out.println(aList);
	}
	
	@Test
	public void queryApplicationMessageByAmUId() {
		List<ApplicationMessage> aList = applicationMessageDao.queryApplicationMessageByAmUId(1);
		System.out.println(aList);
	}

}
