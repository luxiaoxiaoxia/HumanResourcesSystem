package com.ssm.entity;

import java.util.Date;

public class InterviewRecord {
	
	private Integer irId;//���Լ�¼id
	private User irUser;//�����ο�
	private Integer irDEId;//��������
	private Integer irEId;//���Թ�
	private Date interviewTime;//����ʱ��
	private ApplicationMessage irAm;//ӦƸ��Ϣ
	private int irType;//����״̬��0.δȷ��;1.����ȷ������;2.����ȡ������;3.�ο�ȷ������;4.�ο�ȡ������;5.�������Բ�ͨ��;6.��������ͨ��;
	
	public InterviewRecord() {
		super();
	}

	public InterviewRecord(Integer irId, User irUser, Integer irDEId, Integer irEId, Date interviewTime,
			ApplicationMessage irAm, int irType) {
		super();
		this.irId = irId;
		this.irUser = irUser;
		this.irDEId = irDEId;
		this.irEId = irEId;
		this.interviewTime = interviewTime;
		this.irAm = irAm;
		this.irType = irType;
	}

	public Integer getIrId() {
		return irId;
	}

	public void setIrId(Integer irId) {
		this.irId = irId;
	}

	public User getIrUser() {
		return irUser;
	}

	public void setIrUser(User irUser) {
		this.irUser = irUser;
	}

	public Integer getIrDEId() {
		return irDEId;
	}

	public void setIrDEId(Integer irDEId) {
		this.irDEId = irDEId;
	}

	public Integer getIrEId() {
		return irEId;
	}

	public void setIrEId(Integer irEId) {
		this.irEId = irEId;
	}

	public Date getInterviewTime() {
		return interviewTime;
	}

	public void setInterviewTime(Date interviewTime) {
		this.interviewTime = interviewTime;
	}

	public ApplicationMessage getIrAm() {
		return irAm;
	}

	public void setIrAm(ApplicationMessage irAm) {
		this.irAm = irAm;
	}

	public int getIrType() {
		return irType;
	}

	public void setIrType(int irType) {
		this.irType = irType;
	}

	@Override
	public String toString() {
		return "InterviewRecord [irId=" + irId + ", irUser=" + irUser + ", irDEId=" + irDEId + ", irEId=" + irEId
				+ ", interviewTime=" + interviewTime + ", irAm=" + irAm + ", irType=" + irType + "]";
	}

	

}
