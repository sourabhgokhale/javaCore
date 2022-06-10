package overriding;

public class trinagle extends Shapeoverriding{

	private double base;
	private double hight;
	
	public double area() {
		return base*hight/2;
	}
	
	
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHight() {
		return hight;
	}
	public void setHight(double hight) {
		this.hight = hight;
	}
	
	
	
	
	
	
}
