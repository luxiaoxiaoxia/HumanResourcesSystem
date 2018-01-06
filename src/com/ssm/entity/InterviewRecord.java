package com.ssm.entity;

import java.util.Date;

public class InterviewRecord {
	
	private Integer irId;//���Լ�¼id
	private User irUser;//�����ο�
	private Employee irDEmployee;//��������
	private Employee irEmployee;//���Թ�
	private Date interviewTime;//����ʱ��
	private ApplicationMessage irAm;//ӦƸ��Ϣ
	private int irType;//����״̬��0.δȷ��;1.ȷ������;2.ȡ������;3.���Բ�ͨ��;4.����ͨ��;
	
	public InterviewRecord() {
		super();
	}

	public InterviewRecord(Integer irId, User irUser, Employee irDEmployee, Employee irEmployee, Date interviewTime,
			ApplicationMessage irAm, int irType) {
		super();
		this.irId = irId;
		this.irUser = irUser;
		this.irDEmployee = irDEmployee;
		this.irEmployee = irEmployee;
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

	public Employee getIrEmployee() {
		return irEmployee;
	}

	public void setIrEmployee(Employee irEmployee) {
		this.irEmployee = irEmployee;
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

	public Employee getIrDEmployee() {
		return irDEmployee;
	}

	public void setIrDEmployee(Employee irDEmployee) {
		this.irDEmployee = irDEmployee;
	}

	@Override
	public String toString() {
		return "InterviewRecord [irId=" + irId + ", irUser=" + irUser + ", irDEmployee=" + irDEmployee + ", irEmployee="
				+ irEmployee + ", interviewTime=" + interviewTime + ", irAm=" + irAm + ", irType=" + irType + "]";
	}
	
	

}
