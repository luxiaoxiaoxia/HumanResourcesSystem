package com.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

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
	 * 通过员工id和年月日查询当天的签到记录
	 * @param eId 员工id
	 * @param aYear 年
	 * @param aMonth 月
	 * @param aDay 日
	 * @return Attendance 查询到的签到信息
	 */
	public Attendance queryAttendanceByEIdAndAYearAndAMonthAndADay(@Param("eId")Integer eId,@Param("aYear")int aYear,@Param("aMonth")int aMonth,@Param("aDay")int aDay);
	
	/**
	 * 通过年月日查询当天的签到记录
	 * @param aYear 年
	 * @param aMonth 月
	 * @param aDay 日
	 * @return 签到信息集合
	 */
	public List<Attendance> queryAttendanceByAYearAndAMonthAndADay(@Param("aYear")int aYear,@Param("aMonth")int aMonth,@Param("aDay")int aDay);
	
	/**
	 * 通过员工id查询该员工的所有签到信息
	 * @param eId 员工id
	 * @return 签到信息集合
	 */
	public List<Attendance> queryAttendanceByEId(Integer eId);
	
	/**
	 * 查询所有签到信息
	 * @return 签到信息集合
	 */
	public List<Attendance> queryAllAttendance();

}
