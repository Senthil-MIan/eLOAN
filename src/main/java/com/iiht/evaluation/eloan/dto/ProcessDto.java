package com.iiht.evaluation.eloan.dto;


public class ProcessDto 
{
	private int applicationNumber;
	private String   loanType;
	private float loanAmount;
	private String applicationDate;
	private String  businessStructure;
	private String billingIndicator ;
	private String taxIndicator ;
	private String address ;
	private String mobile ;
	private String email  ;
	private String loanStatus ;
	private float amountSanctioned;
	private float term ;
	private String payStartDate;
	private String closureDate ;
	private float emi;		
	private float interestRate ;		
	private String customerName ;
	
	public int getApplicationNumber() {
		return applicationNumber;
	}
	public void setApplicationNumber(int applicationNumber) {
		this.applicationNumber = applicationNumber;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public float getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getApplicationDate() {
		return applicationDate;
	}
	public void setApplicationDate(String applicationDate) {
		this.applicationDate = applicationDate;
	}
	public String getBusinessStructure() {
		return businessStructure;
	}
	public void setBusinessStructure(String businessStructure) {
		this.businessStructure = businessStructure;
	}
	public String getBillingIndicator() {
		return billingIndicator;
	}
	public void setBillingIndicator(String billingIndicator) {
		this.billingIndicator = billingIndicator;
	}
	public String getTaxIndicator() {
		return taxIndicator;
	}
	public void setTaxIndicator(String taxIndicator) {
		this.taxIndicator = taxIndicator;
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
	public String getLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
	public float getAmountSanctioned() {
		return amountSanctioned;
	}
	public void setAmountSanctioned(float amountSanctioned) {
		this.amountSanctioned = amountSanctioned;
	}
	public float getTerm() {
		return term;
	}
	public void setTerm(float term) {
		this.term = term;
	}
	public String getPayStartDate() {
		return payStartDate;
	}
	public void setPayStartDate(String payStartDate) {
		this.payStartDate = payStartDate;
	}
	public String getClosureDate() {
		return closureDate;
	}
	public void setClosureDate(String closureDate) {
		this.closureDate = closureDate;
	}
	public float getEmi() {
		return emi;
	}
	public void setEmi(float emi) {
		this.emi = emi;
	}
	public float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public ProcessDto(int applicationNumber, String loanType, float loanAmount, String applicationDate,
			String businessStructure, String billingIndicator, String taxIndicator, String address, String mobile,
			String email, String loanStatus, float amountSanctioned, float term, String payStartDate,
			String closureDate, float emi, float interestRate, String customerName) {
		super();
		this.applicationNumber = applicationNumber;
		this.loanType = loanType;
		this.loanAmount = loanAmount;
		this.applicationDate = applicationDate;
		this.businessStructure = businessStructure;
		this.billingIndicator = billingIndicator;
		this.taxIndicator = taxIndicator;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
		this.loanStatus = loanStatus;
		this.amountSanctioned = amountSanctioned;
		this.term = term;
		this.payStartDate = payStartDate;
		this.closureDate = closureDate;
		this.emi = emi;
		this.interestRate = interestRate;
		this.customerName = customerName;
	}
	
	
	
}
	