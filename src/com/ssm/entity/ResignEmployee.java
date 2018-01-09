package com.ssm.entity;

import java.util.Date;

public class ResignEmployee {
	
	private Integer reId;//Ա��id
	private String reName;//Ա��name
	private String reRealName;//��ʵ����
	private String rePassword;//Ա������
	private String reSex;//Ա��sex
	private int reAge;//Ա������
	private String reEducation;//Ա��ѧ��
	private long rePhotoNumber;//Ա���ֻ���
	private String reEmail;//�ο�email
	private Date reEntryDate;//��ְʱ�� 
	private int reType;//-1.��ְԱ��
	private Integer reDId;//����
	private Integer rePId;//ְλ
	private String rePoliticalStatus;//������ò
	private String reHobby;//��Ȥ����
	private Date reLeaveDate;//��ְʱ��
	private String reRemark;//��ע
	
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
