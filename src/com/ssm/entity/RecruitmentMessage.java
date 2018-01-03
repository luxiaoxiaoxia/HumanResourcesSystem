package com.ssm.entity;

public class RecruitmentMessage {
	
	private Integer rmId;//��Ƹ��Ϣid
	private Integer dId;//����id
	private Integer pId;//ְλid
	private String rMessage;//��Ƹ��Ϣ
	private int rType;//0.��Ϣ����;1.��Ϣ����;
	
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
