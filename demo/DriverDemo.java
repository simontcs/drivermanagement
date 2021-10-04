package com.ilp.demo;


import java.util.List;

import com.ilp.bean.Driver;
import com.ilp.service.DriverService;


public class DriverDemo {
	
	
	public static void main(String[] args) {
		Driver driver1= new Driver( "Pete Petterson", "04273245621", "GJ12201901EA", "available", "abc123");
		
		System.out.println("Driver Registration status: " + DriverService.insertDriver(driver1));
		
		
		
	}
	
	

}
