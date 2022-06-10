package overriding;

public class circle extends Shapeoverriding {
	
	public static double PI =3.14;
	
		private double radious;

		
		public double area() {
			return PI*radious*radious;
			
		}
		
		public double getRadious() {
			return radious;
		}

		public void setRadious(double radious) {
			this.radious = radious;
		}
		
			
			
			
			
			
}
