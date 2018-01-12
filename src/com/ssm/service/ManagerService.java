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
	
	public Position findPositionByPId(Integer pId);
	
	public boolean updatePosition(Position position);
	
	public boolean deletePosition(Integer pId);
	
	public Employee findEmployeeByEId(Integer eId);
	
	public List<Position> findAllPosition();
	
	public boolean updateEmployee(Employee employee);
	
	public boolean deleteEmployee(Integer eId);
	
	public boolean addDepartment(Department department);
	
	public boolean addPosition(Position position);

}
