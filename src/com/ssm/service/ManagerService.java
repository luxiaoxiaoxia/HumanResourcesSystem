package com.ssm.service;

import java.util.List;

import com.ssm.entity.Department;
import com.ssm.entity.Employee;
import com.ssm.entity.Position;

public interface ManagerService {
	
	public List<Department> findAllDepartment();
	
	public List<Position> findPositionByDId(Integer dId);
	
	public List<Employee> findEmployeeByPId(Integer pId);
	
	public List<Employee> findEmployeeByDId(Integer dId);
	
	public Department findDepartmentByDId(Integer dId);
	
	public boolean updateDepartment(Department department);
	
	public boolean deleteDepartment(Integer dId);

}
