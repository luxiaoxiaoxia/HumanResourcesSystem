package com.ssm.entity;

import java.util.Date;

public class Employee {
	
	private Integer eId;//员工id
	private String eName;//员工name
	private String eRealName;//真实姓名
	private String ePassword;//员工密码
	private String eSex;//员工sex
	private int eAge;//员工岁数
	private String eEducation;//员工学历
	private long ePhotoNumber;//员工手机号
	private String eEmail;//游客email
	private Date eEntryDate;//入职时间 
	private int eType;//1.普通员工;2.部门经理;3.管理员;
	private Department eDepartment;//部门
	private Position ePosition;//职位
	private String ePoliticalStatus;//政治面貌
	private String eHobby;//兴趣爱好
	private String eRemark;//备注
	
	public Employee() {
		super();
	}

	public Employee(Integer eId, String eName, String eRealName, String ePassword, String eSex, int eAge,
			String eEducation, long ePhotoNumber, String eEmail, Date eEntryDate, int eType, Department eDepartment,
			Position ePosition, String ePoliticalStatus, String eHobby, String eRemark) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eRealName = eRealName;
		this.ePassword = ePassword;
		this.eSex = eSex;
		this.eAge = eAge;
		this.eEducation = eEducation;
		this.ePhotoNumber = ePhotoNumber;
		this.eEmail = eEmail;
		this.eEntryDate = eEntryDate;
		this.eType = eType;
		this.eDepartment = eDepartment;
		this.ePosition = ePosition;
		this.ePoliticalStatus = ePoliticalStatus;
		this.eHobby = eHobby;
		this.eRemark = eRemark;
	}

	public Integer geteId() {
		return eId;
	}

	public void seteId(Integer eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteRealName() {
		return eRealName;
	}

	public void seteRealName(String eRealName) {
		this.eRealName = eRealName;
	}

	public String getePassword() {
		return ePassword;
	}

	public void setePassword(String ePassword) {
		this.ePassword = ePassword;
	}

	public String geteSex() {
		return eSex;
	}

	public void seteSex(String eSex) {
		this.eSex = eSex;
	}

	public int geteAge() {
		return eAge;
	}

	public void seteAge(int eAge) {
		this.eAge = eAge;
	}

	public String geteEducation() {
		return eEducation;
	}

	public void seteEducation(String eEducation) {
		this.eEducation = eEducation;
	}

	public long getePhotoNumber() {
		return ePhotoNumber;
	}

	public void setePhotoNumber(long ePhotoNumber) {
		this.ePhotoNumber = ePhotoNumber;
	}

	public String geteEmail() {
		return eEmail;
	}

	public void seteEmail(String eEmail) {
		this.eEmail = eEmail;
	}

	public Date geteEntryDate() {
		return eEntryDate;
	}

	public void seteEntryDate(Date eEntryDate) {
		this.eEntryDate = eEntryDate;
	}

	public int geteType() {
		return eType;
	}

	public void seteType(int eType) {
		this.eType = eType;
	}

	public Department geteDepartment() {
		return eDepartment;
	}

	public void seteDepartment(Department eDepartment) {
		this.eDepartment = eDepartment;
	}

	public Position getePosition() {
		return ePosition;
	}

	public void setePosition(Position ePosition) {
		this.ePosition = ePosition;
	}

	public String getePoliticalStatus() {
		return ePoliticalStatus;
	}

	public void setePoliticalStatus(String ePoliticalStatus) {
		this.ePoliticalStatus = ePoliticalStatus;
	}

	public String geteHobby() {
		return eHobby;
	}

	public void seteHobby(String eHobby) {
		this.eHobby = eHobby;
	}

	public String geteRemark() {
		return eRemark;
	}

	public void seteRemark(String eRemark) {
		this.eRemark = eRemark;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eRealName=" + eRealName + ", ePassword=" + ePassword
				+ ", eSex=" + eSex + ", eAge=" + eAge + ", eEducation=" + eEducation + ", ePhotoNumber=" + ePhotoNumber
				+ ", eEmail=" + eEmail + ", eEntryDate=" + eEntryDate + ", eType=" + eType + ", eDepartment="
				+ eDepartment + ", ePosition=" + ePosition + ", ePoliticalStatus=" + ePoliticalStatus + ", eHobby="
				+ eHobby + ", eRemark=" + eRemark + "]";
	}

	

}
