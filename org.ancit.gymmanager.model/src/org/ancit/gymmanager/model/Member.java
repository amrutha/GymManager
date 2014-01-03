package org.ancit.gymmanager.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Member extends SuperSaver {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2911686179510229142L;

	private String id;
	private String name;
	private String mobileNo;
	private String category;
	private String address;
	private String emergencyContactNo;
	private String bloodGroup;
	private String workoutTimings;
	private String applicationStatus;
	private String idCardStatus;
	private Date registrationDate;
	private String photoStatus;
	List<PlanData> planDetails = new ArrayList<PlanData>();
	PlanData lastPlanData = new PlanData();
	private static int count = 1;

	// private String planType;
	// private String amount;
	// private int billNo;
	// private Date startDate;
	// private Date endDate;

	public static int getCount() {
		return count;
	}

	public static void incrementCounter() {
		count = count + 1;

	}

	public Member() {
		// TODO Auto-generated constructor stub

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
		firePropertyChange("Member", null, this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		firePropertyChange("Member", null, this);
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
		firePropertyChange("Member", null, this);
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
		firePropertyChange("Member", null, this);
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
		firePropertyChange("Member", null, this);

	}

	public String getEmergencyContactNo() {
		return emergencyContactNo;
	}

	public void setEmergencyContactNo(String emergencyContactNo) {
		this.emergencyContactNo = emergencyContactNo;
		firePropertyChange("Member", null, this);
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
		firePropertyChange("Member", null, this);
	}

	public String getWorkoutTimings() {
		return workoutTimings;
	}

	public void setWorkoutTimings(String workoutTimings) {
		this.workoutTimings = workoutTimings;
		firePropertyChange("Member", null, this);
	}

	public String getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
		firePropertyChange("Member", null, this);
	}

	public String getIdCardStatus() {
		return idCardStatus;
	}

	public void setIdCardStatus(String idCardStatus) {
		this.idCardStatus = idCardStatus;
		firePropertyChange("Member", null, this);
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
		firePropertyChange("Member", null, this);
	}

	public String getPhotoStatus() {
		firePropertyChange("Member", null, this);
		return photoStatus;
	}

	public void setPhotoStatus(String photoStatus) {
		this.photoStatus = photoStatus;
		firePropertyChange("Member", null, this);
	}

	public List<PlanData> getPlanDetails() {
		return planDetails;
	}

	public void setPlanDetails(List<PlanData> planDetails) {
		firePropertyChange("Member", null, this);
		this.planDetails = planDetails;
	}

	public void addToPlanDetails(PlanData planData) {
		firePropertyChange("Member", null, this);
		lastPlanData = planData;
		getPlanDetails().add(lastPlanData);
	}

	public PlanData getLastPlanDetails() {
		return lastPlanData;

	}

	/*
	 * public String getPlanType() { return planType; }
	 * 
	 * public void setPlanType(String planType) { this.planType = planType;
	 * firePropertyChange("Member", null, this); }
	 * 
	 * public String getAmount() { return amount; }
	 * 
	 * public void setAmount(String amount) { this.amount = amount;
	 * firePropertyChange("Member", null, this); } public int getBillNo() {
	 * return billNo; }
	 * 
	 * public void setBillNo(int billNo) { this.billNo = billNo;
	 * firePropertyChange("Member", null, this); }
	 * 
	 * public Date getStartDate() { return startDate; }
	 * 
	 * public void setStartDate(Date startDate) { this.startDate = startDate;
	 * firePropertyChange("Member", null, this); }
	 * 
	 * public Date getEndDate() { return endDate; }
	 * 
	 * public void setEndDate(Date endDate) { this.endDate = endDate;
	 * firePropertyChange("Member", null, this); }
	 */
}
