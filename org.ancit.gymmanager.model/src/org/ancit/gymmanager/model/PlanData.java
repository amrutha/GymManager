package org.ancit.gymmanager.model;

import java.util.Date;

public class PlanData extends SuperSaver {

	private static final long serialVersionUID = 8092693176886415758L;

	public static final String PLAN_TYPE_MONTHLY = "Monthly";
	public static final String PLAN_TYPE_QUARTERLY = "Quarterly";
	public static final String PLAN_TYPE_HALF_YEARLY = "Half Yearly";
	public static final String PLAN_TYPE_YEARLY = "Yearly";

	private int billNo;
	private String planType;
	private double amountPaid;
	private String planStatus;
	private Date startDate;
	private Date endDate;
	private double balanceAmount;
	
	public int getBillNo() {
		return billNo;
	}
	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}
	public String getPlanType() {
		return planType;
	}
	public void setPlanType(String planType) {
		this.planType = planType;
	}
	public double getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}
	public String getPlanStatus() {
		return planStatus;
	}
	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public double getBalanceAmount() {
		return balanceAmount;
	}
	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	
}
