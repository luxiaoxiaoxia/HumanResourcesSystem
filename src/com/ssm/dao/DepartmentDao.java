package com.ssm.dao;

import java.util.List;

import com.ssm.entity.Department;

public interface DepartmentDao {
	
	/**
	 * 添加一个部门
	 * @param department 部门
	 * @return int 表示是否添加成功
	 */
	public int insertDepartment(Department department);
	
	/**
	 * 删除一个部门
	 * @param dId 部门id
	 * @return int 表示是否删除成功
	 */
	public int deleteDepartment(Integer dId);
	
	/**
	 * 修改一个部门
	 * @param department 部门
	 * @return int 表示是否修改成功
	 */
	public int updateDepartment(Department department);
	
	/**
	 * 通过did查询一个部门
	 * @param dId 部门id
	 * @return Department 查询出来的部门
	 */
	public Department queryDepartmentByDId(Integer dId);
	
	/**
	 * 通过dName查询一个部门
	 * @param dName 部门name
	 * @return Department 查询出的部门
	 */
	public Department queryDepartmentByDName(String dName);
	
	/**
	 * 查询所有部门
	 * @return 部门集合
	 */
	public List<Department> queryAllDepartment();

}
