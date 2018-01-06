package com.ssm.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.dao.ResumeDao;
import com.ssm.entity.Department;
import com.ssm.entity.Position;
import com.ssm.entity.Resume;
import com.ssm.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring*.xml"})
public class TestResumeDao {
	
	@Autowired
	private ResumeDao resumeDao;
	
	@Test
	public void insertUser() {
		Resume e = new Resume(-1, new User(1, null, null, 1, null), "张五", "男", 25, "小学", 13817713546L, "233@QQ.COM", new Department(1, null, null, 0), new Position(3, null, null, 2, null,0), 2, 700, "工程师", "国民党", "shuijiao", new Date(), 1);
		int res = resumeDao.insertResume(e);
		System.out.println(res);
	}
	
	@Test
	public void deleteResume() {
		int res = resumeDao.deleteResume(2);
		System.out.println(res);
	}
	
	@Test
	public void updateResume() {
		Resume e = new Resume(3, new User(1, null, null, 1, null), "李四", "女", 21, "初中", 1381771323L, "111@QQ.COM", new Department(1, null, null, 0), new Position(3, null, null, 2, null,0), 1, 900, "工程师", "国民党111", "shuijiao", new Date(), 1);
		int res = resumeDao.updateResume(e);
		System.out.println(res);
	}
	
	@Test
	public void queryResumeByRId() {
		Resume e = resumeDao.queryResumeByRId(1);
		System.out.println(e);
	}

	@Test
	public void queryResumeByUId() {
		List<Resume> eList = resumeDao.queryResumeByUId(1);
		System.out.println(eList);
	}
	
	@Test
	public void queryAllResume() {
		List<Resume> eList = resumeDao.queryAllResume();
		System.out.println(eList);
	}

}
