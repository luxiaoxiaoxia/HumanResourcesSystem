package com.ssm.dao;

import com.ssm.entity.Department;

public interface DepartmentDao {
	
	/**
	 * ���һ������
	 * @param department ����
	 * @return int ��ʾ�Ƿ���ӳɹ�
	 */
	public int insertDepartment(Department department);

}
