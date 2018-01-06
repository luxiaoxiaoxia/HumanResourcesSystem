package com.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.entity.Employee;

public interface EmployeeDao {
	
	/**
	 * 添加一个正式员工
	 * @param employee 员工
	 * @return int 表示是否添加成功
	 */
	public int insertEmployee(Employee employee);
	
	/**
	 * 通过员工id删除一个员工
	 * @param eId 员工id
	 * @return int 表示是否删除成功
	 */
	public int deleteEmployee(Integer eId);
	
	/**
	 * 修改一个员工
	 * @param employee 员工
	 * @return int 表示是否修改成功
	 */
	public int updateEmployee(Employee employee);
	
	/**
	 * 通过eId查询一个员工
	 * @param eId 员工id
	 * @return Employee 查询出来的员工
	 */
	public Employee queryEmployeeByEId(Integer eId);
	
	/**
	 * 通过员工name查询一个员工
	 * @param eName 员工name
	 * @return Employee 查询出来的员工
	 */
	public Employee queryEmployeeByEName(String eName);
	
	/**
	 * 通过员工name和员工password查询一个员工
	 * @param eName 员工name
	 * @param ePassword 员工password
	 * @return Employee 查询出来的员工
	 */
	public Employee queryEmployeeByENameAndEPassword(@Param("eName")String eName, @Param("ePassword")String ePassword);
	
	/**
	 * 通过部门id查询所有员工
	 * @param eDId 员工所属部门的id
	 * @return 员工集合
	 */
	public List<Employee> queryEmployeeByEDId(Integer eDId);
	
	/**
	 * 通过职位id查询员工
	 * @param ePId 员工所属职位的id
	 * @return	员工集合
	 */
	public List<Employee> queryEmployeeByEPId(Integer ePId);
	
	/**
	 * 查询全部员工
	 * @return 员工集合
	 */
	public List<Employee> queryAllEmployee();

}
