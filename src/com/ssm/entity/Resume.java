package com.ssm.entity;

import java.util.Date;

public class Resume {
	
	private Integer rId;//����id
	private Integer uId;//�ο�id
	private String uRealName;//��ʵ����
	private String uSex;//�ο�sex
	private int uAge;//�ο�����
	private String uEducation;//�ο�ѧ��
	private long uPhotoNumber;//�ο��ֻ���
	private String uEmail;//�ο�email
	private Department uDepartment;//����Ĳ���
	private Position uPosition;//�����ְλ
	private int uWorkTime;//��������
	private double uSalary;//����н��
	private String uBeforeJob;//��һ�ݹ���
	private String uPoliticalStatus;//������ò
	private String uHobby;//��Ȥ����
	private Date uResumeDate;//����ʱ��
	
	public Resume() {
		super();
	}

	public Resume(Integer rId, Integer uId, String uRealName, String uSex, int uAge, String uEducation,
			long uPhotoNumber, String uEmail, Department uDepartment, Position uPosition, int uWorkTime, double uSalary,
			String uBeforeJob, String uPoliticalStatus, String uHobby, Date uResumeDate) {
		super();
		this.rId = rId;
		this.uId = uId;
		this.uRealName = uRealName;
		this.uSex = uSex;
		this.uAge = uAge;
		this.uEducation = uEducation;
		this.uPhotoNumber = uPhotoNumber;
		this.uEmail = uEmail;
		this.uDepartment = uDepartment;
		this.uPosition = uPosition;
		this.uWorkTime = uWorkTime;
		this.uSalary = uSalary;
		this.uBeforeJob = uBeforeJob;
		this.uPoliticalStatus = uPoliticalStatus;
		this.uHobby = uHobby;
		this.uResumeDate = uResumeDate;
	}

	public Integer getrId() {
		return rId;
	}

	public void setrId(Integer rId) {
		this.rId = rId;
	}

	public Integer getuId() {
		return uId;
	}

	public void setuId(Integer uId) {
		this.uId = uId;
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

	public Department getuDepartment() {
		return uDepartment;
	}

	public void setuDepartment(Department uDepartment) {
		this.uDepartment = uDepartment;
	}

	public Position getuPosition() {
		return uPosition;
	}

	public void setuPosition(Position uPosition) {
		this.uPosition = uPosition;
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

	@Override
	public String toString() {
		return "Resume [rId=" + rId + ", uId=" + uId + ", uRealName=" + uRealName + ", uSex=" + uSex + ", uAge=" + uAge
				+ ", uEducation=" + uEducation + ", uPhotoNumber=" + uPhotoNumber + ", uEmail=" + uEmail
				+ ", uDepartment=" + uDepartment + ", uPosition=" + uPosition + ", uWorkTime=" + uWorkTime
				+ ", uSalary=" + uSalary + ", uBeforeJob=" + uBeforeJob + ", uPoliticalStatus=" + uPoliticalStatus
				+ ", uHobby=" + uHobby + ", uResumeDate=" + uResumeDate + "]";
	}
	
	

}
