package Exercise_1;

public  class Circle1 extends Shape1 {
	
	private double redius;
	public final double PI=3.14;
	
	
	public double area () {
		return PI*redius*redius;
	}
	
	
	
	
	public double getRedius() {
		return redius;
	}
	public void setRedius(double redius) {
		this.redius = redius;
	}
	public double getPI() {
		return PI;
	}
	
	
	
	
	
	

}
