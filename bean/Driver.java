package com.ilp.bean;

public class Driver {
	
	private String driverName;
	private String contactNumber;
	private String driverLicenseNumber;
	private String driverStatus;
	private String carRegistrationNumber;
	
	
	
	public String getDriverStatus() {
		return driverStatus;
	}

	public String getCarRegistrationNumber() {
		return carRegistrationNumber;
	}

	public String getDriverName() {
		return driverName;
	}

	public String getContactNumber() {
		return contactNumber;
	}
	
	public String getDriverLicenseNumber() {
		return driverLicenseNumber;
	}
	
	

	public void setDriverName(String name) {
		this.driverName = name;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public void setDriverLicenseNumber(String driverLicenseNumber) {
		this.driverLicenseNumber = driverLicenseNumber;
	}
	
	public void setDriverStatus(String driverStatus) {
		this.driverStatus = driverStatus;
	}
	public void setCarRegistrationNumber(String carRegistrationNumber) {
		this.carRegistrationNumber = carRegistrationNumber;
	}
	

	public Driver(String name, String contactNumber, String driverLicenseNumber, String driverStatus, String carRegistrationNumber) {
		super();
		this.driverName = name;
		this.contactNumber = contactNumber;
		this.driverLicenseNumber = driverLicenseNumber;
		this.driverStatus = driverStatus;
		this.carRegistrationNumber = carRegistrationNumber;
	}

	
	
	

}
