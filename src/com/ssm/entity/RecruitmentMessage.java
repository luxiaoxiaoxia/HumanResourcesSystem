package com.ssm.entity;

import java.util.Date;

public class RecruitmentMessage {
	
	private Integer rmId;//招聘信息id
	private Integer rmDId;//部门
	private Integer rmPId;//职位
	private String rmMessage;//招聘信息
	private Date rmCreateDate;//招聘信息创建时间
	private int rmType;//0.信息过期;1.信息在线;
	
	public RecruitmentMessage() {
		super();
	}

	
	public RecruitmentMessage(Integer rmId, Integer rmDId, Integer rmPId, String rmMessage, Date rmCreateDate,
			int rmType) {
		super();
		this.rmId = rmId;
		this.rmDId = rmDId;
		this.rmPId = rmPId;
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

	public Integer getRmDId() {
		return rmDId;
	}


	public void setRmDId(Integer rmDId) {
		this.rmDId = rmDId;
	}


	public Integer getRmPId() {
		return rmPId;
	}


	public void setRmPId(Integer rmPId) {
		this.rmPId = rmPId;
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
		return "RecruitmentMessage [rmId=" + rmId + ", rmDId=" + rmDId + ", rmPId=" + rmPId + ", rmMessage=" + rmMessage
				+ ", rmCreateDate=" + rmCreateDate + ", rmType=" + rmType + "]";
	}

	

	
	
}
