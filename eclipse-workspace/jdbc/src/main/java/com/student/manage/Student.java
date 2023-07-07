package com.student.manage;

public class Student {
	
	private int ID;
	private String name;
	private String phone;
	private String city;
	
	
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", name=" + name + ", phone=" + phone + ", city=" + city + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int iD, String name, String phone, String city) {
		super();
		ID = iD;
		this.name = name;
		this.phone = phone;
		this.city = city;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
