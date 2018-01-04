package com.ssm.dao;

import java.util.List;

import com.ssm.entity.Position;

public interface PositionDao {
	
	/**
	 * ����һ��ְλ
	 * @param position ְλ
	 * @return int ��ʾ�Ƿ���ӳɹ�
	 */
	public int insertPosition(Position position);
	
	/**
	 * ɾ��һ��ְλ
	 * @param pId ְλpid
	 * @return int ��ʾ�Ƿ�ɾ���ɹ�
	 */
	public int deletePosition(Integer pId);
	
	/**
	 * �޸�һ��ְλ
	 * @param position ְλ
	 * @return int ��ʾ�Ƿ��޸ĳɹ�
	 */
	public int updatePosition(Position position);
	
	/**
	 * ��ѯһ��ְλ
	 * @param pId ְλid
	 * @return Position ��ְλ
	 */
	public Position queryPositionByPId(Integer pId);
	
	/**
	 * ͨ��pName��ѯһ��ְλ
	 * @param pName ְλname
	 * @return Position ��ְλ
	 */
	public Position queryPositionByPName(String pName);
	
	/**
	 * ��ѯ�ò��������е�ְλ
	 * @param dId ����id
	 * @return ְλ����
	 */
	public List<Position> queryPositionByDId(Integer dId);
	
	/**
	 * ��ѯ����ְλ
	 * @return ְλ����
	 */
	public List<Position> queryAllPosition();

}
