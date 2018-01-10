package com.ssm.entity;

import java.util.Date;

public class Department {
	
	private Integer dId;//部门id
	private String dName;//部门name
	private Date dCreateTime;//部门创建时间
	private int dType;//部门状态：0.已经费部;1.部门现存;
	
	public Department() {
		super();
	}

	public Department(Integer dId, String dName, Date dCreateTime, int dType) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.dCreateTime = dCreateTime;
		this.dType = dType;
	}

	public Integer getdId() {
		return dId;
	}

	public void setdId(Integer dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public Date getdCreateTime() {
		return dCreateTime;
	}

	public void setdCreateTime(Date dCreateTime) {
		this.dCreateTime = dCreateTime;
	}

	public int getdType() {
		return dType;
	}

	public void setdType(int dType) {
		this.dType = dType;
	}

	public Integer getDId() {
		return dId;
	}

	public void setDId(Integer dId) {
		this.dId = dId;
	}

	public String getDName() {
		return dName;
	}

	public void setDName(String dName) {
		this.dName = dName;
	}

	public Date getDCreateTime() {
		return dCreateTime;
	}

	public void setDCreateTime(Date dCreateTime) {
		this.dCreateTime = dCreateTime;
	}

	public int getDType() {
		return dType;
	}

	public void setDType(int dType) {
		this.dType = dType;
	}

	@Override
	public String toString() {
		return "Department [dId=" + dId + ", dName=" + dName + ", dCreateTime=" + dCreateTime + ", dType=" + dType
				+ "]";
	}
	
	

}
