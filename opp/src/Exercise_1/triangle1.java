package Exercise_1;

public class triangle1 extends Shape1 {
	
	private double base;
	private double higth;
	
	public double area() {
		return base*higth/2;
		
		
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHigth() {
		return higth;
	}

	public void setHigth(double higth) {
		this.higth = higth;
	}

}
