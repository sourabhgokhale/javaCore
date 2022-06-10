package exercise_6;

public class StaticPolyjmorphism {
	
	
	public void Car(int a ) {
		
		System.out.println("one");
	
	}
	public void car (int a , int b) {
		System.out.println("two integer");
	}
	
	public void car(int d,String s) {
		System.out.println("ek integer , ek string");
	}
	
	public void car(String r , float f) {
		System.out.println("string and float");
		
	}

	public static void main(String[] args) {
		
		StaticPolyjmorphism s = new StaticPolyjmorphism()	;
		s.Car(10);
		s.car(20, "sourabh");
		s.car("ghjhg", 20.5f);
		s.car(50, 10);
	}
}
