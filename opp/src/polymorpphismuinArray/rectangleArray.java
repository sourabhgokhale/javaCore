package polymorpphismuinArray;

public class rectangleArray extends shapearry {

	private double length;
	private double width;
	
	public rectangleArray(int i, int j) {
		length = i;
		width = j;
		// TODO Auto-generated constructor stub
	}
	public double area() {
		return length*width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	
	
	
	
	
}
