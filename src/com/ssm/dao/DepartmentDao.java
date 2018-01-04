package com.ssm.dao;

import java.util.List;

import com.ssm.entity.Department;

public interface DepartmentDao {
	
	/**
	 * ���һ������
	 * @param department ����
	 * @return int ��ʾ�Ƿ���ӳɹ�
	 */
	public int insertDepartment(Department department);
	
	/**
	 * ɾ��һ������
	 * @param dId ����id
	 * @return int ��ʾ�Ƿ�ɾ���ɹ�
	 */
	public int deleteDepartment(Integer dId);
	
	/**
	 * �޸�һ������
	 * @param department ����
	 * @return int ��ʾ�Ƿ��޸ĳɹ�
	 */
	public int updateDepartment(Department department);
	
	/**
	 * ͨ��did��ѯһ������
	 * @param dId ����id
	 * @return Department ��ѯ�����Ĳ���
	 */
	public Department queryDepartmentByDId(Integer dId);
	
	/**
	 * ͨ��dName��ѯһ������
	 * @param dName ����name
	 * @return Department ��ѯ���Ĳ���
	 */
	public Department queryDepartmentByDName(String dName);
	
	/**
	 * ��ѯ���в���
	 * @return ���ż���
	 */
	public List<Department> queryAllDepartment();

}
