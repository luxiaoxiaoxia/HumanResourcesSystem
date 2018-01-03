package com.ssm.entity;

public class RecruitmentMessage {
	
	private Integer rmId;//招聘信息id
	private Integer dId;//部门id
	private Integer pId;//职位id
	private String rMessage;//招聘信息
	private int rType;//0.信息过期;1.信息在线;
	
	public RecruitmentMessage() {
		super();
	}

	public RecruitmentMessage(Integer rmId, Integer dId, Integer pId, String rMessage, int rType) {
		super();
		this.rmId = rmId;
		this.dId = dId;
		this.pId = pId;
		this.rMessage = rMessage;
		this.rType = rType;
	}

	public Integer getRmId() {
		return rmId;
	}

	public void setRmId(Integer rmId) {
		this.rmId = rmId;
	}

	public Integer getdId() {
		return dId;
	}

	public void setdId(Integer dId) {
		this.dId = dId;
	}

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getrMessage() {
		return rMessage;
	}

	public void setrMessage(String rMessage) {
		this.rMessage = rMessage;
	}

	public int getrType() {
		return rType;
	}

	public void setrType(int rType) {
		this.rType = rType;
	}

	@Override
	public String toString() {
		return "RecruitmentMessage [rmId=" + rmId + ", dId=" + dId + ", pId=" + pId + ", rMessage=" + rMessage
				+ ", rType=" + rType + "]";
	}
	
	

}
