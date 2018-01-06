package com.ssm.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.dao.SalaryDao;
import com.ssm.entity.Salary;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring*.xml"})
public class TestSalaryDao {
	
	@Autowired
	private SalaryDao salaryDao;
	
	@Test
	public void insertSalary() {
		Salary sa = new Salary(-1, 1, 2017, 10, 13, 8, 2, 2, 1, 0);
		salaryDao.insertSalary(sa);
	}
	
	@Test
	public void deleteSalary() {
		int res = salaryDao.deleteSalary(2);
		System.out.println(res);
	}
	
	@Test
	public void updateSalary() {
		Salary sa = new Salary(1, 1, 2017, 11, 12, 5, 2, 2, 1, 2);
		int res = salaryDao.updateSalary(sa);
		System.out.println(res);
	}
	
	@Test
	public void querySalaryBySId() {
		Salary sa = salaryDao.querySalaryBySId(1);
		System.out.println(sa);
	}
	
	@Test
	public void querySalaryByEId() {
		List<Salary> saList = salaryDao.querySalaryByEId(1);
		System.out.println(saList);
		System.out.println(saList.size());
	}
	
	@Test
	public void querySalaryByEIdAndSYear() {
		List<Salary> saList = salaryDao.querySalaryByEIdAndSYear(1, 2017);
		System.out.println(saList);
		System.out.println(saList.size());
	}
	
	@Test
	public void querySalaryByEIdAndSYearAndSMonth() {
		Salary sa = salaryDao.querySalaryByEIdAndSYearAndSMonth(1, 2017, 10);
		System.out.println(sa);
	}
	
	@Test
	public void querySalaryBySYear() {
		List<Salary> saList = salaryDao.querySalaryBySYear(2017);
		System.out.println(saList);
		System.out.println(saList.size());
	}
	
	@Test
	public void querySalaryBySYearAndSMonth() {
		List<Salary> saList = salaryDao.querySalaryBySYearAndSMonth(2017,11);
		System.out.println(saList);
		System.out.println(saList.size());
	}
	
	@Test
	public void queryAllSalary() {
		List<Salary> saList = salaryDao.queryAllSalary();
		System.out.println(saList);
		System.out.println(saList.size());
	}

}
