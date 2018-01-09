package com.ssm.service;

import com.ssm.entity.ResignEmployee;

public interface ResignEmployeeService {
	
	/**
	 * 通过name查询一个离职员工
	 * @param reName 离职员工name
	 * @return ResignEmployee 离职员工
	 */
	public ResignEmployee findResignEmployeeByReName(String reName);
	
	/**
	 * 添加一个离职员工
	 * @param resignEmployee 离职员工
	 * @return boolean 表示是否添加成功
	 */
	public boolean addResignEmployee(ResignEmployee resignEmployee);

}
