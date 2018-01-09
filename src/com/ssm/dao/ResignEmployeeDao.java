package com.ssm.dao;

import java.util.List;

import com.ssm.entity.ResignEmployee;

public interface ResignEmployeeDao {
	
	/**
	 * ���һ����ְԱ��
	 * @param resignEmployee ��ְԱ��
	 * @return int ��ʾ����Ƿ�ɹ�
	 */
	public int insertResignEmployee(ResignEmployee resignEmployee);
	
	/**
	 * ͨ����ְԱ��idɾ��һ����ְԱ��
	 * @param reId ��ְԱ��id
	 * @return int ��ʾɾ���Ƿ�ɹ�
	 */
	public int deleteResignEmployee(Integer reId);
	
	/**
	 * �޸�һ����ְԱ��
	 * @param resignEmployee ��ְԱ��
	 * @return int ��ʾ�޸��Ƿ�ɹ�
	 */
	public int updateResignEmployee(ResignEmployee resignEmployee);
	
	/**
	 * ͨ����ְԱ��id��ѯһ����ְԱ��
	 * @param reId ��ְԱ��id
	 * @return ResignEmployee ��ѯ��������ְԭ��
	 */
	public ResignEmployee queryResignEmployeeByReId(Integer reId);
	
	/**
	 * ͨ����ְԱ��name��ѯһ����ְԱ��
	 * @param reName ��ְԱ��name
	 * @return ResignEmployee ��ѯ��������ְԭ��
	 */
	public ResignEmployee queryResignEmployeeByReName(String reName);
	
	/**
	 * ͨ������id��ѯ������ְԱ��
	 * @param reDId ����id
	 * @return ��ְԱ������
	 */
	public List<ResignEmployee> queryResignEmployeeByReDId(Integer reDId);
	
	/**
	 * ͨ��ְλid��ѯ������ְԱ��
	 * @param rePId ְλid
	 * @return ��ְԱ������
	 */
	public List<ResignEmployee> queryResignEmployeeByRePId(Integer rePId);
	
	/**
	 * ��ѯ������ְ��Ա
	 * @return ��ְԱ������
	 */
	public List<ResignEmployee> queryAllResignEmployee();

}
