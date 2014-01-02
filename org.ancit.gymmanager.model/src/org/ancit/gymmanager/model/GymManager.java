package org.ancit.gymmanager.model;

import java.util.Date;

public class GymManager {

	private static GymManager gymManager;
	private GymRecord record;

	private GymManager() {
		// TODO Auto-generated constructor stub
	}

	public static GymManager getGymManager() {
		if (gymManager == null) {
			gymManager = new GymManager();
		}
		return gymManager;

	}

	private void loadFewData() {
		// TODO Auto-generated method stub
		Member member1 = new Member();
		member1.setName("A");
		member1.setId("1");
		member1.setMobileNo("81234");
		member1.setAddress("XYZ");
		member1.setBloodGroup("B+ve");
		member1.setCategory("General");

		PlanData member1PlanData = new PlanData();
		member1PlanData.setAmountPaid(100);
		member1PlanData.setBillNo(1);
		member1PlanData.setStartDate(new Date(2013, 12, 30));
		member1PlanData.setEndDate(new Date(2014, 6, 30));
		member1PlanData.setPlanType(PlanData.PLAN_TYPE_HALF_YEARLY);
		member1.addToPlanDetails(member1PlanData);

		record.addMemberToGym(member1);
		Member member2 = new Member();
		member2.setName("S");
		member2.setId("2");
		member2.setMobileNo("8123499872");
		member2.setAddress("Bangalore");
		member2.setBloodGroup("O +ve");
		member2.setCategory("General");

		PlanData member2PlanData2 = new PlanData();
		member2PlanData2.setAmountPaid(100);
		member2PlanData2.setBillNo(1);
		member2PlanData2.setStartDate(new Date(2013, 10, 30));
		member2PlanData2.setEndDate(new Date(2014, 10, 29));
		member2PlanData2.setPlanType(PlanData.PLAN_TYPE_YEARLY);
		member2.addToPlanDetails(member2PlanData2);

		record.addMemberToGym(member2);

	}

	public GymRecord getRecord() {
		if (record == null) {
			this.record = new GymRecord();
			// loadFewData();
		}
		return record;
	}
}
