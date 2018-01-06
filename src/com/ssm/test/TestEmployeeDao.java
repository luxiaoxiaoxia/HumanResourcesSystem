package com.ssm.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.dao.EmployeeDao;
import com.ssm.dao.UserDao;
import com.ssm.entity.Department;
import com.ssm.entity.Employee;
import com.ssm.entity.Position;
import com.ssm.entity.User;
import com.ssm.util.MD5Util;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring*.xml"})
public class TestEmployeeDao {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@Test
	public void insertEmployee() {
		Employee e = new Employee(-1, "xiaoxia", "xiao", MD5Util.md5("111"), "男", 18, "大学", 13817717717L, "234@qq.com", new Date(), 1, new Department(1, "", new Date(), 0), new Position(1, "咸鱼组员", new Date(), 1, new Department(1, null, null, 1),0), "共党", "共党", "共党");
		employeeDao.insertEmployee(e);
	}
	
	@Test
	public void deleteEmployee() {
		int res = employeeDao.deleteEmployee(2);
		System.out.println(res);
	}
	
	@Test
	public void updateEmployee() {
		Employee e = new Employee(1, "xiaoxia111", "xiao", MD5Util.md5("222"), "男", 18, "大学", 13817717717L, "234@qq.com", new Date(), 1, new Department(1, "", new Date(), 0), new Position(1, "咸鱼组员", new Date(), 1, new Department(1, null, null, 1),0), "共党", "共党", "共党");
		int res = employeeDao.updateEmployee(e);
		System.out.println(res);
	}
	
	@Test
	public void queryEmployeeByEId() {
		Employee e = employeeDao.queryEmployeeByEId(1);
		System.out.println(e);
	}
	
	@Test
	public void queryEmployeeByEName() {
		Employee e = employeeDao.queryEmployeeByEName("xiaolu");
		System.out.println(e);
	}
	
	@Test
	public void queryEmployeeByENameAndEPassword() {
		Employee e = employeeDao.queryEmployeeByENameAndEPassword("xiaol","698D51A19D8A121CE581499D7B701668");
		System.out.println(e);
	}
	
	@Test
	public void queryEmployeeByEDId() {
		List<Employee> eList = employeeDao.queryEmployeeByEDId(3);
		System.out.println(eList);
	}
	
	@Test
	public void queryEmployeeByEPId() {
		List<Employee> eList = employeeDao.queryEmployeeByEPId(2);
		System.out.println(eList);
		System.out.println(eList.size());
	}
	
	@Test
	public void queryAllEmployee() {
		List<Employee> eList = employeeDao.queryAllEmployee();
		System.out.println(eList);
		System.out.println(eList.size());
	}
	
}
