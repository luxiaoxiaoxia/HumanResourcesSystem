package com.ssm.dao;

import java.util.List;

import com.ssm.entity.ResignEmployee;

public interface ResignEmployeeDao {
	
	/**
	 * 添加一个离职员工
	 * @param resignEmployee 离职员工
	 * @return int 表示添加是否成功
	 */
	public int insertResignEmployee(ResignEmployee resignEmployee);
	
	/**
	 * 通过离职员工id删除一个离职员工
	 * @param reId 离职员工id
	 * @return int 表示删除是否成功
	 */
	public int deleteResignEmployee(Integer reId);
	
	/**
	 * 修改一个离职员工
	 * @param resignEmployee 离职员工
	 * @return int 表示修改是否成功
	 */
	public int updateResignEmployee(ResignEmployee resignEmployee);
	
	/**
	 * 通过离职员工id查询一个离职员工
	 * @param reId 离职员工id
	 * @return ResignEmployee 查询出来的离职原因
	 */
	public ResignEmployee queryResignEmployeeByReId(Integer reId);
	
	/**
	 * 通过离职员工name查询一个离职员工
	 * @param reName 离职员工name
	 * @return ResignEmployee 查询出来的离职原因
	 */
	public ResignEmployee queryResignEmployeeByReName(String reName);
	
	/**
	 * 通过部门id查询所有离职员工
	 * @param reDId 部门id
	 * @return 离职员工集合
	 */
	public List<ResignEmployee> queryResignEmployeeByReDId(Integer reDId);
	
	/**
	 * 通过职位id查询所有离职员工
	 * @param rePId 职位id
	 * @return 离职员工集合
	 */
	public List<ResignEmployee> queryResignEmployeeByRePId(Integer rePId);
	
	/**
	 * 查询所有离职人员
	 * @return 离职员工集合
	 */
	public List<ResignEmployee> queryAllResignEmployee();

}
