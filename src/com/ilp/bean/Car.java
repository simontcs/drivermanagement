package com.ilp.bean;

public class Car {
	private String carregistrationnumber;
	private String carbrand;
	private String carmodelname;
	private int carseatcapacity;
	private int categoryid;
	
	public Car(String carregistrationnumber, String carbrand, String carmodelname, int carseatcapacity,
			int categoryid) {
		super();
		this.carregistrationnumber = carregistrationnumber;
		this.carbrand = carbrand;
		this.carmodelname = carmodelname;
		this.carseatcapacity = carseatcapacity;
		this.categoryid = categoryid;
	}
	
	public Car() {
		
	}

	public String getCarregistrationnumber() {
		return carregistrationnumber;
	}

	public void setCarregistrationnumber(String carregistrationnumber) {
		this.carregistrationnumber = carregistrationnumber;
	}

	public String getCarbrand() {
		return carbrand;
	}

	public void setCarbrand(String carbrand) {
		this.carbrand = carbrand;
	}

	public String getCarmodelname() {
		return carmodelname;
	}

	public void setCarmodelname(String carmodelname) {
		this.carmodelname = carmodelname;
	}

	public int getCarseatcapacity() {
		return carseatcapacity;
	}

	public void setCarseatcapacity(int carseatcapacity) {
		this.carseatcapacity = carseatcapacity;
	}

	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
}
