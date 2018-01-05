package com.ssm.entity;

import java.util.Date;

public class RecruitmentMessage {
	
	private Integer rmId;//��Ƹ��Ϣid
	private Department rmDepartment;//����
	private Position rmPosition;//ְλ
	private String rmMessage;//��Ƹ��Ϣ
	private Date rmCreateDate;//��Ƹ��Ϣ����ʱ��
	private int rmType;//0.��Ϣ����;1.��Ϣ����;
	
	public RecruitmentMessage() {
		super();
	}

	public RecruitmentMessage(Integer rmId, Department rmDepartment, Position rmPosition, String rmMessage,
			Date rmCreateDate, int rmType) {
		super();
		this.rmId = rmId;
		this.rmDepartment = rmDepartment;
		this.rmPosition = rmPosition;
		this.rmMessage = rmMessage;
		this.rmCreateDate = rmCreateDate;
		this.rmType = rmType;
	}

	public Integer getRmId() {
		return rmId;
	}

	public void setRmId(Integer rmId) {
		this.rmId = rmId;
	}

	public Department getRmDepartment() {
		return rmDepartment;
	}

	public void setRmDepartment(Department rmDepartment) {
		this.rmDepartment = rmDepartment;
	}

	public Position getRmPosition() {
		return rmPosition;
	}

	public void setRmPosition(Position rmPosition) {
		this.rmPosition = rmPosition;
	}

	public String getRmMessage() {
		return rmMessage;
	}

	public void setRmMessage(String rmMessage) {
		this.rmMessage = rmMessage;
	}

	public Date getRmCreateDate() {
		return rmCreateDate;
	}

	public void setRmCreateDate(Date rmCreateDate) {
		this.rmCreateDate = rmCreateDate;
	}

	public int getRmType() {
		return rmType;
	}

	public void setRmType(int rmType) {
		this.rmType = rmType;
	}

	@Override
	public String toString() {
		return "RecruitmentMessage [rmId=" + rmId + ", rmDepartment=" + rmDepartment + ", rmPosition=" + rmPosition
				+ ", rmMessage=" + rmMessage + ", rmCreateDate=" + rmCreateDate + ", rmType=" + rmType + "]";
	}

	
	
}
