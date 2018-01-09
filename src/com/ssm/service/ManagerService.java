package com.ssm.service;

import java.util.List;

import com.ssm.entity.Department;
import com.ssm.entity.Employee;
import com.ssm.entity.Position;

public interface ManagerService {
	
	public List<Department> findAllDepartment();
	
	public List<Position> findPositionByDId(Integer dId);
	
	public List<Employee> findEmployeeByPId(Integer pId);

}
