package inheritance;

public class circle extends Shapinheritance {

	public static double  PI = 3.14;		//<===============>
	
	private double redious;
	
	public double area() {
		return PI*redious*redious;
	}

	public double getRedious() {
		return redious;
	}

	public void setRedious(double redious) {
		this.redious = redious;
	}
	
}
