package com.ssm.entity;

public class Salary {
	
	private Integer sId;//���ʵ�id
	private Integer eId;//Ա��id
	private Integer sYear;
	private Integer sDay;
	private double sumSalary;//�����ܹ���
	private double baseSalary;//��������
	private double performanceSalary;//��Ч����
	private double callBackSalary;//�Ӱ๤��
	private double extraSalary;//����
	private double insurance;//�籣
	
	public Salary() {
		super();
	}

	public Salary(Integer sId, Integer eId, Integer sYear, Integer sDay, double sumSalary, double baseSalary,
			double performanceSalary, double callBackSalary, double extraSalary, double insurance) {
		super();
		this.sId = sId;
		this.eId = eId;
		this.sYear = sYear;
		this.sDay = sDay;
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

	public Integer getsDay() {
		return sDay;
	}

	public void setsDay(Integer sDay) {
		this.sDay = sDay;
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
		return "Salary [sId=" + sId + ", eId=" + eId + ", sYear=" + sYear + ", sDay=" + sDay + ", sumSalary="
				+ sumSalary + ", baseSalary=" + baseSalary + ", performanceSalary=" + performanceSalary
				+ ", callBackSalary=" + callBackSalary + ", extraSalary=" + extraSalary + ", insurance=" + insurance
				+ "]";
	}
	
	

}
