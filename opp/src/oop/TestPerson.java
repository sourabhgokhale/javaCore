package oop;

import java.text.ParseException;

public class TestPerson {

	public static void main(String[] args) throws ParseException {
		
		person p = new person()	;
		p.setName("sourabh");
		p.setAddress("indore");
		p.setDob("31/03/1993");
		
		
		System.out.println(p.getName());
		System.out.println(p.getAddress());
		System.out.println(p.getDob());
		
		
	}
	
	
	
}
