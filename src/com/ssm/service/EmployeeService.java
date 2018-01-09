package com.ssm.service;

import com.ssm.entity.Employee;

public interface EmployeeService {
	
	/**
	 * 通过name查询一个员工
	 * @param eName 员工name
	 * @return Employee 员工
	 */
	public Employee findEmployeeByEName(String eName);
	
	/**
	 * 添加一个员工
	 * @param employee 员工
	 * @return boolean 添加员工是否成功
	 */
	public boolean addEmployee(Employee employee);
	
	/**
	 * 通过员工name和员工password查询一个员工
	 * @param eName 员工name
	 * @param ePassword 员工password
	 * @return Employee 员工
	 */
	public Employee findEmployeeByENameAndEPassword(String eName,String ePassword);

}
