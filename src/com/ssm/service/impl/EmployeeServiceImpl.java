package com.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.EmployeeDao;
import com.ssm.entity.Employee;
import com.ssm.service.EmployeeService;
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Employee findEmployeeByEName(String eName) {
		return employeeDao.queryEmployeeByEName(eName);
	}

	@Override
	public boolean addEmployee(Employee employee) {
		int res = employeeDao.insertEmployee(employee);
		boolean flag = false;
		if(res > 0) {
			flag = true;
		}
		return flag;
	}

	@Override
	public Employee findEmployeeByENameAndEPassword(String eName, String ePassword) {
		return employeeDao.queryEmployeeByENameAndEPassword(eName, ePassword);
	}
	
	

}
