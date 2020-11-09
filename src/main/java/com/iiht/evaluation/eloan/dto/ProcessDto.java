package com.iiht.evaluation.eloan.dto;

import java.util.Date;



public class ProcessDto {
	private int appNum;
	private String loanName;
	private Float amountRequested;
	private Date applicationDate;
	private String business;
	private String billing_indicatoer;
	private String tax_indicator;
	private String address;
	private String mobile;
	private String email;
	private String status;
	public int getAppNum() {
		return appNum;
	}
	public void setAppNum(int appNum) {
		this.appNum = appNum;
	}
	public String getLoanName() {
		return loanName;
	}
	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}
	public Float getAmountRequested() {
		return amountRequested;
	}
	public void setAmountRequested(Float amountRequested) {
		this.amountRequested = amountRequested;
	}
	public Date getApplicationDate() {
		return applicationDate;
	}
	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}
	public String getBusiness() {
		return business;
	}
	public void setBusiness(String business) {
		this.business = business;
	}
	public String getBilling_indicator() {
		return billing_indicatoer;
	}
	public void setBilling_indicatoer(String billing_indicatoer) {
		this.billing_indicatoer = billing_indicatoer;
	}
	public String getTax_indicator() {
		return tax_indicator;
	}
	public void setTax_indicator(String tax_indicator) {
		this.tax_indicator = tax_indicator;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public ProcessDto(int appNum, String loanName, Float amountRequested, Date applicationDate, String business,
			String billing_indicatoer, String tax_indicator, String address, String mobile, String email,
			String status) {
		super();
		this.appNum = appNum;
		this.loanName = loanName;
		this.amountRequested = amountRequested;
		this.applicationDate = applicationDate;
		this.business = business;
		this.billing_indicatoer = billing_indicatoer;
		this.tax_indicator = tax_indicator;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
		this.status = status;
	}
	
	
	
	
	

}
