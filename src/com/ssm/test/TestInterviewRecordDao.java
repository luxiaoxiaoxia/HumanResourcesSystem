package com.ssm.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.dao.InterviewRecordDao;
import com.ssm.entity.ApplicationMessage;
import com.ssm.entity.Employee;
import com.ssm.entity.InterviewRecord;
import com.ssm.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring*.xml"})
public class TestInterviewRecordDao {
	
	@Autowired
	private InterviewRecordDao interviewRecordDao;
	
	/*@Test
	public void insertInterviewRecord() {
		User u = new User();
		u.setuId(1);
		Employee e = new Employee();
		e.seteId(1);
		Employee e1 = new Employee();
		e1.seteId(3);
		ApplicationMessage am = new ApplicationMessage();
		am.setAmId(1);
		InterviewRecord ir = new InterviewRecord(-1, u, e, e1, new Date(), am, 0);
		interviewRecordDao.insertInterviewRecord(ir);
	}
	
	@Test
	public void deleteInterviewRecord() {
		int res = interviewRecordDao.deleteInterviewRecord(2);
		System.out.println(res);
	}
	
	@Test
	public void updateInterviewRecord() {
		User u = new User();
		u.setuId(1);
		Employee e = new Employee();
		e.seteId(1);
		Employee e1 = new Employee();
		ApplicationMessage am = new ApplicationMessage();
		am.setAmId(1);
		InterviewRecord ir = new InterviewRecord(1, u, e, e1, new Date(), am, 2);
		interviewRecordDao.updateInterviewRecord(ir);
	}*/
	
	@Test
	public void queryInterviewRecordByIrId() {
		InterviewRecord ir = interviewRecordDao.queryInterviewRecordByIrId(2);
		System.out.println(ir);
	}
	
	@Test
	public void queryInterviewRecordByIrDEId() {
		List<InterviewRecord> ir = interviewRecordDao.queryInterviewRecordByIrDEId(1);
		System.out.println(ir);
	}
	
	@Test
	public void queryInterviewRecordByIrEId() {
		List<InterviewRecord> ir = interviewRecordDao.queryInterviewRecordByIrEId(1);
		System.out.println(ir);
	}
	
	@Test
	public void queryAllInterviewRecord() {
		List<InterviewRecord> ir = interviewRecordDao.queryAllInterviewRecord();
		System.out.println(ir);
	}

}
