package com.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.entity.Salary;

public interface SalaryDao {
	
	/**
	 * 
	 * @param salary
	 * @return
	 */
	public int insertSalary(Salary salary);
	
	/**
	 * 
	 * @param sId
	 * @return
	 */
	public int deleteSalary(Integer sId);
	
	/**
	 * 
	 * @param salary
	 * @return
	 */
	public int updateSalary(Salary salary);
	
	/**
	 * 
	 * @param sId
	 * @return
	 */
	public Salary querySalaryBySId(Integer sId);
	
	/**
	 * 
	 * @param eId
	 * @return
	 */
	public List<Salary> querySalaryByEId(Integer eId);
	
	/**
	 * 
	 * @param eId
	 * @param sYear
	 * @return
	 */
	public List<Salary> querySalaryByEIdAndSYear(@Param("eId")Integer eId, @Param("sYear")Integer sYear);
	
	/**
	 * 
	 * @param eId
	 * @param sYear
	 * @param sMonth
	 * @return
	 */
	public Salary querySalaryByEIdAndSYearAndSMonth(@Param("eId")Integer eId, @Param("sYear")Integer sYear, @Param("sMonth")Integer sMonth);
	
	/**
	 * 
	 * @param sYear
	 * @return
	 */
	public List<Salary> querySalaryBySYear(Integer sYear);
	
	/**
	 * 
	 * @param sYear
	 * @param sMonth
	 * @return
	 */
	public List<Salary> querySalaryBySYearAndSMonth(@Param("sYear")Integer sYear, @Param("sMonth")Integer sMonth);
	
	/**
	 * 
	 * @return
	 */
	public List<Salary> queryAllSalary();

}
