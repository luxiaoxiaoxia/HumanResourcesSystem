package com.ssm.entity;

import java.util.Date;

public class InterviewRecord {
	
	private Integer irId;//面试记录id
	private User irUser;//面试游客
	private Integer irDEId;//部门主管
	private Integer irEId;//面试官
	private Date interviewTime;//面试时间
	private ApplicationMessage irAm;//应聘信息
	private int irType;//面试状态：0.未确认;1.确认面试;2.取消面试;3.面试不通过;4.面试通过;
	
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
