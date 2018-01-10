package com.ssm.entity;

import java.util.Date;

public class User {
	
	private Integer uId;//Ա��id
	private String uName;//Ա��name
	private String uPassword;//Ա������
	private int uType;//0.�ο�;1.¼��;
	private Date uCreateTime;//�οʹ���ʱ��
	
	public User() {
		super();
	}

	public User(Integer uId, String uName, String uPassword, int uType, Date uCreateTime) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.uPassword = uPassword;
		this.uType = uType;
		this.uCreateTime = uCreateTime;
	}

	public Integer getUId() {
		return uId;
	}

	public Integer getuId() {
		return uId;
	}

	public void setuId(Integer uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	public int getuType() {
		return uType;
	}

	public void setuType(int uType) {
		this.uType = uType;
	}

	public Date getuCreateTime() {
		return uCreateTime;
	}

	public void setuCreateTime(Date uCreateTime) {
		this.uCreateTime = uCreateTime;
	}

	public void setUId(Integer uId) {
		this.uId = uId;
	}

	public String getUName() {
		return uName;
	}

	public void setUName(String uName) {
		this.uName = uName;
	}

	public String getUPassword() {
		return uPassword;
	}

	public void setUPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	public int getUType() {
		return uType;
	}

	public void setUType(int uType) {
		this.uType = uType;
	}

	public Date getUCreateTime() {
		return uCreateTime;
	}

	public void setUCreateTime(Date uCreateTime) {
		this.uCreateTime = uCreateTime;
	}

	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + ", uPassword=" + uPassword + ", uType=" + uType
				+ ", uCreateTime=" + uCreateTime + "]";
	}
	
	

}
