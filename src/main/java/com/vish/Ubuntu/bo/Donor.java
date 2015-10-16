package com.vish.Ubuntu.bo;

public class Donor {

	public Donor(){}
	
	public Donor(String name, String id, String locID, String address, long phone, String group, String email) {
		super();
		this.name = name;
		this.id = id;
		this.locID = locID;
		this.address = address;
		this.phone = phone;
		this.group = group;
		this.email = email;
	}
	
	private String name;
	private String id;
	private String locID;
	
	private String address;
	private long phone ;
	private String group;
	private String email;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLocID() {
		return locID;
	}
	public void setLocID(String locID) {
		this.locID = locID;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
