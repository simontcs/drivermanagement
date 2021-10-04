package com.ilp.service;

import java.util.List;

import com.ilp.bean.Car;
import com.ilp.dao.CarDao;

public class CarService {
	public static List<Car> searchCar(int categoryid) {
		CarDao dao = new CarDao();
		
		return dao.searchCar(categoryid);
	}
}
