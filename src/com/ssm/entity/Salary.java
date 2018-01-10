package com.ssm.entity;

public class Salary {
	
	private Integer sId;//工资单id
	private Integer eId;//员工id
	private Integer sYear;
	private Integer sMonth;
	private double sumSalary;//该月总工资
	private double baseSalary;//基本工资
	private double performanceSalary;//绩效工资
	private double callBackSalary;//加班工资
	private double extraSalary;//奖罚
	private double insurance;//社保
	
	public Salary() {
		super();
	}

	public Salary(Integer sId, Integer eId, Integer sYear, Integer sMonth, double sumSalary, double baseSalary,
			double performanceSalary, double callBackSalary, double extraSalary, double insurance) {
		super();
		this.sId = sId;
		this.eId = eId;
		this.sYear = sYear;
		this.sMonth = sMonth;
		this.sumSalary = sumSalary;
		this.baseSalary = baseSalary;
		this.performanceSalary = performanceSalary;
		this.callBackSalary = callBackSalary;
		this.extraSalary = extraSalary;
		this.insurance = insurance;
	}

	public Integer getsId() {
		return sId;
	}

	public void setsId(Integer sId) {
		this.sId = sId;
	}

	public Integer geteId() {
		return eId;
	}

	public void seteId(Integer eId) {
		this.eId = eId;
	}

	public Integer getsYear() {
		return sYear;
	}

	public void setsYear(Integer sYear) {
		this.sYear = sYear;
	}

	public Integer getsMonth() {
		return sMonth;
	}

	public void setsMonth(Integer sMonth) {
		this.sMonth = sMonth;
	}

	public Integer getSId() {
		return sId;
	}

	public void setSId(Integer sId) {
		this.sId = sId;
	}

	public Integer getEId() {
		return eId;
	}

	public void setEId(Integer eId) {
		this.eId = eId;
	}

	public Integer getSYear() {
		return sYear;
	}

	public void setSYear(Integer sYear) {
		this.sYear = sYear;
	}

	public Integer getSMonth() {
		return sMonth;
	}

	public void setSMonth(Integer sMonth) {
		this.sMonth = sMonth;
	}

	public double getSumSalary() {
		return sumSalary;
	}

	public void setSumSalary(double sumSalary) {
		this.sumSalary = sumSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public double getPerformanceSalary() {
		return performanceSalary;
	}

	public void setPerformanceSalary(double performanceSalary) {
		this.performanceSalary = performanceSalary;
	}

	public double getCallBackSalary() {
		return callBackSalary;
	}

	public void setCallBackSalary(double callBackSalary) {
		this.callBackSalary = callBackSalary;
	}

	public double getExtraSalary() {
		return extraSalary;
	}

	public void setExtraSalary(double extraSalary) {
		this.extraSalary = extraSalary;
	}

	public double getInsurance() {
		return insurance;
	}

	public void setInsurance(double insurance) {
		this.insurance = insurance;
	}

	@Override
	public String toString() {
		return "Salary [sId=" + sId + ", eId=" + eId + ", sYear=" + sYear + ", sMonth=" + sMonth + ", sumSalary="
				+ sumSalary + ", baseSalary=" + baseSalary + ", performanceSalary=" + performanceSalary
				+ ", callBackSalary=" + callBackSalary + ", extraSalary=" + extraSalary + ", insurance=" + insurance
				+ "]";
	}
	

}
