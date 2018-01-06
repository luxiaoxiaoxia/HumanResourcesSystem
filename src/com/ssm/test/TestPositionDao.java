package com.ssm.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.dao.PositionDao;
import com.ssm.entity.Department;
import com.ssm.entity.Position;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring*.xml"})
public class TestPositionDao {
	
	@Autowired
	private PositionDao positionDao;
	
	@Test
	public void insertPosition() {
		Position p = new Position(-1, "咸鱼组员", new Date(), 1, new Department(1, null, null, 1),0);
		int res = positionDao.insertPosition(p);
		System.out.println(res);
	}
	
	@Test
	public void deletePosition() {
		int res = positionDao.deletePosition(2);
		System.out.println(res);
	}
	
	@Test
	public void queryPositionByPId() {
		Position p = positionDao.queryPositionByPId(1);
		System.out.println(p);
	}
	
	@Test
	public void updatePosition() {
		Position p = new Position(1, "咸鱼主管a", new Date(), 0, new Department(1, null, null, 1),0);
		int res = positionDao.updatePosition(p);
		System.out.println(res);
	}
	
	@Test
	public void queryAllPosition() {
		List<Position> dList = positionDao.queryAllPosition();
		System.out.println(dList);
		System.out.println(dList.size());
	}
	
	@Test
	public void queryPositionByDId() {
		List<Position> dList = positionDao.queryPositionByDId(1);
		System.out.println(dList);
		System.out.println(dList.size());
	}
	
	@Test
	public void queryPositionByPName() {
		Position p = positionDao.queryPositionByPName("咸鱼主管a");
		System.out.println(p);
	}

}
