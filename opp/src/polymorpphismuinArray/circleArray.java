package polymorpphismuinArray;

public class circleArray  extends shapearry{

	private double radius;
	
	public final double PI=3.14;
	
	
	public circleArray(int i) {
		radius =i;
		// TODO Auto-generated constructor stub
	}

	public double area () {
		return PI*radius*radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	
	
	
	
}
