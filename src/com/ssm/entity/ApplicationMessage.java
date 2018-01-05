package com.ssm.entity;

import java.util.Date;

public class ApplicationMessage {
	
	private Integer amId;//ӦƸ��Ϣid
	private User amUser;//�ο�
	private RecruitmentMessage amRm;//��Ӧ����Ƹ��Ϣ
	private Resume amResume;//��Ӧ�ļ���
	private Date amCreateTime;//ӦƸ��Ϣ����ʱ��
	private int amType;//ӦƸ��Ϣ״̬��0.δ����;1.�Ѿ�����
	
	public ApplicationMessage() {
		super();
	}

	public ApplicationMessage(Integer amId, User amUser, RecruitmentMessage amRm, Resume amResume, Date amCreateTime,
			int amType) {
		super();
		this.amId = amId;
		this.amUser = amUser;
		this.amRm = amRm;
		this.amResume = amResume;
		this.amCreateTime = amCreateTime;
		this.amType = amType;
	}

	public Integer getAmId() {
		return amId;
	}

	public void setAmId(Integer amId) {
		this.amId = amId;
	}

	public User getAmUser() {
		return amUser;
	}

	public void setAmUser(User amUser) {
		this.amUser = amUser;
	}

	public RecruitmentMessage getAmRm() {
		return amRm;
	}

	public void setAmRm(RecruitmentMessage amRm) {
		this.amRm = amRm;
	}

	public Resume getAmResume() {
		return amResume;
	}

	public void setAmResume(Resume amResume) {
		this.amResume = amResume;
	}

	public Date getAmCreateTime() {
		return amCreateTime;
	}

	public void setAmCreateTime(Date amCreateTime) {
		this.amCreateTime = amCreateTime;
	}

	public int getAmType() {
		return amType;
	}

	public void setAmType(int amType) {
		this.amType = amType;
	}

	@Override
	public String toString() {
		return "ApplicationMessage [amId=" + amId + ", amUser=" + amUser + ", amRm=" + amRm + ", amResume=" + amResume
				+ ", amCreateTime=" + amCreateTime + ", amType=" + amType + "]";
	}
	

}
