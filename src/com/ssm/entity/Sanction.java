package com.ssm.entity;

import java.util.Date;

public class Sanction {
	
	private Integer stId;
	private Integer eId;
	private String stReason;
	private double stSalary;
	private Date stCreateDate;
	
	public Sanction() {
		super();
	}

	public Sanction(Integer stId, Integer eId, String stReason, double stSalary, Date stCreateDate) {
		super();
		this.stId = stId;
		this.eId = eId;
		this.stReason = stReason;
		this.stSalary = stSalary;
		this.stCreateDate = stCreateDate;
	}

	public Integer getStId() {
		return stId;
	}

	public void setStId(Integer stId) {
		this.stId = stId;
	}

	public Integer geteId() {
		return eId;
	}

	public void seteId(Integer eId) {
		this.eId = eId;
	}

	public String getStReason() {
		return stReason;
	}

	public void setStReason(String stReason) {
		this.stReason = stReason;
	}

	public double getStSalary() {
		return stSalary;
	}

	public void setStSalary(double stSalary) {
		this.stSalary = stSalary;
	}

	public Date getStCreateDate() {
		return stCreateDate;
	}

	public void setStCreateDate(Date stCreateDate) {
		this.stCreateDate = stCreateDate;
	}

	@Override
	public String toString() {
		return "Sanction [stId=" + stId + ", eId=" + eId + ", stReason=" + stReason + ", stSalary=" + stSalary
				+ ", stCreateDate=" + stCreateDate + "]";
	}
	
	

}
