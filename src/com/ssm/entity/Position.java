package com.ssm.entity;

import java.util.Date;

public class Position {
	
	private Integer pId;
	private String pName;
	private Date pCreateTime;
	private int pType;
	private Department pDepartment;
	
	public Position() {
		super();
	}

	public Position(Integer pId, String pName, Date pCreateTime, int pType, Department pDepartment) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pCreateTime = pCreateTime;
		this.pType = pType;
		this.pDepartment = pDepartment;
	}

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Date getpCreateTime() {
		return pCreateTime;
	}

	public void setpCreateTime(Date pCreateTime) {
		this.pCreateTime = pCreateTime;
	}

	public int getpType() {
		return pType;
	}

	public void setpType(int pType) {
		this.pType = pType;
	}

	public Department getpDepartment() {
		return pDepartment;
	}

	public void setpDepartment(Department pDepartment) {
		this.pDepartment = pDepartment;
	}

	@Override
	public String toString() {
		return "Position [pId=" + pId + ", pName=" + pName + ", pCreateTime=" + pCreateTime + ", pType=" + pType
				+ ", pDepartment=" + pDepartment + "]";
	}
	
	

}
