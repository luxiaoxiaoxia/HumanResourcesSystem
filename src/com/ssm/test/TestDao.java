package com.ssm.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.dao.DepartmentDao;
import com.ssm.entity.Department;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring*.xml"})
public class TestDao {
	
	@Autowired
	private DepartmentDao departmentDao;
	
	@Test
	public void insertDepartment() {
		Department d = new Department(-1, "ЯЬгу", new Date(), 0);
		int res = departmentDao.insertDepartment(d);
		System.out.println(res);
	}

}
