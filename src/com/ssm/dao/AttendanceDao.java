package com.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.entity.Attendance;

public interface AttendanceDao {
	
	/**
	 * ���һ��ǩ����Ϣ
	 * @param attendance ǩ����Ϣ
	 * @return int ��ʾ�Ƿ��ύ�ɹ�
	 */
	public int insertAttendance(Attendance attendance);
	
	/**
	 * ͨ��ǩ��idɾ��һ��ǩ����Ϣ
	 * @param aId ǩ����Ϣid
	 * @return int ��ʾɾ����Ϣ�ɹ�
	 */
	public int deleteAttendance(Integer aId);
	
	/**
	 * �޸�һ��ǩ����Ϣ
	 * @param attendance ǩ����Ϣ
	 * @return int ��ʾ�޸��Ƿ�ɹ�
	 */
	public int updateAttendance(Attendance attendance);
	
	/**
	 * ͨ��ǩ����Ϣid��ѯһ��ǩ����Ϣ
	 * @param aId ǩ����Ϣid
	 * @return Attendance ��ѯ����ǩ����Ϣ
	 */
	public Attendance queryAttendanceByAId(Integer aId);
	
	/**
	 * ͨ��Ա��id�������ղ�ѯ�����ǩ����¼
	 * @param eId Ա��id
	 * @param aYear ��
	 * @param aMonth ��
	 * @param aDay ��
	 * @return Attendance ��ѯ����ǩ����Ϣ
	 */
	public Attendance queryAttendanceByEIdAndAYearAndAMonthAndADay(@Param("eId")Integer eId,@Param("aYear")int aYear,@Param("aMonth")int aMonth,@Param("aDay")int aDay);
	
	/**
	 * ͨ�������ղ�ѯ�����ǩ����¼
	 * @param aYear ��
	 * @param aMonth ��
	 * @param aDay ��
	 * @return ǩ����Ϣ����
	 */
	public List<Attendance> queryAttendanceByAYearAndAMonthAndADay(@Param("aYear")int aYear,@Param("aMonth")int aMonth,@Param("aDay")int aDay);
	
	/**
	 * ͨ��Ա��id��ѯ��Ա��������ǩ����Ϣ
	 * @param eId Ա��id
	 * @return ǩ����Ϣ����
	 */
	public List<Attendance> queryAttendanceByEId(Integer eId);
	
	/**
	 * ��ѯ����ǩ����Ϣ
	 * @return ǩ����Ϣ����
	 */
	public List<Attendance> queryAllAttendance();

}
