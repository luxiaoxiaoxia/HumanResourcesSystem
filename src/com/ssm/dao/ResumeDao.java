package com.ssm.dao;

import java.util.List;

import com.ssm.entity.Resume;

public interface ResumeDao {
	
	/**
	 * ���һ������
	 * @param resume ����
	 * @return int ��ʾ��������Ƿ�ɹ�
	 */
	public int insertResume(Resume resume);
	
	/**
	 * ͨ��rIdɾ��һ������
	 * @param rId ����id
	 * @return int ��ʾ����ɾ���Ƿ�ɹ�
	 */
	public int deleteResume(Integer rId);
	
	/**
	 * �޸�һ������
	 * @param resume ����
	 * @return int ��ʾ�����޸��Ƿ�ɹ�
	 */
	public int updateResume(Resume resume);
	
	/**
	 * ͨ��rId��ѯһ������
	 * @param rId ����id
	 * @return Resume ��ѯ�����ļ���
	 */
	public Resume queryResumeByRId(Integer rId);
	
	/**
	 * ͨ��uId��ѯ���ο͵����м���
	 * @param uId �ο�id
	 * @return ��������
	 */
	public List<Resume> queryResumeByUId(Integer uId);
	
	/**
	 * ��ѯ���еļ���
	 * @return ��������
	 */
	public List<Resume> queryAllResume();

}
