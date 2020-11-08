package com.iiht.evaluation.eloan.model;

import java.util.Date;

public class Process {
	
	private String applicationNumber;
	private String loanName;
	private float loanAmount;
	private float amountSanctioned;
	private String busniessStructure;
	private int term;
	private String loanStatus;
	private float emi;
	private String taxIndicator;
	private float interestRate;
	private String billingIndicator;
	private String address;
	private String mobile;
	private Date payStartDate;
	private float termPaymentAmount;
	private Date closureDate;
	public String getApplicationNumber() {
		return applicationNumber;
	}
	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}
	public String getLoanName() {
		return loanName;
	}
	public void setLoanName(String loanName) {
		this.loanName = loanName;
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
		this.amountSanctioned = amountSanctioned;
	}
	public String getBusniessStructure() {
		return busniessStructure;
	}
	public void setBusniessStructure(String busniessStructure) {
		this.busniessStructure = busniessStructure;
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
	public Date getPayStartDate() {
		return payStartDate;
	}
	public void setPayStartDate(Date payStartDate) {
		this.payStartDate = payStartDate;
	}
	public float getTermPaymentAmount() {
		return termPaymentAmount;
	}
	public void setTermPaymentAmount(float termPaymentAmount) {
		this.termPaymentAmount = termPaymentAmount;
	}
	public Date getClosureDate() {
		return closureDate;
	}
	public void setClosureDate(Date closureDate) {
		this.closureDate = closureDate;
	}
	public Process(String applicationNumber, String loanName, float loanAmount, float amountSanctioned,
			String busniessStructure, int term, String loanStatus, float emi, String taxIndicator, float interestRate,
			String billingIndicator, String address, String mobile, Date payStartDate, float termPaymentAmount,
			Date closureDate) {
		super();
		this.applicationNumber = applicationNumber;
		this.loanName = loanName;
		this.loanAmount = loanAmount;
		this.amountSanctioned = amountSanctioned;
		this.busniessStructure = busniessStructure;
		this.term = term;
		this.loanStatus = loanStatus;
		this.emi = emi;
		this.taxIndicator = taxIndicator;
		this.interestRate = interestRate;
		this.billingIndicator = billingIndicator;
		this.address = address;
		this.mobile = mobile;
		this.payStartDate = payStartDate;
		this.termPaymentAmount = termPaymentAmount;
		this.closureDate = closureDate;
	}
	
	
	



	}


