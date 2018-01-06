package com.ssm.entity;

import java.util.Date;

public class Attendance {
	
	private Integer aId;
	private Integer eId;
	private int aYear;
	private int aMonth;
	private int aDay;
	private Date aCheckInTime;
	private Date aCheckOutTime;
	private int minute;
	
	public Attendance() {
		super();
	}

	public Attendance(Integer aId, Integer eId, int aYear, int aMonth, int aDay, Date aCheckOutTime, int minute) {
		super();
		this.aId = aId;
		this.eId = eId;
		this.aYear = aYear;
		this.aMonth = aMonth;
		this.aDay = aDay;
		this.aCheckOutTime = aCheckOutTime;
		this.minute = minute;
	}

	public Attendance(Integer aId, Integer eId, int aYear, int aMonth, int aDay, Date aCheckInTime) {
		super();
		this.aId = aId;
		this.eId = eId;
		this.aYear = aYear;
		this.aMonth = aMonth;
		this.aDay = aDay;
		this.aCheckInTime = aCheckInTime;
	}

	public Attendance(Integer aId, Integer eId, int aYear, int aMonth, int aDay, Date aCheckInTime, Date aCheckOutTime,
			int minute) {
		super();
		this.aId = aId;
		this.eId = eId;
		this.aYear = aYear;
		this.aMonth = aMonth;
		this.aDay = aDay;
		this.aCheckInTime = aCheckInTime;
		this.aCheckOutTime = aCheckOutTime;
		this.minute = minute;
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

	public int getaYear() {
		return aYear;
	}

	public void setaYear(int aYear) {
		this.aYear = aYear;
	}

	public int getaMonth() {
		return aMonth;
	}

	public void setaMonth(int aMonth) {
		this.aMonth = aMonth;
	}

	public int getaDay() {
		return aDay;
	}

	public void setaDay(int aDay) {
		this.aDay = aDay;
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

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	@Override
	public String toString() {
		return "Attendance [aId=" + aId + ", eId=" + eId + ", aYear=" + aYear + ", aMonth=" + aMonth + ", aDay=" + aDay
				+ ", aCheckInTime=" + aCheckInTime + ", aCheckOutTime=" + aCheckOutTime + ", minute=" + minute + "]";
	}

	

	
}
