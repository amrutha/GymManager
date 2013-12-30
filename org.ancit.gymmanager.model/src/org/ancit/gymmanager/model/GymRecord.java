package org.ancit.gymmanager.model;

import java.util.ArrayList;
import java.util.List;

public class GymRecord extends SuperSaver {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6237212180214740353L;
	private String name;
	private List<Member> members = new ArrayList<Member>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	public void addMemberToGym(Member member) {
		getMembers().add(member);
		firePropertyChange("GymRecordAdded", null, getMembers());
	}

}
