package com.ssm.entity;

public class Page {
	
	private Integer pageNo;//��ǰҳ��
	private Integer beforeNo;//��һҳ
	private Integer afterNo;//��һҳ
	private Integer itemCount;//��ҳ����
	private Integer itemSum;//��¼����
	private Integer pageSum;//ҳ����
	
	public Page() {
		super();
	}

	public Page(Integer pageNo, Integer beforeNo, Integer afterNo, Integer itemCount, Integer itemSum,
			Integer pageSum) {
		super();
		this.pageNo = pageNo;
		this.beforeNo = beforeNo;
		this.afterNo = afterNo;
		this.itemCount = itemCount;
		this.itemSum = itemSum;
		this.pageSum = pageSum;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getBeforeNo() {
		return beforeNo;
	}

	public void setBeforeNo(Integer beforeNo) {
		this.beforeNo = beforeNo;
	}

	public Integer getAfterNo() {
		return afterNo;
	}

	public void setAfterNo(Integer afterNo) {
		this.afterNo = afterNo;
	}

	public Integer getItemCount() {
		return itemCount;
	}

	public void setItemCount(Integer itemCount) {
		this.itemCount = itemCount;
	}

	public Integer getItemSum() {
		return itemSum;
	}

	public void setItemSum(Integer itemSum) {
		this.itemSum = itemSum;
	}

	public Integer getPageSum() {
		return pageSum;
	}

	public void setPageSum(Integer pageSum) {
		this.pageSum = pageSum;
	}

	@Override
	public String toString() {
		return "Page [pageNo=" + pageNo + ", beforeNo=" + beforeNo + ", afterNo=" + afterNo + ", itemCount=" + itemCount
				+ ", itemSum=" + itemSum + ", pageSum=" + pageSum + "]";
	}
	
	

}
