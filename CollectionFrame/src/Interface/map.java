package Interface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class map {
	
	
	
	public static void main(String[] args) {
		
		Map m = new HashMap ();
		
		m.put(5, "sou");
		m.put(6, "hgg");
		m.put(7, "gvg");
		m.put(8, "edx");
		m.put(9, "jkvg");
		m.put(10, "yugy");
		
		
		
	System.out.println(m.get(7));
	//m.clear();
		System.out.println(m.containsKey(9));
		System.out.println(m.containsValue("hgg"));
		System.out.println(m.entrySet());
		System.out.println(m.keySet());
		System.out.println(m.remove(10));
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
