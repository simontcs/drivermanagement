package com.ilp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ilp.bean.Car;

public class CarDao {
	public static final String JDBC_URL="jdbc:derby:C:\\Users\\2079666\\MyDerby;create=true";
	
	public static final String USERNAME = "test";
	public static final String PASSWORD = "test";
	
	public Connection con = null;
	public ResultSet rs = null;
	
	public List<Car> searchCar(int categoryid) {
		
		List<Car> cars = new ArrayList<Car>();
		
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			con = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
			
			String selectQuery = "select * from tbl_car where categoryid = ?";
			PreparedStatement ps = con.prepareStatement(selectQuery);
			
			
			ps.setInt(1, categoryid);
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				
				Car car = new Car();
				
				car.setCarregistrationnumber(rs.getString("carregistrationnumber"));
				car.setCarbrand(rs.getString("carbrand"));
				car.setCarmodelname(rs.getString("carmodelname"));
				car.setCarseatcapacity(rs.getInt("carseatcapacity"));
				car.setCategoryid(rs.getInt("categoryid"));
				
				cars.add(car);
				
			}
			
		} catch(ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return cars;
		
	}
}
