package com.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.entity.Salary;

public interface SalaryDao {
	
	/**
	 * ���һ��������Ϣ
	 * @param salary ������Ϣ
	 * @return int ��ʾ����һ��������Ϣ�ɹ�
	 */
	public int insertSalary(Salary salary);
	
	/**
	 * ͨ��������Ϣid��ѯһ��������Ϣ
	 * @param sId ������Ϣid
	 * @return int ��ʾɾ���Ƿ�ɹ�
	 */
	public int deleteSalary(Integer sId);
	
	/**
	 * �޸�һ��������Ϣ
	 * @param salary ������Ϣ
	 * @return int ��ʾ�޸��Ƿ�ɹ�
	 */
	public int updateSalary(Salary salary);
	
	/**
	 * ͨ��������Ϣid��ѯһ��������Ϣ
	 * @param sId ������Ϣid
	 * @return Salary ��ѯ�����Ĺ�����Ϣ
	 */
	public Salary querySalaryBySId(Integer sId);
	
	/**
	 * ͨ��Ա��id��ѯ��Ա�������й�����Ϣ
	 * @param eId Ա��id
	 * @return ������Ϣ����
	 */
	public List<Salary> querySalaryByEId(Integer eId);
	
	/**
	 * ͨ��Ա��id����ݲ�ѯ����������й�����Ϣ
	 * @param eId Ա��id
	 * @param sYear ���
	 * @return ������Ϣ����
	 */
	public List<Salary> querySalaryByEIdAndSYear(@Param("eId")Integer eId, @Param("sYear")Integer sYear);
	
	/**
	 * ͨ��Ա��id����ݺ��·ݲ�ѯһ��������Ϣ
	 * @param eId Ա��id
	 * @param sYear ���
	 * @param sMonth �·�
	 * @return Salary ��ѯ�����Ĺ�����Ϣ
	 */
	public Salary querySalaryByEIdAndSYearAndSMonth(@Param("eId")Integer eId, @Param("sYear")Integer sYear, @Param("sMonth")Integer sMonth);
	
	/**
	 * ͨ����ݲ�ѯ������Ϣ
	 * @param sYear ���
	 * @return ������Ϣ����
	 */
	public List<Salary> querySalaryBySYear(Integer sYear);
	
	/**
	 * ͨ����ݺ��·ݲ�ѯ������Ϣ
	 * @param sYear ���
	 * @param sMonth �·�
	 * @return ������Ϣ����
	 */
	public List<Salary> querySalaryBySYearAndSMonth(@Param("sYear")Integer sYear, @Param("sMonth")Integer sMonth);
	
	/**
	 * ��ѯ���й�����Ϣ
	 * @return ������Ϣ����
	 */
	public List<Salary> queryAllSalary();

}
