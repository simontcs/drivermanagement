package com.ilp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ilp.bean.Driver;



public class DriverDao {
	
	public static final String JDBC_URL="jdbc:derby:C:\\Users\\2079716\\MyDB;create=true";
	
	public static final String USERNAME="test";
	public static final String PASSWORD="test";
	
	public Connection con=null;
	public ResultSet rs=null;
	
	
	

	public boolean insertDriver(Driver driver) {

	try{
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		con= DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
		
		String insertQuery="insert into TBL_DRIVER (drivername, drivercontactnumber, driverlicensenumber, driverstatus, carregistrationnumber) values(?,?,?,?,?)";
		PreparedStatement ps= con.prepareStatement(insertQuery);
		
		ps.setString(1, driver.getDriverName());
		ps.setString(2, driver.getContactNumber());
		ps.setString(3, driver.getDriverLicenseNumber());
		ps.setString(4, driver.getDriverStatus());
		ps.setString(5, driver.getCarRegistrationNumber());
		
		int count=ps.executeUpdate();
		
		//System.out.println("COUNT" + count);
		
		if(count>0){
			return true;
		}
		
	}
	catch(ClassNotFoundException | SQLException e){
		System.out.println(e.getMessage());
	}
	catch(Exception ex){
		System.out.println(ex.getMessage());
	}
	finally{
		if(con!=null){
			try {
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		
	}
	}

return false;



}
	
	
	

}
