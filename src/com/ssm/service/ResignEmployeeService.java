package com.ssm.service;

import com.ssm.entity.ResignEmployee;

public interface ResignEmployeeService {
	
	/**
	 * ͨ��name��ѯһ����ְԱ��
	 * @param reName ��ְԱ��name
	 * @return ResignEmployee ��ְԱ��
	 */
	public ResignEmployee findResignEmployeeByReName(String reName);
	
	/**
	 * ���һ����ְԱ��
	 * @param resignEmployee ��ְԱ��
	 * @return boolean ��ʾ�Ƿ���ӳɹ�
	 */
	public boolean addResignEmployee(ResignEmployee resignEmployee);

}
