package com.ssm.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.dao.DepartmentDao;
import com.ssm.entity.Department;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring*.xml"})
public class TestDepartmentDao {
	
	@Autowired
	private DepartmentDao departmentDao;
	
	@Test
	public void insertDepartment() {
		Department d = new Department(-1, "ЯЬгу3", new Date(), 0);
		int res = departmentDao.insertDepartment(d);
		System.out.println(res);
	}
	
	@Test
	public void deleteDepartment() {
		int res = departmentDao.deleteDepartment(2);
		System.out.println(res);
	}
	
	@Test
	public void queryDepartmentByDId() {
		Department d = departmentDao.queryDepartmentByDId(1);
		System.out.println(d);
	}
	
	@Test
	public void updateDepartment() {
		Department d = new Department(3, "ЯЬгу3", new Date(), 1);
		int res = departmentDao.updateDepartment(d);
		System.out.println(res);
	}
	
	@Test
	public void queryDepartmentByDName() {
		Department d = departmentDao.queryDepartmentByDName("ЯЬгу3");
		System.out.println(d);
	}
	
	@Test
	public void queryAllDepartment() {
		List<Department> dList = departmentDao.queryAllDepartment();
		System.out.println(dList);
		System.out.println(dList.size());
	}

}
