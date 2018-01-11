package com.ssm.entity;

import java.util.Date;

public class Resume {
	
	private Integer rId;//简历id
	private User rUser;//游客
	private String uRealName;//真实姓名
	private String uSex;//游客sex
	private int uAge;//游客岁数
	private String uEducation;//游客学历
	private long uPhotoNumber;//游客手机号
	private String uEmail;//游客email
	private Integer uDId;//申请的部门
	private Integer uPId;//申请的职位
	private int uWorkTime;//工作经历
	private double uSalary;//期望薪资
	private String uBeforeJob;//上一份工作
	private String uPoliticalStatus;//政治面貌
	private String uHobby;//兴趣爱好
	private Date uResumeDate;//简历时间
	private int rType;//0.未查看;1.已查看;
	
	public Resume() {
		super();
	}

	
	public Resume(Integer rId, User rUser, String uRealName, String uSex, int uAge, String uEducation,
			long uPhotoNumber, String uEmail, Integer uDId, Integer uPId, int uWorkTime, double uSalary,
			String uBeforeJob, String uPoliticalStatus, String uHobby, Date uResumeDate, int rType) {
		super();
		this.rId = rId;
		this.rUser = rUser;
		this.uRealName = uRealName;
		this.uSex = uSex;
		this.uAge = uAge;
		this.uEducation = uEducation;
		this.uPhotoNumber = uPhotoNumber;
		this.uEmail = uEmail;
		this.uDId = uDId;
		this.uPId = uPId;
		this.uWorkTime = uWorkTime;
		this.uSalary = uSalary;
		this.uBeforeJob = uBeforeJob;
		this.uPoliticalStatus = uPoliticalStatus;
		this.uHobby = uHobby;
		this.uResumeDate = uResumeDate;
		this.rType = rType;
	}




	public Integer getrId() {
		return rId;
	}

	public void setrId(Integer rId) {
		this.rId = rId;
	}

	public User getrUser() {
		return rUser;
	}

	public void setrUser(User rUser) {
		this.rUser = rUser;
	}

	public String getuRealName() {
		return uRealName;
	}

	public void setuRealName(String uRealName) {
		this.uRealName = uRealName;
	}

	public String getuSex() {
		return uSex;
	}

	public void setuSex(String uSex) {
		this.uSex = uSex;
	}

	public int getuAge() {
		return uAge;
	}

	public void setuAge(int uAge) {
		this.uAge = uAge;
	}

	public String getuEducation() {
		return uEducation;
	}

	public void setuEducation(String uEducation) {
		this.uEducation = uEducation;
	}

	public long getuPhotoNumber() {
		return uPhotoNumber;
	}

	public void setuPhotoNumber(long uPhotoNumber) {
		this.uPhotoNumber = uPhotoNumber;
	}

	public String getuEmail() {
		return uEmail;
	}

	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}

	
	public int getuWorkTime() {
		return uWorkTime;
	}

	public void setuWorkTime(int uWorkTime) {
		this.uWorkTime = uWorkTime;
	}

	public double getuSalary() {
		return uSalary;
	}

	public void setuSalary(double uSalary) {
		this.uSalary = uSalary;
	}

	public String getuBeforeJob() {
		return uBeforeJob;
	}

	public void setuBeforeJob(String uBeforeJob) {
		this.uBeforeJob = uBeforeJob;
	}

	public String getuPoliticalStatus() {
		return uPoliticalStatus;
	}

	public void setuPoliticalStatus(String uPoliticalStatus) {
		this.uPoliticalStatus = uPoliticalStatus;
	}

	public String getuHobby() {
		return uHobby;
	}

	public void setuHobby(String uHobby) {
		this.uHobby = uHobby;
	}

	public Date getuResumeDate() {
		return uResumeDate;
	}

	public void setuResumeDate(Date uResumeDate) {
		this.uResumeDate = uResumeDate;
	}

	public int getrType() {
		return rType;
	}

	public void setrType(int rType) {
		this.rType = rType;
	}

	public Integer getRId() {
		return rId;
	}

	public void setRId(Integer rId) {
		this.rId = rId;
	}

	public User getRUser() {
		return rUser;
	}

	public void setRUser(User rUser) {
		this.rUser = rUser;
	}

	public String getURealName() {
		return uRealName;
	}

	public void setURealName(String uRealName) {
		this.uRealName = uRealName;
	}

	public String getUSex() {
		return uSex;
	}

	public void setUSex(String uSex) {
		this.uSex = uSex;
	}

	public int getUAge() {
		return uAge;
	}

	public void setUAge(int uAge) {
		this.uAge = uAge;
	}

	public String getUEducation() {
		return uEducation;
	}

	public void setUEducation(String uEducation) {
		this.uEducation = uEducation;
	}

	public long getUPhotoNumber() {
		return uPhotoNumber;
	}

	public void setUPhotoNumber(long uPhotoNumber) {
		this.uPhotoNumber = uPhotoNumber;
	}

	public String getUEmail() {
		return uEmail;
	}

	public void setUEmail(String uEmail) {
		this.uEmail = uEmail;
	}

	

	public int getUWorkTime() {
		return uWorkTime;
	}

	public void setUWorkTime(int uWorkTime) {
		this.uWorkTime = uWorkTime;
	}

	public double getUSalary() {
		return uSalary;
	}

	public void setUSalary(double uSalary) {
		this.uSalary = uSalary;
	}

	public String getUBeforeJob() {
		return uBeforeJob;
	}

	public void setUBeforeJob(String uBeforeJob) {
		this.uBeforeJob = uBeforeJob;
	}

	public String getUPoliticalStatus() {
		return uPoliticalStatus;
	}

	public void setUPoliticalStatus(String uPoliticalStatus) {
		this.uPoliticalStatus = uPoliticalStatus;
	}

	public String getUHobby() {
		return uHobby;
	}

	public void setUHobby(String uHobby) {
		this.uHobby = uHobby;
	}

	public Date getUResumeDate() {
		return uResumeDate;
	}

	public void setUResumeDate(Date uResumeDate) {
		this.uResumeDate = uResumeDate;
	}

	public int getRType() {
		return rType;
	}

	public void setRType(int rType) {
		this.rType = rType;
	}


	public Integer getUDId() {
		return uDId;
	}


	public void setUDId(Integer uDId) {
		this.uDId = uDId;
	}


	public Integer getUPId() {
		return uPId;
	}


	public void setUPId(Integer uPId) {
		this.uPId = uPId;
	}


	public Integer getuDId() {
		return uDId;
	}


	public void setuDId(Integer uDId) {
		this.uDId = uDId;
	}


	public Integer getuPId() {
		return uPId;
	}


	public void setuPId(Integer uPId) {
		this.uPId = uPId;
	}


	@Override
	public String toString() {
		return "Resume [rId=" + rId + ", rUser=" + rUser + ", uRealName=" + uRealName + ", uSex=" + uSex + ", uAge="
				+ uAge + ", uEducation=" + uEducation + ", uPhotoNumber=" + uPhotoNumber + ", uEmail=" + uEmail
				+ ", uDId=" + uDId + ", uPId=" + uPId + ", uWorkTime=" + uWorkTime + ", uSalary=" + uSalary
				+ ", uBeforeJob=" + uBeforeJob + ", uPoliticalStatus=" + uPoliticalStatus + ", uHobby=" + uHobby
				+ ", uResumeDate=" + uResumeDate + ", rType=" + rType + "]";
	}

	
	
	

}
