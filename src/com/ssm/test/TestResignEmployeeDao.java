package com.ssm.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.dao.ResignEmployeeDao;
import com.ssm.entity.ResignEmployee;
import com.ssm.util.MD5Util;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring*.xml"})
public class TestResignEmployeeDao {
	
	@Autowired
	private ResignEmployeeDao resignEmployeeDao;
	
	@Test
	public void insertResignEmployee() {
		ResignEmployee re = new ResignEmployee(-1, "ccc", "ddd", MD5Util.md5("111"), "ÄÐ", 15, "ÖÐ×¨", 13717171101L, "555@.qq.com", new Date(), -1, 3, 3, "zzz", "Å¾Å¾Å¾", new Date(), "kepa");
		int res = resignEmployeeDao.insertResignEmployee(re);
		System.out.println(res);
	}
	
	@Test
	public void deleteResignEmployee() {
		int res = resignEmployeeDao.deleteResignEmployee(4);
		System.out.println(res);
	}
	
	@Test
	public void updateResignEmployee() {
		ResignEmployee re = new ResignEmployee(3, "ccc", "ddd", MD5Util.md5("111"), "ÄÐ", 25, "ÖÐ×¨", 13717171101L, "555@.qq.com", new Date(), -1, 3, 3, "666666", "Å¾Å¾Å¾papapa", new Date(), "girlscolor");
		int res = resignEmployeeDao.updateResignEmployee(re);
		System.out.println(res);
	}
	
	@Test
	public void queryResignEmployeeByReId() {
		ResignEmployee re = resignEmployeeDao.queryResignEmployeeByReId(1);
		System.out.println(re);
	}
	
	@Test
	public void queryResignEmployeeByReName() {
		ResignEmployee re = resignEmployeeDao.queryResignEmployeeByReName("rrr");
		System.out.println(re);
	}
	
	@Test
	public void queryResignEmployeeByReDId() {
		List<ResignEmployee> re = resignEmployeeDao.queryResignEmployeeByReDId(3);
		System.out.println(re);
		System.out.println(re.size());
	}
	
	@Test
	public void queryResignEmployeeByRePId() {
		List<ResignEmployee> re = resignEmployeeDao.queryResignEmployeeByRePId(3);
		System.out.println(re);
		System.out.println(re.size());
	}
	
	@Test
	public void queryAllResignEmployee() {
		List<ResignEmployee> re = resignEmployeeDao.queryAllResignEmployee();
		System.out.println(re);
		System.out.println(re.size());
	}
	
}
