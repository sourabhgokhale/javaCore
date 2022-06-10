package inheritance;

public class testinheri extends ractangle {
	
	public static void main(String[] args) {
		
	
	
	ractangle r = new ractangle();
	r.setLenght(10);
	r.setWidth(5);
	r.setBorderWidth(0);
	
	
	System.out.println(r.getLenght());
	System.out.println(r.getWidth());
		System.out.println(r.area());
		
		
		System.out.println("--------------Rectangl-----------");
	
		
		
		
		circle c = new circle();
		c.setBorderWidth(10);
		c.setColor("Blue");
		c.setRedious(2);
		
		
		System.out.println("Redious "+c.getRedious());
		System.out.println("Area " +  c.area());
		
		
		
		
		
		
		
		
		
		}
}