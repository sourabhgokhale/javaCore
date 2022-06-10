package Exercise_1;

public class testShape1 {

	
	public static void main(String[] args) {
		
		
		Circle1 c= new Circle1();
		c.setRedius(5);
						
		System.out.println("Circle = "+ c.getRedius()+", area = "+c.area());
		
		
		System.out.println("--------Circle---------");
		
		
		
		rectangle1 rc = new rectangle1();
		rc.setLength(5);
		rc.setWidth(5);
		
		System.out.println("Length = "+ rc.getLength()+", Width = " + rc.getWidth()+"\n"+"Area of rectangle " + rc.area());
		
		System.out.println("-----------Rectangle-----------------");
		
		
					
		triangle1 tr = new triangle1();
		tr.setBase(2); tr.setHigth(5);
		System.out.println("Triangle area = "+tr.area());
		
		
		Shape1 []s = new Shape1[3];
		s[0]=  c;
		s[1]= rc;
		s[2]= tr;
		
		int totalarea=0;
		for (int i = 0; i < s.length; i++) {
			totalarea += s[i].area();			
		}
		
		
		System.out.println("\nTotal Area of Circle , Rectangle , Triangle = "+totalarea);
		
		
	}
	
	
}
