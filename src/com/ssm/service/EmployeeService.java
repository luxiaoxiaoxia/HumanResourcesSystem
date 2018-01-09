package com.ssm.service;

import com.ssm.entity.Employee;

public interface EmployeeService {
	
	/**
	 * ͨ��name��ѯһ��Ա��
	 * @param eName Ա��name
	 * @return Employee Ա��
	 */
	public Employee findEmployeeByEName(String eName);
	
	/**
	 * ���һ��Ա��
	 * @param employee Ա��
	 * @return boolean ���Ա���Ƿ�ɹ�
	 */
	public boolean addEmployee(Employee employee);
	
	/**
	 * ͨ��Ա��name��Ա��password��ѯһ��Ա��
	 * @param eName Ա��name
	 * @param ePassword Ա��password
	 * @return Employee Ա��
	 */
	public Employee findEmployeeByENameAndEPassword(String eName,String ePassword);

}
