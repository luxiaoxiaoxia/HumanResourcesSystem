package com.ssm.dao;

import java.util.List;

import com.ssm.entity.Position;

public interface PositionDao {
	
	/**
	 * 增加一个职位
	 * @param position 职位
	 * @return int 表示是否添加成功
	 */
	public int insertPosition(Position position);
	
	/**
	 * 删除一个职位
	 * @param pId 职位pid
	 * @return int 表示是否删除成功
	 */
	public int deletePosition(Integer pId);
	
	/**
	 * 修改一个职位
	 * @param position 职位
	 * @return int 表示是否修改成功
	 */
	public int updatePosition(Position position);
	
	/**
	 * 查询一个职位
	 * @param pId 职位id
	 * @return Position 该职位
	 */
	public Position queryPositionByPId(Integer pId);
	
	/**
	 * 通过pName查询一个职位
	 * @param pName 职位name
	 * @return Position 该职位
	 */
	public Position queryPositionByPName(String pName);
	
	/**
	 * 查询该部门下所有的职位
	 * @param dId 部门id
	 * @return 职位集合
	 */
	public List<Position> queryPositionByDId(Integer dId);
	
	/**
	 * 查询所有职位
	 * @return 职位集合
	 */
	public List<Position> queryAllPosition();

}
