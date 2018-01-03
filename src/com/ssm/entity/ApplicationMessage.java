package com.ssm.entity;

public class ApplicationMessage {
	
	private Integer amId;//应聘信息id
	private Integer dId;//部门id
	private Integer pId;//职位id
	private Integer rId;//简历id
	
	public ApplicationMessage() {
		super();
	}

	public ApplicationMessage(Integer amId, Integer dId, Integer pId, Integer rId) {
		super();
		this.amId = amId;
		this.dId = dId;
		this.pId = pId;
		this.rId = rId;
	}

	public Integer getAmId() {
		return amId;
	}

	public void setAmId(Integer amId) {
		this.amId = amId;
	}

	public Integer getdId() {
		return dId;
	}

	public void setdId(Integer dId) {
		this.dId = dId;
	}

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public Integer getrId() {
		return rId;
	}

	public void setrId(Integer rId) {
		this.rId = rId;
	}

	@Override
	public String toString() {
		return "ApplicationMessage [amId=" + amId + ", dId=" + dId + ", pId=" + pId + ", rId=" + rId + "]";
	}
	
	

}
