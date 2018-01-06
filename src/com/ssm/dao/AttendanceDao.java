package com.ssm.dao;

import java.util.Date;
import java.util.List;

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
	 * 
	 * @return
	 */
	public List<Attendance> queryAllAttendance();

}
