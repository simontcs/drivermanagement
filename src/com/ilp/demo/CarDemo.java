package com.ilp.demo;

import java.util.List;

import com.ilp.bean.Car;
import com.ilp.service.CarService;

public class CarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int categoryid = 1;
		
		System.out.println("Available cars");
		
		List<Car> cars = CarService.searchCar(categoryid);
		
		if (cars.size() > 0) {
			for (Car car: cars) {
				System.out.println(car.getCarregistrationnumber());
				System.out.println(car.getCarbrand());
				System.out.println(car.getCarmodelname());
				System.out.println(car.getCarseatcapacity());
				System.out.println(car.getCategoryid());	
			}
		} else {
			System.out.println("No records found");
		}
	}

}
