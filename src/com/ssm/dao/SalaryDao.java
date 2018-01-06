package com.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.entity.Salary;

public interface SalaryDao {
	
	/**
	 * 添加一条工资信息
	 * @param salary 工资信息
	 * @return int 表示插入一条工资信息成功
	 */
	public int insertSalary(Salary salary);
	
	/**
	 * 通过工资信息id查询一条工资信息
	 * @param sId 工资信息id
	 * @return int 表示删除是否成功
	 */
	public int deleteSalary(Integer sId);
	
	/**
	 * 修改一条工资信息
	 * @param salary 工资信息
	 * @return int 表示修改是否成功
	 */
	public int updateSalary(Salary salary);
	
	/**
	 * 通过工资信息id查询一条工资信息
	 * @param sId 工资信息id
	 * @return Salary 查询出来的工资信息
	 */
	public Salary querySalaryBySId(Integer sId);
	
	/**
	 * 通过员工id查询该员工的所有工资信息
	 * @param eId 员工id
	 * @return 工资信息集合
	 */
	public List<Salary> querySalaryByEId(Integer eId);
	
	/**
	 * 通过员工id和年份查询该年份中所有工资信息
	 * @param eId 员工id
	 * @param sYear 年份
	 * @return 工资信息集合
	 */
	public List<Salary> querySalaryByEIdAndSYear(@Param("eId")Integer eId, @Param("sYear")Integer sYear);
	
	/**
	 * 通过员工id、年份和月份查询一条工资信息
	 * @param eId 员工id
	 * @param sYear 年份
	 * @param sMonth 月份
	 * @return Salary 查询出来的工资信息
	 */
	public Salary querySalaryByEIdAndSYearAndSMonth(@Param("eId")Integer eId, @Param("sYear")Integer sYear, @Param("sMonth")Integer sMonth);
	
	/**
	 * 通过年份查询工资信息
	 * @param sYear 年份
	 * @return 工资信息集合
	 */
	public List<Salary> querySalaryBySYear(Integer sYear);
	
	/**
	 * 通过年份和月份查询工资信息
	 * @param sYear 年份
	 * @param sMonth 月份
	 * @return 工资信息集合
	 */
	public List<Salary> querySalaryBySYearAndSMonth(@Param("sYear")Integer sYear, @Param("sMonth")Integer sMonth);
	
	/**
	 * 查询所有工资信息
	 * @return 工资信息集合
	 */
	public List<Salary> queryAllSalary();

}
