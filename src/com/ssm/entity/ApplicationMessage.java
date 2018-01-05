package com.ssm.entity;

import java.util.Date;

public class ApplicationMessage {
	
	private Integer amId;//应聘信息id
	private User amUser;//游客
	private RecruitmentMessage amRm;//对应的招聘信息
	private Resume amResume;//对应的简历
	private Date amCreateTime;//应聘信息创建时间
	private int amType;//应聘信息状态：0.未处理;1.已经处理
	
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
