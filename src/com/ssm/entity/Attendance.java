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
	private int morningMinute;
	private int afternoonMinute;
	
	public Attendance() {
		super();
	}

	public Attendance(Integer aId, Integer eId, int aYear, int aMonth, int aDay, Date aCheckInTime, Date aCheckOutTime,
			int minute, int morningMinute, int afternoonMinute) {
		super();
		this.aId = aId;
		this.eId = eId;
		this.aYear = aYear;
		this.aMonth = aMonth;
		this.aDay = aDay;
		this.aCheckInTime = aCheckInTime;
		this.aCheckOutTime = aCheckOutTime;
		this.minute = minute;
		this.morningMinute = morningMinute;
		this.afternoonMinute = afternoonMinute;
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

	public Integer getAId() {
		return aId;
	}

	public void setAId(Integer aId) {
		this.aId = aId;
	}

	public Integer getEId() {
		return eId;
	}

	public void setEId(Integer eId) {
		this.eId = eId;
	}

	public int getAYear() {
		return aYear;
	}

	public void setAYear(int aYear) {
		this.aYear = aYear;
	}

	public int getAMonth() {
		return aMonth;
	}

	public void setAMonth(int aMonth) {
		this.aMonth = aMonth;
	}

	public int getADay() {
		return aDay;
	}

	public void setADay(int aDay) {
		this.aDay = aDay;
	}

	public Date getACheckInTime() {
		return aCheckInTime;
	}

	public void setACheckInTime(Date aCheckInTime) {
		this.aCheckInTime = aCheckInTime;
	}

	public Date getACheckOutTime() {
		return aCheckOutTime;
	}

	public void setACheckOutTime(Date aCheckOutTime) {
		this.aCheckOutTime = aCheckOutTime;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getMorningMinute() {
		return morningMinute;
	}

	public void setMorningMinute(int morningMinute) {
		this.morningMinute = morningMinute;
	}

	public int getAfternoonMinute() {
		return afternoonMinute;
	}

	public void setAfternoonMinute(int afternoonMinute) {
		this.afternoonMinute = afternoonMinute;
	}

	@Override
	public String toString() {
		return "Attendance [aId=" + aId + ", eId=" + eId + ", aYear=" + aYear + ", aMonth=" + aMonth + ", aDay=" + aDay
				+ ", aCheckInTime=" + aCheckInTime + ", aCheckOutTime=" + aCheckOutTime + ", minute=" + minute
				+ ", morningMinute=" + morningMinute + ", afternoonMinute=" + afternoonMinute + "]";
	}

	

	
}
