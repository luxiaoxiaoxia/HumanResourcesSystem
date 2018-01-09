package com.ssm.entity;

import java.util.Date;

public class ResignEmployee {
	
	private Integer reId;//员工id
	private String reName;//员工name
	private String reRealName;//真实姓名
	private String rePassword;//员工密码
	private String reSex;//员工sex
	private int reAge;//员工岁数
	private String reEducation;//员工学历
	private long rePhotoNumber;//员工手机号
	private String reEmail;//游客email
	private Date reEntryDate;//入职时间 
	private int reType;//-1.离职员工
	private Integer reDId;//部门
	private Integer rePId;//职位
	private String rePoliticalStatus;//政治面貌
	private String reHobby;//兴趣爱好
	private Date reLeaveDate;//离职时间
	private String reRemark;//备注
	
	public ResignEmployee() {
		super();
	}

	public ResignEmployee(Integer reId, String reName, String reRealName, String rePassword, String reSex, int reAge,
			String reEducation, long rePhotoNumber, String reEmail, Date reEntryDate, int reType, Integer reDId,
			Integer rePId, String rePoliticalStatus, String reHobby, Date reLeaveDate, String reRemark) {
		super();
		this.reId = reId;
		this.reName = reName;
		this.reRealName = reRealName;
		this.rePassword = rePassword;
		this.reSex = reSex;
		this.reAge = reAge;
		this.reEducation = reEducation;
		this.rePhotoNumber = rePhotoNumber;
		this.reEmail = reEmail;
		this.reEntryDate = reEntryDate;
		this.reType = reType;
		this.reDId = reDId;
		this.rePId = rePId;
		this.rePoliticalStatus = rePoliticalStatus;
		this.reHobby = reHobby;
		this.reLeaveDate = reLeaveDate;
		this.reRemark = reRemark;
	}

	public Integer getReId() {
		return reId;
	}

	public void setReId(Integer reId) {
		this.reId = reId;
	}

	public String getReName() {
		return reName;
	}

	public void setReName(String reName) {
		this.reName = reName;
	}

	public String getReRealName() {
		return reRealName;
	}

	public void setReRealName(String reRealName) {
		this.reRealName = reRealName;
	}

	public String getRePassword() {
		return rePassword;
	}

	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}

	public String getReSex() {
		return reSex;
	}

	public void setReSex(String reSex) {
		this.reSex = reSex;
	}

	public int getReAge() {
		return reAge;
	}

	public void setReAge(int reAge) {
		this.reAge = reAge;
	}

	public String getReEducation() {
		return reEducation;
	}

	public void setReEducation(String reEducation) {
		this.reEducation = reEducation;
	}

	public long getRePhotoNumber() {
		return rePhotoNumber;
	}

	public void setRePhotoNumber(long rePhotoNumber) {
		this.rePhotoNumber = rePhotoNumber;
	}

	public String getReEmail() {
		return reEmail;
	}

	public void setReEmail(String reEmail) {
		this.reEmail = reEmail;
	}

	public Date getReEntryDate() {
		return reEntryDate;
	}

	public void setReEntryDate(Date reEntryDate) {
		this.reEntryDate = reEntryDate;
	}

	public int getReType() {
		return reType;
	}

	public void setReType(int reType) {
		this.reType = reType;
	}

	public Integer getReDId() {
		return reDId;
	}

	public void setReDId(Integer reDId) {
		this.reDId = reDId;
	}

	public Integer getRePId() {
		return rePId;
	}

	public void setRePId(Integer rePId) {
		this.rePId = rePId;
	}

	public String getRePoliticalStatus() {
		return rePoliticalStatus;
	}

	public void setRePoliticalStatus(String rePoliticalStatus) {
		this.rePoliticalStatus = rePoliticalStatus;
	}

	public String getReHobby() {
		return reHobby;
	}

	public void setReHobby(String reHobby) {
		this.reHobby = reHobby;
	}

	public Date getReLeaveDate() {
		return reLeaveDate;
	}

	public void setReLeaveDate(Date reLeaveDate) {
		this.reLeaveDate = reLeaveDate;
	}

	public String getReRemark() {
		return reRemark;
	}

	public void setReRemark(String reRemark) {
		this.reRemark = reRemark;
	}

	@Override
	public String toString() {
		return "ResignEmployee [reId=" + reId + ", reName=" + reName + ", reRealName=" + reRealName + ", rePassword="
				+ rePassword + ", reSex=" + reSex + ", reAge=" + reAge + ", reEducation=" + reEducation
				+ ", rePhotoNumber=" + rePhotoNumber + ", reEmail=" + reEmail + ", reEntryDate=" + reEntryDate
				+ ", reType=" + reType + ", reDId=" + reDId + ", rePId=" + rePId + ", rePoliticalStatus="
				+ rePoliticalStatus + ", reHobby=" + reHobby + ", reLeaveDate=" + reLeaveDate + ", reRemark=" + reRemark
				+ "]";
	}
	
	

}
