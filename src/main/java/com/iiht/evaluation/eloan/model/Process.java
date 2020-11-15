package com.iiht.evaluation.eloan.model;

import java.util.Date;

public class Process {
	
	private String applicationNumber;
	private String loanName;
	private String customerName;
	private String loanType;
	private float loanAmount;
	private String applicationDate;
	private float amountSanctioned;
	private String businessStructure;
	private int term;
	private String loanStatus;
	private float emi;
	private String taxIndicator;
	private float interestRate;
	private String billingIndicator;
	private String address;
	private String mobile;
	private String email;
	private String userName;
	private String payStartDate;
	private float termPaymentAmount;
	private String closureDate;
	private String userid;
	public String getApplicationNumber() {
		return applicationNumber;
	}
	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getLoanName() {
		return loanName;
	}
	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.loanName = userName;
	}
	
	public String getApplicationDate() {
		return applicationDate;
	}
	public void setApplicationDate(String applicationDate) {
		this.applicationDate = applicationDate;
	}
	
	public float getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}
	public float getAmountSanctioned() {
		return amountSanctioned;
	}
	public void setAmountSanctioned(float amountSanctioned) {
		this.amountSanctioned=amountSanctioned;
	}
	public String getBusinessStructure() {
		return businessStructure;
	}
	public void setBusinessStructure(String businessStructure) {
		this.businessStructure = businessStructure;
	}
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	public String getLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
	
	public String getLoanType() {
		return loanStatus;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public float getEmi() {
		return emi;
	}
	public void setEmi(float emi) {
		this.emi = emi;
	}
	public String getTaxIndicator() {
		return taxIndicator;
	}
	public void setTaxIndicator(String taxIndicator) {
		this.taxIndicator = taxIndicator;
	}
	public float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	public String getBillingIndicator() {
		return billingIndicator;
	}
	public void setBillingIndicator(String billingIndicator) {
		this.billingIndicator = billingIndicator;
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
	public String getPayStartDate() {
		return payStartDate;
	}
	public void setPayStartDate(String payStartDate) {
		this.payStartDate = payStartDate;
	}
	public float getTermPaymentAmount() {
		return termPaymentAmount;
	}
	public void setTermPaymentAmount(float termPaymentAmount) {
		this.termPaymentAmount = termPaymentAmount;
	}
	public String getClosureDate() {
		return closureDate;
	}
	public void setClosureDate(String closureDate) {
		this.closureDate = closureDate;
	}
	
	public Process(String applicationNumber, String loanName, String customerName, String loanType, float loanAmount,
			String applicationDate, float amountSanctioned, String businessStructure, int term, String loanStatus,
			float emi, String taxIndicator, float interestRate, String billingIndicator, String address, String mobile,
			String email, String userName, String payStartDate, float termPaymentAmount, String closureDate,
			String userid) {
		super();
		this.applicationNumber = applicationNumber;
		this.loanName = loanName;
		this.customerName = customerName;
		this.loanType = loanType;
		this.loanAmount = loanAmount;
		this.applicationDate = applicationDate;
		this.amountSanctioned = amountSanctioned;
		this.businessStructure = businessStructure;
		this.term = term;
		this.loanStatus = loanStatus;
		this.emi = emi;
		this.taxIndicator = taxIndicator;
		this.interestRate = interestRate;
		this.billingIndicator = billingIndicator;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
		this.userName = userName;
		this.payStartDate = payStartDate;
		this.termPaymentAmount = termPaymentAmount;
		this.closureDate = closureDate;
		this.userid = userid;
	}
	public Process() {
		// TODO Auto-generated constructor stub
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
	
	
	



	}


