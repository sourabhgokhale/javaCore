package practis;

import java.util.ArrayList;

public class collectin {
	
	public static void main(String[] args) {
		
		
		ArrayList ar = new ArrayList();
		ar.add("github");
		ar.add(55);
		ar.add("iNTERNE");
		System.out.println(ar.size());
		
		for (Object ele :ar) {
			System.out.print(" "+ ele);
			
			
			ArrayList ar1 = new ArrayList();
			ar1.add(12);	ar1.add(5);
			ar1.add(13);	ar1.add(65);
			ar1.addAll(ar1);
			System.out.println(ar1);
			
			
			
			
		}
		
		
		
	}

}
