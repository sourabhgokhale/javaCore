package oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sourabh {

	
	private String name;
	private String address;
	private long mobile;
	private Date d;
	
	SimpleDateFormat d1 = new SimpleDateFormat("dd/MM/yyyy");	
	
	
	
	public String getD() {					//<=================
		String s1=d1.format(d);
		return s1;
	}
	public void setD(String s2) throws ParseException {
		d=d1.parse(s2);
	}
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
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	
	
	
	
	
	
	
	
	
}
