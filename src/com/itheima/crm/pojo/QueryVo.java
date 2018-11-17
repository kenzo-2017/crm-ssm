package com.itheima.crm.pojo;

public class QueryVo {

	private String custName;
	private String custSource;
	private String custIndustry;
	private String custLevel;
	
	private Integer page;
	private Integer size;
	private Integer startRow;
	public Integer getStartRow() {
		return startRow;
	}
	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustSource() {
		return custSource;
	}
	public void setCustSource(String custSource) {
		this.custSource = custSource;
	}
	public String getCustIndustry() {
		return custIndustry;
	}
	public void setCustIndustry(String custIndustry) {
		this.custIndustry = custIndustry;
	}
	public String getCustLevel() {
		return custLevel;
	}
	public void setCustLevel(String custLevel) {
		this.custLevel = custLevel;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.startRow = (page - 1) * size;
		this.page = page;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.startRow = (page - 1) * size;
		this.size = size;
	}
	
	
	
}
