package com.ssm.entity;

import java.util.Date;

public class RecruitmentMessage {
	
	private Integer rmId;//招聘信息id
	private Department rmDept;//部门
	private Position rmPosit;//职位
	private String rmMessage;//招聘信息
	private Date rmCreateDate;//招聘信息创建时间
	private int rmType;//0.信息过期;1.信息在线;
	
	public RecruitmentMessage() {
		super();
	}

	public RecruitmentMessage(Integer rmId, Department rmDept, Position rmPosit, String rmMessage, Date rmCreateDate,
			int rmType) {
		super();
		this.rmId = rmId;
		this.rmDept = rmDept;
		this.rmPosit = rmPosit;
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

	public Department getRmDept() {
		return rmDept;
	}

	public void setRmDept(Department rmDept) {
		this.rmDept = rmDept;
	}

	public Position getRmPosit() {
		return rmPosit;
	}

	public void setRmPosit(Position rmPosit) {
		this.rmPosit = rmPosit;
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
		return "RecruitmentMessage [rmId=" + rmId + ", rmDept=" + rmDept + ", rmPosit=" + rmPosit + ", rmMessage="
				+ rmMessage + ", rmCreateDate=" + rmCreateDate + ", rmType=" + rmType + "]";
	}

	
	
	
}
