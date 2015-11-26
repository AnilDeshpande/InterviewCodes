package com.meetingscheduler;

import java.util.List;

public class Person {
	
	private String name;
	private List<Meeting> personalmeetingschedule;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Meeting> getPersonalmeetingschedule() {
		return personalmeetingschedule;
	}
	public void setPersonalmeetingschedule(List<Meeting> personalmeetingschedule) {
		this.personalmeetingschedule = personalmeetingschedule;
	} 
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
