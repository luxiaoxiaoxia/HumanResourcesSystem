package com.ssm.dao;

import java.util.Date;
import java.util.List;

import com.ssm.entity.Attendance;

public interface AttendanceDao {
	
	/**
	 * 添加一条签到信息
	 * @param attendance 签到信息
	 * @return int 表示是否提交成功
	 */
	public int insertAttendance(Attendance attendance);
	
	/**
	 * 通过签到id删除一条签到信息
	 * @param aId 签到信息id
	 * @return int 表示删除信息成功
	 */
	public int deleteAttendance(Integer aId);
	
	/**
	 * 修改一条签到信息
	 * @param attendance 签到信息
	 * @return int 表示修改是否成功
	 */
	public int updateAttendance(Attendance attendance);
	
	/**
	 * 通过签到信息id查询一条签到信息
	 * @param aId 签到信息id
	 * @return Attendance 查询到的签到信息
	 */
	public Attendance queryAttendanceByAId(Integer aId);
	
	
	/**
	 * 
	 * @return
	 */
	public List<Attendance> queryAllAttendance();

}
