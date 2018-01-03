package com.ssm.dao;

import com.ssm.entity.Department;

public interface DepartmentDao {
	
	/**
	 * 添加一个部门
	 * @param department 部门
	 * @return int 表示是否添加成功
	 */
	public int insertDepartment(Department department);

}
