package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.DepartmentDao;
import com.ssm.dao.EmployeeDao;
import com.ssm.dao.PositionDao;
import com.ssm.entity.Department;
import com.ssm.entity.Employee;
import com.ssm.entity.Position;
import com.ssm.service.ManagerService;
@Service("managerService")
public class ManagerServiceImpl implements ManagerService{
	
	@Autowired
	private DepartmentDao departmentDao;
	@Autowired
	private PositionDao positionDao;
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public List<Department> findAllDepartment() {
		return departmentDao.queryAllDepartment();
	}

	@Override
	public List<Position> findPositionByDId(Integer dId) {
		return positionDao.queryPositionByDId(dId);
	}

	@Override
	public List<Employee> findEmployeeByPId(Integer pId) {
		return employeeDao.queryEmployeeByEPId(pId);
	}

}
