package oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class person {
	
	private String name;
	private String address;
	private Date dob;
	
	Date d = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {					//<================
		String s1=sdf.format(dob);			
		return s1;
	}
	public void setDob(String s2) throws ParseException {
		dob = sdf.parse(s2);
	}
	
	
	
		
	
	
}
