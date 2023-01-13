package com.goair.bo;

public class PassengerBo {
	int passengerNo;
	String fullname;
	int age;
	String gender;

	public PassengerBo(int passengerNo, String fullname, int age, String gender) {
		super();
		this.passengerNo = passengerNo;
		this.fullname = fullname;
		this.age = age;
		this.gender = gender;
	}

	public int getPassengerNo() {
		return passengerNo;
	}

	public void setPassengerNo(int passengerNo) {
		this.passengerNo = passengerNo;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "PassengerBo [passengerNo=" + passengerNo + ", fullname=" + fullname + ", age=" + age + ", gender="
				+ gender + "]";
	}

}
