package com.ssm.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.dao.AttendanceDao;
import com.ssm.entity.Attendance;
import com.ssm.util.DateUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring*.xml"})
public class TestAttendanceDao {
	
	@Autowired
	private AttendanceDao attendanceDao;
	
	/*@Test
	public void insertAttendance() {
		Attendance att =new Attendance(-1, 1, 2017, 12, 5, new Date());
		attendanceDao.insertAttendance(att);
	}
	
	@Test
	public void deleteAttendance() {
		int res = attendanceDao.deleteAttendance(2);
		System.out.println(res);
	}
	
	@Test
	public void updateAttendance() {
		Attendance att =new Attendance(1, 1, 2017, 12, 3, new Date(),new Date(),1);
		int res = attendanceDao.updateAttendance(att);
		System.out.println(res);
	}*/
	
	@Test
	public void queryAttendanceByAId() {
		Attendance att = attendanceDao.queryAttendanceByAId(1);
		System.out.println(att);
	}
	
	@Test
	public void queryAttendanceByEIdAndAYearAndAMonthAndADay() {
		Attendance att = attendanceDao.queryAttendanceByEIdAndAYearAndAMonthAndADay(1, 2017, 12, 4);
		System.out.println(att);
	}
	
	@Test
	public void queryAttendanceByAYearAndAMonthAndADay() {
		List<Attendance> att = attendanceDao.queryAttendanceByAYearAndAMonthAndADay(2017, 12, 4);
		System.out.println(att);
	}
	
	@Test
	public void queryAttendanceByEId() {
		List<Attendance> att = attendanceDao.queryAttendanceByEId(1);
		System.out.println(att);
	}
	
	@Test
	public void queryAllAttendance() {
		List<Attendance> att = attendanceDao.queryAllAttendance();
		System.out.println(att);
	}

}
