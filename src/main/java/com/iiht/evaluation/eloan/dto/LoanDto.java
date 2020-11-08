package com.iiht.evaluation.eloan.dto;

import java.sql.Date;

public class LoanDto {
	private int app_num;
	private int userid;
	private String loan_name;
	private String loan_amount;
	private Date application_date; 
	private int business;
	private int billing_indicator;
	private int tax_indicator;
	private String address;
	private int mobile;
	private String email;
	private int status;
	private int amount_sanctioned;
	private int term;
	private Date payment_start_date;
	private Date closure_date;
	private int monthly_payment;
	private float interest_rate;
	private int term_payment_amount;
	public int getApp_num() {
		return app_num;
	}
	public void setApp_num(int app_num) {
		this.app_num = app_num;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getLoan_name() {
		return loan_name;
	}
	public void setLoan_name(String loan_name) {
		this.loan_name = loan_name;
	}
	public String getLoan_amount() {
		return loan_amount;
	}
	public void setLoan_amount(String loan_amount) {
		this.loan_amount = loan_amount;
	}
	public Date getApplication_date() {
		return application_date;
	}
	public void setApplication_date(Date application_date) {
		this.application_date = application_date;
	}
	public int getBusiness() {
		return business;
	}
	public void setBusiness(int business) {
		this.business = business;
	}
	public int getBilling_indicator() {
		return billing_indicator;
	}
	public void setBilling_indicator(int billing_indicator) {
		this.billing_indicator = billing_indicator;
	}
	public int getTax_indicator() {
		return tax_indicator;
	}
	public void setTax_indicator(int tax_indicator) {
		this.tax_indicator = tax_indicator;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getAmount_sanctioned() {
		return amount_sanctioned;
	}
	public void setAmount_sanctioned(int amount_sanctioned) {
		this.amount_sanctioned = amount_sanctioned;
	}
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	public Date getPayment_start_date() {
		return payment_start_date;
	}
	public void setPayment_start_date(Date payment_start_date) {
		this.payment_start_date = payment_start_date;
	}
	public Date getClosure_date() {
		return closure_date;
	}
	public void setClosure_date(Date closure_date) {
		this.closure_date = closure_date;
	}
	public int getMonthly_payment() {
		return monthly_payment;
	}
	public void setMonthly_payment(int monthly_payment) {
		this.monthly_payment = monthly_payment;
	}
	public float getInterest_rate() {
		return interest_rate;
	}
	public void setInterest_rate(float interest_rate) {
		this.interest_rate = interest_rate;
	}
	public int getTerm_payment_amount() {
		return term_payment_amount;
	}
	public void setTerm_payment_amount(int term_payment_amount) {
		this.term_payment_amount = term_payment_amount;
	}
}
