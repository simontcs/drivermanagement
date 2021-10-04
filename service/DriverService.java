package com.ilp.service;

import com.ilp.bean.Driver;
import com.ilp.dao.DriverDao;

public class DriverService {

	public static boolean insertDriver(Driver Driver) {
		
		DriverDao dao = new DriverDao();
		
		return dao.insertDriver(Driver);
		
	}
	
}
