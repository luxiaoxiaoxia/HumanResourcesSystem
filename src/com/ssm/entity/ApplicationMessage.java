package com.ssm.entity;

public class ApplicationMessage {
	
	private Integer amId;//ӦƸ��Ϣid
	private RecruitmentMessage amRm;//��Ӧ����Ƹ��Ϣ
	private Resume amResume;//��Ӧ�ļ���
	
	public ApplicationMessage() {
		super();
	}

	public ApplicationMessage(Integer amId, RecruitmentMessage amRm, Resume amResume) {
		super();
		this.amId = amId;
		this.amRm = amRm;
		this.amResume = amResume;
	}

	public Integer getAmId() {
		return amId;
	}

	public void setAmId(Integer amId) {
		this.amId = amId;
	}

	public RecruitmentMessage getAmRm() {
		return amRm;
	}

	public void setAmRm(RecruitmentMessage amRm) {
		this.amRm = amRm;
	}

	public Resume getAmResume() {
		return amResume;
	}

	public void setAmResume(Resume amResume) {
		this.amResume = amResume;
	}

	@Override
	public String toString() {
		return "ApplicationMessage [amId=" + amId + ", amRm=" + amRm + ", amResume=" + amResume + "]";
	}
	
	

}
