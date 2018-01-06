package com.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.entity.Employee;

public interface EmployeeDao {
	
	/**
	 * ���һ����ʽԱ��
	 * @param employee Ա��
	 * @return int ��ʾ�Ƿ���ӳɹ�
	 */
	public int insertEmployee(Employee employee);
	
	/**
	 * ͨ��Ա��idɾ��һ��Ա��
	 * @param eId Ա��id
	 * @return int ��ʾ�Ƿ�ɾ���ɹ�
	 */
	public int deleteEmployee(Integer eId);
	
	/**
	 * �޸�һ��Ա��
	 * @param employee Ա��
	 * @return int ��ʾ�Ƿ��޸ĳɹ�
	 */
	public int updateEmployee(Employee employee);
	
	/**
	 * ͨ��eId��ѯһ��Ա��
	 * @param eId Ա��id
	 * @return Employee ��ѯ������Ա��
	 */
	public Employee queryEmployeeByEId(Integer eId);
	
	/**
	 * ͨ��Ա��name��ѯһ��Ա��
	 * @param eName Ա��name
	 * @return Employee ��ѯ������Ա��
	 */
	public Employee queryEmployeeByEName(String eName);
	
	/**
	 * ͨ��Ա��name��Ա��password��ѯһ��Ա��
	 * @param eName Ա��name
	 * @param ePassword Ա��password
	 * @return Employee ��ѯ������Ա��
	 */
	public Employee queryEmployeeByENameAndEPassword(@Param("eName")String eName, @Param("ePassword")String ePassword);
	
	/**
	 * ͨ������id��ѯ����Ա��
	 * @param eDId Ա���������ŵ�id
	 * @return Ա������
	 */
	public List<Employee> queryEmployeeByEDId(Integer eDId);
	
	/**
	 * ͨ��ְλid��ѯԱ��
	 * @param ePId Ա������ְλ��id
	 * @return	Ա������
	 */
	public List<Employee> queryEmployeeByEPId(Integer ePId);
	
	/**
	 * ��ѯȫ��Ա��
	 * @return Ա������
	 */
	public List<Employee> queryAllEmployee();

}
