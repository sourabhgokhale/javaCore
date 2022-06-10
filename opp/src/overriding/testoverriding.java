package overriding;

public class testoverriding {
	
	
	
	public static void main(String[] args) {
		
		Shapeoverriding s = new rectangle();
		rectangle r = (rectangle) s;
		
		r.setLength(10);
		r.setWidth(5);
		
		System.out.println(r.area());
		
	Shapeoverriding ss = new trinagle();
	trinagle t = (trinagle) ss;
	t.setBase(5);
t.setHight(5);	
	t.area();		
	
	System.out.println("Triangle = "+ t.area());
	}
	
}
