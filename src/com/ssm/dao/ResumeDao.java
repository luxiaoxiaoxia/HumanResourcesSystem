package com.ssm.dao;

import java.util.List;

import com.ssm.entity.Resume;

public interface ResumeDao {
	
	/**
	 * 添加一条简历
	 * @param resume 简历
	 * @return int 表示简历添加是否成功
	 */
	public int insertResume(Resume resume);
	
	/**
	 * 通过rId删除一条简历
	 * @param rId 简历id
	 * @return int 表示简历删除是否成功
	 */
	public int deleteResume(Integer rId);
	
	/**
	 * 修改一个简历
	 * @param resume 简历
	 * @return int 表示简历修改是否成功
	 */
	public int updateResume(Resume resume);
	
	/**
	 * 通过rId查询一条简历
	 * @param rId 简历id
	 * @return Resume 查询出来的简历
	 */
	public Resume queryResumeByRId(Integer rId);
	
	/**
	 * 通过uId查询该游客的所有简历
	 * @param uId 游客id
	 * @return 简历集合
	 */
	public List<Resume> queryResumeByUId(Integer uId);
	
	/**
	 * 查询所有的简历
	 * @return 简历集合
	 */
	public List<Resume> queryAllResume();

}
