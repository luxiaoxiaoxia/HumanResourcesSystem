package com.ssm.entity;

import java.util.Date;

public class User {
	
	private Integer uId;//员工id
	private String uName;//员工name
	private String uPassword;//员工密码
	private int uType;//0.游客;1.录用;
	private Date uCreateTime;//游客创建时间
	
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

	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + ", uPassword=" + uPassword + ", uType=" + uType
				+ ", uCreateTime=" + uCreateTime + "]";
	}
	
	

}
