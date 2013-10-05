package com.example.handsonandroid;

import java.util.ArrayList;

public class Events {

	private String occurenceID;
	private String opportunityName;
	private String ageGroupsServed;
	private String volunteerCity;
	private String volunteerCountry;
	private String volunteerDescription;
	private String endDate;
	private String startDate;
	private String googleMapURL;
	private String organization;
	private String maxAttendance;
	private String minAttendance;
	private String orgServedID;
	private String orgServedName;
	private String organizationServedURl;
	private String partnerStaffEmail;
	private String primaryImpactArea;
	private String state;
	private String status;
	private boolean groups;
	private String coordinatorEmail;
	private String coordinatorName;
	private String location;
	private String locationDetailpage;
	private String volunteerActivityType;
	private String registrationType;
	private String street;
	private String zipCode;
	
	
	private static ArrayList<Events> curEvents = new ArrayList<Events>();
	
	
	
	
	public Events(){
		
	}
	
	public static void clearList(){
		curEvents = new ArrayList<Events>();
	}
	
	public static void addToList(Events e){
		curEvents.add(e);
	}
	
	public static void removeFromList(Events e){
		curEvents.remove(e);
	}
	
	public static ArrayList<Events> getList(Events e){
		return curEvents;
	}
	
}
