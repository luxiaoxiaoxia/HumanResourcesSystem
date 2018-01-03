package com.ssm.entity;

import java.util.Date;

public class Attendance {
	
	private Integer aId;
	private Integer eId;
	private Date aCheckInTime;
	private Date aCheckOutTime;
	private int hour;
	
	public Attendance() {
		super();
	}

	public Attendance(Integer aId, Integer eId, Date aCheckInTime, Date aCheckOutTime, int hour) {
		super();
		this.aId = aId;
		this.eId = eId;
		this.aCheckInTime = aCheckInTime;
		this.aCheckOutTime = aCheckOutTime;
		this.hour = hour;
	}

	public Integer getaId() {
		return aId;
	}

	public void setaId(Integer aId) {
		this.aId = aId;
	}

	public Integer geteId() {
		return eId;
	}

	public void seteId(Integer eId) {
		this.eId = eId;
	}

	public Date getaCheckInTime() {
		return aCheckInTime;
	}

	public void setaCheckInTime(Date aCheckInTime) {
		this.aCheckInTime = aCheckInTime;
	}

	public Date getaCheckOutTime() {
		return aCheckOutTime;
	}

	public void setaCheckOutTime(Date aCheckOutTime) {
		this.aCheckOutTime = aCheckOutTime;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	@Override
	public String toString() {
		return "Attendance [aId=" + aId + ", eId=" + eId + ", aCheckInTime=" + aCheckInTime + ", aCheckOutTime="
				+ aCheckOutTime + ", hour=" + hour + "]";
	}
	
	

}
