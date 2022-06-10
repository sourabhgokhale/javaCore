package practis;

import java.util.ArrayList;
import java.util.Collection;

public class collection1 {
	
	
	public static void main(String[] args) {
		
		Collection name = new ArrayList();
		name.add(3);
		name.add("Sourabh");
		name.add("Indore");
		name.add(21);
		name.add(5);
		name.add(3);
		
		

		System.out.println(name);    System.out.println("Shows size of Array List ==>> "+name.size());
//System.out.println("Shows index posision ==>> "+name.get(1)); 
System.out.println("Remove ==>> "+name.remove(0));
//name.set(21, 5);  // ??????



		
		
	}

}
