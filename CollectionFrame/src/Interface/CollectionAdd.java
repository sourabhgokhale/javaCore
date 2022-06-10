package Interface;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionAdd {

	public static void main(String[] args) {
		
				System.out.println("Here we go ");
		Collection c =new ArrayList();
		c.add("Indore");
		c.add("Bhopal");
		c.add("Ujain");
		c.add("Lucknow");
		c.add("Sheopur (M.P.)");
		
		
		System.out.println(" city name =====> " +c.size());
		
		// Convert Collection into array
		for (Object ele:c) {
			System.out.println(ele+" "+ "");
									
		}System.out.println(c.isEmpty()); 	
		
		System.out.println("-------------------------------");
			
	}
	
	
	
}
